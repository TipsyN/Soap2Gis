
package ru.gosuslugi.dom.schema.integration.infrastructure_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Асинхронный сервис управления ОКИ
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InfrastructureServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/infrastructure-service-async/", wsdlLocation = "file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/infrastructure/hcs-infrastructure-service-async.wsdl")
public class InfrastructureServiceAsync
    extends Service
{

    private final static URL INFRASTRUCTURESERVICEASYNC_WSDL_LOCATION;
    private final static WebServiceException INFRASTRUCTURESERVICEASYNC_EXCEPTION;
    private final static QName INFRASTRUCTURESERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/infrastructure-service-async/", "InfrastructureServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/infrastructure/hcs-infrastructure-service-async.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INFRASTRUCTURESERVICEASYNC_WSDL_LOCATION = url;
        INFRASTRUCTURESERVICEASYNC_EXCEPTION = e;
    }

    public InfrastructureServiceAsync() {
        super(__getWsdlLocation(), INFRASTRUCTURESERVICEASYNC_QNAME);
    }

    public InfrastructureServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), INFRASTRUCTURESERVICEASYNC_QNAME, features);
    }

    public InfrastructureServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, INFRASTRUCTURESERVICEASYNC_QNAME);
    }

    public InfrastructureServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INFRASTRUCTURESERVICEASYNC_QNAME, features);
    }

    public InfrastructureServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InfrastructureServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InfrastructurePortsTypeAsync
     */
    @WebEndpoint(name = "InfrastructurePortAsync")
    public InfrastructurePortsTypeAsync getInfrastructurePortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/infrastructure-service-async/", "InfrastructurePortAsync"), InfrastructurePortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfrastructurePortsTypeAsync
     */
    @WebEndpoint(name = "InfrastructurePortAsync")
    public InfrastructurePortsTypeAsync getInfrastructurePortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/infrastructure-service-async/", "InfrastructurePortAsync"), InfrastructurePortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INFRASTRUCTURESERVICEASYNC_EXCEPTION!= null) {
            throw INFRASTRUCTURESERVICEASYNC_EXCEPTION;
        }
        return INFRASTRUCTURESERVICEASYNC_WSDL_LOCATION;
    }

}
