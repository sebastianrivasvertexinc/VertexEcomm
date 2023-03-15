
<%
    response.setCharacterEncoding( "UTF-8" );
    response.setHeader( "Cache-Control", "no-cache" );
    response.setHeader( "Pragma", "no-cache" );
    response.setDateHeader( "Expires", -1 );
%>
<script>
function editAddress(formId){
	$( "#editBillingAddress_"+formId).submit();	
}
function editShippingAddress(formId){
	$( "#editShippingAddress_"+formId).submit();	
}
function addShippingAddress(formId){
	$( "#addShippingAddress_"+formId).submit();	
}


</script>

 <!-- Import the ECW javascript library -->
 <script src="https://ecwportal.vertexsmb.com/wizard/button.js"></script>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/shopizer-tags.tld" prefix="sm"%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<c:url var="editAddress" value="/shop/customer/editAddress.html"/>
<div id="main-content" class="container clearfix row-fluid">
		<div class="span12 common-row">

			  <div class="span8 col-md-8 no-padding">
				<div class="checkout-box">
					<span class="box-title">
						<p class="p-title">
							<s:message
									code="label.customer.billingaddress" text="Billing Address" />
							&nbsp;<a href="javascript:void(0)" onclick="editAddress('${customer.id}');"><s:message code="label.generic.edit" text="Edit"/></a>
						</p>
					</span>

					<c:if test="${not empty customer}">
					
						<form:form action="${editAddress}" method="GET" id="editBillingAddress_${customer.id}">
						<input type="hidden" name="customerId" value="${customer.id}">
						<input type="hidden" name="billingAddress" value="true"/>
						<address>
							<c:choose>
								<c:when test="${not empty customer.billing.company}">
									${customer.billing.company}<br/>
								</c:when>
								<c:otherwise>
									${customer.billing.firstName}&nbsp;${customer.billing.lastName}<br />
								</c:otherwise>
							</c:choose>


							<c:if test="${not empty customer.billing.address}"> ${customer.billing.address} <br />
							</c:if>
							
							
							<c:if test="${not empty customer.billing.city}">${customer.billing.city} <br />
							</c:if>
							<c:choose><c:when test="${not empty customer.billing.stateProvince}"><c:out value="${customer.billing.stateProvince}"/></c:when><c:otherwise><script>$.ajax({url: "<c:url value="/shop/reference/zoneName"/>",type: "GET",data: "zoneCode=${customer.billing.zone}",success: function(data){$('#billingZoneName').html(data)}})</script><span id="billingZoneName"><c:out value="${customer.billing.zone}"/></span></c:otherwise></c:choose>,
							
							<c:if test="${not empty customer.billing.country}">
							<span id="customerCountryName"><script>$.ajax({url: "<c:url value="/shop/reference/countryName"/>",type: "GET",data: "countryCode=${customer.billing.country}",success: function(data){$('#customerCountryName').html(data)}})</script></span><br/>
							</c:if>
							<c:if test="${not empty customer.billing.postalCode}"> ${customer.billing.postalCode}<br />
							</c:if>
							<c:if test="${not empty customer.billing.phone}">${customer.billing.phone}</c:if>

						
						</address>
					   </form:form>
					</c:if>
				</div>
				<br/>
				<div class="checkout-box">
					<span class="box-title">
						<p class="p-title">
							<s:message
									code="label.customer.shippingaddress" text="Shipping Address" />
									&nbsp;

											<c:if test="${not empty customer.delivery}">
												<a href="javascript:void(0)" onclick="editShippingAddress('${customer.id}');"><s:message code="label.generic.edit" text="Edit"/></a>
											</c:if>

						</p>
					</span>
					<c:if test="${not empty customer.delivery}">
					<form:form action="${editAddress}" id="editShippingAddress_${customer.id}">
					  <input type="hidden" name="customerId" value="${customer.id}">
						<input type="hidden" name="billingAddress" value="false"/>
						<address>
							${customer.delivery.firstName}&nbsp;${customer.delivery.lastName}
							<br />
							<c:if test="${not empty customer.delivery.company}"> ${customer.delivery.company} <br />
							</c:if>
							<c:if test="${not empty customer.delivery.address}"> ${customer.delivery.address} <br />
							</c:if>
							<c:if test="${not empty customer.delivery.city}">${customer.delivery.city} <br />
							</c:if>

							
							<c:choose><c:when test="${not empty customer.delivery.stateProvince}"><c:out value="${customer.delivery.stateProvince}"/></c:when><c:otherwise><script>$.ajax({url: "<c:url value="/shop/reference/zoneName"/>",type: "GET",data: "zoneCode=${customer.delivery.zone}",success: function(data){$('#deliveryZoneName').html(data)}})</script><span id="deliveryZoneName"><c:out value="${customer.delivery.zone}"/></span></c:otherwise></c:choose>,
							
							<c:if test="${not empty customer.delivery.country}">
							<span id="customerDeliveryName"><script>$.ajax({url: "<c:url value="/shop/reference/countryName"/>",type: "GET",data: "countryCode=${customer.delivery.country}",success: function(data){$('#customerDeliveryName').html(data)}})</script></span><br/>
							</c:if>
							<c:if test="${not empty customer.delivery.postalCode}"> ${customer.delivery.postalCode}<br />
							</c:if>
							<c:if test="${not empty customer.delivery.phone}">${customer.delivery.phone} <br/></c:if>
						
						</address>
					  </form:form>
					</c:if>
					
					<c:if test="${empty customer.delivery}">
							<form:form action="${editAddress}" id="addShippingAddress_${customer.id}">
							<input type="hidden" name="customerId" value="${customer.id}">
							<input type="hidden" name="billingAddress" value="false"/>
							<a href="javascript:void(0)" onclick="addShippingAddress('${customer.id}');"><s:message code="menu.addaddress" text="Add a new address" /></a> <br />
							</form:form>
				    </c:if>

			 </div>
			 <br/>
			 <div class="checkout-box">
             					<span class="box-title">
             						<p class="p-title">Exemption Certificate Uploader
             						</p>
             					</span>
                             <!-- Create a button to launch the wizard -->
                                    <button id="wizard-btn" type="button" class="btn btn-large template-btn">Upload Exception Certificate</button>
              </div>
			 </div>
			 <div class="span4 col-md-4">
			 	<jsp:include page="/pages/shop/common/customer/customerProfileMenu.jsp" />
			 	<jsp:include page="/pages/shop/common/customer/customerOrdersMenu.jsp" />
			 </div>
			</div>
		</div>

 <script type="text/javascript">
      // Call the ECW authentication service to obtain an access token
      $(document).ready(function() {
        $.ajax({
          url: "https://auth.vertexsmb.com/identity/connect/token",
          method: "POST",
          data: {
            "client_id": "f6907c10678b423c8b2442315130b561",
            "client_secret": "ab0c89698d6d42789c29ec8622da141a",
            "grant_type": "client_credentials",
            "scope": "vtms-internal-api ecw-wizard-api"
          },
        }).then(function(response) {
          // Configure the wizard
          const btn = new vertex.Wizard({
            domNode: document.getElementById('wizard-btn'),
            wizardPath: 'https://ecwportal.vertexsmb.com/wizard',
            accessToken: response.access_token,
            action: "CREATE",
            clientCode: "SHOPIZER",
            sellerCodes: ["Vertex HQ"],
            buyerCode: "60036760", //Enter Shopizer email address of the buyer, or username
            overrides: [
              {qId:2, value: 'Vertex Shopizer'},                   // Shopizer Name
              {qId:3, value: '3000 coral way'},    // Shopizer buyerStreetAddress
              {qId:4, value: 'miami'},          // Shopizer buyerCity
              {qId:5, value: 'fl'},                       // Shopizer buyerState
              {qId:6, value: '33145'},                    // Shopizer buyerPostalCode
              {qId:19, value: 'someuser@vertexinc.com'},  // Shopizer buyerEmail
              {qId:22, value: '800-555-1212'}             // Shopizer buyerPhone
            ]
          });

        // Add an event listener to get notifications when a certificate is created
        window.addEventListener("message", function(event) {
          if (event.data && event.data.type == 'createdCertificates') {
            for (var i = 0; i < event.data.data.length; i++) {
              console.log("certificateId=" + event.data.data[i].id);
              console.log("buyerCode=" + event.data.data[i].buyerCode);
            }
          }
        })
      });
    });
    </script>
<!--close .container "main-content" -->