
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualDeliveryTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualDespatchTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualPickupTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AwardTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CallTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ComparisonForecastIssueTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EarliestPickupTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EffectiveTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EndTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedDeliveryTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedDespatchTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExpiryTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GuaranteedDespatchTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IssueTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LastRevisionTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestDeliveryTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestPickupTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ManufactureTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NominationTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OccurrenceTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaidTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReferenceTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegisteredTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequestedDespatchTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequiredDeliveryTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResolutionTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResponseTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RevisionTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SourceForecastIssueTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.StartTimeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidationTimeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000010&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An instance of time that occurs every day.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;time"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ActualDeliveryTimeType.class,
    ActualDespatchTimeType.class,
    ActualPickupTimeType.class,
    AwardTimeType.class,
    CallTimeType.class,
    ComparisonForecastIssueTimeType.class,
    EarliestPickupTimeType.class,
    EffectiveTimeType.class,
    EndTimeType.class,
    EstimatedDeliveryTimeType.class,
    EstimatedDespatchTimeType.class,
    ExpiryTimeType.class,
    GuaranteedDespatchTimeType.class,
    IssueTimeType.class,
    LastRevisionTimeType.class,
    LatestDeliveryTimeType.class,
    LatestPickupTimeType.class,
    ManufactureTimeType.class,
    NominationTimeType.class,
    OccurrenceTimeType.class,
    PaidTimeType.class,
    ReferenceTimeType.class,
    RegisteredTimeType.class,
    RequestedDespatchTimeType.class,
    RequiredDeliveryTimeType.class,
    ResolutionTimeType.class,
    ResponseTimeType.class,
    RevisionTimeType.class,
    SourceForecastIssueTimeType.class,
    StartTimeType.class,
    ValidationTimeType.class
})
public class TimeType {

    @XmlValue
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}
