<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Person Client</title>
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
				 
	<div id = "clientPersonForm">
		<form:form  modelAttribute="personClient" action = "addPersonClient" method = "post" class="form-horizontal">
			<fieldset>
				<legend><spring:message code="addPersonClient.form.person.formInfo"/></legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="person.firstName"><spring:message code="addPersonClient.form.person.firstName.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.firstName" path="person.firstName" type="text" class="form:input-large"/>
						<form:errors path="person.firstName" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="person.lastName"><spring:message code="addPersonClient.form.person.lastName.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.lastName" path="person.lastName" type="text" class="form:input-large"/>
						<form:errors path="person.lastName" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="person.sex"><spring:message code="addPersonClient.form.person.sex.label"/></label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select id="unitPrice" path="person.sex" class="form:input-large">
								<form:option value="male">Male</form:option>
								<form:option value="female">Female</form:option>
							</form:select>
							<form:errors path="person.sex" cssClass="text-danger"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="person.birthDate"><spring:message code="addPersonClient.form.person.birthDate.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.birthDate" path="person.birthDate" type="text" placeholder = "MM/DD/YYYY" class="form:input-large"/>
						<form:errors path="person.birthDate" cssClass="text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.email"><spring:message code="addPersonClient.form.person.contact.email.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.email" path="person.contact.email" type="text" class="form:input-large"/>
						<form:errors path="person.contact.email" cssClass="text-danger"/>
					</div>
				</div>
				
				<fieldset>
				<legend><spring:message code="addPersonClient.form.person.contact.phone.label"/></legend>
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.areaCode"><spring:message code="addPersonClient.form.person.contact.areaCode.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.areaCode" path="person.contact.areaCode" type="text" class="form:input-large"/>
						<form:errors path="person.contact.areaCode" cssClass="text-danger"/>
					</div>
				</div>
						
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.prefix"><spring:message code="addPersonClient.form.person.contact.prefix.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.prefix" path="person.contact.prefix" type="text" class="form:input-large"/>
						<form:errors path="person.contact.prefix" cssClass="text-danger"/>
					</div>
				</div>	
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.number"><spring:message code="addPersonClient.form.person.contact.number.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.number" path="person.contact.number" type="text" class="form:input-large"/>
						<form:errors path="person.contact.number" cssClass="text-danger"/>
					</div>
				</div>	
				</fieldset>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.city"><spring:message code="addPersonClient.form.person.contact.city.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.city" path="person.contact.city" type="text" class="form:input-large"/>
						<form:errors path="person.contact.city" cssClass="text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.state"><spring:message code="addPersonClient.form.person.contact.state.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.state" path="person.contact.state" type="text" class="form:input-large"/>
						<form:errors path="person.contact.state" cssClass="text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="person.contact.zipCode"><spring:message code="addPersonClient.form.person.contact.zipCode.label"/></label>
					<div class="col-lg-10">
						<form:input id="person.contact.zipCode" path="person.contact.zipCode" type="text" class="form:input-large"/>
						<form:errors path="person.contact.zipCode" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="<spring:message code="addPersonClient.form.person.button"/>"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
		</div>
		
	</section>
</body>
</html>
