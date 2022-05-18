
package clientsoaptp2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientsoaptp2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConvertIntString_QNAME = new QName("http://www.floriante.fr/", "convertIntString");
    private final static QName _ConvertIntStringResponse_QNAME = new QName("http://www.floriante.fr/", "convertIntStringResponse");
    private final static QName _DivisionResponse_QNAME = new QName("http://www.floriante.fr/", "divisionResponse");
    private final static QName _Division_QNAME = new QName("http://www.floriante.fr/", "division");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientsoaptp2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link ConvertIntStringResponse }
     * 
     */
    public ConvertIntStringResponse createConvertIntStringResponse() {
        return new ConvertIntStringResponse();
    }

    /**
     * Create an instance of {@link ConvertIntString }
     * 
     */
    public ConvertIntString createConvertIntString() {
        return new ConvertIntString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertIntString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.floriante.fr/", name = "convertIntString")
    public JAXBElement<ConvertIntString> createConvertIntString(ConvertIntString value) {
        return new JAXBElement<ConvertIntString>(_ConvertIntString_QNAME, ConvertIntString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertIntStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.floriante.fr/", name = "convertIntStringResponse")
    public JAXBElement<ConvertIntStringResponse> createConvertIntStringResponse(ConvertIntStringResponse value) {
        return new JAXBElement<ConvertIntStringResponse>(_ConvertIntStringResponse_QNAME, ConvertIntStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.floriante.fr/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.floriante.fr/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

}
