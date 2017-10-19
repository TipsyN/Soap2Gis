
package ru.gosuslugi.dom.schema.integration.house_management_service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ru.gosuslugi.dom.schema.integration.house_management.ExportAccountIndividualServicesRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportAccountIndividualServicesResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportAccountRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportAccountResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportCAChRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportHouseRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportHouseResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportMeteringDeviceDataRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportMeteringDeviceDataResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportStatusCAChRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportStatusCAChResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportStatusPublicPropertyContractRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportStatusPublicPropertyContractResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportSupplyResourceContractRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportSupplyResourceContractResult;
import ru.gosuslugi.dom.schema.integration.house_management.ExportVotingProtocolRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ExportVotingProtocolResult;
import ru.gosuslugi.dom.schema.integration.house_management.ImportAccountIndividualServicesRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportAccountRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportHouseESPRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportHouseRSORequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportHouseUORequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportMeteringDeviceDataRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportNotificationRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportPublicPropertyContractRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportSupplyResourceContractRequest;
import ru.gosuslugi.dom.schema.integration.house_management.ImportVotingProtocolRequest;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HouseManagementPortsType", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management-service/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.organizations_registry_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.nsi_base.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.account_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.bills_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.individual_registry_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.metering_device_base.ObjectFactory.class,
    ru.gosuslugi.dom.schema.integration.organizations_base.ObjectFactory.class
})
public interface HouseManagementPortsType {


