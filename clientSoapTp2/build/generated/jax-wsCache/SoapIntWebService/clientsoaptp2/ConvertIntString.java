
package clientsoaptp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour convertIntString complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="convertIntString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertIntString", propOrder = {
    "entier"
})
public class ConvertIntString {

    protected int entier;

    /**
     * Obtient la valeur de la propriété entier.
     * 
     */
    public int getEntier() {
        return entier;
    }

    /**
     * Définit la valeur de la propriété entier.
     * 
     */
    public void setEntier(int value) {
        this.entier = value;
    }

}
