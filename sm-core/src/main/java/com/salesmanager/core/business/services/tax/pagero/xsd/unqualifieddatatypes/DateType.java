
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualDeliveryDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualDespatchDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualPickupDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ApprovalDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AvailabilityDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AwardDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BestBeforeDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BirthDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CallDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ComparisonForecastIssueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EarliestPickupDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EffectiveDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EndDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedDeliveryDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedDespatchDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExpiryDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FirstShipmentAvailibilityDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GuaranteedDespatchDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InstallmentDueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IssueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LastRevisionDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestDeliveryDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestMeterReadingDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestPickupDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestProposalAcceptanceDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestSecurityClearanceDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ManufactureDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NominationDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OccurrenceDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaidDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentDueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PlannedDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreviousMeterReadingDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReceivedDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReferenceDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegisteredDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegistrationDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegistrationExpirationDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequestedDeliveryDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequestedDespatchDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequestedPublicationDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequiredDeliveryDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResolutionDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResponseDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RevisionDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SourceForecastIssueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.StartDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SubmissionDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SubmissionDueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxPointDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidationDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidityStartDateType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000009&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;One calendar day according the Gregorian calendar.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ActualDeliveryDateType.class,
    ActualDespatchDateType.class,
    ActualPickupDateType.class,
    ApprovalDateType.class,
    AvailabilityDateType.class,
    AwardDateType.class,
    BestBeforeDateType.class,
    BirthDateType.class,
    CallDateType.class,
    ComparisonForecastIssueDateType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DateType.class,
    DueDateType.class,
    EarliestPickupDateType.class,
    EffectiveDateType.class,
    EndDateType.class,
    EstimatedDeliveryDateType.class,
    EstimatedDespatchDateType.class,
    ExpiryDateType.class,
    FirstShipmentAvailibilityDateType.class,
    GuaranteedDespatchDateType.class,
    InstallmentDueDateType.class,
    IssueDateType.class,
    LastRevisionDateType.class,
    LatestDeliveryDateType.class,
    LatestMeterReadingDateType.class,
    LatestPickupDateType.class,
    LatestProposalAcceptanceDateType.class,
    LatestSecurityClearanceDateType.class,
    ManufactureDateType.class,
    NominationDateType.class,
    OccurrenceDateType.class,
    PaidDateType.class,
    PaymentDueDateType.class,
    PlannedDateType.class,
    PreviousMeterReadingDateType.class,
    ReceivedDateType.class,
    ReferenceDateType.class,
    RegisteredDateType.class,
    RegistrationDateType.class,
    RegistrationExpirationDateType.class,
    RequestedDeliveryDateType.class,
    RequestedDespatchDateType.class,
    RequestedPublicationDateType.class,
    RequiredDeliveryDateType.class,
    ResolutionDateType.class,
    ResponseDateType.class,
    RevisionDateType.class,
    SourceForecastIssueDateType.class,
    StartDateType.class,
    SubmissionDateType.class,
    SubmissionDueDateType.class,
    TaxPointDateType.class,
    ValidationDateType.class,
    ValidityStartDateType.class
})
public class DateType {

    @XmlValue
    @XmlSchemaType(name = "date")
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