    /**
     * Передать данные ПУ
     * 
     * @param importMeteringDeviceDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importMeteringDeviceData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importMeteringDeviceDataResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importMeteringDeviceData(
        @WebParam(name = "importMeteringDeviceDataRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importMeteringDeviceDataRequest")
        ImportMeteringDeviceDataRequest importMeteringDeviceDataRequest)
        throws Fault
    ;

    /**
     * Получить перечень ПУ
     * 
     * @param exportMeteringDeviceDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportMeteringDeviceDataResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportMeteringDeviceData")
    @WebResult(name = "exportMeteringDeviceDataResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportMeteringDeviceDataResult")
    public ExportMeteringDeviceDataResult exportMeteringDeviceData(
        @WebParam(name = "exportMeteringDeviceDataRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportMeteringDeviceDataRequest")
        ExportMeteringDeviceDataRequest exportMeteringDeviceDataRequest)
        throws Fault
    ;

    /**
     * Импорт договора управления 
     * 
     * @param importContractRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importContractData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importContractData(
        @WebParam(name = "importContractRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importContractRequest")
        ImportContractRequest importContractRequest)
        throws Fault
    ;

    /**
     * Импорт устава 
     * 
     * @param importCharterRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importCharterData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "ImportResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importCharterData(
        @WebParam(name = "importCharterRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importCharterRequest")
        ImportCharterRequest importCharterRequest)
        throws Fault
    ;

    /**
     * Экспорт статусов договоров управления, уставов, доп. соглашений
     * 
     * @param exportStatusCAChRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportStatusCAChResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportStatusCAChData")
    @WebResult(name = "exportStatusCAChResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportStatusCAChResult")
    public ExportStatusCAChResult exportStatusCAChData(
        @WebParam(name = "exportStatusCAChRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportStatusCAChRequest")
        ExportStatusCAChRequest exportStatusCAChRequest)
        throws Fault
    ;

    /**
     * ВИ_ИРАО_ДОМ_ЭКСП. Экспорт данных дома.
     * 
     * @param exportHouseDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportHouseResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportHouseData")
    @WebResult(name = "exportHouseResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportHouseDataResult")
    public ExportHouseResult exportHouseData(
        @WebParam(name = "exportHouseRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportHouseDataRequest")
        ExportHouseRequest exportHouseDataRequest)
        throws Fault
    ;

    /**
     * ВИ_ИЛС_СЗЛС. передать данные лицевых счетов
     * 
     * @param importAccountDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importAccountData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importAccountDataResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importAccountData(
        @WebParam(name = "importAccountRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importAccountDataRequest")
        ImportAccountRequest importAccountDataRequest)
        throws Fault
    ;

    /**
     * ВИ_ИЛС_РЛС. получить перечень лицевых счетов
     * 
     * @param exportAccountDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportAccountResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportAccountData")
    @WebResult(name = "exportAccountResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportAccountDataResult")
    public ExportAccountResult exportAccountData(
        @WebParam(name = "exportAccountRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportAccountDataRequest")
        ExportAccountRequest exportAccountDataRequest)
        throws Fault
    ;

    /**
     * Импорт ДОИ (Договор на пользование общим имуществом)
     * 
     * @param importPublicPropertyContractRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importPublicPropertyContract")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "importPublicPropertyContractResult")
    public ru.gosuslugi.dom.schema.integration.base.ImportResult importPublicPropertyContract(
        @WebParam(name = "importPublicPropertyContractRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importPublicPropertyContractRequest")
        ImportPublicPropertyContractRequest importPublicPropertyContractRequest)
        throws Fault
    ;

    /**
     * Экспорт списка ДОИ
     * 
     * @param exportStatusPublicPropertyContractRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportStatusPublicPropertyContractResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportStatusPublicPropertyContract")
    @WebResult(name = "exportStatusPublicPropertyContractResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportStatusPublicPropertyContractResult")
    public ExportStatusPublicPropertyContractResult exportStatusPublicPropertyContract(
        @WebParam(name = "exportStatusPublicPropertyContractRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportStatusPublicPropertyContractRequest")
        ExportStatusPublicPropertyContractRequest exportStatusPublicPropertyContractRequest)
        throws Fault
    ;

    /**
     * ВИ_ИО_И_1. Импорт новостей для информирования граждан
     * 
     * @param importNotificationRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importNotificationData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "importNotificationResult")
    public ru.gosuslugi.dom.schema.integration.base.ImportResult importNotificationData(
        @WebParam(name = "importNotificationRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importNotificationRequest")
        ImportNotificationRequest importNotificationRequest)
        throws Fault
    ;

    /**
     * Импорт протокола ОСС
     * 
     * @param importVotingProtocolRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importVotingProtocol")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "importVotingProtocolResult")
    public ru.gosuslugi.dom.schema.integration.base.ImportResult importVotingProtocol(
        @WebParam(name = "importVotingProtocolRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importVotingProtocolRequest")
        ImportVotingProtocolRequest importVotingProtocolRequest)
        throws Fault
    ;

    /**
     * Экспорт протокола ОСС
     * 
     * @param exportVotingProtocolRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportVotingProtocolResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportVotingProtocol")
    @WebResult(name = "exportVotingProtocolResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportVotingProtocolResult")
    public ExportVotingProtocolResult exportVotingProtocol(
        @WebParam(name = "exportVotingProtocolRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportVotingProtocolRequest")
        ExportVotingProtocolRequest exportVotingProtocolRequest)
        throws Fault
    ;

    /**
     * Экспорт договоров управления, уставов, доп. соглашений
     * 
     * @param exportCAChDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportCAChData")
    @WebResult(name = "exportCAChResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportCAChDataResult")
    public ExportCAChResult exportCAChData(
        @WebParam(name = "exportCAChRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportCAChDataRequest")
        ExportCAChRequest exportCAChDataRequest)
        throws Fault
    ;

    /**
     * Импорт данных дома для полномочия УО
     * 
     * @param importHouseUODataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importHouseUOData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "ImportResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importHouseUOData(
        @WebParam(name = "importHouseUORequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importHouseUODataRequest")
        ImportHouseUORequest importHouseUODataRequest)
        throws Fault
    ;

    /**
     * Импорт данных дома для полномочия РСО
     * 
     * @param importHouseRSODataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importHouseRSOData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "ImportResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importHouseRSOData(
        @WebParam(name = "importHouseRSORequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importHouseRSODataRequest")
        ImportHouseRSORequest importHouseRSODataRequest)
        throws Fault
    ;

    /**
     * Импорт данных дома для полномочия ОМС
     * 
     * @param importHouseOMSDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importHouseOMSData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "ImportResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importHouseOMSData(
        @WebParam(name = "importHouseOMSRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importHouseOMSDataRequest")
        ImportHouseOMSRequest importHouseOMSDataRequest)
        throws Fault
    ;

    /**
     * Импорт договора ресурсоснабжения с РСО
     * 
     * @param importSupplyResourceContractRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importSupplyResourceContractData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importSupplyResourceContractResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importSupplyResourceContractData(
        @WebParam(name = "importSupplyResourceContractRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importSupplyResourceContractRequest")
        ImportSupplyResourceContractRequest importSupplyResourceContractRequest)
        throws Fault
    ;

    /**
     * Экспорт договоров ресурсоснабжения
     * 
     * @param exportSupplyResourceContractRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportSupplyResourceContractResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportSupplyResourceContractData")
    @WebResult(name = "exportSupplyResourceContractResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportSupplyResourceContractResult")
    public ExportSupplyResourceContractResult exportSupplyResourceContractData(
        @WebParam(name = "exportSupplyResourceContractRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportSupplyResourceContractRequest")
        ExportSupplyResourceContractRequest exportSupplyResourceContractRequest)
        throws Fault
    ;

    /**
     * Импорт индивидуальных услуг лицевого счета
     * 
     * @param importAccountIndividualServicesRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.base.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importAccountIndividualServices")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/", partName = "importAccountIndividualServicesResult")
    public ru.gosuslugi.dom.schema.integration.base.ImportResult importAccountIndividualServices(
        @WebParam(name = "importAccountIndividualServicesRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importAccountIndividualServicesRequest")
        ImportAccountIndividualServicesRequest importAccountIndividualServicesRequest)
        throws Fault
    ;

    /**
     * Экспорт индивидуальных услуг лицевого счета
     * 
     * @param exportAccountIndividualServicesRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ExportAccountIndividualServicesResult
     * @throws Fault
     */
    @WebMethod(action = "urn:exportAccountIndividualServices")
    @WebResult(name = "exportAccountIndividualServicesResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportAccountIndividualServicesResult")
    public ExportAccountIndividualServicesResult exportAccountIndividualServices(
        @WebParam(name = "exportAccountIndividualServicesRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "exportAccountIndividualServicesRequest")
        ExportAccountIndividualServicesRequest exportAccountIndividualServicesRequest)
        throws Fault
    ;

    /**
     * Импорт данных дома для полномочия ЕСП
     * 
     * @param importHouseESPDataRequest
     * @return
     *     returns ru.gosuslugi.dom.schema.integration.house_management.ImportResult
     * @throws Fault
     */
    @WebMethod(action = "urn:importHouseESPData")
    @WebResult(name = "ImportResult", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "ImportResult")
    public ru.gosuslugi.dom.schema.integration.house_management.ImportResult importHouseESPData(
        @WebParam(name = "importHouseESPRequest", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", partName = "importHouseESPDataRequest")
        ImportHouseESPRequest importHouseESPDataRequest)
        throws Fault
    ;

}