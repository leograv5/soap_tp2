/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsoaptp2;

/**
 *
 * @author legravier
 */
public class ClientSoapTp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoapIntWebService service = (new SoapIntWebService_Service()).getSoapIntWebServicePort();
        try {
            float result = service.division(10, 2);
            System.out.println(result);
        } catch (DivisionZeroException ex) {
            System.out.println(ex.getFaultInfo());
        }
        String chaine = service.convertIntString(524);
        System.out.println(chaine);
        try {
            service.division(10, 0);
        } catch (DivisionZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
