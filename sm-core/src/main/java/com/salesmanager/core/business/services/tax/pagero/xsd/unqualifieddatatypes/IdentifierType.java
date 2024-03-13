
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AccountIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AdditionalAccountIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AgencyIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AircraftIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AttributeIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AuctionURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AwardingCriterionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BarcodeSymbologyIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BrokerAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BusinessClassificationEvidenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BusinessIdentityEvidenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BuyerEventIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BuyerProfileURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CV2IDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CarrierAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChipApplicationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CompanyIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsigneeAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsignorAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumptionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumptionReportIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContractFolderIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContractedCarrierAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CustomerAssignedAccountIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CustomizationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DocumentIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EconomicOperatorRegistryURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EndpointIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExchangeMarketIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExtendedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FreightForwarderAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HazardClassIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IdentificationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ImmobilizationCertificateIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InformationURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InstructionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IssueNumberIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IssuerIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.JourneyIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LanguageIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LicensePlateIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LoadingSequenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LocationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LogoReferenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LotNumberIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LowerOrangeHazardPlacardIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MarkingIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NationalityIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NetworkIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OntologyURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OpenTenderIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OriginalContractingSystemIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OriginalJobIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ParentDocumentIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ParentDocumentLineReferenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ParentDocumentVersionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentMeansIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentTermsDetailsURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PerformingCarrierAssignedIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrepaidPaymentReferenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreviousJobIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreviousVersionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrimaryAccountNumberIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProductTraceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProfileExecutionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProfileIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RadioCallSignIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RailCarIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReferenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReferencedConsignmentIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegistrationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegistrationNationalityIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReleaseIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequestForQuotationLineIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequiredCustomsIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RevisedForecastLineIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SalesOrderIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SalesOrderLineIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SchemeURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SecurityIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SellerEventIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SequenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SequenceNumberIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SerialIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ShippingOrderIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SignatureIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SpecificationIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SubscriberIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SuccessiveSequenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SupplierAssignedAccountIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TenderEnvelopeIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TraceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TrackingIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TrainIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportExecutionPlanReferenceIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportationServiceDetailsURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.UBLVersionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.URIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.UUIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.UpperOrangeHazardPlacardIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidatorIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.VariantIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.VersionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.VesselIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.WebsiteURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.ExtensionAgencyIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.ExtensionAgencyURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.ExtensionURIType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.ExtensionVersionIDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.signaturebasiccomponents.ReferencedSignatureIDType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000011&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and uniquely distinguish one instance of an object in an identification scheme from all other objects in the same scheme, together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the identifier list and thus, are not declared as attributes. &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;IdentifierType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType")
@XmlSeeAlso({
    AccountIDType.class,
    AdditionalAccountIDType.class,
    AgencyIDType.class,
    AircraftIDType.class,
    AttributeIDType.class,
    AuctionURIType.class,
    AwardingCriterionIDType.class,
    BarcodeSymbologyIDType.class,
    BrokerAssignedIDType.class,
    BusinessClassificationEvidenceIDType.class,
    BusinessIdentityEvidenceIDType.class,
    BuyerEventIDType.class,
    BuyerProfileURIType.class,
    CV2IDType.class,
    CarrierAssignedIDType.class,
    ChipApplicationIDType.class,
    CompanyIDType.class,
    ConsigneeAssignedIDType.class,
    ConsignorAssignedIDType.class,
    ConsumptionIDType.class,
    ConsumptionReportIDType.class,
    ContractFolderIDType.class,
    ContractedCarrierAssignedIDType.class,
    CustomerAssignedAccountIDType.class,
    CustomizationIDType.class,
    DocumentIDType.class,
    EconomicOperatorRegistryURIType.class,
    EndpointIDType.class,
    ExchangeMarketIDType.class,
    ExtendedIDType.class,
    FreightForwarderAssignedIDType.class,
    HazardClassIDType.class,
    IDType.class,
    IdentificationIDType.class,
    ImmobilizationCertificateIDType.class,
    InformationURIType.class,
    InstructionIDType.class,
    IssueNumberIDType.class,
    IssuerIDType.class,
    JourneyIDType.class,
    LanguageIDType.class,
    LicensePlateIDType.class,
    LineIDType.class,
    LoadingSequenceIDType.class,
    LocationIDType.class,
    LogoReferenceIDType.class,
    LotNumberIDType.class,
    LowerOrangeHazardPlacardIDType.class,
    MarkingIDType.class,
    NationalityIDType.class,
    NetworkIDType.class,
    OntologyURIType.class,
    OpenTenderIDType.class,
    OriginalContractingSystemIDType.class,
    OriginalJobIDType.class,
    ParentDocumentIDType.class,
    ParentDocumentLineReferenceIDType.class,
    ParentDocumentVersionIDType.class,
    PaymentIDType.class,
    PaymentMeansIDType.class,
    PaymentTermsDetailsURIType.class,
    PerformingCarrierAssignedIDType.class,
    PrepaidPaymentReferenceIDType.class,
    PreviousJobIDType.class,
    PreviousVersionIDType.class,
    PrimaryAccountNumberIDType.class,
    ProductTraceIDType.class,
    ProfileExecutionIDType.class,
    ProfileIDType.class,
    RadioCallSignIDType.class,
    RailCarIDType.class,
    ReferenceIDType.class,
    ReferencedConsignmentIDType.class,
    RegistrationIDType.class,
    RegistrationNationalityIDType.class,
    ReleaseIDType.class,
    RequestForQuotationLineIDType.class,
    RequiredCustomsIDType.class,
    RevisedForecastLineIDType.class,
    SalesOrderIDType.class,
    SalesOrderLineIDType.class,
    SchemeURIType.class,
    SecurityIDType.class,
    SellerEventIDType.class,
    SequenceIDType.class,
    SequenceNumberIDType.class,
    SerialIDType.class,
    ShippingOrderIDType.class,
    SignatureIDType.class,
    SpecificationIDType.class,
    SubscriberIDType.class,
    SuccessiveSequenceIDType.class,
    SupplierAssignedAccountIDType.class,
    TenderEnvelopeIDType.class,
    TraceIDType.class,
    TrackingIDType.class,
    TrainIDType.class,
    TransportExecutionPlanReferenceIDType.class,
    TransportationServiceDetailsURIType.class,
    UBLVersionIDType.class,
    URIType.class,
    UUIDType.class,
    UpperOrangeHazardPlacardIDType.class,
    ValidatorIDType.class,
    VariantIDType.class,
    VersionIDType.class,
    VesselIDType.class,
    WebsiteURIType.class,
    ExtensionAgencyIDType.class,
    ExtensionAgencyURIType.class,
    ExtensionURIType.class,
    ExtensionVersionIDType.class,
    ReferencedSignatureIDType.class
})
public class IdentifierType
    extends com.salesmanager.core.business.services.tax.pagero._2.IdentifierType
{


}
