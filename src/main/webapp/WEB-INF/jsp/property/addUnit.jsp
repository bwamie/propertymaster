<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Add Unit</title>
</head>
<body>
	<section>
		<div class="jumbotron">
  			<div class="pull-right" style="padding-right:50px">
				<a href="?language=en" >English</a>|<a href="?language=fr_CA" >French</a>					
			</div>
			
		</div>
	</section>
	<section>
		<div class="jumbotron">
  			<h4>Building Details</h4>
	<h6>${unit.property.name}</h6>
	<p>Type: ${unit.property.type}</p>
	<p>Description:${unit.property.description}</p>
		</div>
	</section>
	<section class="container" >
		<form:form  modelAttribute="unit" class="form-horizontal" action="../addunit" method="post"   enctype="multipart/form-data">
			<fieldset>
				<legend>Add new Unit</legend>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitNumber"><spring:message code="form.unit.unitNumber" />:</label>
					<div class="col-lg-10">
						<form:input path="unitNumber" type="text" class="form:input-large"/>
					</div>
					<form:errors path="unitNumber" cssClass="text-danger"/>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="type"><spring:message code="form.unit.unitType" />:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select path="unitType">
							<form:option value="Room">Room</form:option>
							<form:option value="Apartment">Apartment</form:option>
							<form:option value="Space">Space</form:option>
							<form:option value="Hall">Hall</form:option>
							</form:select>
						</div>
					</div>
					<form:errors path="unitType" cssClass="text-danger"/>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description"><spring:message code="form.unit.description" />:</label>
					<div class="col-lg-10">
						<form:textarea path="description" rows = "2"/>
					</div>
					<form:errors path="description" cssClass="text-danger"/>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="city"><spring:message code="form.unit.size" />:</label>
					<div class="col-lg-10">
						<form:input path="size" type="text" class="form:input-large"/>
					</div>
					<form:errors path="size" cssClass="text-danger"/>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="city"><spring:message code="form.unit.rooms" />:</label>
					<div class="col-lg-10">
						<form:input path="rooms" type="text" class="form:input-large"/>
					</div>
					<form:errors path="rooms" cssClass="text-danger"/>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="status"><spring:message code="form.unit.status" />:</label>
					<div class="col-lg-10">
						<form:radiobutton path="status" value="OCCUPIED" />Occupied 
						<form:radiobutton path="status" value="AVAILABLE" />Available 
					</div>
					<form:errors path="status" cssClass="text-danger"/>
				</div>
				
					
					<div class="form-group">
					<label class="control-label col-lg-2" for="status"><spring:message code="form.unit.photo" />:</label>
					<div class="col-lg-10">
            <form:input id="photo" path="photo" type="file" /> 
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
					<form:hidden path="property.propertyId" value="${unit.property.propertyId}"/>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
		
	</section>
</body>
</html>
