
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AcceptedVariantsDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AccountingCostType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActivityTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AdditionalConditionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AdditionalInformationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AgencyNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AllowanceChargeReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ApprovalStatusType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AwardingCriterionDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BackorderReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BirthplaceNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BuildingNumberType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BuyerReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CalculationExpressionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CancellationNoteType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CandidateStatementType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CanonicalizationMethodType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CarrierServiceInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CertificateTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChangeConditionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChannelType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CharacteristicsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CodeValueType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CommentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CompanyLegalFormType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConditionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConditionsDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConditionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumersEnergyLevelType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumptionLevelType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumptionTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContractNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContractSubdivisionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContractTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CorrectionTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CountrySubentityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CurrentChargeTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CustomerReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CustomsClearanceServiceInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DamageRemarksType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DataSendingCapabilityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DeliveryInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DemurrageInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DepartmentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DistrictType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DocumentDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DocumentHashType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DocumentStatusReasonDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DocumentTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DutyType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ElectronicDeviceDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ElectronicMailType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExclusionReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExemptionReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExpressionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExtensionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FeeDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FloorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ForwarderServiceInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FrequencyType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FundingProgramType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HandlingInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HashAlgorithmMethodType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HaulageInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HeatingTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InformationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InhouseMailType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InstructionNoteType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InvoicingPartyReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.JobTitleType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.JustificationDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.JustificationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.KeywordType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestMeterReadingMethodType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LegalReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LimitationDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ListValueType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LocationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LoginType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LossRiskType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LowTendersDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MarkAttentionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MarkCareType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumValueType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MeterConstantType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MeterNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MeterNumberType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MeterReadingCommentsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MeterReadingTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumImprovementBidType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumValueType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MonetaryScopeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MovieTitleType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NameSuffixType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NegotiationDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NoteType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OneTimeChargeTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OptionsDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OrderableUnitType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OrganizationDepartmentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OtherInstructionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OutstandingReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PackingMaterialType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PartyTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PasswordType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PayPerViewType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PayerReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentNoteType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaymentOrderReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PersonalSituationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PhoneNumberType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PlacardEndorsementType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PlacardNotationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PlotIdentificationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PostalZoneType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PostboxType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreviousMeterReadingMethodType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PriceChangeReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PriceRevisionFormulaDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PriceTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrintQualifierType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PriorityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrizeDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProcessDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ProcessReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PurposeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RankType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReferenceType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegistrationNationalityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RegulatoryDomainType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RejectReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RejectionNoteType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RemarksType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReplenishmentOwnerDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResidenceTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResolutionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RoleDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RoomType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SealingPartyTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ServiceNumberCalledType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ServiceTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ShippingMarksType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ShipsRequirementsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SignatureMethodType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SpecialInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SpecialServiceInstructionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SpecialTermsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SpecialTransportRequirementsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.StatusReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SubscriberTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SummaryDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TariffDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxExemptionReasonType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TechnicalCommitteeDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TelecommunicationsServiceCallType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TelecommunicationsServiceCategoryType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TelecommunicationsSupplyTypeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TelefaxType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TelephoneType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TestMethodType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TierRangeType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TimeAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TimezoneOffsetType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TimingComplaintType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TitleType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TradingRestrictionsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportServiceProviderRemarksType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportServiceProviderSpecialTermsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportUserRemarksType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportUserSpecialTermsType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransportationServiceDescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidateProcessType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidateToolType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValidateToolVersionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValueQualifierType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValueType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.WarrantyInformationType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.WeightType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.WorkPhaseType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.XPathType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.ExtensionAgencyNameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonextensioncomponents.ExtensionReasonType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000019&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (i.e. a finite set of characters), generally in the form of words of a language.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextType"&gt;
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
@XmlType(name = "TextType")
@XmlSeeAlso({
    AcceptedVariantsDescriptionType.class,
    AccountingCostType.class,
    ActivityTypeType.class,
    AdditionalConditionsType.class,
    AdditionalInformationType.class,
    AgencyNameType.class,
    AllowanceChargeReasonType.class,
    ApprovalStatusType.class,
    AwardingCriterionDescriptionType.class,
    BackorderReasonType.class,
    BirthplaceNameType.class,
    BuildingNumberType.class,
    BuyerReferenceType.class,
    CalculationExpressionType.class,
    CancellationNoteType.class,
    CandidateStatementType.class,
    CanonicalizationMethodType.class,
    CarrierServiceInstructionsType.class,
    CertificateTypeType.class,
    ChangeConditionsType.class,
    ChannelType.class,
    CharacteristicsType.class,
    CodeValueType.class,
    CommentType.class,
    CompanyLegalFormType.class,
    ConditionType.class,
    ConditionsType.class,
    ConditionsDescriptionType.class,
    ConsumersEnergyLevelType.class,
    ConsumptionLevelType.class,
    ConsumptionTypeType.class,
    ContentType.class,
    ContractNameType.class,
    ContractSubdivisionType.class,
    ContractTypeType.class,
    CorrectionTypeType.class,
    CountrySubentityType.class,
    CurrentChargeTypeType.class,
    CustomerReferenceType.class,
    CustomsClearanceServiceInstructionsType.class,
    DamageRemarksType.class,
    DataSendingCapabilityType.class,
    DeliveryInstructionsType.class,
    DemurrageInstructionsType.class,
    DepartmentType.class,
    DescriptionType.class,
    DistrictType.class,
    DocumentDescriptionType.class,
    DocumentHashType.class,
    DocumentStatusReasonDescriptionType.class,
    DocumentTypeType.class,
    DutyType.class,
    ElectronicDeviceDescriptionType.class,
    ElectronicMailType.class,
    ExclusionReasonType.class,
    ExemptionReasonType.class,
    ExpressionType.class,
    ExtensionType.class,
    FeeDescriptionType.class,
    FloorType.class,
    ForwarderServiceInstructionsType.class,
    FrequencyType.class,
    FundingProgramType.class,
    HandlingInstructionsType.class,
    HashAlgorithmMethodType.class,
    HaulageInstructionsType.class,
    HeatingTypeType.class,
    InformationType.class,
    InhouseMailType.class,
    InstructionNoteType.class,
    InstructionsType.class,
    InvoicingPartyReferenceType.class,
    JobTitleType.class,
    JustificationType.class,
    JustificationDescriptionType.class,
    KeywordType.class,
    LatestMeterReadingMethodType.class,
    LegalReferenceType.class,
    LimitationDescriptionType.class,
    LineType.class,
    ListValueType.class,
    LocationType.class,
    LoginType.class,
    LossRiskType.class,
    LowTendersDescriptionType.class,
    MarkAttentionType.class,
    MarkCareType.class,
    MaximumValueType.class,
    MeterConstantType.class,
    MeterNameType.class,
    MeterNumberType.class,
    MeterReadingCommentsType.class,
    MeterReadingTypeType.class,
    MinimumImprovementBidType.class,
    MinimumValueType.class,
    MonetaryScopeType.class,
    MovieTitleType.class,
    NameSuffixType.class,
    NegotiationDescriptionType.class,
    NoteType.class,
    OneTimeChargeTypeType.class,
    OptionsDescriptionType.class,
    OrderableUnitType.class,
    OrganizationDepartmentType.class,
    OtherInstructionType.class,
    OutstandingReasonType.class,
    PackingMaterialType.class,
    PartyTypeType.class,
    PasswordType.class,
    PayPerViewType.class,
    PayerReferenceType.class,
    PaymentDescriptionType.class,
    PaymentNoteType.class,
    PaymentOrderReferenceType.class,
    PersonalSituationType.class,
    PhoneNumberType.class,
    PlacardEndorsementType.class,
    PlacardNotationType.class,
    PlotIdentificationType.class,
    PostalZoneType.class,
    PostboxType.class,
    PreviousMeterReadingMethodType.class,
    PriceChangeReasonType.class,
    PriceRevisionFormulaDescriptionType.class,
    PriceTypeType.class,
    PrintQualifierType.class,
    PriorityType.class,
    PrizeDescriptionType.class,
    ProcessDescriptionType.class,
    ProcessReasonType.class,
    PurposeType.class,
    RankType.class,
    ReferenceType.class,
    RegionType.class,
    RegistrationNationalityType.class,
    RegulatoryDomainType.class,
    RejectReasonType.class,
    RejectionNoteType.class,
    RemarksType.class,
    ReplenishmentOwnerDescriptionType.class,
    ResidenceTypeType.class,
    ResolutionType.class,
    RoleDescriptionType.class,
    RoomType.class,
    SealingPartyTypeType.class,
    ServiceNumberCalledType.class,
    ServiceTypeType.class,
    ShippingMarksType.class,
    ShipsRequirementsType.class,
    SignatureMethodType.class,
    SpecialInstructionsType.class,
    SpecialServiceInstructionsType.class,
    SpecialTermsType.class,
    SpecialTransportRequirementsType.class,
    StatusReasonType.class,
    SubscriberTypeType.class,
    SummaryDescriptionType.class,
    TariffDescriptionType.class,
    TaxExemptionReasonType.class,
    TechnicalCommitteeDescriptionType.class,
    TelecommunicationsServiceCallType.class,
    TelecommunicationsServiceCategoryType.class,
    TelecommunicationsSupplyTypeType.class,
    TelefaxType.class,
    TelephoneType.class,
    TestMethodType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TextType.class,
    TierRangeType.class,
    TimeAmountType.class,
    TimezoneOffsetType.class,
    TimingComplaintType.class,
    TitleType.class,
    TradingRestrictionsType.class,
    TransportServiceProviderRemarksType.class,
    TransportServiceProviderSpecialTermsType.class,
    TransportUserRemarksType.class,
    TransportUserSpecialTermsType.class,
    TransportationServiceDescriptionType.class,
    ValidateProcessType.class,
    ValidateToolType.class,
    ValidateToolVersionType.class,
    ValueType.class,
    ValueQualifierType.class,
    WarrantyInformationType.class,
    WeightType.class,
    WorkPhaseType.class,
    XPathType.class,
    ExtensionAgencyNameType.class,
    ExtensionReasonType.class
})
public class TextType
    extends com.salesmanager.core.business.services.tax.pagero._2.TextType
{


}
