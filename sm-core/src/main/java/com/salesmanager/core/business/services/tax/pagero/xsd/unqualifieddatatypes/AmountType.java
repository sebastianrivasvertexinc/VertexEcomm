
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AdvertisementAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AllowanceTotalAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AnnualAverageAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AverageAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AverageSubsequentContractAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BalanceAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BaseAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CallBaseAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CallExtensionAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChargeTotalAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CorporateStockAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CorrectionAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CorrectionUnitAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CreditLineAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DebitLineAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DeclaredCarriageValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DeclaredCustomsValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DeclaredForCarriageValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DeclaredStatisticsValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DocumentationFeeAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedOverallContractAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FaceValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FeeAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FreeOnBoardValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.HigherTenderAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InsurancePremiumAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InsuranceValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InventoryValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LiabilityAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineExtensionAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LowerTenderAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MarketValueAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumAdvertisementAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumPaidAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PaidAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PartyCapacityAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PayableAlternativeAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PayableAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PayableRoundingAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PenaltyAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PerUnitAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PrepaidAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PriceAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RequiredFeeAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RoundingAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SettlementDiscountAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxEnergyAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxEnergyBalanceAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxEnergyOnAccountAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxExclusiveAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxInclusiveAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxableAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ThresholdAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalBalanceAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalCreditAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalDebitAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalInvoiceAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalPaymentAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalTaskAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalTaxAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TransactionCurrencyTaxAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValueAmountType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000001&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A number of monetary units specified using a given unit of currency.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;AmountType"&gt;
 *       &lt;attribute name="currencyID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType")
@XmlSeeAlso({
    AdvertisementAmountType.class,
    AllowanceTotalAmountType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.AmountType.class,
    AnnualAverageAmountType.class,
    AverageAmountType.class,
    AverageSubsequentContractAmountType.class,
    BalanceAmountType.class,
    BaseAmountType.class,
    CallBaseAmountType.class,
    CallExtensionAmountType.class,
    ChargeTotalAmountType.class,
    CorporateStockAmountType.class,
    CorrectionAmountType.class,
    CorrectionUnitAmountType.class,
    CreditLineAmountType.class,
    DebitLineAmountType.class,
    DeclaredCarriageValueAmountType.class,
    DeclaredCustomsValueAmountType.class,
    DeclaredForCarriageValueAmountType.class,
    DeclaredStatisticsValueAmountType.class,
    DocumentationFeeAmountType.class,
    EstimatedAmountType.class,
    EstimatedOverallContractAmountType.class,
    FaceValueAmountType.class,
    FeeAmountType.class,
    FreeOnBoardValueAmountType.class,
    HigherTenderAmountType.class,
    InsurancePremiumAmountType.class,
    InsuranceValueAmountType.class,
    InventoryValueAmountType.class,
    LiabilityAmountType.class,
    LineExtensionAmountType.class,
    LowerTenderAmountType.class,
    MarketValueAmountType.class,
    MaximumAdvertisementAmountType.class,
    MaximumAmountType.class,
    MaximumPaidAmountType.class,
    MinimumAmountType.class,
    PaidAmountType.class,
    PartyCapacityAmountType.class,
    PayableAlternativeAmountType.class,
    PayableAmountType.class,
    PayableRoundingAmountType.class,
    PenaltyAmountType.class,
    PerUnitAmountType.class,
    PrepaidAmountType.class,
    PriceAmountType.class,
    RequiredFeeAmountType.class,
    RoundingAmountType.class,
    SettlementDiscountAmountType.class,
    TaxAmountType.class,
    TaxEnergyAmountType.class,
    TaxEnergyBalanceAmountType.class,
    TaxEnergyOnAccountAmountType.class,
    TaxExclusiveAmountType.class,
    TaxInclusiveAmountType.class,
    TaxableAmountType.class,
    ThresholdAmountType.class,
    TotalAmountType.class,
    TotalBalanceAmountType.class,
    TotalCreditAmountType.class,
    TotalDebitAmountType.class,
    TotalInvoiceAmountType.class,
    TotalPaymentAmountType.class,
    TotalTaskAmountType.class,
    TotalTaxAmountType.class,
    TransactionCurrencyTaxAmountType.class,
    ValueAmountType.class
})
public class AmountType
    extends com.salesmanager.core.business.services.tax.pagero._2.AmountType
{


}
