
package com.salesmanager.core.business.services.tax.pagero.extensioncomponent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.DescriptionType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IDType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.IssueDateType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.LineExtensionAmountType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NameType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.NoteType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.PercentType;
import com.salesmanager.core.business.services.tax.pagero.xsd.commonbasiccomponents.TaxTypeCodeType;
import org.w3c.dom.Element;
import com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents.DocumentReferenceType;
import com.salesmanager.core.business.services.tax.pagero.commonaggregatecomponents.TaxTotalType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RestrictedInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RestrictedInformationLine" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{urn:pagero:ExtensionComponent:1.0}PUFCodeType"/&gt;
 *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}TaxTotal" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplierGeneratedQRString" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QRString" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
 *                   &lt;element name="QREncodingType" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplyType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DutyStamp" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IGSTOnIntra" type="{urn:pagero:ExtensionComponent:1.0}PUFIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="BillingSoftware" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Number" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
 *                   &lt;element name="Hash" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}InvoiceSeries" minOccurs="0"/&gt;
 *         &lt;element name="OrderReferenceExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SalesOrderIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillingReferenceExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}InvoiceSeries" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code" minOccurs="0"/&gt;
 *                   &lt;element name="RestrictedInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractDocumentReferenceExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BuyerContractID" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
 *                   &lt;element name="BuyerContractIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PartyExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RegistrationData" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}IDType"/&gt;
 *                             &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ADAID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}IDType"/&gt;
 *                             &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeliveryExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DeliveryMethod" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentTermsExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Penalty" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxSubtotalExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TaxCurrencyTaxableAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxCurrencyTaxAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxInclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxCurrencyTaxInclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxChargeability" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxTypeCode"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EquivalenceSurcharge" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent"/&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
 *                             &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LegalMonetaryTotalExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TaxCurrencyTaxExclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxCurrencyTaxInclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxCurrencyPayableAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentInKind" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrepaidPaymentExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}TaxTotal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
 *         &lt;element name="LineExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RestrictedInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
 *                             &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxCurrencyLineExtensionAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxInclusiveLineExtensionAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxCurrencyTaxInclusiveLineExtensionAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="LineExclAllowanceChargeAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="OrderLineReference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SalesOrderIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OriginatorDocumentReference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProjectReference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ContractDocumentReference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *                             &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *                             &lt;element name="BuyerContractID" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
 *                             &lt;element name="BuyerContractIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PriceExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PriceInclAllowanceChargeAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;element name="TaxCurrencyPriceAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemType" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
 *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "restrictedInformation",
    "restrictedInformationLine",
    "classification",
    "supplierGeneratedQRString",
    "supplyType",
    "dutyStamp",
    "igstOnIntra",
    "billingSoftware",
    "invoiceSeries",
    "orderReferenceExtension",
    "billingReferenceExtension",
    "contractDocumentReferenceExtension",
    "partyExtension",
    "deliveryExtension",
    "paymentTermsExtension",
    "taxSubtotalExtension",
    "legalMonetaryTotalExtension",
    "prepaidPaymentExtension",
    "languageCode",
    "lineExtension",
    "priceExtension",
    "itemExtension",
    "any"
})
@XmlRootElement(name = "PageroExtension")
public class PageroExtension {

