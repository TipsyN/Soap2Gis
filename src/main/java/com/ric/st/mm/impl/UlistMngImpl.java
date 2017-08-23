package com.ric.st.mm.impl;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.gosuslugi.dom.schema.integration.nsi_base.NsiElementFieldType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiElementNsiRefFieldType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiElementNsiRefFieldType.NsiRef;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiElementStringFieldType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiElementType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiItemInfoType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiItemType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiListType;
import ru.gosuslugi.dom.schema.integration.nsi_common_service.Fault;

import com.diffplug.common.base.Errors;
import com.ric.bill.Utl;
import com.ric.bill.model.exs.Ulist;
import com.ric.bill.model.exs.UlistTp;
import com.ric.st.builder.impl.NsiAsyncBindingBuilder;
import com.ric.st.dao.UlistDAO;
import com.ric.st.excp.CantGetNSI;
import com.ric.st.excp.CantSendSoap;
import com.ric.st.excp.CantSignSoap;
import com.ric.st.excp.CantUpdNSI;
import com.ric.st.impl.RefStore;
import com.ric.st.impl.SoapConfig;
import com.ric.st.mm.UlistMng;

/**
 * Сервис справочников ГИС ЖКХ
 * @author lev
 *
 */
@Slf4j
@Service
public class UlistMngImpl implements UlistMng {

	@Autowired
	UlistDAO ulistDao; 
	@Autowired
	NsiAsyncBindingBuilder nsiBuilder;
	@Autowired
	private SoapConfig config;
	@PersistenceContext
    private EntityManager em;
	
	private int idx=0;
	// Хранилище справочников ГИС ЖКХ
	private RefStore rStore;
	
	// Инициализация
	public Boolean setUp() {
		// загрузка справочников из ГИС ЖКХ
		if (!loadRef()){
			return false;
		} else {
			log.info("справочники обновлены из ГИС");
			return true;
		}
		
	}
	
	// префикс для элементов справочника
	private String getPrefixedCD(String cd, String grp, String code) {
		return getPrefixedCD(cd, grp)+"_"+code+"_"+idx++;
	}

	// префикс для заголовка справочника
	private String getPrefixedCD(String cd, String grp) {
		return config.getPrefixGis()+"_"+grp+"_"+cd;
	}
	
