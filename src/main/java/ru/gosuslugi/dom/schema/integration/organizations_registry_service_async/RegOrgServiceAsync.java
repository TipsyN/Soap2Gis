
package ru.gosuslugi.dom.schema.integration.organizations_registry_service_async;

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
@WebServiceClient(name = "RegOrgServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-service-async/", wsdlLocation = "file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/organizations-registry/hcs-organizations-registry-service-async.wsdl")
public class RegOrgServiceAsync
    extends Service
{

    private final static URL REGORGSERVICEASYNC_WSDL_LOCATION;
    private final static WebServiceException REGORGSERVICEASYNC_EXCEPTION;
    private final static QName REGORGSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-service-async/", "RegOrgServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/organizations-registry/hcs-organizations-registry-service-async.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGORGSERVICEASYNC_WSDL_LOCATION = url;
        REGORGSERVICEASYNC_EXCEPTION = e;
    }

    public RegOrgServiceAsync() {
        super(__getWsdlLocation(), REGORGSERVICEASYNC_QNAME);
    }

    public RegOrgServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGORGSERVICEASYNC_QNAME, features);
    }

    public RegOrgServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, REGORGSERVICEASYNC_QNAME);
    }

    public RegOrgServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGORGSERVICEASYNC_QNAME, features);
    }

    public RegOrgServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegOrgServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegOrgPortsTypeAsync
     */
    @WebEndpoint(name = "RegOrgAsyncPort")
    public RegOrgPortsTypeAsync getRegOrgAsyncPort() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-service-async/", "RegOrgAsyncPort"), RegOrgPortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegOrgPortsTypeAsync
     */
    @WebEndpoint(name = "RegOrgAsyncPort")
    public RegOrgPortsTypeAsync getRegOrgAsyncPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-service-async/", "RegOrgAsyncPort"), RegOrgPortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGORGSERVICEASYNC_EXCEPTION!= null) {
            throw REGORGSERVICEASYNC_EXCEPTION;
        }
        return REGORGSERVICEASYNC_WSDL_LOCATION;
    }

}
