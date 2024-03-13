
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AltitudeMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BaseUnitMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChargeableWeightMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ComparedValueMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DurationMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GrossTonnageMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GrossVolumeMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GrossWeightMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatitudeDegreesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatitudeMinutesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LeadTimeMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LoadingLengthMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LongitudeDegreesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LongitudeMinutesMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NetNetWeightMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NetTonnageMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NetVolumeMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NetWeightMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PostEventNotificationDurationMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreEventNotificationDurationMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SourceValueMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TareWeightMeasureType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValueMeasureType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000013&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A numeric value determined by measuring an object using a specified unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Type&lt;/ccts:PropertyTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;MeasureType"&gt;
 *       &lt;attribute name="unitCode" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType")
@XmlSeeAlso({
    AltitudeMeasureType.class,
    BaseUnitMeasureType.class,
    ChargeableWeightMeasureType.class,
    ComparedValueMeasureType.class,
    DurationMeasureType.class,
    GrossTonnageMeasureType.class,
    GrossVolumeMeasureType.class,
    GrossWeightMeasureType.class,
    LatitudeDegreesMeasureType.class,
    LatitudeMinutesMeasureType.class,
    LeadTimeMeasureType.class,
    LoadingLengthMeasureType.class,
    LongitudeDegreesMeasureType.class,
    LongitudeMinutesMeasureType.class,
    MaximumMeasureType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MeasureType.class,
    MinimumMeasureType.class,
    NetNetWeightMeasureType.class,
    NetTonnageMeasureType.class,
    NetVolumeMeasureType.class,
    NetWeightMeasureType.class,
    PostEventNotificationDurationMeasureType.class,
    PreEventNotificationDurationMeasureType.class,
    SourceValueMeasureType.class,
    TareWeightMeasureType.class,
    ValueMeasureType.class
})
public class MeasureType
    extends com.salesmanager.core.business.services.tax.pagero._2.MeasureType
{


}
