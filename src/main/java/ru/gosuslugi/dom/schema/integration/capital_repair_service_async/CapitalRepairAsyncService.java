
package ru.gosuslugi.dom.schema.integration.capital_repair_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Сервис Капитальный ремонт
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CapitalRepairAsyncService", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/capital-repair-service-async/", wsdlLocation = "file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/capital-repair/hcs-capital-repair-service-async.wsdl")
public class CapitalRepairAsyncService
    extends Service
{

    private final static URL CAPITALREPAIRASYNCSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAPITALREPAIRASYNCSERVICE_EXCEPTION;
    private final static QName CAPITALREPAIRASYNCSERVICE_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/capital-repair-service-async/", "CapitalRepairAsyncService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/capital-repair/hcs-capital-repair-service-async.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAPITALREPAIRASYNCSERVICE_WSDL_LOCATION = url;
        CAPITALREPAIRASYNCSERVICE_EXCEPTION = e;
    }

    public CapitalRepairAsyncService() {
        super(__getWsdlLocation(), CAPITALREPAIRASYNCSERVICE_QNAME);
    }

    public CapitalRepairAsyncService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAPITALREPAIRASYNCSERVICE_QNAME, features);
    }

    public CapitalRepairAsyncService(URL wsdlLocation) {
        super(wsdlLocation, CAPITALREPAIRASYNCSERVICE_QNAME);
    }

    public CapitalRepairAsyncService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAPITALREPAIRASYNCSERVICE_QNAME, features);
    }

    public CapitalRepairAsyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CapitalRepairAsyncService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CapitalRepairAsyncPort
     */
    @WebEndpoint(name = "CapitalRepairAsyncPort")
    public CapitalRepairAsyncPort getCapitalRepairAsyncPort() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/capital-repair-service-async/", "CapitalRepairAsyncPort"), CapitalRepairAsyncPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CapitalRepairAsyncPort
     */
    @WebEndpoint(name = "CapitalRepairAsyncPort")
    public CapitalRepairAsyncPort getCapitalRepairAsyncPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/capital-repair-service-async/", "CapitalRepairAsyncPort"), CapitalRepairAsyncPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAPITALREPAIRASYNCSERVICE_EXCEPTION!= null) {
            throw CAPITALREPAIRASYNCSERVICE_EXCEPTION;
        }
        return CAPITALREPAIRASYNCSERVICE_WSDL_LOCATION;
    }

}
