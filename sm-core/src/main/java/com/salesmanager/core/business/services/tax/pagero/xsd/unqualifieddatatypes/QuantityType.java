
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ActualTemperatureReductionQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BackorderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BaseQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BasicConsumedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BatchQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChargeableQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ChildConsignmentQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsignmentQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumerUnitQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumptionEnergyQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ConsumptionWaterQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ContentUnitQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CreditedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CrewQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CustomsTariffQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DebitedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DeliveredQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DifferenceTemperatureReductionQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EmployeeQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedConsumedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.EstimatedOverallContractQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExpectedOperatorQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ExpectedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.GasPressureQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.InvoicedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LatestMeterQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumBackorderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumOperatorQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumOrderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumVariantQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumBackorderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumInventoryQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumOrderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MultipleOrderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NormalTemperatureReductionQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OperatingYearsQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OutstandingQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OversupplyQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PackQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PassengerQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PerformanceValueQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PreviousMeterQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReceivedElectronicTenderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReceivedForeignTenderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReceivedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReceivedTenderQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.RejectedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReturnableQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SharesNumberQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ShortQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TargetInventoryQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ThresholdQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TimeDeltaDaysQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalConsumedQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalDeliveredQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalGoodsItemQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalMeteredQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalPackageQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalPackagesQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TotalTransportHandlingUnitQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ValueQuantityType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.VarianceQuantityType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000018&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units, possibly including a fractional part.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;QuantityType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType")
@XmlSeeAlso({
    ActualTemperatureReductionQuantityType.class,
    BackorderQuantityType.class,
    BaseQuantityType.class,
    BasicConsumedQuantityType.class,
    BatchQuantityType.class,
    ChargeableQuantityType.class,
    ChildConsignmentQuantityType.class,
    ConsignmentQuantityType.class,
    ConsumerUnitQuantityType.class,
    ConsumptionEnergyQuantityType.class,
    ConsumptionWaterQuantityType.class,
    ContentUnitQuantityType.class,
    CreditedQuantityType.class,
    CrewQuantityType.class,
    CustomsTariffQuantityType.class,
    DebitedQuantityType.class,
    DeliveredQuantityType.class,
    DifferenceTemperatureReductionQuantityType.class,
    EmployeeQuantityType.class,
    EstimatedConsumedQuantityType.class,
    EstimatedOverallContractQuantityType.class,
    ExpectedOperatorQuantityType.class,
    ExpectedQuantityType.class,
    GasPressureQuantityType.class,
    InvoicedQuantityType.class,
    LatestMeterQuantityType.class,
    MaximumBackorderQuantityType.class,
    MaximumOperatorQuantityType.class,
    MaximumOrderQuantityType.class,
    MaximumQuantityType.class,
    MaximumVariantQuantityType.class,
    MinimumBackorderQuantityType.class,
    MinimumInventoryQuantityType.class,
    MinimumOrderQuantityType.class,
    MinimumQuantityType.class,
    MultipleOrderQuantityType.class,
    NormalTemperatureReductionQuantityType.class,
    OperatingYearsQuantityType.class,
    OutstandingQuantityType.class,
    OversupplyQuantityType.class,
    PackQuantityType.class,
    PassengerQuantityType.class,
    PerformanceValueQuantityType.class,
    PreviousMeterQuantityType.class,
    com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.QuantityType.class,
    ReceivedElectronicTenderQuantityType.class,
    ReceivedForeignTenderQuantityType.class,
    ReceivedQuantityType.class,
    ReceivedTenderQuantityType.class,
    RejectedQuantityType.class,
    ReturnableQuantityType.class,
    SharesNumberQuantityType.class,
    ShortQuantityType.class,
    TargetInventoryQuantityType.class,
    ThresholdQuantityType.class,
    TimeDeltaDaysQuantityType.class,
    TotalConsumedQuantityType.class,
    TotalDeliveredQuantityType.class,
    TotalGoodsItemQuantityType.class,
    TotalMeteredQuantityType.class,
    TotalPackageQuantityType.class,
    TotalPackagesQuantityType.class,
    TotalTransportHandlingUnitQuantityType.class,
    ValueQuantityType.class,
    VarianceQuantityType.class
})
public class QuantityType
    extends com.salesmanager.core.business.services.tax.pagero._2.QuantityType
{


}
