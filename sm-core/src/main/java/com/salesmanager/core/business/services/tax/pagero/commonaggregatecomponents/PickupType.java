
package com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualPickupDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualPickupTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EarliestPickupDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EarliestPickupTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestPickupDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestPickupTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A class to describe a pickup for delivery.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:AlternativeBusinessTerms&gt;Collection&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PickupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}PickupLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}PickupParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupType", propOrder = {
    "ublExtensions",
    "id",
    "actualPickupDate",
    "actualPickupTime",
    "earliestPickupDate",
    "earliestPickupTime",
    "latestPickupDate",
    "latestPickupTime",
    "pickupLocation",
    "pickupParty"
})
public class PickupType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "ActualPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualPickupDateType actualPickupDate;
    @XmlElement(name = "ActualPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualPickupTimeType actualPickupTime;
    @XmlElement(name = "EarliestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EarliestPickupDateType earliestPickupDate;
    @XmlElement(name = "EarliestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EarliestPickupTimeType earliestPickupTime;
    @XmlElement(name = "LatestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestPickupDateType latestPickupDate;
    @XmlElement(name = "LatestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestPickupTimeType latestPickupTime;
    @XmlElement(name = "PickupLocation")
    protected LocationType pickupLocation;
    @XmlElement(name = "PickupParty")
    protected PartyType pickupParty;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for this pickup.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Actual_ Pickup Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The actual pickup date.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Actual&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Pickup Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupDateType }
     *     
     */
    public ActualPickupDateType getActualPickupDate() {
        return actualPickupDate;
    }

    /**
     * Sets the value of the actualPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupDateType }
     *     
     */
    public void setActualPickupDate(ActualPickupDateType value) {
        this.actualPickupDate = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Actual_ Pickup Time. Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The actual pickup time.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Actual&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Pickup Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupTimeType }
     *     
     */
    public ActualPickupTimeType getActualPickupTime() {
        return actualPickupTime;
    }

    /**
     * Sets the value of the actualPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupTimeType }
     *     
     */
    public void setActualPickupTime(ActualPickupTimeType value) {
        this.actualPickupTime = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Earliest_ Pickup Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The earliest pickup date.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Earliest&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Pickup Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupDateType }
     *     
     */
    public EarliestPickupDateType getEarliestPickupDate() {
        return earliestPickupDate;
    }

    /**
     * Sets the value of the earliestPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupDateType }
     *     
     */
    public void setEarliestPickupDate(EarliestPickupDateType value) {
        this.earliestPickupDate = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Earliest_ Pickup Time. Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The earliest pickup time.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Earliest&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Pickup Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupTimeType }
     *     
     */
    public EarliestPickupTimeType getEarliestPickupTime() {
        return earliestPickupTime;
    }

    /**
     * Sets the value of the earliestPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupTimeType }
     *     
     */
    public void setEarliestPickupTime(EarliestPickupTimeType value) {
        this.earliestPickupTime = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Latest_ Pickup Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The latest pickup date.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Latest&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Pickup Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupDateType }
     *     
     */
    public LatestPickupDateType getLatestPickupDate() {
        return latestPickupDate;
    }

    /**
     * Sets the value of the latestPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupDateType }
     *     
     */
    public void setLatestPickupDate(LatestPickupDateType value) {
        this.latestPickupDate = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Latest_ Pickup Time. Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The latest pickup time.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Latest&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Pickup Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Time. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupTimeType }
     *     
     */
    public LatestPickupTimeType getLatestPickupTime() {
        return latestPickupTime;
    }

    /**
     * Sets the value of the latestPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupTimeType }
     *     
     */
    public void setLatestPickupTime(LatestPickupTimeType value) {
        this.latestPickupTime = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Pickup_ Location. Location&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The pickup location.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Pickup&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Location&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Location&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Location&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPickupLocation(LocationType value) {
        this.pickupLocation = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Pickup. Pickup_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The party responsible for picking up a delivery.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Pickup&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Pickup&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Party&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPickupParty() {
        return pickupParty;
    }

    /**
     * Sets the value of the pickupParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPickupParty(PartyType value) {
        this.pickupParty = value;
    }

}
