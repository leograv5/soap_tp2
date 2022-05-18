
package clientsoaptp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour division complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="division">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dividende" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diviseur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "division", propOrder = {
    "dividende",
    "diviseur"
})
public class Division {

    protected int dividende;
    protected int diviseur;

    /**
     * Obtient la valeur de la propriété dividende.
     * 
     */
    public int getDividende() {
        return dividende;
    }

    /**
     * Définit la valeur de la propriété dividende.
     * 
     */
    public void setDividende(int value) {
        this.dividende = value;
    }

    /**
     * Obtient la valeur de la propriété diviseur.
     * 
     */
    public int getDiviseur() {
        return diviseur;
    }

    /**
     * Définit la valeur de la propriété diviseur.
     * 
     */
    public void setDiviseur(int value) {
        this.diviseur = value;
    }

}
