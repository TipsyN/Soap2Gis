package com.ric.st.mm;

import com.ric.bill.dto.OrgDTO;
import com.ric.bill.model.exs.Eolink;

/**
 * Интерфейс сервиса организации
 * @author Leo
 *
 */
public interface OrgMng {

	public OrgDTO getOrgDTO(Eolink uk);
}
