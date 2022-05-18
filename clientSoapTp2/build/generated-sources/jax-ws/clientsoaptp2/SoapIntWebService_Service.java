
package clientsoaptp2;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SoapIntWebService", targetNamespace = "http://www.floriante.fr/", wsdlLocation = "http://localhost:8080/SoapTp2/SoapIntWebService?wsdl")
public class SoapIntWebService_Service
    extends Service
{

    private final static URL SOAPINTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPINTWEBSERVICE_EXCEPTION;
    private final static QName SOAPINTWEBSERVICE_QNAME = new QName("http://www.floriante.fr/", "SoapIntWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SoapTp2/SoapIntWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPINTWEBSERVICE_WSDL_LOCATION = url;
        SOAPINTWEBSERVICE_EXCEPTION = e;
    }

    public SoapIntWebService_Service() {
        super(__getWsdlLocation(), SOAPINTWEBSERVICE_QNAME);
    }

    public SoapIntWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPINTWEBSERVICE_QNAME, features);
    }

    public SoapIntWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SOAPINTWEBSERVICE_QNAME);
    }

    public SoapIntWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPINTWEBSERVICE_QNAME, features);
    }

    public SoapIntWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapIntWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapIntWebService
     */
    @WebEndpoint(name = "SoapIntWebServicePort")
    public SoapIntWebService getSoapIntWebServicePort() {
        return super.getPort(new QName("http://www.floriante.fr/", "SoapIntWebServicePort"), SoapIntWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapIntWebService
     */
    @WebEndpoint(name = "SoapIntWebServicePort")
    public SoapIntWebService getSoapIntWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.floriante.fr/", "SoapIntWebServicePort"), SoapIntWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPINTWEBSERVICE_EXCEPTION!= null) {
            throw SOAPINTWEBSERVICE_EXCEPTION;
        }
        return SOAPINTWEBSERVICE_WSDL_LOCATION;
    }

}