
package com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A class to define a reference to a billing document.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BillingReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}InvoiceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}SelfBilledInvoiceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}CreditNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}SelfBilledCreditNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}DebitNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}ReminderDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}AdditionalDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}BillingReferenceLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingReferenceType", propOrder = {
    "ublExtensions",
    "invoiceDocumentReference",
    "selfBilledInvoiceDocumentReference",
    "creditNoteDocumentReference",
    "selfBilledCreditNoteDocumentReference",
    "debitNoteDocumentReference",
    "reminderDocumentReference",
    "additionalDocumentReference",
    "billingReferenceLine"
})
public class BillingReferenceType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "InvoiceDocumentReference")
    protected DocumentReferenceType invoiceDocumentReference;
    @XmlElement(name = "SelfBilledInvoiceDocumentReference")
    protected DocumentReferenceType selfBilledInvoiceDocumentReference;
    @XmlElement(name = "CreditNoteDocumentReference")
    protected DocumentReferenceType creditNoteDocumentReference;
    @XmlElement(name = "SelfBilledCreditNoteDocumentReference")
    protected DocumentReferenceType selfBilledCreditNoteDocumentReference;
    @XmlElement(name = "DebitNoteDocumentReference")
    protected DocumentReferenceType debitNoteDocumentReference;
    @XmlElement(name = "ReminderDocumentReference")
    protected DocumentReferenceType reminderDocumentReference;
    @XmlElement(name = "AdditionalDocumentReference")
    protected DocumentReferenceType additionalDocumentReference;
    @XmlElement(name = "BillingReferenceLine")
    protected List<BillingReferenceLineType> billingReferenceLine;

    /**
     * A container for all extensions present in the document.
     * 
     * @return
     *     possible object is
     *     {@link UBLExtensionsType }
     *     
     */
    public UBLExtensionsType getUBLExtensions() {
        return ublExtensions;
    }

    /**
     * Sets the value of the ublExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLExtensionsType }
     *     
     */
    public void setUBLExtensions(UBLExtensionsType value) {
        this.ublExtensions = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Invoice_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to an invoice.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Invoice&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getInvoiceDocumentReference() {
        return invoiceDocumentReference;
    }

    /**
     * Sets the value of the invoiceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setInvoiceDocumentReference(DocumentReferenceType value) {
        this.invoiceDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Self Billed Invoice_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a self billed invoice.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Self Billed Invoice&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSelfBilledInvoiceDocumentReference() {
        return selfBilledInvoiceDocumentReference;
    }

    /**
     * Sets the value of the selfBilledInvoiceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSelfBilledInvoiceDocumentReference(DocumentReferenceType value) {
        this.selfBilledInvoiceDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Credit Note_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a credit note.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Credit Note&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCreditNoteDocumentReference() {
        return creditNoteDocumentReference;
    }

    /**
     * Sets the value of the creditNoteDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCreditNoteDocumentReference(DocumentReferenceType value) {
        this.creditNoteDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Self Billed Credit Note_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a self billed credit note.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Self Billed Credit Note&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSelfBilledCreditNoteDocumentReference() {
        return selfBilledCreditNoteDocumentReference;
    }

    /**
     * Sets the value of the selfBilledCreditNoteDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSelfBilledCreditNoteDocumentReference(DocumentReferenceType value) {
        this.selfBilledCreditNoteDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Debit Note_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a debit note.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Debit Note&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDebitNoteDocumentReference() {
        return debitNoteDocumentReference;
    }

    /**
     * Sets the value of the debitNoteDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDebitNoteDocumentReference(DocumentReferenceType value) {
        this.debitNoteDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Reminder_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a billing reminder.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Reminder&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getReminderDocumentReference() {
        return reminderDocumentReference;
    }

    /**
     * Sets the value of the reminderDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setReminderDocumentReference(DocumentReferenceType value) {
        this.reminderDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Additional_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to an additional document.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Additional&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getAdditionalDocumentReference() {
        return additionalDocumentReference;
    }

    /**
     * Sets the value of the additionalDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setAdditionalDocumentReference(DocumentReferenceType value) {
        this.additionalDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Billing Reference. Billing Reference Line&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a transaction line in the billing document.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Billing Reference&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Billing Reference Line&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Billing Reference Line&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Billing Reference Line&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the billingReferenceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReferenceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReferenceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReferenceLineType }
     * 
     * 
     */
    public List<BillingReferenceLineType> getBillingReferenceLine() {
        if (billingReferenceLine == null) {
            billingReferenceLine = new ArrayList<BillingReferenceLineType>();
        }
        return this.billingReferenceLine;
    }

}
