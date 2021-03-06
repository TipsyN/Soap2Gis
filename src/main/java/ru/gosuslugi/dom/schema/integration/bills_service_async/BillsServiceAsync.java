
package ru.gosuslugi.dom.schema.integration.bills_service_async;

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
@WebServiceClient(name = "BillsServiceAsync", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/bills-service-async/", wsdlLocation = "file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/bills/hcs-bills-service-async.wsdl")
public class BillsServiceAsync
    extends Service
{

    private final static URL BILLSSERVICEASYNC_WSDL_LOCATION;
    private final static WebServiceException BILLSSERVICEASYNC_EXCEPTION;
    private final static QName BILLSSERVICEASYNC_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/bills-service-async/", "BillsServiceAsync");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/work/GIS_MUP/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/\u0413\u0418\u0421%20\u0416\u041a\u0425_\u0418\u043d\u0442\u0435\u0433\u0440\u0430\u0446\u0438\u044f_v.11.9.7.1/hcs_wsdl_xsd_v.11.9.7.1/bills/hcs-bills-service-async.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BILLSSERVICEASYNC_WSDL_LOCATION = url;
        BILLSSERVICEASYNC_EXCEPTION = e;
    }

    public BillsServiceAsync() {
        super(__getWsdlLocation(), BILLSSERVICEASYNC_QNAME);
    }

    public BillsServiceAsync(WebServiceFeature... features) {
        super(__getWsdlLocation(), BILLSSERVICEASYNC_QNAME, features);
    }

    public BillsServiceAsync(URL wsdlLocation) {
        super(wsdlLocation, BILLSSERVICEASYNC_QNAME);
    }

    public BillsServiceAsync(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BILLSSERVICEASYNC_QNAME, features);
    }

    public BillsServiceAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillsServiceAsync(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BillsPortsTypeAsync
     */
    @WebEndpoint(name = "BillsPortAsync")
    public BillsPortsTypeAsync getBillsPortAsync() {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/bills-service-async/", "BillsPortAsync"), BillsPortsTypeAsync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillsPortsTypeAsync
     */
    @WebEndpoint(name = "BillsPortAsync")
    public BillsPortsTypeAsync getBillsPortAsync(WebServiceFeature... features) {
        return super.getPort(new QName("http://dom.gosuslugi.ru/schema/integration/bills-service-async/", "BillsPortAsync"), BillsPortsTypeAsync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BILLSSERVICEASYNC_EXCEPTION!= null) {
            throw BILLSSERVICEASYNC_EXCEPTION;
        }
        return BILLSSERVICEASYNC_WSDL_LOCATION;
    }

}
