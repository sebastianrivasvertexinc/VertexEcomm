package com.salesmanager.core.business.services.order;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.salesmanager.core.business.repositories.order.orderproduct.OrderProductDownloadRepository;
import com.salesmanager.core.business.services.tax.TaxServiceVtx;

import com.salesmanager.core.business.services.tax.ecosio.vrbl.DefaultNamespacePrefixMapper;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.EInvoicingResponse;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.*;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.*;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.*;


import com.salesmanager.core.business.services.tax.ecosio.vrbl.vertexinc.vrbl.extensioncomponent._1.InvoiceExtensionType;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.vertexinc.vrbl.extensioncomponent._1.PaymentTermsExtensionType;
import com.salesmanager.core.business.services.tax.ecosio.vrbl.vertexinc.vrbl.extensioncomponent._1.RoutingDetailsType;
import com.salesmanager.core.business.services.tax.taxamo.*;
import com.salesmanager.core.business.services.tax.vertex.LineItem;
import com.salesmanager.core.business.services.tax.vertex.VtxTaxCalc;
import com.salesmanager.core.business.services.tax.vertex.VtxTaxItem;
import com.salesmanager.core.model.catalog.product.description.ProductDescription;
import com.salesmanager.core.model.tax.TaxConfiguration;



import com.squareup.okhttp.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.salesmanager.core.business.constants.Constants;
import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.modules.order.InvoiceModule;
import com.salesmanager.core.business.repositories.order.OrderRepository;
import com.salesmanager.core.business.services.catalog.product.ProductService;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.business.services.customer.CustomerService;
import com.salesmanager.core.business.services.order.ordertotal.OrderTotalService;
import com.salesmanager.core.business.services.payments.PaymentService;
import com.salesmanager.core.business.services.payments.TransactionService;
import com.salesmanager.core.business.services.shipping.ShippingService;
import com.salesmanager.core.business.services.shoppingcart.ShoppingCartService;
import com.salesmanager.core.model.catalog.product.Product;
import com.salesmanager.core.model.catalog.product.availability.ProductAvailability;
import com.salesmanager.core.model.catalog.product.price.FinalPrice;
import com.salesmanager.core.model.common.UserContext;
import com.salesmanager.core.model.customer.Customer;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.order.Order;
import com.salesmanager.core.model.order.OrderCriteria;
import com.salesmanager.core.model.order.OrderList;
import com.salesmanager.core.model.order.OrderSummary;
import com.salesmanager.core.model.order.OrderSummaryType;
import com.salesmanager.core.model.order.OrderTotal;
import com.salesmanager.core.model.order.OrderTotalSummary;
import com.salesmanager.core.model.order.OrderTotalType;
import com.salesmanager.core.model.order.OrderTotalVariation;
import com.salesmanager.core.model.order.OrderValueType;
import com.salesmanager.core.model.order.orderproduct.OrderProduct;
import com.salesmanager.core.model.order.orderstatus.OrderStatus;
import com.salesmanager.core.model.order.orderstatus.OrderStatusHistory;
import com.salesmanager.core.model.payments.Payment;
import com.salesmanager.core.model.payments.Transaction;
import com.salesmanager.core.model.payments.TransactionType;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.shipping.ShippingConfiguration;
import com.salesmanager.core.model.shoppingcart.ShoppingCart;
import com.salesmanager.core.model.shoppingcart.ShoppingCartItem;


@Service("orderService")
public class OrderServiceImpl  extends SalesManagerEntityServiceImpl<Long, Order> implements OrderService {

    private String client_Id = "";
    private String client_secret = "";
    private String calc_url = "";
    private String taxamoValidationURL  = "";
    private String taxamoAuthToken = "";
    private MerchantStore _store = new MerchantStore();
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    //STAGING
  /*  private String eInvoicing_client_Id = "s0xpW2Pogz4LXRTnoHI5MXElP0gHxEqH";//TODO Staging David to send this to the Admini UI
    private String eInvoicing_client_secret = "TOAQSrUqetRlYiSKdXQSUkj9gRioefsYmjE3v_Ar0T2CWlj5Xz9gNW2vKypAasot";//TODO Staging David to send this to the Admini UI
    private String eInvoicing_url = "https://e-invoicing-service.cst-stage.vtxdev.net/customers/v1/documents";//TODO David to send this to the Admini UI
    private String eInvoicing_auth_url = "https://stage-auth.vertexcloud.com/oauth/token";//TODO David to send this to the Admini UI
*/
  //PROD Vertex Inc Sales
  /*  private String eInvoicing_client_Id = "ela0i938eotzpO8nj7p5wCHBnoLH54Ev";//TODO Staging David to send this to the Admini UI
    private String eInvoicing_client_secret = "IxoT0SPzH7DZFi2N9LXrz78jUKAgXWW26O8_UnJfUhQleEmlTmi2-8qDLwPnmb8b";//TODO Staging David to send this to the Admini UI
    private String eInvoicing_url = "https://e-invoicing-service.vertexcloud.com/customers/v1/documents";//TODO David to send this to the Admini UI
    private String eInvoicing_auth_url = "https://auth.vertexcloud.com/oauth/token";//TODO David to send this to the Admini UI
*/

    //End2End Vertex Inc Sales
    private String eInvoicing_client_Id = "9PNoWBAgkUPMrAxfIjRhC4ca3mxnP6E7";//TODO Staging David to send this to the Admini UI
    private String eInvoicing_client_secret = "jev3o7T05TTheCQVCZXKWB-xK-r9BSLIP4QyhvllLhj83I5eCW92THu-LvF56y0l";//TODO Staging David to send this to the Admini UI
    private String eInvoicing_url = "https://e-invoicing-service.vertexcloud.com/customers/v1/documents";//TODO David to send this to the Admini UI
    private String eInvoicing_auth_url = "https://auth.vertexcloud.com/oauth/token";//TODO David to send this to the Admini UI


    @Inject
    private InvoiceModule invoiceModule;

    @Inject
    private ShippingService shippingService;

    @Inject
    private PaymentService paymentService;

    @Inject
    private ProductService productService;

    @Inject
    private TaxServiceVtx taxService;

    @Inject
    private CustomerService customerService;

    @Inject
    private ShoppingCartService shoppingCartService;

    @Inject
    private TransactionService transactionService;

    @Inject
    private OrderTotalService orderTotalService;

        private final OrderRepository orderRepository;

