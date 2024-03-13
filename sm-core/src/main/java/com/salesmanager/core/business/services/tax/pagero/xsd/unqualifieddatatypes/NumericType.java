
package com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.BudgetYearNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.CalculationSequenceNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.FrozenPeriodDaysNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineCountNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineNumberNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumCopiesNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumNumberNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MaximumPaymentInstructionsNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MinimumNumberNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.MultiplierFactorNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OrderIntervalDaysNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.OrderQuantityIncrementNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PackSizeNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ReminderSequenceNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.ResidentOccupantsNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.SequenceNumericType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.WeightNumericType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000014&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric information that is assigned or is determined by calculation, counting, or sequencing. It does not require a unit of quantity or unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for NumericType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericType"&gt;
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
@XmlType(name = "NumericType")
@XmlSeeAlso({
    BudgetYearNumericType.class,
    CalculationSequenceNumericType.class,
    FrozenPeriodDaysNumericType.class,
    LineCountNumericType.class,
    LineNumberNumericType.class,
    MaximumCopiesNumericType.class,
    MaximumNumberNumericType.class,
    MaximumPaymentInstructionsNumericType.class,
    MinimumNumberNumericType.class,
    MultiplierFactorNumericType.class,
    OrderIntervalDaysNumericType.class,
    OrderQuantityIncrementNumericType.class,
    PackSizeNumericType.class,
    ReminderSequenceNumericType.class,
    ResidentOccupantsNumericType.class,
    SequenceNumericType.class,
    WeightNumericType.class
})
public class NumericType
    extends com.salesmanager.core.business.services.tax.pagero._2.NumericType
{


}
