
package clientsoaptp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour divisionZero complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="divisionZero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://www.floriante.fr/}divisionZeroBean" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divisionZero", propOrder = {
    "detail",
    "message"
})
public class DivisionZero {

    protected DivisionZeroBean detail;
    protected String message;

    /**
     * Obtient la valeur de la propriété detail.
     * 
     * @return
     *     possible object is
     *     {@link DivisionZeroBean }
     *     
     */
    public DivisionZeroBean getDetail() {
        return detail;
    }

    /**
     * Définit la valeur de la propriété detail.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionZeroBean }
     *     
     */
    public void setDetail(DivisionZeroBean value) {
        this.detail = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