    @XmlElement(name = "RestrictedInformation")
    protected List<RestrictedInformation> restrictedInformation;
    @XmlElement(name = "RestrictedInformationLine")
    protected List<RestrictedInformationLine> restrictedInformationLine;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "SupplierGeneratedQRString")
    protected SupplierGeneratedQRString supplierGeneratedQRString;
    @XmlElement(name = "SupplyType")
    protected SupplyType supplyType;
    @XmlElement(name = "DutyStamp")
    protected DutyStamp dutyStamp;
    @XmlElement(name = "IGSTOnIntra")
    protected PUFIndicatorType igstOnIntra;
    @XmlElement(name = "BillingSoftware")
    protected BillingSoftware billingSoftware;
    @XmlElement(name = "InvoiceSeries")
    protected InvoiceSeriesType invoiceSeries;
    @XmlElement(name = "OrderReferenceExtension")
    protected OrderReferenceExtension orderReferenceExtension;
    @XmlElement(name = "BillingReferenceExtension")
    protected BillingReferenceExtension billingReferenceExtension;
    @XmlElement(name = "ContractDocumentReferenceExtension")
    protected ContractDocumentReferenceExtension contractDocumentReferenceExtension;
    @XmlElement(name = "PartyExtension")
    protected PartyExtension partyExtension;
    @XmlElement(name = "DeliveryExtension")
    protected DeliveryExtension deliveryExtension;
    @XmlElement(name = "PaymentTermsExtension")
    protected PaymentTermsExtension paymentTermsExtension;
    @XmlElement(name = "TaxSubtotalExtension")
    protected TaxSubtotalExtension taxSubtotalExtension;
    @XmlElement(name = "LegalMonetaryTotalExtension")
    protected LegalMonetaryTotalExtension legalMonetaryTotalExtension;
    @XmlElement(name = "PrepaidPaymentExtension")
    protected PrepaidPaymentExtension prepaidPaymentExtension;
    @XmlElement(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlElement(name = "LineExtension")
    protected LineExtension lineExtension;
    @XmlElement(name = "PriceExtension")
    protected PriceExtension priceExtension;
    @XmlElement(name = "ItemExtension")
    protected ItemExtension itemExtension;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the restrictedInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictedInformation }
     * 
     * 
     */
    public List<RestrictedInformation> getRestrictedInformation() {
        if (restrictedInformation == null) {
            restrictedInformation = new ArrayList<RestrictedInformation>();
        }
        return this.restrictedInformation;
    }

    /**
     * Gets the value of the restrictedInformationLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedInformationLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedInformationLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictedInformationLine }
     * 
     * 
     */
    public List<RestrictedInformationLine> getRestrictedInformationLine() {
        if (restrictedInformationLine == null) {
            restrictedInformationLine = new ArrayList<RestrictedInformationLine>();
        }
        return this.restrictedInformationLine;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the supplierGeneratedQRString property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierGeneratedQRString }
     *     
     */
    public SupplierGeneratedQRString getSupplierGeneratedQRString() {
        return supplierGeneratedQRString;
    }

    /**
     * Sets the value of the supplierGeneratedQRString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierGeneratedQRString }
     *     
     */
    public void setSupplierGeneratedQRString(SupplierGeneratedQRString value) {
        this.supplierGeneratedQRString = value;
    }

    /**
     * Gets the value of the supplyType property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyType }
     *     
     */
    public SupplyType getSupplyType() {
        return supplyType;
    }

    /**
     * Sets the value of the supplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyType }
     *     
     */
    public void setSupplyType(SupplyType value) {
        this.supplyType = value;
    }

    /**
     * Gets the value of the dutyStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DutyStamp }
     *     
     */
    public DutyStamp getDutyStamp() {
        return dutyStamp;
    }

    /**
     * Sets the value of the dutyStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyStamp }
     *     
     */
    public void setDutyStamp(DutyStamp value) {
        this.dutyStamp = value;
    }

    /**
     * Gets the value of the igstOnIntra property.
     * 
     * @return
     *     possible object is
     *     {@link PUFIndicatorType }
     *     
     */
    public PUFIndicatorType getIGSTOnIntra() {
        return igstOnIntra;
    }

    /**
     * Sets the value of the igstOnIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUFIndicatorType }
     *     
     */
    public void setIGSTOnIntra(PUFIndicatorType value) {
        this.igstOnIntra = value;
    }

    /**
     * Gets the value of the billingSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSoftware }
     *     
     */
    public BillingSoftware getBillingSoftware() {
        return billingSoftware;
    }

    /**
     * Sets the value of the billingSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSoftware }
     *     
     */
    public void setBillingSoftware(BillingSoftware value) {
        this.billingSoftware = value;
    }

    /**
     * Gets the value of the invoiceSeries property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSeriesType }
     *     
     */
    public InvoiceSeriesType getInvoiceSeries() {
        return invoiceSeries;
    }

    /**
     * Sets the value of the invoiceSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSeriesType }
     *     
     */
    public void setInvoiceSeries(InvoiceSeriesType value) {
        this.invoiceSeries = value;
    }

    /**
     * Gets the value of the orderReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferenceExtension }
     *     
     */
    public OrderReferenceExtension getOrderReferenceExtension() {
        return orderReferenceExtension;
    }

    /**
     * Sets the value of the orderReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferenceExtension }
     *     
     */
    public void setOrderReferenceExtension(OrderReferenceExtension value) {
        this.orderReferenceExtension = value;
    }

    /**
     * Gets the value of the billingReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link BillingReferenceExtension }
     *     
     */
    public BillingReferenceExtension getBillingReferenceExtension() {
        return billingReferenceExtension;
    }

    /**
     * Sets the value of the billingReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingReferenceExtension }
     *     
     */
    public void setBillingReferenceExtension(BillingReferenceExtension value) {
        this.billingReferenceExtension = value;
    }

    /**
     * Gets the value of the contractDocumentReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDocumentReferenceExtension }
     *     
     */
    public ContractDocumentReferenceExtension getContractDocumentReferenceExtension() {
        return contractDocumentReferenceExtension;
    }

    /**
     * Sets the value of the contractDocumentReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDocumentReferenceExtension }
     *     
     */
    public void setContractDocumentReferenceExtension(ContractDocumentReferenceExtension value) {
        this.contractDocumentReferenceExtension = value;
    }

    /**
     * Gets the value of the partyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PartyExtension }
     *     
     */
    public PartyExtension getPartyExtension() {
        return partyExtension;
    }

    /**
     * Sets the value of the partyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyExtension }
     *     
     */
    public void setPartyExtension(PartyExtension value) {
        this.partyExtension = value;
    }

    /**
     * Gets the value of the deliveryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryExtension }
     *     
     */
    public DeliveryExtension getDeliveryExtension() {
        return deliveryExtension;
    }

    /**
     * Sets the value of the deliveryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryExtension }
     *     
     */
    public void setDeliveryExtension(DeliveryExtension value) {
        this.deliveryExtension = value;
    }

    /**
     * Gets the value of the paymentTermsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsExtension }
     *     
     */
    public PaymentTermsExtension getPaymentTermsExtension() {
        return paymentTermsExtension;
    }

    /**
     * Sets the value of the paymentTermsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsExtension }
     *     
     */
    public void setPaymentTermsExtension(PaymentTermsExtension value) {
        this.paymentTermsExtension = value;
    }

    /**
     * Gets the value of the taxSubtotalExtension property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSubtotalExtension }
     *     
     */
    public TaxSubtotalExtension getTaxSubtotalExtension() {
        return taxSubtotalExtension;
    }

    /**
     * Sets the value of the taxSubtotalExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSubtotalExtension }
     *     
     */
    public void setTaxSubtotalExtension(TaxSubtotalExtension value) {
        this.taxSubtotalExtension = value;
    }

    /**
     * Gets the value of the legalMonetaryTotalExtension property.
     * 
     * @return
     *     possible object is
     *     {@link LegalMonetaryTotalExtension }
     *     
     */
    public LegalMonetaryTotalExtension getLegalMonetaryTotalExtension() {
        return legalMonetaryTotalExtension;
    }

    /**
     * Sets the value of the legalMonetaryTotalExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalMonetaryTotalExtension }
     *     
     */
    public void setLegalMonetaryTotalExtension(LegalMonetaryTotalExtension value) {
        this.legalMonetaryTotalExtension = value;
    }

    /**
     * Gets the value of the prepaidPaymentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidPaymentExtension }
     *     
     */
    public PrepaidPaymentExtension getPrepaidPaymentExtension() {
        return prepaidPaymentExtension;
    }

    /**
     * Sets the value of the prepaidPaymentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidPaymentExtension }
     *     
     */
    public void setPrepaidPaymentExtension(PrepaidPaymentExtension value) {
        this.prepaidPaymentExtension = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the lineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link LineExtension }
     *     
     */
    public LineExtension getLineExtension() {
        return lineExtension;
    }

    /**
     * Sets the value of the lineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtension }
     *     
     */
    public void setLineExtension(LineExtension value) {
        this.lineExtension = value;
    }

    /**
     * Gets the value of the priceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtension }
     *     
     */
    public PriceExtension getPriceExtension() {
        return priceExtension;
    }

    /**
     * Sets the value of the priceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtension }
     *     
     */
    public void setPriceExtension(PriceExtension value) {
        this.priceExtension = value;
    }

    /**
     * Gets the value of the itemExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ItemExtension }
     *     
     */
    public ItemExtension getItemExtension() {
        return itemExtension;
    }

    /**
     * Sets the value of the itemExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemExtension }
     *     
     */
    public void setItemExtension(ItemExtension value) {
        this.itemExtension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}InvoiceSeries" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code" minOccurs="0"/&gt;
     *         &lt;element name="RestrictedInformation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invoiceSeries",
        "note",
        "code",
        "restrictedInformation"
    })
    public static class BillingReferenceExtension {

        @XmlElement(name = "InvoiceSeries")
        protected InvoiceSeriesType invoiceSeries;
        @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        protected NoteType note;
        @XmlElement(name = "Code")
        protected PUFCodeType code;
        @XmlElement(name = "RestrictedInformation")
        protected List<RestrictedInformation> restrictedInformation;

        /**
         * Gets the value of the invoiceSeries property.
         * 
         * @return
         *     possible object is
         *     {@link InvoiceSeriesType }
         *     
         */
        public InvoiceSeriesType getInvoiceSeries() {
            return invoiceSeries;
        }

        /**
         * Sets the value of the invoiceSeries property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvoiceSeriesType }
         *     
         */
        public void setInvoiceSeries(InvoiceSeriesType value) {
            this.invoiceSeries = value;
        }

        /**
         * Gets the value of the note property.
         * 
         * @return
         *     possible object is
         *     {@link NoteType }
         *     
         */
        public NoteType getNote() {
            return note;
        }

        /**
         * Sets the value of the note property.
         * 
         * @param value
         *     allowed object is
         *     {@link NoteType }
         *     
         */
        public void setNote(NoteType value) {
            this.note = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link PUFCodeType }
         *     
         */
        public PUFCodeType getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFCodeType }
         *     
         */
        public void setCode(PUFCodeType value) {
            this.code = value;
        }

        /**
         * Gets the value of the restrictedInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restrictedInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestrictedInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestrictedInformation }
         * 
         * 
         */
        public List<RestrictedInformation> getRestrictedInformation() {
            if (restrictedInformation == null) {
                restrictedInformation = new ArrayList<RestrictedInformation>();
            }
            return this.restrictedInformation;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class RestrictedInformation {

            @XmlElement(name = "Key", required = true)
            protected PUFCodeType key;
            @XmlElement(name = "Value", required = true)
            protected PUFTextType value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link PUFCodeType }
             *     
             */
            public PUFCodeType getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFCodeType }
             *     
             */
            public void setKey(PUFCodeType value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link PUFTextType }
             *     
             */
            public PUFTextType getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFTextType }
             *     
             */
            public void setValue(PUFTextType value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Number" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
     *         &lt;element name="Hash" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "number",
        "hash",
        "description"
    })
    public static class BillingSoftware {

        @XmlElement(name = "Number")
        protected PUFTextType number;
        @XmlElement(name = "Hash")
        protected PUFTextType hash;
        @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        protected DescriptionType description;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link PUFTextType }
         *     
         */
        public PUFTextType getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFTextType }
         *     
         */
        public void setNumber(PUFTextType value) {
            this.number = value;
        }

        /**
         * Gets the value of the hash property.
         * 
         * @return
         *     possible object is
         *     {@link PUFTextType }
         *     
         */
        public PUFTextType getHash() {
            return hash;
        }

        /**
         * Sets the value of the hash property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFTextType }
         *     
         */
        public void setHash(PUFTextType value) {
            this.hash = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptionType }
         *     
         */
        public DescriptionType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptionType }
         *     
         */
        public void setDescription(DescriptionType value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BuyerContractID" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
     *         &lt;element name="BuyerContractIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "buyerContractID",
        "buyerContractIssueDate",
        "any"
    })
    public static class ContractDocumentReferenceExtension {

        @XmlElement(name = "BuyerContractID")
        protected PUFIDType buyerContractID;
        @XmlElement(name = "BuyerContractIssueDate")
        protected PUFDateType buyerContractIssueDate;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the buyerContractID property.
         * 
         * @return
         *     possible object is
         *     {@link PUFIDType }
         *     
         */
        public PUFIDType getBuyerContractID() {
            return buyerContractID;
        }

        /**
         * Sets the value of the buyerContractID property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFIDType }
         *     
         */
        public void setBuyerContractID(PUFIDType value) {
            this.buyerContractID = value;
        }

        /**
         * Gets the value of the buyerContractIssueDate property.
         * 
         * @return
         *     possible object is
         *     {@link PUFDateType }
         *     
         */
        public PUFDateType getBuyerContractIssueDate() {
            return buyerContractIssueDate;
        }

        /**
         * Sets the value of the buyerContractIssueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFDateType }
         *     
         */
        public void setBuyerContractIssueDate(PUFDateType value) {
            this.buyerContractIssueDate = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DeliveryMethod" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deliveryMethod",
        "any"
    })
    public static class DeliveryExtension {

        @XmlElement(name = "DeliveryMethod")
        protected DeliveryMethod deliveryMethod;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the deliveryMethod property.
         * 
         * @return
         *     possible object is
         *     {@link DeliveryMethod }
         *     
         */
        public DeliveryMethod getDeliveryMethod() {
            return deliveryMethod;
        }

        /**
         * Sets the value of the deliveryMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeliveryMethod }
         *     
         */
        public void setDeliveryMethod(DeliveryMethod value) {
            this.deliveryMethod = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "note",
            "code"
        })
        public static class DeliveryMethod {

            @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected NoteType note;
            @XmlElement(name = "Code")
            protected PUFCodeType code;

            /**
             * Gets the value of the note property.
             * 
             * @return
             *     possible object is
             *     {@link NoteType }
             *     
             */
            public NoteType getNote() {
                return note;
            }

            /**
             * Sets the value of the note property.
             * 
             * @param value
             *     allowed object is
             *     {@link NoteType }
             *     
             */
            public void setNote(NoteType value) {
                this.note = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link PUFCodeType }
             *     
             */
            public PUFCodeType getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFCodeType }
             *     
             */
            public void setCode(PUFCodeType value) {
                this.code = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount"
    })
    public static class DutyStamp {

        @XmlElement(name = "Amount", required = true)
        protected PUFAmountType amount;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ItemType" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemType",
        "any"
    })
    public static class ItemExtension {

        @XmlElement(name = "ItemType")
        protected PUFTextType itemType;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the itemType property.
         * 
         * @return
         *     possible object is
         *     {@link PUFTextType }
         *     
         */
        public PUFTextType getItemType() {
            return itemType;
        }

        /**
         * Sets the value of the itemType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFTextType }
         *     
         */
        public void setItemType(PUFTextType value) {
            this.itemType = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TaxCurrencyTaxExclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxCurrencyTaxInclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxCurrencyPayableAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="PaymentInKind" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxCurrencyTaxExclusiveAmount",
        "taxCurrencyTaxInclusiveAmount",
        "taxCurrencyPayableAmount",
        "paymentInKind",
        "any"
    })
    public static class LegalMonetaryTotalExtension {

        @XmlElement(name = "TaxCurrencyTaxExclusiveAmount")
        protected PUFAmountType taxCurrencyTaxExclusiveAmount;
        @XmlElement(name = "TaxCurrencyTaxInclusiveAmount")
        protected PUFAmountType taxCurrencyTaxInclusiveAmount;
        @XmlElement(name = "TaxCurrencyPayableAmount")
        protected PUFAmountType taxCurrencyPayableAmount;
        @XmlElement(name = "PaymentInKind")
        protected PaymentInKind paymentInKind;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the taxCurrencyTaxExclusiveAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyTaxExclusiveAmount() {
            return taxCurrencyTaxExclusiveAmount;
        }

        /**
         * Sets the value of the taxCurrencyTaxExclusiveAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyTaxExclusiveAmount(PUFAmountType value) {
            this.taxCurrencyTaxExclusiveAmount = value;
        }

        /**
         * Gets the value of the taxCurrencyTaxInclusiveAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyTaxInclusiveAmount() {
            return taxCurrencyTaxInclusiveAmount;
        }

        /**
         * Sets the value of the taxCurrencyTaxInclusiveAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyTaxInclusiveAmount(PUFAmountType value) {
            this.taxCurrencyTaxInclusiveAmount = value;
        }

        /**
         * Gets the value of the taxCurrencyPayableAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyPayableAmount() {
            return taxCurrencyPayableAmount;
        }

        /**
         * Sets the value of the taxCurrencyPayableAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyPayableAmount(PUFAmountType value) {
            this.taxCurrencyPayableAmount = value;
        }

        /**
         * Gets the value of the paymentInKind property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentInKind }
         *     
         */
        public PaymentInKind getPaymentInKind() {
            return paymentInKind;
        }

        /**
         * Sets the value of the paymentInKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentInKind }
         *     
         */
        public void setPaymentInKind(PaymentInKind value) {
            this.paymentInKind = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount",
            "note"
        })
        public static class PaymentInKind {

            @XmlElement(name = "Amount", required = true)
            protected PUFAmountType amount;
            @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected NoteType note;

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

            /**
             * Gets the value of the note property.
             * 
             * @return
             *     possible object is
             *     {@link NoteType }
             *     
             */
            public NoteType getNote() {
                return note;
            }

            /**
             * Sets the value of the note property.
             * 
             * @param value
             *     allowed object is
             *     {@link NoteType }
             *     
             */
            public void setNote(NoteType value) {
                this.note = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RestrictedInformation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TaxCurrencyLineExtensionAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxInclusiveLineExtensionAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxCurrencyTaxInclusiveLineExtensionAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="LineExclAllowanceChargeAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="OrderLineReference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SalesOrderIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OriginatorDocumentReference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProjectReference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ContractDocumentReference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
     *                   &lt;element name="BuyerContractID" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
     *                   &lt;element name="BuyerContractIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "restrictedInformation",
        "taxCurrencyLineExtensionAmount",
        "taxInclusiveLineExtensionAmount",
        "taxCurrencyTaxInclusiveLineExtensionAmount",
        "lineExclAllowanceChargeAmount",
        "orderLineReference",
        "originatorDocumentReference",
        "projectReference",
        "contractDocumentReference",
        "any"
    })
    public static class LineExtension {

        @XmlElement(name = "RestrictedInformation")
        protected List<RestrictedInformation> restrictedInformation;
        @XmlElement(name = "TaxCurrencyLineExtensionAmount")
        protected PUFAmountType taxCurrencyLineExtensionAmount;
        @XmlElement(name = "TaxInclusiveLineExtensionAmount")
        protected PUFAmountType taxInclusiveLineExtensionAmount;
        @XmlElement(name = "TaxCurrencyTaxInclusiveLineExtensionAmount")
        protected PUFAmountType taxCurrencyTaxInclusiveLineExtensionAmount;
        @XmlElement(name = "LineExclAllowanceChargeAmount")
        protected PUFAmountType lineExclAllowanceChargeAmount;
        @XmlElement(name = "OrderLineReference")
        protected OrderLineReference orderLineReference;
        @XmlElement(name = "OriginatorDocumentReference")
        protected OriginatorDocumentReference originatorDocumentReference;
        @XmlElement(name = "ProjectReference")
        protected ProjectReference projectReference;
        @XmlElement(name = "ContractDocumentReference")
        protected ContractDocumentReference contractDocumentReference;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the restrictedInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restrictedInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestrictedInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestrictedInformation }
         * 
         * 
         */
        public List<RestrictedInformation> getRestrictedInformation() {
            if (restrictedInformation == null) {
                restrictedInformation = new ArrayList<RestrictedInformation>();
            }
            return this.restrictedInformation;
        }

        /**
         * Gets the value of the taxCurrencyLineExtensionAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyLineExtensionAmount() {
            return taxCurrencyLineExtensionAmount;
        }

        /**
         * Sets the value of the taxCurrencyLineExtensionAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyLineExtensionAmount(PUFAmountType value) {
            this.taxCurrencyLineExtensionAmount = value;
        }

        /**
         * Gets the value of the taxInclusiveLineExtensionAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxInclusiveLineExtensionAmount() {
            return taxInclusiveLineExtensionAmount;
        }

        /**
         * Sets the value of the taxInclusiveLineExtensionAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxInclusiveLineExtensionAmount(PUFAmountType value) {
            this.taxInclusiveLineExtensionAmount = value;
        }

        /**
         * Gets the value of the taxCurrencyTaxInclusiveLineExtensionAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyTaxInclusiveLineExtensionAmount() {
            return taxCurrencyTaxInclusiveLineExtensionAmount;
        }

        /**
         * Sets the value of the taxCurrencyTaxInclusiveLineExtensionAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyTaxInclusiveLineExtensionAmount(PUFAmountType value) {
            this.taxCurrencyTaxInclusiveLineExtensionAmount = value;
        }

        /**
         * Gets the value of the lineExclAllowanceChargeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getLineExclAllowanceChargeAmount() {
            return lineExclAllowanceChargeAmount;
        }

        /**
         * Sets the value of the lineExclAllowanceChargeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setLineExclAllowanceChargeAmount(PUFAmountType value) {
            this.lineExclAllowanceChargeAmount = value;
        }

        /**
         * Gets the value of the orderLineReference property.
         * 
         * @return
         *     possible object is
         *     {@link OrderLineReference }
         *     
         */
        public OrderLineReference getOrderLineReference() {
            return orderLineReference;
        }

        /**
         * Sets the value of the orderLineReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderLineReference }
         *     
         */
        public void setOrderLineReference(OrderLineReference value) {
            this.orderLineReference = value;
        }

        /**
         * Gets the value of the originatorDocumentReference property.
         * 
         * @return
         *     possible object is
         *     {@link OriginatorDocumentReference }
         *     
         */
        public OriginatorDocumentReference getOriginatorDocumentReference() {
            return originatorDocumentReference;
        }

        /**
         * Sets the value of the originatorDocumentReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginatorDocumentReference }
         *     
         */
        public void setOriginatorDocumentReference(OriginatorDocumentReference value) {
            this.originatorDocumentReference = value;
        }

        /**
         * Gets the value of the projectReference property.
         * 
         * @return
         *     possible object is
         *     {@link ProjectReference }
         *     
         */
        public ProjectReference getProjectReference() {
            return projectReference;
        }

        /**
         * Sets the value of the projectReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProjectReference }
         *     
         */
        public void setProjectReference(ProjectReference value) {
            this.projectReference = value;
        }

        /**
         * Gets the value of the contractDocumentReference property.
         * 
         * @return
         *     possible object is
         *     {@link ContractDocumentReference }
         *     
         */
        public ContractDocumentReference getContractDocumentReference() {
            return contractDocumentReference;
        }

        /**
         * Sets the value of the contractDocumentReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractDocumentReference }
         *     
         */
        public void setContractDocumentReference(ContractDocumentReference value) {
            this.contractDocumentReference = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
         *         &lt;element name="BuyerContractID" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
         *         &lt;element name="BuyerContractIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "issueDate",
            "buyerContractID",
            "buyerContractIssueDate"
        })
        public static class ContractDocumentReference {

            @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected IDType id;
            @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected IssueDateType issueDate;
            @XmlElement(name = "BuyerContractID")
            protected PUFIDType buyerContractID;
            @XmlElement(name = "BuyerContractIssueDate")
            protected PUFDateType buyerContractIssueDate;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link IDType }
             *     
             */
            public IDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link IDType }
             *     
             */
            public void setID(IDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the issueDate property.
             * 
             * @return
             *     possible object is
             *     {@link IssueDateType }
             *     
             */
            public IssueDateType getIssueDate() {
                return issueDate;
            }

            /**
             * Sets the value of the issueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link IssueDateType }
             *     
             */
            public void setIssueDate(IssueDateType value) {
                this.issueDate = value;
            }

            /**
             * Gets the value of the buyerContractID property.
             * 
             * @return
             *     possible object is
             *     {@link PUFIDType }
             *     
             */
            public PUFIDType getBuyerContractID() {
                return buyerContractID;
            }

            /**
             * Sets the value of the buyerContractID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFIDType }
             *     
             */
            public void setBuyerContractID(PUFIDType value) {
                this.buyerContractID = value;
            }

            /**
             * Gets the value of the buyerContractIssueDate property.
             * 
             * @return
             *     possible object is
             *     {@link PUFDateType }
             *     
             */
            public PUFDateType getBuyerContractIssueDate() {
                return buyerContractIssueDate;
            }

            /**
             * Sets the value of the buyerContractIssueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFDateType }
             *     
             */
            public void setBuyerContractIssueDate(PUFDateType value) {
                this.buyerContractIssueDate = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="SalesOrderIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "salesOrderIssueDate"
        })
        public static class OrderLineReference {

            @XmlElement(name = "SalesOrderIssueDate")
            protected PUFDateType salesOrderIssueDate;

            /**
             * Gets the value of the salesOrderIssueDate property.
             * 
             * @return
             *     possible object is
             *     {@link PUFDateType }
             *     
             */
            public PUFDateType getSalesOrderIssueDate() {
                return salesOrderIssueDate;
            }

            /**
             * Sets the value of the salesOrderIssueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFDateType }
             *     
             */
            public void setSalesOrderIssueDate(PUFDateType value) {
                this.salesOrderIssueDate = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "issueDate"
        })
        public static class OriginatorDocumentReference {

            @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
            protected IDType id;
            @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected IssueDateType issueDate;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link IDType }
             *     
             */
            public IDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link IDType }
             *     
             */
            public void setID(IDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the issueDate property.
             * 
             * @return
             *     possible object is
             *     {@link IssueDateType }
             *     
             */
            public IssueDateType getIssueDate() {
                return issueDate;
            }

            /**
             * Sets the value of the issueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link IssueDateType }
             *     
             */
            public void setIssueDate(IssueDateType value) {
                this.issueDate = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id"
        })
        public static class ProjectReference {

            @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
            protected IDType id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link IDType }
             *     
             */
            public IDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link IDType }
             *     
             */
            public void setID(IDType value) {
                this.id = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class RestrictedInformation {

            @XmlElement(name = "Key", required = true)
            protected PUFCodeType key;
            @XmlElement(name = "Value", required = true)
            protected PUFTextType value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link PUFCodeType }
             *     
             */
            public PUFCodeType getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFCodeType }
             *     
             */
            public void setKey(PUFCodeType value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link PUFTextType }
             *     
             */
            public PUFTextType getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFTextType }
             *     
             */
            public void setValue(PUFTextType value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SalesOrderIssueDate" type="{urn:pagero:ExtensionComponent:1.0}PUFDateType" minOccurs="0"/&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "salesOrderIssueDate",
        "any"
    })
    public static class OrderReferenceExtension {

        @XmlElement(name = "SalesOrderIssueDate")
        protected PUFDateType salesOrderIssueDate;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the salesOrderIssueDate property.
         * 
         * @return
         *     possible object is
         *     {@link PUFDateType }
         *     
         */
        public PUFDateType getSalesOrderIssueDate() {
            return salesOrderIssueDate;
        }

        /**
         * Sets the value of the salesOrderIssueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFDateType }
         *     
         */
        public void setSalesOrderIssueDate(PUFDateType value) {
            this.salesOrderIssueDate = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RegistrationData" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}IDType"/&gt;
     *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ADAID" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}IDType"/&gt;
     *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registrationData",
        "adaid",
        "any"
    })
    public static class PartyExtension {

        @XmlElement(name = "RegistrationData")
        protected List<RegistrationData> registrationData;
        @XmlElement(name = "ADAID")
        protected List<ADAID> adaid;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the registrationData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registrationData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegistrationData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RegistrationData }
         * 
         * 
         */
        public List<RegistrationData> getRegistrationData() {
            if (registrationData == null) {
                registrationData = new ArrayList<RegistrationData>();
            }
            return this.registrationData;
        }

        /**
         * Gets the value of the adaid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adaid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADAID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ADAID }
         * 
         * 
         */
        public List<ADAID> getADAID() {
            if (adaid == null) {
                adaid = new ArrayList<ADAID>();
            }
            return this.adaid;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}IDType"/&gt;
         *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "name",
            "idType",
            "any"
        })
        public static class ADAID {

            @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
            protected IDType id;
            @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected NameType name;
            @XmlElement(name = "IDType", required = true)
            protected PUFIDType idType;
            @XmlAnyElement(lax = true)
            protected Object any;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link IDType }
             *     
             */
            public IDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link IDType }
             *     
             */
            public void setID(IDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the idType property.
             * 
             * @return
             *     possible object is
             *     {@link PUFIDType }
             *     
             */
            public PUFIDType getIDType() {
                return idType;
            }

            /**
             * Sets the value of the idType property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFIDType }
             *     
             */
            public void setIDType(PUFIDType value) {
                this.idType = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}IDType"/&gt;
         *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "idType",
            "any"
        })
        public static class RegistrationData {

            @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
            protected IDType id;
            @XmlElement(name = "IDType", required = true)
            protected PUFIDType idType;
            @XmlAnyElement(lax = true)
            protected Object any;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link IDType }
             *     
             */
            public IDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link IDType }
             *     
             */
            public void setID(IDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the idType property.
             * 
             * @return
             *     possible object is
             *     {@link PUFIDType }
             *     
             */
            public PUFIDType getIDType() {
                return idType;
            }

            /**
             * Sets the value of the idType property.
             * 
             * @param value
             *     allowed object is
             *     {@link PUFIDType }
             *     
             */
            public void setIDType(PUFIDType value) {
                this.idType = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Penalty" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penalty",
        "any"
    })
    public static class PaymentTermsExtension {

        @XmlElement(name = "Penalty")
        protected Penalty penalty;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link Penalty }
         *     
         */
        public Penalty getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Penalty }
         *     
         */
        public void setPenalty(Penalty value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "note"
        })
        public static class Penalty {

            @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
            protected NoteType note;

            /**
             * Gets the value of the note property.
             * 
             * @return
             *     possible object is
             *     {@link NoteType }
             *     
             */
            public NoteType getNote() {
                return note;
            }

            /**
             * Sets the value of the note property.
             * 
             * @param value
             *     allowed object is
             *     {@link NoteType }
             *     
             */
            public void setNote(NoteType value) {
                this.note = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}TaxTotal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "documentReference",
        "description",
        "taxTotal"
    })
    public static class PrepaidPaymentExtension {

        @XmlElement(name = "DocumentReference", namespace = "urn:pagero:CommonAggregateComponents:1.0")
        protected List<DocumentReferenceType> documentReference;
        @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        protected DescriptionType description;
        @XmlElement(name = "TaxTotal", namespace = "urn:pagero:CommonAggregateComponents:1.0")
        protected TaxTotalType taxTotal;

        /**
         * Gets the value of the documentReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentReferenceType }
         * 
         * 
         */
        public List<DocumentReferenceType> getDocumentReference() {
            if (documentReference == null) {
                documentReference = new ArrayList<DocumentReferenceType>();
            }
            return this.documentReference;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptionType }
         *     
         */
        public DescriptionType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptionType }
         *     
         */
        public void setDescription(DescriptionType value) {
            this.description = value;
        }

        /**
         * Gets the value of the taxTotal property.
         * 
         * @return
         *     possible object is
         *     {@link TaxTotalType }
         *     
         */
        public TaxTotalType getTaxTotal() {
            return taxTotal;
        }

        /**
         * Sets the value of the taxTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxTotalType }
         *     
         */
        public void setTaxTotal(TaxTotalType value) {
            this.taxTotal = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PriceInclAllowanceChargeAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxCurrencyPriceAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceInclAllowanceChargeAmount",
        "taxCurrencyPriceAmount",
        "any"
    })
    public static class PriceExtension {

        @XmlElement(name = "PriceInclAllowanceChargeAmount")
        protected PUFAmountType priceInclAllowanceChargeAmount;
        @XmlElement(name = "TaxCurrencyPriceAmount")
        protected PUFAmountType taxCurrencyPriceAmount;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the priceInclAllowanceChargeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getPriceInclAllowanceChargeAmount() {
            return priceInclAllowanceChargeAmount;
        }

        /**
         * Sets the value of the priceInclAllowanceChargeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setPriceInclAllowanceChargeAmount(PUFAmountType value) {
            this.priceInclAllowanceChargeAmount = value;
        }

        /**
         * Gets the value of the taxCurrencyPriceAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyPriceAmount() {
            return taxCurrencyPriceAmount;
        }

        /**
         * Sets the value of the taxCurrencyPriceAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyPriceAmount(PUFAmountType value) {
            this.taxCurrencyPriceAmount = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Key"/&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Value"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class RestrictedInformation {

        @XmlElement(name = "Key", required = true)
        protected PUFCodeType key;
        @XmlElement(name = "Value", required = true)
        protected PUFTextType value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link PUFCodeType }
         *     
         */
        public PUFCodeType getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFCodeType }
         *     
         */
        public void setKey(PUFCodeType value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link PUFTextType }
         *     
         */
        public PUFTextType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFTextType }
         *     
         */
        public void setValue(PUFTextType value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Key" type="{urn:pagero:ExtensionComponent:1.0}PUFCodeType"/&gt;
     *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:pagero:CommonAggregateComponents:1.0}TaxTotal" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "id",
        "lineExtensionAmount",
        "taxTotal",
        "classification"
    })
    public static class RestrictedInformationLine {

        @XmlElement(name = "Key", required = true)
        protected PUFCodeType key;
        @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        protected IDType id;
        @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        protected LineExtensionAmountType lineExtensionAmount;
        @XmlElement(name = "TaxTotal", namespace = "urn:pagero:CommonAggregateComponents:1.0")
        protected TaxTotalType taxTotal;
        @XmlElement(name = "Classification")
        protected List<ClassificationType> classification;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link PUFCodeType }
         *     
         */
        public PUFCodeType getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFCodeType }
         *     
         */
        public void setKey(PUFCodeType value) {
            this.key = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link IDType }
         *     
         */
        public IDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link IDType }
         *     
         */
        public void setID(IDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the lineExtensionAmount property.
         * 
         * @return
         *     possible object is
         *     {@link LineExtensionAmountType }
         *     
         */
        public LineExtensionAmountType getLineExtensionAmount() {
            return lineExtensionAmount;
        }

        /**
         * Sets the value of the lineExtensionAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link LineExtensionAmountType }
         *     
         */
        public void setLineExtensionAmount(LineExtensionAmountType value) {
            this.lineExtensionAmount = value;
        }

        /**
         * Gets the value of the taxTotal property.
         * 
         * @return
         *     possible object is
         *     {@link TaxTotalType }
         *     
         */
        public TaxTotalType getTaxTotal() {
            return taxTotal;
        }

        /**
         * Sets the value of the taxTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxTotalType }
         *     
         */
        public void setTaxTotal(TaxTotalType value) {
            this.taxTotal = value;
        }

        /**
         * Gets the value of the classification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassificationType }
         * 
         * 
         */
        public List<ClassificationType> getClassification() {
            if (classification == null) {
                classification = new ArrayList<ClassificationType>();
            }
            return this.classification;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="QRString" type="{urn:pagero:ExtensionComponent:1.0}PUFTextType" minOccurs="0"/&gt;
     *         &lt;element name="QREncodingType" type="{urn:pagero:ExtensionComponent:1.0}PUFIDType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "qrString",
        "qrEncodingType"
    })
    public static class SupplierGeneratedQRString {

        @XmlElement(name = "QRString")
        protected PUFTextType qrString;
        @XmlElement(name = "QREncodingType")
        protected PUFIDType qrEncodingType;

        /**
         * Gets the value of the qrString property.
         * 
         * @return
         *     possible object is
         *     {@link PUFTextType }
         *     
         */
        public PUFTextType getQRString() {
            return qrString;
        }

        /**
         * Sets the value of the qrString property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFTextType }
         *     
         */
        public void setQRString(PUFTextType value) {
            this.qrString = value;
        }

        /**
         * Gets the value of the qrEncodingType property.
         * 
         * @return
         *     possible object is
         *     {@link PUFIDType }
         *     
         */
        public PUFIDType getQREncodingType() {
            return qrEncodingType;
        }

        /**
         * Sets the value of the qrEncodingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFIDType }
         *     
         */
        public void setQREncodingType(PUFIDType value) {
            this.qrEncodingType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Code"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code"
    })
    public static class SupplyType {

        @XmlElement(name = "Code", required = true)
        protected PUFCodeType code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link PUFCodeType }
         *     
         */
        public PUFCodeType getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFCodeType }
         *     
         */
        public void setCode(PUFCodeType value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TaxCurrencyTaxableAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxCurrencyTaxAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxInclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxCurrencyTaxInclusiveAmount" type="{urn:pagero:ExtensionComponent:1.0}PUFAmountType" minOccurs="0"/&gt;
     *         &lt;element name="TaxChargeability" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxTypeCode"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EquivalenceSurcharge" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent"/&gt;
     *                   &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
     *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxCurrencyTaxableAmount",
        "taxCurrencyTaxAmount",
        "taxInclusiveAmount",
        "taxCurrencyTaxInclusiveAmount",
        "taxChargeability",
        "equivalenceSurcharge",
        "any"
    })
    public static class TaxSubtotalExtension {

        @XmlElement(name = "TaxCurrencyTaxableAmount")
        protected PUFAmountType taxCurrencyTaxableAmount;
        @XmlElement(name = "TaxCurrencyTaxAmount")
        protected PUFAmountType taxCurrencyTaxAmount;
        @XmlElement(name = "TaxInclusiveAmount")
        protected PUFAmountType taxInclusiveAmount;
        @XmlElement(name = "TaxCurrencyTaxInclusiveAmount")
        protected PUFAmountType taxCurrencyTaxInclusiveAmount;
        @XmlElement(name = "TaxChargeability")
        protected TaxChargeability taxChargeability;
        @XmlElement(name = "EquivalenceSurcharge")
        protected EquivalenceSurcharge equivalenceSurcharge;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the taxCurrencyTaxableAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyTaxableAmount() {
            return taxCurrencyTaxableAmount;
        }

        /**
         * Sets the value of the taxCurrencyTaxableAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyTaxableAmount(PUFAmountType value) {
            this.taxCurrencyTaxableAmount = value;
        }

        /**
         * Gets the value of the taxCurrencyTaxAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyTaxAmount() {
            return taxCurrencyTaxAmount;
        }

        /**
         * Sets the value of the taxCurrencyTaxAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyTaxAmount(PUFAmountType value) {
            this.taxCurrencyTaxAmount = value;
        }

        /**
         * Gets the value of the taxInclusiveAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxInclusiveAmount() {
            return taxInclusiveAmount;
        }

        /**
         * Sets the value of the taxInclusiveAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxInclusiveAmount(PUFAmountType value) {
            this.taxInclusiveAmount = value;
        }

        /**
         * Gets the value of the taxCurrencyTaxInclusiveAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PUFAmountType }
         *     
         */
        public PUFAmountType getTaxCurrencyTaxInclusiveAmount() {
            return taxCurrencyTaxInclusiveAmount;
        }

        /**
         * Sets the value of the taxCurrencyTaxInclusiveAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PUFAmountType }
         *     
         */
        public void setTaxCurrencyTaxInclusiveAmount(PUFAmountType value) {
            this.taxCurrencyTaxInclusiveAmount = value;
        }

        /**
         * Gets the value of the taxChargeability property.
         * 
         * @return
         *     possible object is
         *     {@link TaxChargeability }
         *     
         */
        public TaxChargeability getTaxChargeability() {
            return taxChargeability;
        }

        /**
         * Sets the value of the taxChargeability property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxChargeability }
         *     
         */
        public void setTaxChargeability(TaxChargeability value) {
            this.taxChargeability = value;
        }

        /**
         * Gets the value of the equivalenceSurcharge property.
         * 
         * @return
         *     possible object is
         *     {@link EquivalenceSurcharge }
         *     
         */
        public EquivalenceSurcharge getEquivalenceSurcharge() {
            return equivalenceSurcharge;
        }

        /**
         * Sets the value of the equivalenceSurcharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquivalenceSurcharge }
         *     
         */
        public void setEquivalenceSurcharge(EquivalenceSurcharge value) {
            this.equivalenceSurcharge = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent"/&gt;
         *         &lt;element ref="{urn:pagero:ExtensionComponent:1.0}Amount"/&gt;
         *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "percent",
            "amount",
            "any"
        })
        public static class EquivalenceSurcharge {

            @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
            protected PercentType percent;
            @XmlElement(name = "Amount", required = true)
            protected PUFAmountType amount;
            @XmlAnyElement(lax = true)
            protected Object any;

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link PercentType }
             *     
             */
            public PercentType getPercent() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link PercentType }
             *     
             */
            public void setPercent(PercentType value) {
                this.percent = value;
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

            /**
             * Gets the value of the any property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxTypeCode"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "taxTypeCode"
        })
        public static class TaxChargeability {

            @XmlElement(name = "TaxTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
            protected TaxTypeCodeType taxTypeCode;

            /**
             * Gets the value of the taxTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link TaxTypeCodeType }
             *     
             */
            public TaxTypeCodeType getTaxTypeCode() {
                return taxTypeCode;
            }

            /**
             * Sets the value of the taxTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxTypeCodeType }
             *     
             */
            public void setTaxTypeCode(TaxTypeCodeType value) {
                this.taxTypeCode = value;
            }

        }

    }

}
