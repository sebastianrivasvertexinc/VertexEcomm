
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AcceptedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AdValoremIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AnimalFoodApprovedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AnimalFoodIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AuctionConstraintIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BackOrderAllowedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BalanceBroughtForwardIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BasedOnConsensusIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BindingOnBuyerIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BulkCargoIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CandidateReductionConstraintIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CatalogueIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChargeIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CompletionIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsolidatableIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContainerizedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CopyIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CustomsImportClassifiedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DangerousGoodsApprovedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FollowupContractIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FreeOfChargeIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FrozenDocumentIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FullyPaidSharesIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GeneralCargoIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GovernmentAgreementConstraintIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HazardousRiskIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HumanFoodApprovedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HumanFoodIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IndicationIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ItemUpdateRequestIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LegalStatusIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LivestockIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MarkAttentionIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MarkCareIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OnCarriageIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OptionalLineItemIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OrderableIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OtherConditionsIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PartialDeliveryIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PowerIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreCarriageIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrepaidIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PricingUpdateRequestIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrizeIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PublishAwardIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RefrigeratedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RefrigerationOnIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequiredCurriculaIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReturnabilityIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReturnableMaterialIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SoleProprietorshipIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SpecialSecurityIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SplitConsignmentIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.StatusAvailableIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxEvidenceIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxIncludedIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ThirdPartyPayerIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ToOrderIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.UnknownPriceIndicatorType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.VariantConstraintIndicatorType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000012&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicator. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A list of two mutually exclusive Boolean values that express the only possible states of a property.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicator&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IndicatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndicatorType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AcceptedIndicatorType.class,
    AdValoremIndicatorType.class,
    AnimalFoodApprovedIndicatorType.class,
    AnimalFoodIndicatorType.class,
    AuctionConstraintIndicatorType.class,
    BackOrderAllowedIndicatorType.class,
    BalanceBroughtForwardIndicatorType.class,
    BasedOnConsensusIndicatorType.class,
    BindingOnBuyerIndicatorType.class,
    BulkCargoIndicatorType.class,
    CandidateReductionConstraintIndicatorType.class,
    CatalogueIndicatorType.class,
    ChargeIndicatorType.class,
    CompletionIndicatorType.class,
    ConsolidatableIndicatorType.class,
    ContainerizedIndicatorType.class,
    CopyIndicatorType.class,
    CustomsImportClassifiedIndicatorType.class,
    DangerousGoodsApprovedIndicatorType.class,
    FollowupContractIndicatorType.class,
    FreeOfChargeIndicatorType.class,
    FrozenDocumentIndicatorType.class,
    FullyPaidSharesIndicatorType.class,
    GeneralCargoIndicatorType.class,
    GovernmentAgreementConstraintIndicatorType.class,
    HazardousRiskIndicatorType.class,
    HumanFoodApprovedIndicatorType.class,
    HumanFoodIndicatorType.class,
    IndicationIndicatorType.class,
    ItemUpdateRequestIndicatorType.class,
    LegalStatusIndicatorType.class,
    LivestockIndicatorType.class,
    MarkAttentionIndicatorType.class,
    MarkCareIndicatorType.class,
    OnCarriageIndicatorType.class,
    OptionalLineItemIndicatorType.class,
    OrderableIndicatorType.class,
    OtherConditionsIndicatorType.class,
    PartialDeliveryIndicatorType.class,
    PowerIndicatorType.class,
    PreCarriageIndicatorType.class,
    PrepaidIndicatorType.class,
    PricingUpdateRequestIndicatorType.class,
    PrizeIndicatorType.class,
    PublishAwardIndicatorType.class,
    RefrigeratedIndicatorType.class,
    RefrigerationOnIndicatorType.class,
    RequiredCurriculaIndicatorType.class,
    ReturnabilityIndicatorType.class,
    ReturnableMaterialIndicatorType.class,
    SoleProprietorshipIndicatorType.class,
    SpecialSecurityIndicatorType.class,
    SplitConsignmentIndicatorType.class,
    StatusAvailableIndicatorType.class,
    TaxEvidenceIndicatorType.class,
    TaxIncludedIndicatorType.class,
    ThirdPartyPayerIndicatorType.class,
    ToOrderIndicatorType.class,
    UnknownPriceIndicatorType.class,
    VariantConstraintIndicatorType.class
})
public class IndicatorType {

    @XmlValue
    protected boolean value;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}
