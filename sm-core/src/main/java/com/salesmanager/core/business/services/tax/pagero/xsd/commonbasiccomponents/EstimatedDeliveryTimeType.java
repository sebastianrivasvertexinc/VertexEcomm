
package com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.salesmanager.core.business.services.tax.pagero.xsd.unqualifieddatatypes.TimeType;


/**
 * <p>Java class for EstimatedDeliveryTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedDeliveryTimeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oasis:names:specification:ubl:schema:xsd:UnqualifiedDataTypes-2&gt;TimeType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedDeliveryTimeType")
public class EstimatedDeliveryTimeType
    extends TimeType
{


}