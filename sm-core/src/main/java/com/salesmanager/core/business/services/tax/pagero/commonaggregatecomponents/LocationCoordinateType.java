
package com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AltitudeMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CoordinateSystemCodeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatitudeDegreesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatitudeDirectionCodeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatitudeMinutesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LongitudeDegreesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LongitudeDirectionCodeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LongitudeMinutesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A class for defining a set of geographical coordinates (apparently misnamed).&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LocationCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationCoordinateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CoordinateSystemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDegreesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeMinutesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDegreesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeMinutesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AltitudeMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCoordinateType", propOrder = {
    "ublExtensions",
    "coordinateSystemCode",
    "latitudeDegreesMeasure",
    "latitudeMinutesMeasure",
    "latitudeDirectionCode",
    "longitudeDegreesMeasure",
    "longitudeMinutesMeasure",
    "longitudeDirectionCode",
    "altitudeMeasure"
})
public class LocationCoordinateType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "CoordinateSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CoordinateSystemCodeType coordinateSystemCode;
    @XmlElement(name = "LatitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeDegreesMeasureType latitudeDegreesMeasure;
    @XmlElement(name = "LatitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeMinutesMeasureType latitudeMinutesMeasure;
    @XmlElement(name = "LatitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeDirectionCodeType latitudeDirectionCode;
    @XmlElement(name = "LongitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeDegreesMeasureType longitudeDegreesMeasure;
    @XmlElement(name = "LongitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeMinutesMeasureType longitudeMinutesMeasure;
    @XmlElement(name = "LongitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeDirectionCodeType longitudeDirectionCode;
    @XmlElement(name = "AltitudeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AltitudeMeasureType altitudeMeasure;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Coordinate System Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code signifying the location system used.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Coordinate System Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemCodeType }
     *     
     */
    public CoordinateSystemCodeType getCoordinateSystemCode() {
        return coordinateSystemCode;
    }

    /**
     * Sets the value of the coordinateSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemCodeType }
     *     
     */
    public void setCoordinateSystemCode(CoordinateSystemCodeType value) {
        this.coordinateSystemCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Latitude_ Degrees. Measure&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The degree component of a latitude measured in degrees and minutes.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Latitude&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Degrees&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Measure&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Measure. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDegreesMeasureType }
     *     
     */
    public LatitudeDegreesMeasureType getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    /**
     * Sets the value of the latitudeDegreesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDegreesMeasureType }
     *     
     */
    public void setLatitudeDegreesMeasure(LatitudeDegreesMeasureType value) {
        this.latitudeDegreesMeasure = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Latitude_ Minutes. Measure&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The minutes component of a latitude measured in degrees and minutes (modulo 60).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Latitude&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Minutes&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Measure&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Measure. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LatitudeMinutesMeasureType }
     *     
     */
    public LatitudeMinutesMeasureType getLatitudeMinutesMeasure() {
        return latitudeMinutesMeasure;
    }

    /**
     * Sets the value of the latitudeMinutesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeMinutesMeasureType }
     *     
     */
    public void setLatitudeMinutesMeasure(LatitudeMinutesMeasureType value) {
        this.latitudeMinutesMeasure = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Latitude Direction Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code signifying the direction of latitude measurement from the equator (north or south).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Latitude Direction Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataTypeQualifier&gt;Latitude Direction&lt;/ccts:DataTypeQualifier&gt;&lt;ccts:DataType&gt;Latitude Direction_ Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDirectionCodeType }
     *     
     */
    public LatitudeDirectionCodeType getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    /**
     * Sets the value of the latitudeDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDirectionCodeType }
     *     
     */
    public void setLatitudeDirectionCode(LatitudeDirectionCodeType value) {
        this.latitudeDirectionCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Longitude_ Degrees. Measure&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The degree component of a longitude measured in degrees and minutes.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Longitude&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Degrees&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Measure&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Measure. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDegreesMeasureType }
     *     
     */
    public LongitudeDegreesMeasureType getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    /**
     * Sets the value of the longitudeDegreesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDegreesMeasureType }
     *     
     */
    public void setLongitudeDegreesMeasure(LongitudeDegreesMeasureType value) {
        this.longitudeDegreesMeasure = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Longitude_ Minutes. Measure&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The minutes component of a longitude measured in degrees and minutes (modulo 60).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Longitude&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Minutes&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Measure&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Measure. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LongitudeMinutesMeasureType }
     *     
     */
    public LongitudeMinutesMeasureType getLongitudeMinutesMeasure() {
        return longitudeMinutesMeasure;
    }

    /**
     * Sets the value of the longitudeMinutesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeMinutesMeasureType }
     *     
     */
    public void setLongitudeMinutesMeasure(LongitudeMinutesMeasureType value) {
        this.longitudeMinutesMeasure = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Longitude Direction Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code signifying the direction of longitude measurement from the prime meridian (east or west).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Longitude Direction Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataTypeQualifier&gt;Longitude Direction&lt;/ccts:DataTypeQualifier&gt;&lt;ccts:DataType&gt;Longitude Direction_ Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDirectionCodeType }
     *     
     */
    public LongitudeDirectionCodeType getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    /**
     * Sets the value of the longitudeDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDirectionCodeType }
     *     
     */
    public void setLongitudeDirectionCode(LongitudeDirectionCodeType value) {
        this.longitudeDirectionCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Location Coordinate. Altitude. Measure&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The altitude of the location.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Location Coordinate&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Altitude&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Measure&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Measure. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link AltitudeMeasureType }
     *     
     */
    public AltitudeMeasureType getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Sets the value of the altitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeMeasureType }
     *     
     */
    public void setAltitudeMeasure(AltitudeMeasureType value) {
        this.altitudeMeasure = value;
    }

}
