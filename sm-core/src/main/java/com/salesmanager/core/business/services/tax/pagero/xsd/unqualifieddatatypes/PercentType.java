
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AirFlowPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HumidityPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PartecipationPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ParticipationPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PenaltySurchargePercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProgressPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReliabilityPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SettlementDiscountPercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TargetServicePercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TierRatePercentType;
import com.salesmanager.core.business.services.tax.pagero._2.NumericType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000016&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Percent. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric information that is assigned or is determined by calculation, counting, or sequencing and is expressed as a percentage. It does not require a unit of quantity or unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Percent&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PercentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;NumericType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentType")
@XmlSeeAlso({
    AirFlowPercentType.class,
    HumidityPercentType.class,
    MaximumPercentType.class,
    MinimumPercentType.class,
    PartecipationPercentType.class,
    ParticipationPercentType.class,
    PaymentPercentType.class,
    PenaltySurchargePercentType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PercentType.class,
    ProgressPercentType.class,
    ReliabilityPercentType.class,
    SettlementDiscountPercentType.class,
    TargetServicePercentType.class,
    TierRatePercentType.class
})
public class PercentType
    extends NumericType
{


}
