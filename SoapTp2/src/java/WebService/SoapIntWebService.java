/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Exceptions.DivisionZeroBean;
import Exceptions.DivisionZeroException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
*
* @author legravier et flvivet
*/
@WebService(serviceName = "SoapIntWebService",
            targetNamespace="http://www.floriante.fr/")
public class SoapIntWebService {

    /**
    * This is a sample web service operation
    */
    @WebMethod(operationName = "convertIntString")
    public String convertIntToString(@WebParam(name = "entier") int entier) {
        return Integer.toString(entier);
    }

    /**
    * Web service operation
    */
    @WebMethod(operationName = "division")
    public float division(@WebParam(name = "dividende") int dividende, @WebParam(name = "diviseur") int diviseur) throws DivisionZeroException {
        if (diviseur == 0) {
            throw new DivisionZeroException("On ne peut pas diviser par 0!", new DivisionZeroBean("Vous avez envoyé un 0 en tant que diviseur."), new Throwable("Impossible de divisé par 0"));
        }
        return dividende / diviseur;
    }
}
