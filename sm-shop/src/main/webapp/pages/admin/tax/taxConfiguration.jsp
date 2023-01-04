<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>				
				

<script src="<c:url value="/resources/js/ckeditor/ckeditor.js" />"></script>






<div class="tabbable">

					<jsp:include page="/common/adminTabs.jsp" />
  					
  					 	<div class="tab-content">

    						<div class="tab-pane active" id="taxrates-section">

								<div class="sm-ui-component">	
								<h3><s:message code="label.tax.taxconfiguration" text="Tax basis calculation" /></h3>	
								<br/>

								<c:url var="saveTaxConfiguration" value="/admin/tax/taxconfiguration/save.html"/>

								<form:form method="POST" modelAttribute="taxConfiguration" action="${saveTaxConfiguration}">	
				      				<form:errors path="*" cssClass="alert alert-error" element="div" />
									<div id="store.success" class="alert alert-success" style="<c:choose><c:when test="${success!=null}">display:block;</c:when><c:otherwise>display:none;</c:otherwise></c:choose>"><s:message code="message.success" text="Request successfull"/></div>    
												
				      			  	
				                 
	                        		<div class="control-group">
                        				<div class="controls">
											<form:radiobutton id="taxBasisCalculation" path="taxBasisCalculation" value="STOREADDRESS"/>&nbsp;<s:message code="label.tax.storeaddress" text="Store address" /><br/>			
											<form:radiobutton id="taxBasisCalculation" path="taxBasisCalculation" value="SHIPPINGADDRESS"/>&nbsp;<s:message code="label.shipping.shippingaddress" text="Shipping address" /><br/>
											<form:radiobutton id="taxBasisCalculation" path="taxBasisCalculation" value="BILLINGADDRESS"/>&nbsp;<s:message code="label.shipping.billingaddress" text="Billing address" />
                        				</div>
	                                	<span class="help-inline"><form:errors path="taxBasisCalculation" cssClass="error" /></span>
	                        		</div>

	                        		<div class="sm-ui-component">
                                        <h3><s:message code="label.tax.vertextaxclass.title" text="Vertex Tax Engine" /></h3>
                                        <br/>

	                        		<div class="control-group">
                                        <h4><label class="required"><s:message code="label.tax.vertexadminurl" text="Admin URL"/></label></h>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxAdminURL" />
                                            </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="required"><s:message code="label.tax.vertexadminclientid" text="Admin Client Id"/></label>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxAdminClientId" />
                                            </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="required"><s:message code="label.tax.vertexadminclientSecret" text="Admin Client Secret"/></label>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxAdminClientSecret" />
                                            </div>
                                    </div>
                                    <div class="control-group">
                                                    <label class="required"><s:message code="label.tax.vertextaxcalcurl" text="Tax Calc URL"/></label>
                                                        <div class="controls">
                                                                <form:input cssClass="input-large" path="taxCalcURL" />
                                                        </div>
                                                </div>
                                    <div class="control-group">
                                        <label class="required"><s:message code="label.tax.vertexcalcclientid" text="Calc Client Id"/></label>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxCalcClientId" />
                                            </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="required"><s:message code="label.tax.vertexcalcclientsecret" text="Calc Client Secret"/></label>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxCalcClientSecret" />
                                            </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="required"><s:message code="label.tax.taxamovalidationurl" text="Taxamo Validation URL"/></label>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxamoValidationURL" />

                                            </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="required"><s:message code="label.tax.taxamoauthtoken" text="Taxamo Auth Token"/></label>
                                            <div class="controls">
                                                    <form:input cssClass="input-large" path="taxamoAuthToken" />

                                            </div>
                                    </div>
	                        		
							        <div class="form-actions">
				                  		<div class="pull-right">
				                  			<button type="submit" class="btn btn-success"><s:message code="button.label.submit" text="Submit"/></button>
				                  		</div>
				            	    </div>
				 
				            	 </form:form>
				            	 

      					</div>
      					


   					</div>


  					</div>

				</div>		      			     