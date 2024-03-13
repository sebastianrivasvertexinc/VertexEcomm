
package com.salesmanager.core.business.services.tax.pagero.extensioncomponent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType"/&gt;
 *         &lt;element name="ClassificationType" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType"/&gt;
 *         &lt;element name="ClassificationCategory" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType"/&gt;
 *         &lt;element name="Amount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType", propOrder = {
    "type",
    "classificationType",
    "classificationCategory",
    "amount"
})
public class ClassificationType {

    @XmlElement(name = "Type", required = true)
    protected PUFTextType type;
    @XmlElement(name = "ClassificationType", required = true)
    protected PUFTextType classificationType;
    @XmlElement(name = "ClassificationCategory", required = true)
    protected PUFTextType classificationCategory;
    @XmlElement(name = "Amount", required = true)
    protected PUFAmountType amount;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PUFTextType }
     *     
     */
    public PUFTextType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUFTextType }
     *     
     */
    public void setType(PUFTextType value) {
        this.type = value;
    }

    /**
     * Gets the value of the classificationType property.
     * 
     * @return
     *     possible object is
     *     {@link PUFTextType }
     *     
     */
    public PUFTextType getClassificationType() {
        return classificationType;
    }

    /**
     * Sets the value of the classificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUFTextType }
     *     
     */
    public void setClassificationType(PUFTextType value) {
        this.classificationType = value;
    }

    /**
     * Gets the value of the classificationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link PUFTextType }
     *     
     */
    public PUFTextType getClassificationCategory() {
        return classificationCategory;
    }

    /**
     * Sets the value of the classificationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUFTextType }
     *     
     */
    public void setClassificationCategory(PUFTextType value) {
        this.classificationCategory = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link PUFAmountType }
     *     
     */
    public PUFAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUFAmountType }
     *     
     */
    public void setAmount(PUFAmountType value) {
        this.amount = value;
    }

}