	// TODO: узнать можно ли параллельно вызывать, не будет ли concurrent excp?
	private void updNsiItem(UlistTp ulistTp, String grp, BigInteger id) throws CantUpdNSI {
		// удалить элементы в нашей базе по данному справочнику
		ulistDao.delListByListTp(ulistTp);
		
		// получить из ГИС справочник
		NsiItemType res = null;
		try {
			res = nsiBuilder.getNsiItem(grp, id);
		} catch (Fault  e) {
			e.printStackTrace();
			throw new CantUpdNSI("Ошибка при обновлении справочника NSI grp="+ grp+", id="+ id);
		} catch (CantSignSoap e) {
			e.printStackTrace();
			throw new CantUpdNSI("Ошибка при обновлении справочника NSI grp="+ grp+", id="+ id);
		} catch (CantSendSoap e) {
			e.printStackTrace();
			throw new CantUpdNSI("Ошибка при обновлении справочника NSI grp="+ grp+", id="+ id);
		} catch (ru.gosuslugi.dom.schema.integration.nsi_common_service_async.Fault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if (res != null) {
			res.getNsiElement().stream().forEach(t ->
				{
					// получить cd новой записи
					String cd = getPrefixedCD(id.toString(), grp, t.getCode());
						// создать новый элемент
						List<NsiElementFieldType> lst2 =  t.getNsiElementField();

						// создать запись главного элемента с CD в Ulist
						log.info("Check1={}", Utl.nvl(t.getCode(), "-------"));
						String code = null;
						if (t.getCode()==null || t.getCode().length()==0) {
							code = "------";
						} else {
							code = t.getCode();
						}
						log.info("Создание записи Code={}, GUID={}", t.getCode(), t.getGUID() );
						Ulist main = new Ulist(cd, code, t.getGUID(), 
								Utl.getDateFromXmlGregCal(t.getStartDate()), Utl.getDateFromXmlGregCal(t.getEndDate()),
								t.isIsActual(), ulistTp, idx, null, null, null, null, null
								);
						em.persist(main);
						log.info("Создана запись Code={}", t.getCode(), t.getGUID());
						
						// создать записи fields в Ulist
						lst2.stream().forEach(d -> {

							// получить cd новой записи
							String fldCd = getPrefixedCD(id.toString(), grp, t.getCode());
							Ulist ulist = null;
							if (d.getClass().equals(NsiElementStringFieldType.class)) {
								NsiElementStringFieldType fld = (NsiElementStringFieldType) d;
								// создать запись в Ulist
								String name = null;
								if (fld.getName()==null || fld.getName().length()==0) {
									name = "------";
								} else {
									name = fld.getName();
								}
								ulist = new Ulist(fldCd, name, null, 
										null, null, null, ulistTp, idx, fld.getValue(), main, null, null, "ST"
										);
							} else if (d.getClass().equals(NsiElementNsiRefFieldType.class)) {
								NsiElementNsiRefFieldType fld = (NsiElementNsiRefFieldType) d;
								// создать запись в Ulist
								String name = null;
								if (fld.getName()==null || fld.getName().length()==0) {
									name = "------";
								} else {
									name = fld.getName();
								}
								NsiRef nRef = fld.getNsiRef();
								if (nRef != null) {
									ulist = new Ulist(fldCd, name, null, 
											null, null, null, ulistTp, idx, null, main, 
											nRef.getRef().getCode(), 
											nRef.getRef().getGUID(), "RF"
											);
								}
							}
							
							if (ulist!=null) {
								em.persist(ulist);
								log.info("Создан элемент справочника  List: {}", ulist.getName());
							}
							
							
						});
						log.info("Создан элемент справочника List :{}", cd);
			    });
		} else {
			log.info("Нет элементов в базе ГИС по справочнику grp={}, id={}", grp, id);
		}
	}
	
	/**
	 * Создать или обновить справочник NSI или NSIRAO
	 * @param lst
	 * @param nsiItem
	 * @param grp
	 * @throws CantUpdNSI 
	 * @throws Exception 
	 */
	private void updNsiList(List<UlistTp> lst, NsiItemInfoType nsiItem, String grp) throws CantUpdNSI {
		// по каким то причинам не загружается справочники
		/*if (nsiItem.getRegistryNumber().equals( new BigInteger("282")) || 
			nsiItem.getRegistryNumber().equals( new BigInteger("298")) ||
			nsiItem.getRegistryNumber().equals( new BigInteger("70"))  ||
			nsiItem.getRegistryNumber().equals( new BigInteger("311")) ||
			nsiItem.getRegistryNumber().equals( new BigInteger("319")) ||
			nsiItem.getRegistryNumber().equals( new BigInteger("306")) ||
			nsiItem.getRegistryNumber().equals( new BigInteger("310")) ||
			nsiItem.getRegistryNumber().equals( new BigInteger("307"))
			) {
			return;
		}*/
		
		// пока работать только со справочником 
		if (!nsiItem.getRegistryNumber().equals( new BigInteger("2") )) {
			//return;
		}

		String prefix = getPrefixedCD(nsiItem.getRegistryNumber().toString(), grp);
		// найти заголовочный элемент в нашей базе
		Optional<UlistTp> el = lst.stream()
				.filter(t-> t.getCd().equals(prefix))
				.findAny();
		if (!el.isPresent()) {
			// не найден элемент, создать новый
			UlistTp lstTp = new UlistTp(prefix, nsiItem.getRegistryNumber().intValue(), nsiItem.getName(), 
					Utl.getDateFromXmlGregCal(nsiItem.getModified()),
					grp, null);
			em.persist(lstTp);
			log.info("Создан заголовочный элемент ListTp :{}", prefix);
			// обновить элементы справочника
			log.info("Создание справочника: {}", prefix);
			updNsiItem(lstTp, grp, nsiItem.getRegistryNumber());
			log.info("Создан справочник: {}", prefix);
		} else {
			// найден элемент, проверить дату обновления
			
			if (el.get().getDt1() == null || el.get().getDt1().getTime() != Utl.getDateFromXmlGregCal(nsiItem.getModified()).getTime()) {
				SimpleDateFormat sm = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.S a z");
				String strDate1 = sm.format(el.get().getDt1());
				String strDate2 = sm.format(Utl.getDateFromXmlGregCal(nsiItem.getModified()));
				log.info("Даты обновления: старая ={}, новая 2 ={}", strDate1, strDate2);
				// обновить элементы справочника
				updNsiItem(el.get(), grp, nsiItem.getRegistryNumber());
				// установить дату обновления
				el.get().setDt1(Utl.getDateFromXmlGregCal(nsiItem.getModified()));
				log.info("Обновлён справочник: {}", prefix);
			}
			
			//проверить Name
			if (!el.get().getName().equals(nsiItem.getName())) {
				//обновить Name
				el.get().setName(nsiItem.getName());
				log.info("Обновлён заголовочный элемент, Name справочника: {}", prefix);
				
			}
			
		}
		
	}
	
	
	/**
	 * Получить справочник Nsi
	 * @param grp - группа, например NSI, NSIRAO
	 * @param id - идентификатор справочника
	 * @return
	 * @throws CantGetNSI
	 */
	public NsiItemType getNsi(String grp, BigInteger id) throws CantGetNSI {
		// получить из ГИС
		NsiItemType res;
		try {
			log.info("Запрос справочника из ГИС: grp={}, id={}", grp, id);
			res = nsiBuilder.getNsiItem(grp, id);
		} catch (Fault | CantSignSoap | CantSendSoap | ru.gosuslugi.dom.schema.integration.nsi_common_service_async.Fault e1) {
			e1.printStackTrace();
			throw new CantGetNSI("Ошибка получения справочника NSI по группе grp="+grp);
		}
		
		return res;
	}
	
	
	/**
	 * Получить элемент справочника по соответствию полей имя и значение
	 * @param grp - Группа справочника, например "NSI"
	 * @param id - № справочника
	 * @param name - имя искомого элемента
	 * @param value - значение искомого элемента
	 */
	public ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef 
		getNsiElem(String grp, Integer id, String name, String value) {
		
		NsiItemType res = getrStore().getByGrpId(grp, BigInteger.valueOf(id));
		Optional<NsiElementType> elem = res.getNsiElement().stream().filter(t -> 
					
					t.getNsiElementField().stream().filter(v -> 
							v.getClass().equals(NsiElementStringFieldType.class) 
							&& v.getName().equals(name))
							.anyMatch(v -> ((NsiElementStringFieldType) v).getValue().equals(value))

				).findFirst();
		if (elem.isPresent()) {
			ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef t = 
					new ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef();
	    	t.setCode(elem.get().getCode());
	    	t.setGUID(elem.get().getGUID());
			return t;
		} else {
			return null;
		}
	}
	
	/**
	 * Обновить NSI справочники
	 * @return 
	 * @throws CantSendSoap 
	 * @throws CantSignSoap 
	 * @throws Fault 
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void refreshNsi(String grp) throws CantUpdNSI {
		// Обновить виды справочников
		// получить из нашей базы 
		List<UlistTp> lst =  ulistDao.getListTpByGrp(grp);
		// получить из ГИС
		NsiListType res = null;
		try {
			log.info("Запрос справочников группы grp={}", grp);
			res = nsiBuilder.getNsiList(grp);
		} catch (Fault | CantSignSoap | CantSendSoap e1) {
			e1.printStackTrace();
			throw new CantUpdNSI("Ошибка обновления группы справочников grp="+grp);
		} catch (ru.gosuslugi.dom.schema.integration.nsi_common_service_async.Fault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (res == null) {
			log.error("ВНИМАНИЕ! XML ответ - пустой, grp={}", grp);
			throw new CantUpdNSI("Ошибка обновления группы справочников grp="+grp);
		}
		// обработать каждый справочник
		try {
			res.getNsiItemInfo().stream().forEach(Errors.rethrow().wrap(t -> {
				updNsiList(lst, t, grp);
				}));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CantUpdNSI("Ошибка обновления справочника");
		}

	}
	
	/**
	 * Вывести на экран содержимое всех загруженных справочников (TODO)
	 */
	public void showAll() {
		getrStore().getMapRef().stream().forEach(d -> {
			log.info("Grp={}, Res={}", d.getGrp(), d.getRes());
			/*	d.getRes().getNsiElement().stream().forEach(t -> {
					t.getNsiElementField().stream().forEach(e-> {
						if (e.getClass().equals(NsiElementStringFieldType.class)) {
							log.info("Elem={},  Value={}", e.getName(), ((NsiElementStringFieldType) e).getValue());
							
						}
					});
							
				}); */
		});
	}
	
	public RefStore getrStore() {
		return rStore;
	}

	private void setrStore(RefStore rStore) {
		this.rStore = rStore;
	}
	
	// загрузить справочники в память
	public Boolean loadRef() {
		// получить необходимые справочники из ГИС, поместить в хранилище в памяти
		setrStore(new RefStore()); 
		try {
			getrStore().add(getNsi("NSI", BigInteger.valueOf(22)), "NSI", BigInteger.valueOf(22));
			getrStore().add(getNsi("NSI", BigInteger.valueOf(24)), "NSI", BigInteger.valueOf(24));
			getrStore().add(getNsi("NSI", BigInteger.valueOf(30)), "NSI", BigInteger.valueOf(30));
			getrStore().add(getNsi("NSI", BigInteger.valueOf(32)), "NSI", BigInteger.valueOf(32));
		} catch (CantGetNSI e) {
			log.error("Ошибка получения справочников NSI!");
			return false;
		}
		return true;
	}

}