
package com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes.AmountType;


/**
 * <p>Java class for TotalInvoiceAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalInvoiceAmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oasis:names:specification:ubl:schema:xsd:UnqualifiedDataTypes-2&gt;AmountType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalInvoiceAmountType")
public class TotalInvoiceAmountType
    extends AmountType
{


}
