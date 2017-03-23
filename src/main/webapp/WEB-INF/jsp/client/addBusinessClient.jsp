<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Business Client</title>
</head>
<body>
	<section>
		<div class="jumbotron">
  			<div class="pull-right" style="padding-right:50px">
				<a href="?language=en" >English</a>|<a href="?language=tg_ER" >ትግርኛ</a>					
			</div>
			
		</div>
	</section>
	<section class="container">
	
		<form:form  modelAttribute="businessClient" action = "addBusinessClient" method = "post" class="form-horizontal">
			<fieldset>
				<legend><spring:message code="addBusinessClient.form.business.formInfo"/></legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="business.name"><spring:message code="addBusinessClient.form.business.name.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.name" path="business.name" type="text" class="form:input-large"/>
						<form:errors path="business.name" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contactPerson"><spring:message code="addBusinessClient.form.business.contactPerson.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contactPerson" path="business.contactPerson" type="text" class="form:input-large"/>
						<form:errors path="business.contactPerson" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.email"><spring:message code="addBusinessClient.form.business.contact.email.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.email" path="business.contact.email" type="text" class="form:input-large"/>
						<form:errors path="business.contact.email" cssClass="text-danger"/>
					</div>
				</div>
				
				<fieldset>
				<legend><spring:message code="addBusinessClient.form.business.contact.phone.label"/></legend>
				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.areaCode"><spring:message code="addBusinessClient.form.business.contact.areaCode.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.areaCode" path="business.contact.areaCode" type="text" class="form:input-large"/>
						<form:errors path="business.contact.areaCode" cssClass="text-danger"/>
					</div>
				</div>
						
				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.prefix"><spring:message code="addBusinessClient.form.business.contact.prefix.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.prefix" path="business.contact.prefix" type="text" class="form:input-large"/>
						<form:errors path="business.contact.prefix" cssClass="text-danger"/>
					</div>
				</div>	
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.number"><spring:message code="addBusinessClient.form.business.contact.number.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.number" path="business.contact.number" type="text" class="form:input-large"/>
						<form:errors path="business.contact.number" cssClass="text-danger"/>
					</div>
				</div>	
				</fieldset>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.city"><spring:message code="addBusinessClient.form.business.contact.city.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.city" path="business.contact.city" type="text" class="form:input-large"/>
						<form:errors path="business.contact.city" cssClass="text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.state"><spring:message code="addBusinessClient.form.business.contact.state.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.state" path="business.contact.state" type="text" class="form:input-large"/>
						<form:errors path="business.contact.state" cssClass="text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="business.contact.zipCode"><spring:message code="addBusinessClient.form.business.contact.zipCode.label"/></label>
					<div class="col-lg-10">
						<form:input id="business.contact.zipCode" path="business.contact.zipCode" type="text" class="form:input-large"/>
						<form:errors path="business.contact.zipCode" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="<spring:message code="addBusinessClient.form.business.button"/>"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
