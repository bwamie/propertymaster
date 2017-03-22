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
  			<h4>Building Details</h4>
	<h6>${unit.property.name}</h6>
	<p>Type: ${unit.property.type}</p>
	<p>Description:${unit.property.description}</p>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="unit" class="form-horizontal" action="../addunit" method="post">
			<fieldset>
				<legend>Add new Unit</legend>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitNumber">Unit Number:</label>
					<div class="col-lg-10">
						<form:input path="unitNumber" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="type">Unit Type:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select path="unitType">
							<form:option value="ROOM">Room</form:option>
							<form:option value="APARTMENT">Apartment</form:option>
							<form:option value="SPACE">Space</form:option>
							<form:option value="HALL">Hall</form:option>
							</form:select>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description:</label>
					<div class="col-lg-10">
						<form:textarea path="description" rows = "2"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="city">Size:</label>
					<div class="col-lg-10">
						<form:input path="size" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="city">Number of Rooms:</label>
					<div class="col-lg-10">
						<form:input path="rooms" type="text" class="form:input-large"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="status">Status:</label>
					<div class="col-lg-10">
						<form:radiobutton path="status" value="OCCUPIED" />Occupied 
						<form:radiobutton path="status" value="AVAILABLE" />Available 
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
					<input type="hidden" name="unit.property.propertyId" value="${unit.property.propertyId}"/>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
		
	</section>
</body>
</html>
