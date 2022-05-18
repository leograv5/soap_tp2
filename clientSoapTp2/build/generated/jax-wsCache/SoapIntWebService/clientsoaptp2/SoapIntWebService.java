
package clientsoaptp2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapIntWebService", targetNamespace = "http://www.floriante.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapIntWebService {


    /**
     * 
     * @param dividende
     * @param diviseur
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://www.floriante.fr/", className = "clientsoaptp2.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://www.floriante.fr/", className = "clientsoaptp2.DivisionResponse")
    public float division(
        @WebParam(name = "dividende", targetNamespace = "")
        int dividende,
        @WebParam(name = "diviseur", targetNamespace = "")
        int diviseur);

    /**
     * 
     * @param entier
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertIntString", targetNamespace = "http://www.floriante.fr/", className = "clientsoaptp2.ConvertIntString")
    @ResponseWrapper(localName = "convertIntStringResponse", targetNamespace = "http://www.floriante.fr/", className = "clientsoaptp2.ConvertIntStringResponse")
    public String convertIntString(
        @WebParam(name = "entier", targetNamespace = "")
        int entier);

}
