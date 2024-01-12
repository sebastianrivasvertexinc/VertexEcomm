
package com.salesmanager.core.business.services.tax.pagero;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pagero.pagerouniversalformat.invoice._1 package. 
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

    private final static QName _Invoice_QNAME = new QName("urn:pagero:PageroUniversalFormat:Invoice:1.0", "Invoice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pagero.pagerouniversalformat.invoice._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:pagero:PageroUniversalFormat:Invoice:1.0", name = "Invoice")
    public JAXBElement<InvoiceType> createInvoice(InvoiceType value) {
        return new JAXBElement<InvoiceType>(_Invoice_QNAME, InvoiceType.class, null, value);
    }

}
