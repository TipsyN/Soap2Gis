
package ru.gosuslugi.dom.schema.integration.msp_service_async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MSPAsyncService", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/msp-service-async/", wsdlLocation = "file:/C:/work/GIS_MUP/GIS11.5.0.8/hcs_wsdl_xsd_v.11.5.0.8/msp/hcs-msp-service-async.wsdl")
public class MSPAsyncService
    extends Service
{

    private final static URL MSPASYNCSERVICE_WSDL_LOCATION;
    private final static WebServiceException MSPASYNCSERVICE_EXCEPTION;
    private final static QName MSPASYNCSERVICE_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/msp-service-async/", "MSPAsyncService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/work/GIS_MUP/GIS11.5.0.8/hcs_wsdl_xsd_v.11.5.0.8/msp/hcs-msp-service-async.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MSPASYNCSERVICE_WSDL_LOCATION = url;
        MSPASYNCSERVICE_EXCEPTION = e;
    }

    public MSPAsyncService() {
        super(__getWsdlLocation(), MSPASYNCSERVICE_QNAME);
    }

    public MSPAsyncService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MSPASYNCSERVICE_QNAME, features);
    }

    public MSPAsyncService(URL wsdlLocation) {
        super(wsdlLocation, MSPASYNCSERVICE_QNAME);
    }

    public MSPAsyncService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MSPASYNCSERVICE_QNAME, features);
    }

    public MSPAsyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MSPAsyncService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MSPAsyncPort
     */
    @WebEndpoint(name = "MSPAsyncPort")
    public MSPAsyncPort getMSPAsyncPort() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/msp-service-async/", "MSPAsyncPort"), MSPAsyncPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MSPAsyncPort
     */
    @WebEndpoint(name = "MSPAsyncPort")
    public MSPAsyncPort getMSPAsyncPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/msp-service-async/", "MSPAsyncPort"), MSPAsyncPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MSPASYNCSERVICE_EXCEPTION!= null) {
            throw MSPASYNCSERVICE_EXCEPTION;
        }
        return MSPASYNCSERVICE_WSDL_LOCATION;
    }

}