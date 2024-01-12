
package com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AuctionConstraintIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AuctionURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConditionsDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ElectronicDeviceDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.JustificationDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProcessDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.UBLExtensionsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A class to describe the terms to be fulfilled by tenderers if an auction is to be executed before the awarding of a tender.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AuctionTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuctionConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JustificationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConditionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicDeviceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuctionURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionTermsType", propOrder = {
    "ublExtensions",
    "auctionConstraintIndicator",
    "justificationDescription",
    "description",
    "processDescription",
    "conditionsDescription",
    "electronicDeviceDescription",
    "auctionURI"
})
public class AuctionTermsType {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "AuctionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AuctionConstraintIndicatorType auctionConstraintIndicator;
    @XmlElement(name = "JustificationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<JustificationDescriptionType> justificationDescription;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProcessDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ProcessDescriptionType> processDescription;
    @XmlElement(name = "ConditionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ConditionsDescriptionType> conditionsDescription;
    @XmlElement(name = "ElectronicDeviceDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ElectronicDeviceDescriptionType> electronicDeviceDescription;
    @XmlElement(name = "AuctionURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AuctionURIType auctionURI;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Auction_ Constraint. Indicator&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Indicates whether an electronic auction will be used before the awarding of a contract (true) or not (false).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Auction&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Constraint&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Indicator&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Indicator. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link AuctionConstraintIndicatorType }
     *     
     */
    public AuctionConstraintIndicatorType getAuctionConstraintIndicator() {
        return auctionConstraintIndicator;
    }

    /**
     * Sets the value of the auctionConstraintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionConstraintIndicatorType }
     *     
     */
    public void setAuctionConstraintIndicator(AuctionConstraintIndicatorType value) {
        this.auctionConstraintIndicator = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Justification_ Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Text describing a justification for the use of an auction in awarding the tender.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Justification&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the justificationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justificationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustificationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JustificationDescriptionType }
     * 
     * 
     */
    public List<JustificationDescriptionType> getJustificationDescription() {
        if (justificationDescription == null) {
            justificationDescription = new ArrayList<JustificationDescriptionType>();
        }
        return this.justificationDescription;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Text for tenderers describing terms governing the auction.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Process_ Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Text describing the auction process.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Process&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the processDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessDescriptionType }
     * 
     * 
     */
    public List<ProcessDescriptionType> getProcessDescription() {
        if (processDescription == null) {
            processDescription = new ArrayList<ProcessDescriptionType>();
        }
        return this.processDescription;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Conditions_ Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Text describing the conditions under which the tenderers will be able to bid as part of the auction.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Conditions&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the conditionsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionsDescriptionType }
     * 
     * 
     */
    public List<ConditionsDescriptionType> getConditionsDescription() {
        if (conditionsDescription == null) {
            conditionsDescription = new ArrayList<ConditionsDescriptionType>();
        }
        return this.conditionsDescription;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Electronic Device_ Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Text describing an electronic device used for the auction, including associated connectivity specifications.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Electronic Device&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the electronicDeviceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicDeviceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicDeviceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicDeviceDescriptionType }
     * 
     * 
     */
    public List<ElectronicDeviceDescriptionType> getElectronicDeviceDescription() {
        if (electronicDeviceDescription == null) {
            electronicDeviceDescription = new ArrayList<ElectronicDeviceDescriptionType>();
        }
        return this.electronicDeviceDescription;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:pagero:CommonAggregateComponents:1.0" xmlns:cac="urn:pagero:CommonAggregateComponents:1.0" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Auction Terms. Auction_ URI. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The Uniform Resource Identifier (URI) of the electronic device used for the auction.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Auction Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Auction&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;URI&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link AuctionURIType }
     *     
     */
    public AuctionURIType getAuctionURI() {
        return auctionURI;
    }

    /**
     * Sets the value of the auctionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionURIType }
     *     
     */
    public void setAuctionURI(AuctionURIType value) {
        this.auctionURI = value;
    }

}
