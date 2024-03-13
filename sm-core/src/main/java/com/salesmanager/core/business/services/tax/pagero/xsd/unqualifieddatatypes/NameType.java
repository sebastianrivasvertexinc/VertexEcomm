
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AdditionalStreetNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AliasNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BlockNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BrandNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BuildingNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CategoryNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CityNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CitySubdivisionNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FamilyNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FileNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FirstNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HolderNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MiddleNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ModelNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OtherNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegistrationNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RetailEventNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RoamingPartnerNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ServiceNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.StreetNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TechnicalNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.VesselNameType;
import com.salesmanager.core.business.services.tax.pagero._2.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000020&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string that constitutes the distinctive designation of a person, place, thing or concept.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;TextType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType")
@XmlSeeAlso({
    AdditionalStreetNameType.class,
    AliasNameType.class,
    BlockNameType.class,
    BrandNameType.class,
    BuildingNameType.class,
    CategoryNameType.class,
    CityNameType.class,
    CitySubdivisionNameType.class,
    FamilyNameType.class,
    FileNameType.class,
    FirstNameType.class,
    HolderNameType.class,
    MiddleNameType.class,
    ModelNameType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NameType.class,
    OtherNameType.class,
    RegistrationNameType.class,
    RetailEventNameType.class,
    RoamingPartnerNameType.class,
    ServiceNameType.class,
    StreetNameType.class,
    TechnicalNameType.class,
    VesselNameType.class
})
public class NameType
    extends TextType
{


}
