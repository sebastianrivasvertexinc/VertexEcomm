
package com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LocationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LocationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Stowage. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A class to describe a location on board a means of transport where specified goods or transport equipment have been stowed or are to be stowed.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Stowage&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StowageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StowageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LocationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StowageType", propOrder = {
    "ublExtensions",
    "locationID",
    "location",
    "measurementDimension"
})
public class StowageType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "LocationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LocationIDType locationID;
    @XmlElement(name = "Location", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<LocationType> location;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Stowage. Location Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for the location.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Stowage&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Location Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;Cell Location, coded&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LocationIDType }
     *     
     */
    public LocationIDType getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIDType }
     *     
     */
    public void setLocationID(LocationIDType value) {
        this.locationID = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Stowage. Location. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Text describing the location.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Stowage&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Location&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;Cell Location&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Stowage. Measurement_ Dimension. Dimension&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A measurable dimension (length, mass, weight, or volume) of this stowage.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Stowage&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Measurement&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Dimension&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Dimension&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Dimension&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the measurementDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimension() {
        if (measurementDimension == null) {
            measurementDimension = new ArrayList<DimensionType>();
        }
        return this.measurementDimension;
    }

}
