
package com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineNumberNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Event Line Item. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A class to define a line item describing the expected impacts associated with a retail event involving a specific product at a specific location.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Event Line Item&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EventLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}ParticipatingLocationsLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}RetailPlannedImpact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLineItemType", propOrder = {
    "ublExtensions",
    "lineNumberNumeric",
    "participatingLocationsLocation",
    "retailPlannedImpact",
    "supplyItem"
})
public class EventLineItemType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "LineNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineNumberNumericType lineNumberNumeric;
    @XmlElement(name = "ParticipatingLocationsLocation")
    protected LocationType participatingLocationsLocation;
    @XmlElement(name = "RetailPlannedImpact")
    protected List<RetailPlannedImpactType> retailPlannedImpact;
    @XmlElement(name = "SupplyItem", required = true)
    protected ItemType supplyItem;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Event Line Item. Line Number. Numeric&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The number of this event line item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Event Line Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Line Number&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Numeric&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Numeric. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LineNumberNumericType }
     *     
     */
    public LineNumberNumericType getLineNumberNumeric() {
        return lineNumberNumeric;
    }

    /**
     * Sets the value of the lineNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNumberNumericType }
     *     
     */
    public void setLineNumberNumeric(LineNumberNumericType value) {
        this.lineNumberNumeric = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Event Line Item. Participating Locations_ Location. Location&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The location of the stores involved in the event described in this line item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Event Line Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Participating Locations&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Location&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Location&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Location&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getParticipatingLocationsLocation() {
        return participatingLocationsLocation;
    }

    /**
     * Sets the value of the participatingLocationsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setParticipatingLocationsLocation(LocationType value) {
        this.participatingLocationsLocation = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Event Line Item. Retail Planned Impact&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A planned impact of the event described in this line item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Event Line Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Retail Planned Impact&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Retail Planned Impact&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Retail Planned Impact&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the retailPlannedImpact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPlannedImpact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPlannedImpact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPlannedImpactType }
     * 
     * 
     */
    public List<RetailPlannedImpactType> getRetailPlannedImpact() {
        if (retailPlannedImpact == null) {
            retailPlannedImpact = new ArrayList<RetailPlannedImpactType>();
        }
        return this.retailPlannedImpact;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Event Line Item. Supply_ Item. Item&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The product with which the event is associated.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Event Line Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Supply&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Item&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Sets the value of the supplyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
    }

}