    @Inject
    public OrderServiceImpl(OrderRepository orderRepository,
OrderProductDownloadRepository orderProductDownloadRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrderStatusHistory(Order order, OrderStatusHistory history) throws ServiceException {
        order.getOrderHistory().add(history);
        history.setOrder(order);
        update(order);
    }

    @Override
    public Order processOrder(Order order, Customer customer, List<ShoppingCartItem> items, OrderTotalSummary summary, Payment payment, MerchantStore store) throws ServiceException {

    	return process(order, customer, items, summary, payment, null, store);
    }

    @Override
    public Order processOrder(Order order, Customer customer, List<ShoppingCartItem> items, OrderTotalSummary summary, Payment payment, Transaction transaction, MerchantStore store) throws ServiceException {

    	return process(order, customer, items, summary, payment, transaction, store);
    }

	private Order process(Order order, Customer customer, List<ShoppingCartItem> items, OrderTotalSummary summary, Payment payment, Transaction transaction, MerchantStore store) throws ServiceException {

        //setting store info for use with other methods
        this._store = store;

    	Validate.notNull(order, "Order cannot be null");
    	Validate.notNull(customer, "Customer cannot be null (even if anonymous order)");
    	Validate.notEmpty(items, "ShoppingCart items cannot be null");
    	Validate.notNull(payment, "Payment cannot be null");
    	Validate.notNull(store, "MerchantStore cannot be null");
    	Validate.notNull(summary, "Order total Summary cannot be null");

    	UserContext context = UserContext.getCurrentInstance();
    	if(context != null) {
    		String ipAddress = context.getIpAddress();
    		if(!StringUtils.isBlank(ipAddress)) {
    			order.setIpAddress(ipAddress);
    		}
    	}


    	//first process payment
    	Transaction processTransaction = paymentService.processPayment(customer, store, payment, items, order);

    	if(order.getOrderHistory()==null || order.getOrderHistory().size()==0 || order.getStatus()==null) {
    		OrderStatus status = order.getStatus();
    		if(status==null) {
    			status = OrderStatus.ORDERED;
    			order.setStatus(status);
    		}
    		Set<OrderStatusHistory> statusHistorySet = new HashSet<OrderStatusHistory>();
    		OrderStatusHistory statusHistory = new OrderStatusHistory();
    		statusHistory.setStatus(status);
    		statusHistory.setDateAdded(new Date());
    		statusHistory.setOrder(order);
    		statusHistorySet.add(statusHistory);
    		order.setOrderHistory(statusHistorySet);

    	}

        if(customer.getId()==null || customer.getId()==0) {
          customerService.create(customer);
        }

        order.setCustomerId(customer.getId());
        this.create(order); //This is where 100 is being set

    	if(transaction!=null) {
    		transaction.setOrder(order);
    		if(transaction.getId()==null || transaction.getId()==0) {
    			transactionService.create(transaction);
    		} else {
    			transactionService.update(transaction);
    		}
    	}

    	if(processTransaction!=null) {
    		processTransaction.setOrder(order);
    		if(processTransaction.getId()==null || processTransaction.getId()==0) {
    			transactionService.create(processTransaction);
    		} else {
    			transactionService.update(processTransaction);
    		}
    	}

        /**
         * decrement inventory
         */
    	LOGGER.debug( "Update inventory" );
        int itemcheck = 0;
        Set<OrderProduct> products = order.getOrderProducts();
        Set<OrderProduct> updateProducts = order.getOrderProducts();
        for(OrderProduct orderProduct : products) {

            orderProduct.getProductQuantity();

            //Product p = productService.getById((8L));
            // fixing bug /issue with ProductId being mapped to ProductOrder - will do checks in place here to avoid error
            // check and see if the actual product is the same as the order no, then update p
            Product p = productService.getById(items.get(itemcheck).getProductId());

            if(p == null)
                throw new ServiceException(ServiceException.EXCEPTION_INVENTORY_MISMATCH);
            for(ProductAvailability availability : p.getAvailabilities()) {
                int qty = availability.getProductQuantity();
                if(qty < orderProduct.getProductQuantity()) {
                    //throw new ServiceException(ServiceException.EXCEPTION_INVENTORY_MISMATCH);
                	LOGGER.error("APP-BACKEND [" + ServiceException.EXCEPTION_INVENTORY_MISMATCH + "]");
                }
                qty = qty - orderProduct.getProductQuantity();
                availability.setProductQuantity(qty);
            }
            productService.update(p);
            // Get order object product name

            Set<ProductDescription> desc = items.get(itemcheck).getProduct().getDescriptions();

            for(ProductDescription d : desc)
            {
               // String l = d.getLanguage().getCode();
               // String pn = d.getName();
               // String c = customer.getDefaultLanguage().getCode();

                if(customer.getDefaultLanguage().getCode().equals(d.getLanguage().getCode()))
                {
                    orderProduct.setProductName(d.getName());
                }
            }

            itemcheck++; //increment for item check
        }
        // update the order
        order.setOrderProducts(updateProducts);

        //Do an invoice call to vertex
        ArrayList<LineItem> vtxLineItems = taxService.commitTax(order, customer, store, summary);
        //create an invoice with Taxamo
        String urlInvoice=createInvoice(order,customer,vtxLineItems,store);// Taxamo info, updated to send store info for URL's
        //Create the electronic invoice
         if(order.getBilling().getCountry().getIsoCode().equals("MY")||
                order.getBilling().getCountry().getIsoCode().equals("RO")||
                order.getBilling().getCountry().getIsoCode().equals("SA")||
                order.getBilling().getCountry().getIsoCode().equals("ES")||
                order.getBilling().getCountry().getIsoCode().equals("IT")||
                order.getBilling().getCountry().getIsoCode().equals("PT")||
                order.getBilling().getCountry().getIsoCode().equals("FR")||
                order.getBilling().getCountry().getIsoCode().equals("DE")
        )//
        {
            order.setEInvoiceId("n/a");
            order.setEInvoiceId(createElectronicInvoice(order,customer,vtxLineItems,store,urlInvoice)); //Removed Pagero code
        }
          // System.out.println("Document Id:"+createElectronicInvoice(order,customer,vtxLineItems,store,urlInvoice));// Taxamo info, updated to send store info for URL's

        System.out.println(urlInvoice);
       order.setShippingModuleCode(urlInvoice);
    	return order;
    }

    private OrderTotalSummary caculateOrder(OrderSummary summary, Customer customer, final MerchantStore store, final Language language) throws Exception {

        OrderTotalSummary totalSummary = new OrderTotalSummary();
        List<OrderTotal> orderTotals = new ArrayList<OrderTotal>();
        Map<String,OrderTotal> otherPricesTotals = new HashMap<String,OrderTotal>();

        ShippingConfiguration shippingConfiguration = null;
        BigDecimal grandTotal = new BigDecimal(0);
        grandTotal.setScale(2, RoundingMode.HALF_UP);

        //price by item
        /**
         * qty * price
         * subtotal
         */
        BigDecimal subTotal = new BigDecimal(0);
        subTotal.setScale(2, RoundingMode.HALF_UP);
        for(ShoppingCartItem item : summary.getProducts()) {

            BigDecimal st = item.getItemPrice().multiply(new BigDecimal(item.getQuantity()));
            item.setSubTotal(st);
            subTotal = subTotal.add(st);
            //Other prices
            FinalPrice finalPrice = item.getFinalPrice();
            if(finalPrice!=null) {
                List<FinalPrice> otherPrices = finalPrice.getAdditionalPrices();
                if(otherPrices!=null) {
                    for(FinalPrice price : otherPrices) {
                        if(!price.isDefaultPrice()) {
                            OrderTotal itemSubTotal = otherPricesTotals.get(price.getProductPrice().getCode());

                            if(itemSubTotal==null) {
                                itemSubTotal = new OrderTotal();
                                itemSubTotal.setModule(Constants.OT_ITEM_PRICE_MODULE_CODE);
                                itemSubTotal.setTitle(Constants.OT_ITEM_PRICE_MODULE_CODE);
                                itemSubTotal.setOrderTotalCode(price.getProductPrice().getCode());
                                itemSubTotal.setOrderTotalType(OrderTotalType.PRODUCT);
                                itemSubTotal.setSortOrder(0);
                                otherPricesTotals.put(price.getProductPrice().getCode(), itemSubTotal);
                            }

                            BigDecimal orderTotalValue = itemSubTotal.getValue();
                            if(orderTotalValue==null) {
                                orderTotalValue = new BigDecimal(0);
                                orderTotalValue.setScale(2, RoundingMode.HALF_UP);
                            }

                            orderTotalValue = orderTotalValue.add(price.getFinalPrice());
                            itemSubTotal.setValue(orderTotalValue);
                            if(price.getProductPrice().getProductPriceType().name().equals(OrderValueType.ONE_TIME)) {
                                subTotal = subTotal.add(price.getFinalPrice());
                            }
                        }
                    }
                }
            }
        }

        //only in order page, otherwise invokes too many processing
        if(
        		OrderSummaryType.ORDERTOTAL.name().equals(summary.getOrderSummaryType().name()) ||
        		OrderSummaryType.SHOPPINGCART.name().equals(summary.getOrderSummaryType().name())

        		) {

	        //Post processing order total variation modules for sub total calculation - drools, custom modules
	        //may affect the sub total
	        OrderTotalVariation orderTotalVariation = orderTotalService.findOrderTotalVariation(summary, customer, store, language);

	        int currentCount = 10;

	        if(CollectionUtils.isNotEmpty(orderTotalVariation.getVariations())) {
	        	for(OrderTotal variation : orderTotalVariation.getVariations()) {
	        		variation.setSortOrder(currentCount++);
	        		orderTotals.add(variation);
	        		subTotal = subTotal.subtract(variation.getValue());
	        	}
	        }

        }


        totalSummary.setSubTotal(subTotal);
        grandTotal=grandTotal.add(subTotal);

        OrderTotal orderTotalSubTotal = new OrderTotal();
        orderTotalSubTotal.setModule(Constants.OT_SUBTOTAL_MODULE_CODE);
        orderTotalSubTotal.setOrderTotalType(OrderTotalType.SUBTOTAL);
        orderTotalSubTotal.setOrderTotalCode("order.total.subtotal");
        orderTotalSubTotal.setTitle(Constants.OT_SUBTOTAL_MODULE_CODE);
        orderTotalSubTotal.setSortOrder(5);
        orderTotalSubTotal.setValue(subTotal);

        orderTotals.add(orderTotalSubTotal);


        //shipping
        if(summary.getShippingSummary()!=null) {


	            OrderTotal shippingSubTotal = new OrderTotal();
	            shippingSubTotal.setModule(Constants.OT_SHIPPING_MODULE_CODE);
	            shippingSubTotal.setOrderTotalType(OrderTotalType.SHIPPING);
	            shippingSubTotal.setOrderTotalCode("order.total.shipping");
	            shippingSubTotal.setTitle(Constants.OT_SHIPPING_MODULE_CODE);
	            shippingSubTotal.setSortOrder(100);
	            orderTotals.add(shippingSubTotal);

            if(!summary.getShippingSummary().isFreeShipping()) {
                shippingSubTotal.setValue(summary.getShippingSummary().getShipping());
                grandTotal=grandTotal.add(summary.getShippingSummary().getShipping());
            } else {
                shippingSubTotal.setValue(new BigDecimal(0));
                grandTotal=grandTotal.add(new BigDecimal(0));
            }

            //check handling fees
            shippingConfiguration = shippingService.getShippingConfiguration(store);
            if(summary.getShippingSummary().getHandling()!=null && summary.getShippingSummary().getHandling().doubleValue()>0) {
                if(shippingConfiguration.getHandlingFees()!=null && shippingConfiguration.getHandlingFees().doubleValue()>0) {
                    OrderTotal handlingubTotal = new OrderTotal();
                    handlingubTotal.setModule(Constants.OT_HANDLING_MODULE_CODE);
                    handlingubTotal.setOrderTotalType(OrderTotalType.HANDLING);
                    handlingubTotal.setOrderTotalCode("order.total.handling");
                    handlingubTotal.setTitle(Constants.OT_HANDLING_MODULE_CODE);
                    //handlingubTotal.setText("order.total.handling");
                    handlingubTotal.setSortOrder(120);
                    handlingubTotal.setValue(summary.getShippingSummary().getHandling());
                    orderTotals.add(handlingubTotal);
                    grandTotal=grandTotal.add(summary.getShippingSummary().getHandling());
                }
            }
        }

        //tax
        //List<TaxItem> taxes = taxService.calculateTax(summary, customer, store, language);
        VtxTaxCalc vtxTaxCalc= taxService.calculateTax(summary, customer, store, language);

        ArrayList<LineItem> vtxLineItems=null;
        if ((vtxTaxCalc!=null) &&(vtxTaxCalc.data!=null))
            vtxLineItems=vtxTaxCalc.data.getlineItems();

        if (vtxLineItems!=null && !vtxLineItems.isEmpty()) {
            int taxCount = 200;
            BigDecimal totalTaxes = new BigDecimal(0);
            for (LineItem vtxItem : vtxLineItems) {

                // Ordering of Product First, then Tax line items
                OrderTotal taxLine = new OrderTotal();
                taxLine.setModule(Constants.OT_TAX_MODULE_CODE);
                taxLine.setOrderTotalType(OrderTotalType.TAX);
                taxLine.setTitle(Constants.OT_TAX_MODULE_CODE);
                taxLine.setText(vtxItem.product.value);
                taxLine.setSortOrder(taxCount);
                taxCount++;
                taxLine.setOrderTotalCode((vtxItem.product.productClass+"("+vtxItem.product.value + ") - TOTAL ITEM TAX"));
                taxLine.setValue(vtxItem.totalTax);
                orderTotals.add(taxLine);
                grandTotal = grandTotal.add(vtxItem.totalTax);
                // totalTaxes= totalTaxes.add(vtxItem.totalTax);
                totalSummary.setTaxTotal(vtxItem.totalTax);


                if (vtxItem.taxes != null || !vtxItem.taxes.isEmpty()) {
                    for (VtxTaxItem vtxItemtax : vtxItem.taxes) {
                        if(vtxItemtax.imposition!=null){
                            taxLine = new OrderTotal();
                            taxLine.setModule(Constants.OT_TAX_MODULE_CODE);
                            taxLine.setOrderTotalType(OrderTotalType.TAX);
                            taxLine.setTitle(Constants.OT_TAX_MODULE_CODE);
                            taxLine.setText(Constants.OT_TAX_MODULE_CODE + "-" + taxCount);
                            taxLine.setSortOrder(taxCount);
                            taxCount++;

                            taxLine.setOrderTotalCode((vtxItemtax.imposition.value + " in the xxx" + vtxItemtax.jurisdiction.jurisdictionType + " of " + vtxItemtax.jurisdiction.value + "(" + BigDecimal.valueOf(vtxItemtax.getEffectiveRate()).multiply(BigDecimal.valueOf(100)) + "%)"));

                           // Gson gson = new Gson();
                         //   taxLine.setOrderTotalCode(gson.toJson(vtxTaxCalc, VtxTaxCalc.class));

                            taxLine.setValue(BigDecimal.valueOf(vtxItemtax.calculatedTax));
                            orderTotals.add(taxLine);
                        }
                    }


                }
            }
            OrderTotal taxLine = new OrderTotal();
            taxLine.setModule(Constants.OT_TAX_MODULE_CODE);
            taxLine.setOrderTotalType(OrderTotalType.TAX);


            String country = customer.getBilling().getCountry().getIsoCode().toString();
            String zone = customer.getBilling().getZone().getCode();
            Object tester = customer.getAttributes();

            if (country.equals("US")) {
                taxLine.setTitle("Total" + Constants.OT_TAX_MODULE_CODE);
                taxLine.setText("Tax");
                taxLine.setOrderTotalCode("TAX");
            } else if (country.equals("CA")) {
                taxLine.setTitle("Total" + Constants.OT_TAX_MODULE_CODE);
                taxLine.setText("GST/HST");
                taxLine.setOrderTotalCode("GST/HST");
            } else {

                if (customer.getBilling().getIsVatValid() == "true") {
                    taxLine.setTitle("VAT_VALID");
                    taxLine.setText("VAT_VALID");
                } else {
                    taxLine.setTitle("VAT_INVALID");
                    taxLine.setText("VAT_INVALID");
                }

                taxLine.setOrderTotalCode("VAT TOTAL");
            }


            taxLine.setSortOrder(taxCount);
            taxCount++;
            taxLine.setValue(BigDecimal.valueOf(vtxTaxCalc.data.getTotalTax()));
            orderTotals.add(taxLine);


            // grand total
            OrderTotal orderTotal = new OrderTotal();
            orderTotal.setModule(Constants.OT_TOTAL_MODULE_CODE);
            orderTotal.setOrderTotalType(OrderTotalType.TOTAL);
            orderTotal.setOrderTotalCode("order.total.total");
            orderTotal.setTitle(Constants.OT_TOTAL_MODULE_CODE);
            //orderTotal.setText("order.total.total");
            orderTotal.setSortOrder(500);
            orderTotal.setValue(BigDecimal.valueOf(vtxTaxCalc.data.getTotal()));
            orderTotals.add(orderTotal);

            totalSummary.setTotal(grandTotal);
            totalSummary.setTotals(orderTotals);
            // fx
           // if(!country.equals(store.getCountry().getIsoCode().toString())) {
            com.salesmanager.core.business.services.tax.taxamo.Invoice currencyDetails = new com.salesmanager.core.business.services.tax.taxamo.Invoice();
            currencyDetails=taxService.currencyConversion(store, country,zone, orderTotal.getValue());
            //TODO return currency code and amount to the UI
            if (currencyDetails!=null){
                // Add conversion after Website Currency to the totalSummary. Since these
                // are not required to be calculated or totalled push to object ReadableOrder

                totalSummary.setTotalLocal(currencyDetails.amount);
                totalSummary.setCurrency(currencyDetails.currency_code);

            }


        }
        return totalSummary;

    }


    @Override
    public OrderTotalSummary caculateOrderTotal(final OrderSummary orderSummary, final Customer customer, final MerchantStore store, final Language language) throws ServiceException {
        Validate.notNull(orderSummary,"Order summary cannot be null");
        Validate.notNull(orderSummary.getProducts(),"Order summary.products cannot be null");
        Validate.notNull(store,"MerchantStore cannot be null");
        Validate.notNull(customer,"Customer cannot be null");

        try {
            return caculateOrder(orderSummary, customer, store, language);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }



    @Override
    public OrderTotalSummary caculateOrderTotal(final OrderSummary orderSummary, final MerchantStore store, final Language language) throws ServiceException {
        Validate.notNull(orderSummary,"Order summary cannot be null");
        Validate.notNull(orderSummary.getProducts(),"Order summary.products cannot be null");
        Validate.notNull(store,"MerchantStore cannot be null");

        try {
            return caculateOrder(orderSummary, null, store, language);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    private OrderTotalSummary caculateShoppingCart( ShoppingCart shoppingCart, final Customer customer, final MerchantStore store, final Language language) throws Exception {


    	OrderSummary orderSummary = new OrderSummary();
    	orderSummary.setOrderSummaryType(OrderSummaryType.SHOPPINGCART);

    	if(!StringUtils.isBlank(shoppingCart.getPromoCode())) {
    		Date promoDateAdded = shoppingCart.getPromoAdded();//promo valid 1 day
    		if(promoDateAdded == null) {
    			promoDateAdded = new Date();
    		}
    		Instant instant = promoDateAdded.toInstant();
    		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
    		LocalDate date = zdt.toLocalDate();
    		//date added < date + 1 day
    		LocalDate tomorrow = LocalDate.now().plusDays(1);
    		if(date.isBefore(tomorrow)) {
    			orderSummary.setPromoCode(shoppingCart.getPromoCode());
    		} else {
    			//clear promo
    			shoppingCart.setPromoCode(null);
    			shoppingCartService.saveOrUpdate(shoppingCart);
    		}
    	}

    	List<ShoppingCartItem> itemList = new ArrayList<ShoppingCartItem>(shoppingCart.getLineItems());
    	//filter out unavailable
    	itemList = itemList.stream().filter(p -> p.getProduct().isAvailable()).collect(Collectors.toList());
    	orderSummary.setProducts(itemList);


    	return caculateOrder(orderSummary, customer, store, language);

    }


    /**
     * <p>Method will be used to calculate Shopping cart total as well will update price for each
     * line items.
     * </p>
     * @param shoppingCart Shopping cart
     * @param customer customer
     * @param store store
     * @param language language
     * @return {@link OrderTotalSummary}
     * @throws ServiceException Service Exception
     *
     */
    @Override
    public OrderTotalSummary calculateShoppingCartTotal(
                                                        final ShoppingCart shoppingCart, final Customer customer, final MerchantStore store,
                                                        final Language language) throws ServiceException {
        Validate.notNull(shoppingCart,"Order summary cannot be null");
        Validate.notNull(customer,"Customery cannot be null");
        Validate.notNull(store,"MerchantStore cannot be null.");
        try {
            return caculateShoppingCart(shoppingCart, customer, store, language);
        } catch (Exception e) {
            LOGGER.error( "Error while calculating shopping cart total" +e );
            throw new ServiceException(e);
        }

    }




    /**
     * <p>Method will be used to calculate Shopping cart total as well will update price for each
     * line items.
     * </p>
     * @param shoppingCart
     * @param store
     * @param language
     * @return {@link OrderTotalSummary}
     * @throws ServiceException
     *
     */
    @Override
    public OrderTotalSummary calculateShoppingCartTotal(
                                                        final ShoppingCart shoppingCart, final MerchantStore store, final Language language)
                                                                        throws ServiceException {
        Validate.notNull(shoppingCart,"Order summary cannot be null");
        Validate.notNull(store,"MerchantStore cannot be null");

        try {
            return caculateShoppingCart(shoppingCart, null, store, language);
        } catch (Exception e) {
            LOGGER.error( "Error while calculating shopping cart total" +e );
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(final Order order) throws ServiceException {


        super.delete(order);
    }


    @Override
    public ByteArrayOutputStream generateInvoice(final MerchantStore store, final Order order, final Language language) throws ServiceException {

        Validate.notNull(order.getOrderProducts(),"Order products cannot be null");
        Validate.notNull(order.getOrderTotal(),"Order totals cannot be null");

        try {
            return invoiceModule.createInvoice(store, order, language);
        } catch(Exception e) {
            throw new ServiceException(e);
        }



    }

    @Override
    public Order getOrder(final Long orderId, MerchantStore store ) {
    	Validate.notNull(orderId, "Order id cannot be null");
    	Validate.notNull(store, "Store cannot be null");
        return orderRepository.findOne(orderId, store.getId());
    }


    /** legacy **/
    @Override
    public OrderList listByStore(final MerchantStore store, final OrderCriteria criteria) {
        return orderRepository.listByStore(store, criteria);
    }

    @Override
    public OrderList getOrders(final OrderCriteria criteria, MerchantStore store) {
        return orderRepository.listOrders(store, criteria);
    }


    @Override
    public void saveOrUpdate(final Order order) throws ServiceException {

        if(order.getId()!=null && order.getId()>0) {
            LOGGER.debug("Updating Order");
            super.update(order);

        } else {
            LOGGER.debug("Creating Order");
            super.create(order);

        }
    }

	@Override
	public boolean hasDownloadFiles(Order order) throws ServiceException {

		Validate.notNull(order,"Order cannot be null");
		Validate.notNull(order.getOrderProducts(),"Order products cannot be null");
		Validate.notEmpty(order.getOrderProducts(),"Order products cannot be empty");

		boolean hasDownloads = false;
		for(OrderProduct orderProduct : order.getOrderProducts()) {

			if(CollectionUtils.isNotEmpty(orderProduct.getDownloads())) {
				hasDownloads = true;
				break;
			}
		}

		return hasDownloads;
	}

	@Override
	public List<Order> getCapturableOrders(MerchantStore store, Date startDate, Date endDate) throws ServiceException {

		List<Transaction> transactions = transactionService.listTransactions(startDate, endDate);

		List<Order> returnOrders = null;

		if(!CollectionUtils.isEmpty(transactions)) {

			returnOrders = new ArrayList<Order>();

			//order id
			Map<Long,Order> preAuthOrders = new HashMap<Long,Order> ();
			//order id
			Map<Long,List<Transaction>> processingTransactions = new HashMap<Long,List<Transaction>> ();

			for(Transaction trx : transactions) {
				Order order = trx.getOrder();
				if(TransactionType.AUTHORIZE.name().equals(trx.getTransactionType().name())) {
					preAuthOrders.put(order.getId(), order);
				}

				//put transaction
				List<Transaction> listTransactions = null;
				if(processingTransactions.containsKey(order.getId())) {
					listTransactions = processingTransactions.get(order.getId());
				} else {
					listTransactions = new ArrayList<Transaction>();
					processingTransactions.put(order.getId(), listTransactions);
				}
				listTransactions.add(trx);
			}

			//should have when captured
			/**
			 * Order id  Transaction type
			 * 1          AUTHORIZE
			 * 1          CAPTURE
			 */

			//should have when not captured
			/**
			 * Order id  Transaction type
			 * 2          AUTHORIZE
			 */

			for(Long orderId : processingTransactions.keySet()) {

				List<Transaction> trx = processingTransactions.get(orderId);
				if(CollectionUtils.isNotEmpty(trx)) {

					boolean capturable = true;
					for(Transaction t : trx) {

						if(TransactionType.CAPTURE.name().equals(t.getTransactionType().name())) {
							capturable = false;
						} else if(TransactionType.AUTHORIZECAPTURE.name().equals(t.getTransactionType().name())) {
							capturable = false;
						} else if(TransactionType.REFUND.name().equals(t.getTransactionType().name())) {
							capturable = false;
						}

					}

					if(capturable) {
						Order o = preAuthOrders.get(orderId);
						returnOrders.add(o);
					}

				}


			}
		}

		return returnOrders;
	}

    public String createInvoice(Order order, Customer customer, ArrayList<LineItem> items, MerchantStore store){
        // Don't want to throw exception back since we're overriding createInvoice, so ignore exception
        try {
            GetConfigData(store);
        } catch (ServiceException ignore){
            LOGGER.warn("GetConfigData from store failed...expect an Exception error");
        }

        Gson gson = new Gson();
        TaxamoRequest taxamoRequest=new TaxamoRequest();
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        //RequestBody body = RequestBody.create(mediaType, "{\n    \"saleMessageType\": \"QUOTATION\",\n    \"seller\": {\n        \"company\": \"COMPANY\"\n    },\n    \"lineItems\": [\n        {\n            \"seller\": {\n                \"physicalOrigin\": {\n                    \"streetAddress1\": \"2301 Renaissance \",\n                    \"city\": \"King Of Prussia\",\n                    \"mainDivision\": \"PA\",\n                    \"postalCode\": \"19406\",\n                    \"country\": \"UNITED STATES\"\n                }\n            },\n            \"customer\": {\n                \"destination\": {\n                    \"streetAddress1\": \"428 N Beverly Dr\",\n                    \"city\": \"Beverly Hills\",\n                    \"mainDivision\": \"CA\",\n                    \"postalCode\": \"90210\",\n                    \"country\": \"UNITED STATES\"\n                }\n            },\n            \"product\": {\n                \"productClass\": \"CLOTHING\",\n                \"value\": \"CLOTHING\"\n            },\n            \"extendedPrice\": 100,\n            \"lineItemNumber\": 1\n        }\n    ],\n    \"documentDate\": \"2021-12-01\",\n    \"transactionType\": \"SALE\"\n}");
        taxamoRequest.setPrivate_token(taxamoAuthToken);
        TransactionRequest trans =new TransactionRequest();
        trans.setForce_country_code(order.getBilling().getCountry().getIsoCode());
        trans.setBuyer_name(order.getBilling().getFirstName()+" "+order.getBilling().getLastName());
        trans.setBuyer_email(order.getCustomerEmailAddress());
        trans.setStatus("C");
        trans.setInvoice_number(order.getId().toString()); //adding set invoice number DJR
        trans.setCurrency_code(order.getCurrency().getCode());
        if(order.getBilling().getVatNumber() != null) {
            trans.setBuyer_tax_number(order.getBilling().getVatNumber());//DJR - Fixed
        }else {
            trans.setBuyer_tax_number("n/a");//DJR - Fixed logic
        }
        trans.setBuyer_ip(order.getIpAddress());

        Invoice_address invAddress =new Invoice_address();
        invAddress.setCountry(order.getBilling().getCountry().getIsoCode());
        invAddress.setCity(order.getBilling().getCity());
        invAddress.setPostal_code(order.getBilling().getPostalCode());
        invAddress.setFreeform_address(order.getBilling().getAddress()+" "+ order.getBilling().getCity() + " " + order.getBilling().getPostalCode()+ " " + order.getBilling().getCountry().getIsoCode());
        if((invAddress.getCountry().equals("US")) || (invAddress.getCountry().equals("CA")))
        {
          invAddress.setRegion(order.getBilling().getCountry().getIsoCode());//SR fix
        }
        trans.setInvoice_address(invAddress);
        //Setting Billing Country Code
        trans.setBilling_country_code(order.getBilling().getCountry().getIsoCode());

        ArrayList<Transaction_line> transaction_lines= new  ArrayList<Transaction_line>();
        Integer cont=0;
        for (LineItem itemProduct :items) {
            Transaction_line tLine= new Transaction_line();
            cont++;
            tLine.setDescription(itemProduct.product.productClass+"("+itemProduct.product.value+")");
            tLine.setQuantity( itemProduct.quantity.value);
            tLine.setAmount((itemProduct.extendedPrice).multiply(new BigDecimal(itemProduct.quantity.value)));
            double rate=0;
            for (VtxTaxItem tax :itemProduct.getTaxes()){
                rate+=tax.getEffectiveRate();
            }
            tLine.setTax_rate(rate*100);
            tLine.setInformative("true");//TODO
            tLine.setCustom_id(cont.toString());//TODO
            transaction_lines.add(tLine);
        }
        trans.transaction_lines=transaction_lines;

        taxamoRequest.setTransaction(trans);
        String jsonDataReq=gson.toJson(taxamoRequest, TaxamoRequest.class);
        RequestBody body = RequestBody.create(mediaType, jsonDataReq);

        Request request = new Request.Builder()
                .url(taxamoValidationURL + "/transactions")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        TaxamoResponse taxamoResponse= new TaxamoResponse();
        String jsonData = null;
        try {
            jsonData = response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        taxamoResponse=gson.fromJson(jsonData,TaxamoResponse.class);
        return taxamoResponse.getTransaction().getInvoice_image_url();//TODO
    }


    private static String getHardcodedValue(String country, String type) {
        // Hardcoded values stored in a 2D array
        String[][] values = {
                {"RO", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"RO", "Receiver", "GENERIC_RO_EFACTURA_1p0p9"},
                {"RO", "InvoiceTypeCode", "380"},
                {"RO", "TaxCategoryId_E", "E"},
                {"RO", "TaxCategoryId", "S"},
                {"RO", "CitySubdivisionName", "VRBL:RO:SECTOR1"},
                {"RO", "CountrySubentity", "RO-B"},
                {"RO", "AccountingSupplierPartyVAT", "DE186279732"},
                {"RO", "PaymentMeansCode", "[Payment means text]"},
                {"RO", "PaymentMeansValue", "58"},
                {"RO", "AccountingCustomerPartyVAT","RO1097530"},


                {"MY", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"MY", "Receiver", "GENERIC_MY_MYINVOIS_1p0p0"},
                {"MY", "InvoiceTypeCode", "VRBL:MY:01"},
                {"MY", "TaxCategoryId_E", "VRBL:MY:E"},
                {"MY", "TaxCategoryId", "VRBL:MY:01"},
                {"MY", "IndustryClassificationCodeValue", "VRBL:MY:15120"},
                {"MY", "IndustryClassificationCodeName", "Manufacture of luggage, handbags and the like, saddlery and harness"},
                {"MY", "ItemClassificationCode", "003"},
                {"MY", "ItemClassificationListID", "VRBL:MY:CLASS"},
                {"MY", "DocumentTypeCodeType", "VRBL:MY:K2"},
                {"MY", "AccountingSupplierPartyVAT", "DE186279732"},
                {"MY", "PaymentMeansCode", "[Payment means text]"},
                {"MY", "PaymentMeansValue", "VRBL:MY:01"},
                {"MY", "AccountingCustomerPartyVAT","MY332527336"},

                {"DE", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"DE", "Receiver", "GENERIC_PEPPOL_UBL_DE_XRECHNUNG_3p0p1"},
                {"DE", "ReceiverDetails", "9930:VERTEX_PROD_SALES_COR_A_UNIT1"},
                {"DE", "InvoiceTypeCode", "381"},
                {"DE", "TaxCategoryId_E", "E"},
                {"DE", "TaxCategoryId", "S"},
                {"DE", "AccountingSupplierPartyVAT", "DE186279732"},
                {"DE", "BuyerReference", "99000000-18188-18"},
                {"DE", "PaymentMeansCode", "[Payment means text]"},
                {"DE", "PaymentMeansValue", "58"},
                {"DE", "DocumentTypeCodeType", "130"},
                {"DE", "CountrySubentity", "Bayern"},
                {"DE", "CitySubdivisionName", "p"},
                {"DE", "PaymentId", "Deb. 12345 / Fact. 9876543"},
                {"DE", "EndpointIDSchemeID", "9930"},
                {"DE", "EndpointID", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"DE", "AccountingCustomerPartyVAT","DE332527336"},

                {"SA", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"SA", "Receiver", "GENERIC_SA_EINVOIC_1p2p0"},
                {"SA", "InvoiceTypeCode", "388"},
                {"SA", "TaxCategoryId_E", "E"},
                {"SA", "TaxCategoryId", "S"},
                {"SA", "PaymentMeansValue", "30"},
                {"SA", "InvoiceSubtypeCode", "0200000"},
                {"SA", "AccountingCustomerPartyVAT","399999999800003"},
                {"SA", "AccountingSupplierPartyVAT", "399999999900003"},
                {"SA", "BuildingNumber", "111"},
                {"SA", "CitySubdivisionName", "Al-Murooj"},

                {"ES", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"ES", "Receiver", "GENERIC_PEPPOL_UBL_ES_1p0p0"},
                {"ES", "ReceiverDetails", "9920:VERTEX_PROD_SALES_COR_A_UNIT1"},
                {"ES", "EndpointID", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"ES", "InvoiceTypeCode", "380"},
                {"ES", "TaxCategoryId_E", "E"},
                {"ES", "TaxCategoryId", "S"},
                {"ES", "AccountingSupplierPartyVAT", "DE186279732"},
                {"ES", "PaymentMeansCode", "[Payment means text]"},
                {"ES", "PaymentMeansValue", "58"},
                {"ES", "AccountingCustomerPartyVAT","ESA28198752"},
                {"ES", "EndpointIDSchemeID", "9920"},
                {"ES", "BuyerReference", "99000000-18188-18"},
                {"ES", "IndustryClassificationCodeValue", "VRBL:ES:15120"},
                {"ES", "IndustryClassificationCodeName", "Manufacture of luggage, handbags and the like, saddlery and harness"},

                {"IT", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"IT", "Receiver", "GENERIC_IT_FatturaPA_1p2p2"},
                {"IT", "SdIReceiverCode", "O92KTP"},
                {"IT", "TransmissionFormatCode", "VRBL:IT:FPA12"},
                {"IT", "InvoiceTypeCode", "380"},
                {"IT", "TaxCategoryId_E", "E"},
                {"IT", "TaxCategoryId", "S"},
                {"IT", "AccountingSupplierPartyVAT", "DE186279732"},
                {"IT", "PaymentMeansCode", "[Payment means text]"},
                {"IT", "PaymentMeansValue", "58"},
                {"IT", "AccountingCustomerPartyVAT","IT00743110157"},
                {"IT", "TaxExemptionReasonCode","VRBL:IT:N2.2"},
                {"IT", "CountrySubentity", "IT-RM"},
                {"IT", "PaymentTermsCode", "VRBL:IT:TP01"},
                {"IT", "TaxLevelCode", "VRBL:IT:RF01"},

                {"PT", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"PT", "Receiver", "GENERIC_FE-AP_UBL_CIUS-PT_2p1p1"},
                {"PT", "SdIReceiverCode", "O92KTP"},
                {"PT", "TransmissionFormatCode", "VRBL:PT:FPA12"},
                {"PT", "InvoiceTypeCode", "380"},
                {"PT", "TaxCategoryId_E", "E"},
                {"PT", "TaxCategoryId", "S"},
                {"PT", "AccountingSupplierPartyVAT", "PT500226480"},
                {"PT", "PaymentMeansCode", "[Payment means text]"},
                {"PT", "PaymentMeansValue", "58"},
                {"PT", "AccountingCustomerPartyVAT","pT00743110157"},
                {"PT", "TaxExemptionReasonCode","VRBL:PT:N2.2"},
                {"PT", "CountrySubentity", "PT-RM"},
                {"PT", "PaymentTermsCode", "VRBL:PT:TP01"},
                {"PT", "TaxLevelCode", "VRBL:IT:RF01"},

                {"FR", "Sender", "VERTEX_PROD_END2END_COR_A_UNIT1"},
                {"FR", "Receiver", "GENERIC_FE-AP_UBL_CIUS-PT_2p1p1"},
                {"FR", "ReceiverDetails", "9957:VERTEX_PROD_SALES_COR_A_UNIT1"},
                {"DE", "EndpointIDSchemeID", "9920"},
                {"DE", "EndpointID", "VERTEX_PROD_SALES_COR_A_UNIT1"},
                {"FR", "SdIReceiverCode", "O92KTP"},
                {"FR", "TransmissionFormatCode", "VRBL:PT:FPA12"},
                {"FR", "InvoiceTypeCode", "380"},
                {"FR", "TaxCategoryId_E", "E"},
                {"FR", "TaxCategoryId", "S"},
                {"FR", "AccountingSupplierPartyVAT", "PT500226480"},
                {"FR", "PaymentMeansCode", "[Payment means text]"},
                {"FR", "PaymentMeansValue", "58"},
                {"FR", "AccountingCustomerPartyVAT","pT00743110157"},
                {"FR", "TaxExemptionReasonCode","VRBL:PT:N2.2"},
                {"FR", "CountrySubentity", "PT-RM"},
                {"FR", "PaymentTermsCode", "VRBL:PT:TP01"},
                {"FR", "TaxLevelCode", "VRBL:IT:RF01"},



        };

        // Iterate through the array to find the matching country and type
        for (String[] value : values) {
            if (value[0].equals(country) && value[1].equals(type)) {
                return value[2]; // Return the corresponding hardcoded value
            }
        }

        return "";
    }
    public String createElectronicInvoice(Order order, Customer customer, ArrayList<LineItem> items, MerchantStore store, String TaxamoUrlInvoice)  {
        // Don't want to throw exception back since we're overriding createInvoice, so ignore exception
        try {
            GetConfigData(store);
        } catch (ServiceException ignore){
            LOGGER.warn("GetConfigData from store failed...expect an Exception error");
        }


        com.salesmanager.core.business.services.tax.taxamo.Invoice currencyDetails = new com.salesmanager.core.business.services.tax.taxamo.Invoice();
        try {
            currencyDetails=taxService.currencyConversion(store, order.getBilling().getCountry().getIsoCode(),order.getCurrency().getCode(), new BigDecimal(1));
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }

        String eInvCountry=order.getBilling().getCountry().getIsoCode();
        InvoiceType eInv =new InvoiceType();

        eInv.setUBLExtensions(new UBLExtensionsType());
        UBLExtensionsType uBLExtensionsType=new UBLExtensionsType();
        UBLExtensionType uBLExtension=new UBLExtensionType();
         ExtensionContentType extensionContentType=new ExtensionContentType();
        InvoiceExtensionType invoiceExtension=new InvoiceExtensionType();
        invoiceExtension.setRoutingDetails(new RoutingDetailsType());
        invoiceExtension.getRoutingDetails().setSender(getHardcodedValue(eInvCountry,"Sender"));
        invoiceExtension.getRoutingDetails().setReceiver(getHardcodedValue(eInvCountry,"Receiver"));
        invoiceExtension.getRoutingDetails().setReceiverDetails(getHardcodedValue(eInvCountry,"ReceiverDetails"));
        invoiceExtension.setSdIReceiverCode((getHardcodedValue(eInvCountry,"SdIReceiverCode")));
        invoiceExtension.setTransmissionFormatCode((getHardcodedValue(eInvCountry,"TransmissionFormatCode")));



        invoiceExtension.setInvoiceSubtypeCode(getHardcodedValue(eInvCountry,"InvoiceSubtypeCode"));
        extensionContentType.setAny(invoiceExtension);



        uBLExtension.setExtensionContent(extensionContentType);


        eInv.getUBLExtensions().getUBLExtension().add(uBLExtension);

        eInv.setCustomizationID(new CustomizationIDType());
        eInv.getCustomizationID().setValue("urn:vertexinc:vrbl:billing:1");

        eInv.setProfileID(new ProfileIDType());
        eInv.getProfileID().setValue("urn:vertexinc:vrbl:billing:1");

        eInv.setUUID(new UUIDType());

        eInv.getUUID().setValue(UUID.randomUUID().toString());

        eInv.setIssueDate(new IssueDateType());
        eInv.setIssueTime(new IssueTimeType());
        eInv.setDueDate(new DueDateType());

        try {
            eInv.getIssueDate().setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(order.getDatePurchased())));
            eInv.getIssueTime().setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("HH:mm:ss'Z'").format(order.getDatePurchased())));

            eInv.getDueDate().setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(order.getDatePurchased())));
        } catch (DatatypeConfigurationException e) {
                throw new RuntimeException(e);
        }

        eInv.setID(new IDType());
        eInv.getID().setValue(order.getId().toString());
        eInv.setInvoiceTypeCode(new InvoiceTypeCodeType());
        eInv.getInvoiceTypeCode().setValue(getHardcodedValue(eInvCountry,"InvoiceTypeCode"));
        eInv.setDocumentCurrencyCode(new DocumentCurrencyCodeType());
        eInv.getDocumentCurrencyCode().setValue(currencyDetails.currency_code);

        eInv.setBuyerReference(new BuyerReferenceType());
        eInv.getBuyerReference().setValue(getHardcodedValue(eInvCountry,"BuyerReference"));

        NoteType noteType=new NoteType();
        noteType.setValue("This is an invoice generated by the SE team using Shopizer");
        noteType.setLanguageID("en");
        eInv.getNote().add(noteType);

        eInv.setOrderReference(new OrderReferenceType());
        eInv.getOrderReference().setID(new IDType());
        eInv.getOrderReference().getID().setValue(order.getId().toString());
        eInv.getOrderReference().setSalesOrderID(new SalesOrderIDType());
        eInv.getOrderReference().getSalesOrderID().setValue(order.getCustomerId().toString());


        DocumentReferenceType documentReferenceType=new DocumentReferenceType();
        documentReferenceType.setAttachment(new AttachmentType());
        documentReferenceType.getAttachment().setExternalReference(new ExternalReferenceType());
        documentReferenceType.getAttachment().getExternalReference().setURI(new URIType());
        documentReferenceType.getAttachment().getExternalReference().getURI().setValue(TaxamoUrlInvoice);
        documentReferenceType.setID(new IDType());
        documentReferenceType.getID().setValue(order.getId().toString());
        DocumentDescriptionType docDesc=new DocumentDescriptionType();
        docDesc.setValue("Attached PDF");
        documentReferenceType.getDocumentDescription().add(docDesc);
    //    TaxamoUrlInvoice="https://invoice.taxamo.com/api/v1/transactions/TMIoAAESd5tMKD61AT2xnLhWjGbg/invoice";
        TaxamoUrlInvoice=TaxamoUrlInvoice.replace("invoice.taxamo.com/api/v1/transactions","invoicestaxamo.s3.amazonaws.com")+".pdf";
        documentReferenceType.setAttachment(new AttachmentType());
        documentReferenceType.getAttachment().setEmbeddedDocumentBinaryObject(new EmbeddedDocumentBinaryObjectType());
        try {
            URL pdfUrl = new URL(TaxamoUrlInvoice);
            URLConnection urlConnection = pdfUrl.openConnection();
            TimeUnit.SECONDS.sleep(1);//added 1 sec to fix sync issue with taxamo
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[1024]; // amount of bytes reading from input stream at a given time
            int readLength;

            InputStream inputStream = pdfUrl.openStream();
            while ((readLength = inputStream.read(byteArray)) > 0){
                outputStream.write(byteArray, 0, readLength);
            }

            outputStream.flush();
            outputStream.close();
            inputStream.close();
            documentReferenceType.getAttachment().getEmbeddedDocumentBinaryObject().setValue(outputStream.toByteArray());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        documentReferenceType.getAttachment().getEmbeddedDocumentBinaryObject().setMimeCode("application/pdf");
        documentReferenceType.getAttachment().getEmbeddedDocumentBinaryObject().setFilename(order.getId().toString()+".pdf");
        DocumentTypeType docType =new DocumentTypeType();
        docType.setValue(getHardcodedValue(eInvCountry,"DocumentTypeCodeType"));
        documentReferenceType.getDocumentType().add(docType);

        eInv.getAdditionalDocumentReference().add(documentReferenceType);

        eInv.setAccountingSupplierParty(new SupplierPartyType());
        eInv.getAccountingSupplierParty().setParty(new PartyType());


        PartyNameType partyName= new PartyNameType();
        partyName.setName(new NameType());
        NameType nameType=new NameType();
        nameType.setValue("Vertex Inc.");
        partyName.setName(nameType);
        eInv.getAccountingSupplierParty().getParty().getPartyName().add(partyName);

        if (!getHardcodedValue(eInvCountry,"EndpointID").isEmpty()){
            eInv.getAccountingSupplierParty().getParty().setEndpointID(new EndpointIDType());
            eInv.getAccountingSupplierParty().getParty().getEndpointID().setValue(getHardcodedValue(eInvCountry,"EndpointID"));
            eInv.getAccountingSupplierParty().getParty().getEndpointID().setSchemeID(getHardcodedValue(eInvCountry,"EndpointIDSchemeID"));
        }

        eInv.getAccountingSupplierParty().getParty().setPostalAddress(new AddressType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setStreetName(new StreetNameType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getStreetName().setValue(store.getStoreaddress());

        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setBuildingNumber(new BuildingNumberType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getBuildingNumber().setValue(getHardcodedValue(eInvCountry,"BuildingNumber"));//TODO: fix hardcoded

        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setCitySubdivisionName(new CitySubdivisionNameType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getCitySubdivisionName().setValue(getHardcodedValue(eInvCountry,"CitySubdivisionName"));//TODO: fix hardcoded


        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setCityName(new CityNameType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getCityName().setValue(store.getStorecity());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setPostalZone(new PostalZoneType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getPostalZone().setValue(store.getStorepostalcode());

        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setCountrySubentity(new CountrySubentityType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getCountrySubentity().setValue(getHardcodedValue(eInvCountry,"CountrySubentity"));//TODO: fix hardcoded

        eInv.getAccountingSupplierParty().getParty().getPostalAddress().setCountry(new CountryType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getCountry().setIdentificationCode(new IdentificationCodeType());
        eInv.getAccountingSupplierParty().getParty().getPostalAddress().getCountry().getIdentificationCode().setValue(eInvCountry);//TODO using the destination country as the origin is USA and that will not work

        eInv.getAccountingSupplierParty().getParty().setIndustryClassificationCode(new IndustryClassificationCodeType());
        eInv.getAccountingSupplierParty().getParty().getIndustryClassificationCode().setName(getHardcodedValue(eInvCountry,"IndustryClassificationCodeName"));
        eInv.getAccountingSupplierParty().getParty().getIndustryClassificationCode().setValue(getHardcodedValue(eInvCountry,"IndustryClassificationCodeValue"));

        PartyTaxSchemeType partyScheme=new PartyTaxSchemeType();
        partyScheme.setRegistrationName(new RegistrationNameType());
        partyScheme.getRegistrationName().setValue(order.getMerchant().getStorename());
        partyScheme.setRegistrationName(new RegistrationNameType());
        partyScheme.getRegistrationName().setValue(store.getStorename());
        partyScheme.setCompanyID(new CompanyIDType());
        partyScheme.getCompanyID().setValue(getHardcodedValue(eInvCountry,"AccountingSupplierPartyVAT"));

        partyScheme.setTaxLevelCode(new TaxLevelCodeType());
        partyScheme.getTaxLevelCode().setValue(getHardcodedValue(eInvCountry,"TaxLevelCode"));

        partyScheme.setTaxScheme(new TaxSchemeType());
        partyScheme.getTaxScheme().setID(new IDType());
        partyScheme.getTaxScheme().getID().setValue("VAT");
        eInv.getAccountingSupplierParty().getParty().getPartyTaxScheme().add(partyScheme);

        PartyLegalEntityType partyLegalEntityType=new PartyLegalEntityType();
        partyLegalEntityType.setRegistrationName(new RegistrationNameType());
        partyLegalEntityType.getRegistrationName().setValue(store.getStorename());
        partyLegalEntityType.setCompanyID(new CompanyIDType());
        partyLegalEntityType.getCompanyID().setValue(order.getMerchant().getCode());
        eInv.getAccountingSupplierParty().getParty().getPartyLegalEntity().add(partyLegalEntityType);

        ContactType contact= new ContactType();
        contact.setID(new IDType());
        contact.getID().setValue(store.getCode());
        contact.setName(new NameType());
        contact.getName().setValue(store.getStorename());
        contact.setTelephone(new TelephoneType());
        contact.getTelephone().setValue(store.getStorephone());
        contact.setTelefax(new TelefaxType());
        contact.getTelefax().setValue(store.getStorephone());
        contact.setElectronicMail(new ElectronicMailType());
        contact.getElectronicMail().setValue(store.getStoreEmailAddress());


        eInv.getAccountingSupplierParty().getParty().setContact(contact);



        eInv.setAccountingCustomerParty(new CustomerPartyType());
        eInv.getAccountingCustomerParty().setSupplierAssignedAccountID(new SupplierAssignedAccountIDType());
        eInv.getAccountingCustomerParty().getSupplierAssignedAccountID( ).setValue("VRTXSL02");
        eInv.getAccountingCustomerParty().setParty(new PartyType());
        PartyNameType partyNameAc= new PartyNameType();
        partyNameAc.setName(new NameType());
        partyNameAc.getName().setValue(customer.getBilling().getFirstName()+" "+customer.getBilling().getLastName());


        eInv.getAccountingCustomerParty().getParty().getPartyName().add(partyNameAc);
        eInv.getAccountingCustomerParty().getParty().setPostalAddress(new AddressType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setStreetName(new StreetNameType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getStreetName().setValue(order.getBilling().getAddress());

        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setBuildingNumber(new BuildingNumberType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getBuildingNumber().setValue(getHardcodedValue(eInvCountry,"BuildingNumber"));//TODO:fix hardcoded

        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setCitySubdivisionName(new CitySubdivisionNameType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getCitySubdivisionName().setValue(getHardcodedValue(eInvCountry,"CitySubdivisionName"));//TODO:fix hardcoded

        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setPostalZone(new PostalZoneType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getPostalZone().setValue(order.getBilling().getPostalCode());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setCountrySubentity(new CountrySubentityType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getCountrySubentity().setValue(getHardcodedValue(eInvCountry,"CountrySubentity"));//TODO:fix hardcoded
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setCityName(new CityNameType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getCityName().setValue(order.getBilling().getCity());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().setCountry(new CountryType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getCountry().setIdentificationCode(new IdentificationCodeType());
        eInv.getAccountingCustomerParty().getParty().getPostalAddress().getCountry().getIdentificationCode().setValue(eInvCountry);

        PartyTaxSchemeType partyTaxScheme=new PartyTaxSchemeType();
        partyTaxScheme.setCompanyID(new CompanyIDType());

        if (order.getBilling().getVatNumber().isEmpty()) {
            Random random = new Random();
            partyTaxScheme.getCompanyID().setValue( String.format(getHardcodedValue(eInvCountry,"AccountingCustomerPartyVAT")));
        }
        else
            partyTaxScheme.getCompanyID().setValue(order.getBilling().getVatNumber());

        partyTaxScheme.setTaxScheme(new TaxSchemeType());
        partyTaxScheme.getTaxScheme().setID(new IDType());
        partyTaxScheme.getTaxScheme().getID().setValue("VAT");
        eInv.getAccountingCustomerParty().getParty().getPartyTaxScheme().add(partyTaxScheme);

        PartyLegalEntityType partyLegalEntityType1=new PartyLegalEntityType();
        partyLegalEntityType1.setRegistrationName(new RegistrationNameType());
        partyLegalEntityType1.getRegistrationName().setValue(store.getStorename());
        partyLegalEntityType1.setCompanyID(new CompanyIDType());
        partyLegalEntityType1.getCompanyID().setValue(order.getMerchant().getCode());
        eInv.getAccountingCustomerParty().getParty().getPartyLegalEntity().add(partyLegalEntityType1);

        PartyTaxSchemeType partyTaxSchemeType= new PartyTaxSchemeType();
        partyTaxSchemeType.setRegistrationName(new RegistrationNameType());
        partyTaxSchemeType.getRegistrationName().setValue(order.getBilling().getCompany());
        partyTaxSchemeType.setCompanyID(new CompanyIDType());

     //   partyScheme.getCompanyID().setValue(getHardcodedValue(order.getBilling().getCountry().getIsoCode(),"AccountingSupplierPartyVAT"));

        ContactType contactCust=new ContactType();
        contactCust.setName(new NameType());
        contactCust.getName().setValue(order.getBilling().getFirstName()+" "+order.getBilling().getLastName());
        contactCust.setTelephone(new TelephoneType());
        contactCust.getTelephone().setValue(order.getBilling().getTelephone());
        contactCust.setElectronicMail(new ElectronicMailType());
        contactCust.getElectronicMail().setValue(order.getCustomerEmailAddress());
        eInv.getAccountingCustomerParty().getParty().setContact(contactCust);

        PaymentMeansType paymentMean=new PaymentMeansType();
        paymentMean.setPaymentMeansCode(new PaymentMeansCodeType());
        paymentMean.getPaymentMeansCode().setName(getHardcodedValue(eInvCountry,"PaymentMeansCode"));
        paymentMean.getPaymentMeansCode().setValue(getHardcodedValue(eInvCountry,"PaymentMeansValue"));
        PaymentIDType paymentId = new PaymentIDType();
        paymentId.setValue(getHardcodedValue(eInvCountry,"PaymentId"));
        paymentMean.getPaymentID().add(paymentId);
        paymentMean.setPayeeFinancialAccount(new FinancialAccountType());
        paymentMean.getPayeeFinancialAccount().setID(new IDType());
        paymentMean.getPayeeFinancialAccount().getID().setValue("DE75512108001245126199");
        paymentMean.getPayeeFinancialAccount().setName(new NameType());
        paymentMean.getPayeeFinancialAccount().getName().setValue("[Payment account name]");
        paymentMean.getPayeeFinancialAccount().setFinancialInstitutionBranch(new BranchType());
        paymentMean.getPayeeFinancialAccount().getFinancialInstitutionBranch().setID(new IDType());
        paymentMean.getPayeeFinancialAccount().getFinancialInstitutionBranch().getID().setValue("[BIC]");
        eInv.getPaymentMeans().add(paymentMean);


        UBLExtensionsType ublextensionspaymentTerm=new UBLExtensionsType();
        UBLExtensionType ublExtensionpaymentTerm=new UBLExtensionType();
        PaymentTermsExtensionType paymentTermsExtensionType=new PaymentTermsExtensionType();
        paymentTermsExtensionType.setPaymentTermsCode(getHardcodedValue(eInvCountry,"PaymentTermsCode"));
        ublExtensionpaymentTerm.setExtensionContent(new ExtensionContentType());
        ublExtensionpaymentTerm.getExtensionContent().setAny(paymentTermsExtensionType);

        ublextensionspaymentTerm.getUBLExtension().add(ublExtensionpaymentTerm);
        PaymentTermsType paymentTermsType=new PaymentTermsType();
        paymentTermsType.setUBLExtensions(ublextensionspaymentTerm);
        eInv.getPaymentTerms().add(paymentTermsType);



        TaxAmountType taxAmountHeader=new TaxAmountType();
        taxAmountHeader.setCurrencyID(currencyDetails.currency_code);
        taxAmountHeader.setValue(BigDecimal.valueOf(0));

        MonetaryTotalType legalMonetaryTotal=new MonetaryTotalType();
        legalMonetaryTotal.setLineExtensionAmount(new LineExtensionAmountType());
        legalMonetaryTotal.getLineExtensionAmount().setCurrencyID(currencyDetails.currency_code);
        legalMonetaryTotal.getLineExtensionAmount().setValue(BigDecimal.valueOf(0));

        legalMonetaryTotal.setTaxExclusiveAmount(new TaxExclusiveAmountType());
        legalMonetaryTotal.getTaxExclusiveAmount().setCurrencyID(currencyDetails.currency_code);
        legalMonetaryTotal.getTaxExclusiveAmount().setValue(BigDecimal.valueOf(0));

        legalMonetaryTotal.setTaxInclusiveAmount(new TaxInclusiveAmountType());
        legalMonetaryTotal.getTaxInclusiveAmount().setCurrencyID(currencyDetails.currency_code);
        legalMonetaryTotal.getTaxInclusiveAmount().setValue(BigDecimal.valueOf(0));

        legalMonetaryTotal.setPayableAmount (new PayableAmountType());
        legalMonetaryTotal.getPayableAmount().setCurrencyID(currencyDetails.currency_code);
        legalMonetaryTotal.getPayableAmount().setValue(BigDecimal.valueOf(0));
        TaxTotalType taxTotalHeader=new TaxTotalType();

        Integer cont=0;
        for (LineItem itemProduct :items) {
            TaxTotalType taxTotalItem=new TaxTotalType();


            InvoiceLineType invoiceLine=new InvoiceLineType();
            invoiceLine.setID(new IDType());
            invoiceLine.getID().setValue(String.valueOf(itemProduct.lineItemNumber));
            invoiceLine.setInvoicedQuantity(new InvoicedQuantityType());
            invoiceLine.getInvoicedQuantity().setValue(BigDecimal.valueOf(itemProduct.quantity.value));
            if (itemProduct.quantity.unitOfMeasure==null)
                invoiceLine.getInvoicedQuantity().setUnitCode("MTK");
            else
                invoiceLine.getInvoicedQuantity().setUnitCode(itemProduct.quantity.unitOfMeasure);
            invoiceLine.setLineExtensionAmount(new LineExtensionAmountType());
            invoiceLine.getLineExtensionAmount().setCurrencyID(currencyDetails.currency_code);
            invoiceLine.getLineExtensionAmount().setValue(itemProduct.extendedPrice.multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP));



            invoiceLine.setItem(new ItemType());
            invoiceLine.getItem().setName(new NameType());
            invoiceLine.getItem().getName().setValue(itemProduct.product.productClass);


            invoiceLine.setPrice(new PriceType());
            UBLExtensionsType ublExtensionsPrice=new UBLExtensionsType();
            UBLExtensionType ublExtensionPrice=new UBLExtensionType();
            ExtensionContentType extensionContentPrice=new ExtensionContentType();
            com.salesmanager.core.business.services.tax.ecosio.vrbl.vertexinc.vrbl.extensioncomponent._1.PriceExtensionType priceExtention=new com.salesmanager.core.business.services.tax.ecosio.vrbl.vertexinc.vrbl.extensioncomponent._1.PriceExtensionType();
            priceExtention.setPriceAmountBeforeAllowanceCharge(itemProduct.extendedPrice.multiply(currencyDetails.amount).divide(new BigDecimal(itemProduct.quantity.value)).setScale(2, RoundingMode.HALF_UP));
            extensionContentPrice.setAny(priceExtention);
            ublExtensionPrice.setExtensionContent(extensionContentPrice);
            ublExtensionsPrice.getUBLExtension().add(ublExtensionPrice);
            invoiceLine.getPrice().setUBLExtensions(ublExtensionsPrice);

            invoiceLine.getPrice().setPriceAmount(new PriceAmountType());
            invoiceLine.getPrice().getPriceAmount().setValue(itemProduct.extendedPrice.multiply(currencyDetails.amount).divide(new BigDecimal(itemProduct.quantity.value)).setScale(2, RoundingMode.HALF_UP));
            invoiceLine.getPrice().getPriceAmount().setCurrencyID(currencyDetails.currency_code);


            CommodityClassificationType commodityClassificationType= new CommodityClassificationType();
            commodityClassificationType.setItemClassificationCode(new ItemClassificationCodeType());
            commodityClassificationType.getItemClassificationCode().setValue(getHardcodedValue(eInvCountry,"ItemClassificationCode"));
            commodityClassificationType.getItemClassificationCode().setListID(getHardcodedValue(eInvCountry,"ItemClassificationListID"));
            if (! commodityClassificationType.getItemClassificationCode().getValue().isEmpty())
                invoiceLine.getItem().getCommodityClassification().add(commodityClassificationType);

            invoiceLine.setItemPriceExtension(new PriceExtensionType());
            invoiceLine.getItemPriceExtension().setAmount(new AmountType());
            invoiceLine.getItemPriceExtension().getAmount().setValue(itemProduct.extendedPrice.multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP));
            invoiceLine.getItemPriceExtension().getAmount().setCurrencyID(currencyDetails.currency_code);


            for (VtxTaxItem tax :itemProduct.getTaxes()) {
                TaxSubtotalType taxSubtotal=new TaxSubtotalType();

                TaxAmountType taxAmountItem = new TaxAmountType();
                taxAmountItem.setCurrencyID(currencyDetails.currency_code);
                taxAmountItem.setValue(BigDecimal.valueOf(tax.calculatedTax).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP));
                taxSubtotal.setTaxAmount (taxAmountItem);

                TaxableAmountType taxableAmount = new TaxableAmountType();
                taxableAmount.setCurrencyID ( currencyDetails.currency_code);
                taxableAmount.setValue(BigDecimal.valueOf(tax.taxable).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP));
                taxSubtotal.setTaxableAmount ( taxableAmount);


                TaxCategoryType taxCategory=new TaxCategoryType();
                taxCategory.setPercent(new PercentType());
                taxCategory.getPercent().setValue(BigDecimal.valueOf(tax.getEffectiveRate()).multiply(BigDecimal.valueOf(100)));

                taxCategory.setID(new IDType());
                taxCategory.getID().setValue(getHardcodedValue(eInvCountry,"TaxCategoryId"));

                if (BigDecimal.valueOf(tax.getEffectiveRate()).equals(BigDecimal.valueOf(0.0))){
                    taxCategory.getID().setValue(getHardcodedValue(eInvCountry,"TaxCategoryId_E"));
                    TaxExemptionReasonType taxExemptionReasonType=new TaxExemptionReasonType();
                    taxExemptionReasonType.setValue(tax.rateClassification);
                    taxCategory.getTaxExemptionReason().add(taxExemptionReasonType);

                    TaxExemptionReasonCodeType taxExemptionReasonCodeType=new TaxExemptionReasonCodeType();
                    taxExemptionReasonCodeType.setValue(getHardcodedValue(eInvCountry,"TaxExemptionReasonCode"));
                    taxCategory.setTaxExemptionReasonCode(taxExemptionReasonCodeType);

                }

                TaxSchemeType taxSchemeItem=new TaxSchemeType();
                taxSchemeItem.setID(new IDType());
                taxSchemeItem.getID().setValue("VAT");
                taxCategory.setTaxScheme(taxSchemeItem);

                invoiceLine.getItem().getClassifiedTaxCategory().add(taxCategory);
                taxSubtotal.setTaxCategory(taxCategory);

                taxTotalItem.setRoundingAmount(new RoundingAmountType());
                taxTotalItem.getRoundingAmount().setValue(BigDecimal.valueOf(itemProduct.fairMarketValue.doubleValue()).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP));
                taxTotalItem.getRoundingAmount().setCurrencyID( currencyDetails.currency_code);

                taxTotalItem.setTaxAmount(new TaxAmountType());
                taxTotalItem.getTaxAmount().setValue(BigDecimal.valueOf(tax.calculatedTax).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP));
                taxTotalItem.getTaxAmount().setCurrencyID( currencyDetails.currency_code);
                taxTotalItem.getTaxSubtotal().add(taxSubtotal);


                    addOrUpdateItem(taxTotalHeader.getTaxSubtotal(),taxSubtotal);
                    taxAmountHeader.setValue(taxAmountHeader.getValue().add(BigDecimal.valueOf(tax.calculatedTax).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP)));

            }
            legalMonetaryTotal.getLineExtensionAmount().setValue( legalMonetaryTotal.getLineExtensionAmount().getValue().add(BigDecimal.valueOf(itemProduct.extendedPrice.doubleValue()).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP)));
            legalMonetaryTotal.getTaxExclusiveAmount().setValue( legalMonetaryTotal.getTaxExclusiveAmount().getValue().add(BigDecimal.valueOf(itemProduct.extendedPrice.doubleValue()).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP)));
            legalMonetaryTotal.getTaxInclusiveAmount().setValue( legalMonetaryTotal.getTaxInclusiveAmount().getValue().add(BigDecimal.valueOf(itemProduct.fairMarketValue.doubleValue()).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP)));
            legalMonetaryTotal.getPayableAmount().setValue( legalMonetaryTotal.getPayableAmount().getValue().add(BigDecimal.valueOf(itemProduct.fairMarketValue.doubleValue()).multiply(currencyDetails.amount).setScale(2, RoundingMode.HALF_UP)));
            eInv.getInvoiceLine().add(invoiceLine);

            invoiceLine.getTaxTotal().add(taxTotalItem);
        }

        eInv.setLegalMonetaryTotal(legalMonetaryTotal);
        taxTotalHeader.setTaxAmount(taxAmountHeader);
        eInv.getTaxTotal().add(taxTotalHeader);



/*prepare the XML*/
        String filename="eInvXMLfile.xml";
        File file = new File(filename);
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(InvoiceType.class,
                    UBLExtensionsType.class,
                    InvoiceExtensionType.class,
                    PaymentTermsExtensionType.class,
                    com.salesmanager.core.business.services.tax.ecosio.vrbl.vertexinc.vrbl.extensioncomponent._1.PriceExtensionType.class);
          //  JAXBElement<InvoiceType> jaxbWrappedHeader =  objectFactory.createHeader(eInv);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new DefaultNamespacePrefixMapper());

            com.salesmanager.core.business.services.tax.ecosio.vrbl.oasis.names.specification.ubl.schema.xsd.invoice_2.ObjectFactory Obj=new com.salesmanager.core.business.services.tax.ecosio.vrbl.oasis.names.specification.ubl.schema.xsd.invoice_2.ObjectFactory();
            QName qName = new QName("urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", "Invoice");
            JAXBElement<InvoiceType> root = new JAXBElement<>(qName, InvoiceType.class, eInv);

            jaxbMarshaller.marshal(root, file);
            jaxbMarshaller.marshal(root, System.out);


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


/* Send the XML to Vertex eInvoicing */
        MediaType MEDIA_TYPE = MediaType.parse("application/xml");
        RequestBody requestBody = new MultipartBuilder()
                .type(MultipartBuilder.FORM)
                .addPart(
                        Headers.of("Content-Disposition", "form-data; name=\"payload\"; filename=\""+file.getName()+"\""),
                        RequestBody.create(MEDIA_TYPE, file))
                .build();

        Request request = null;
        try {
            request = new Request.Builder()
                   .url( eInvoicing_url)
                    .method("POST", requestBody)
                    .addHeader("Authorization", "Bearer "+this.getAuthentication(eInvoicing_client_Id,eInvoicing_client_secret,eInvoicing_auth_url))//TODO david to fix this.
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        OkHttpClient client = new OkHttpClient();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//process the response
        EInvoicingResponse eInvResponse= new EInvoicingResponse();
        String jsonData = null;
        try {
            jsonData = response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       // eInvResponse=gson.fromJson(jsonData,TaxamoResponse.class);
        return jsonData;//TODO
    }

    private static List<TaxSubtotalType>  addOrUpdateItem(List<TaxSubtotalType> itemList, TaxSubtotalType newItem) {
        boolean found = false;

        // Search for an existing item with the same name
        for (TaxSubtotalType item : itemList) {
            Integer count=0;
            if (item.getTaxCategory().getTaxScheme().getID().getValue().equals(newItem.getTaxCategory().getTaxScheme().getID().getValue())&&
            item.getTaxCategory().getID().getValue().equals(newItem.getTaxCategory().getID().getValue())) {
                // If found, update the existing item's quantity and price
                itemList.get(count).getTaxAmount().setValue( item.getTaxAmount().getValue().add(newItem.getTaxAmount().getValue()));
                itemList.get(count).getTaxableAmount().setValue( item.getTaxableAmount().getValue().add(newItem.getTaxableAmount().getValue()));
                found = true;
                break;
            }
            count++;
        }

        // If not found, add the new item to the list
        if (!found) {
            itemList.add(newItem);
        }
        return itemList;
    }

    /*Oauth Authentication for eInvoicing*/
    public static String getAuthentication(String client_Id, String client_secret, String auth_url) throws IOException {

        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "client_id=" + client_Id + "&client_secret=" + client_secret +"&grant_type=client_credentials&audience=verx://migration-api");
        Request request = new Request.Builder()
                //.url("https://auth.vertexsmb.com/identity/connect/token")//TODO: david add this to tha admin console as "Vertex Autentication URL"
                .url(auth_url)
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = client.newCall(request).execute();

        Map<String, Object> responseMap = new ObjectMapper().readValue(response.body().byteStream(), HashMap.class);
        // Read the value of the "access_token" key from the hashmap
        String accessToken = (String) responseMap.get("access_token");
        return accessToken;

    }
    private void GetConfigData(MerchantStore store) throws ServiceException {


        LOGGER.info("getting Tax Config data for OrderServiceImpl....");
        TaxConfiguration taxConfiguration = taxService.getTaxConfiguration(store);
        if (taxConfiguration == null) {
            throw new ServiceException("error getting taxConfig in Vertex Tax Calculation");
        }
        LOGGER.info("setting Tax Config data for OrderServiceImpl....");
        this.client_Id = taxConfiguration.getTaxCalcClientId();
        this.client_secret = taxConfiguration.getTaxCalcClientSecret();
        this.calc_url = taxConfiguration.getTaxCalcURL();
        this.taxamoValidationURL = taxConfiguration.getTaxamoValidationURL();
        this.taxamoAuthToken = taxConfiguration.getTaxamoAuthToken();
    }

    public static byte[] getAsByteArray(String urlStr) throws IOException {

        java.net.URL url=new  java.net.URL(urlStr);
        java.net.URLConnection connection = url.openConnection();
        // Since you get a URLConnection, use it to get the InputStream
        InputStream in = connection.getInputStream();
        // Now that the InputStream is open, get the content length
        int contentLength = connection.getContentLength();

        // To avoid having to resize the array over and over and over as
        // bytes are written to the array, provide an accurate estimate of
        // the ultimate size of the byte array
        ByteArrayOutputStream tmpOut;
        if (contentLength != -1) {
            tmpOut = new ByteArrayOutputStream(contentLength);
        } else {
            tmpOut = new ByteArrayOutputStream(16384); // Pick some appropriate size
        }

        byte[] buf = new byte[512];
        while (true) {
            int len = in.read(buf);
            if (len == -1) {
                break;
            }
            tmpOut.write(buf, 0, len);
        }
        in.close();
        tmpOut.close(); // No effect, but good to do anyway to keep the metaphor alive

        return tmpOut.toByteArray();
    }
}
