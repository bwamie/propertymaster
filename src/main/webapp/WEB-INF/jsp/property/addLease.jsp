<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Add Unit Lease</title>
</head>
<body>
	<section>
		<div class="jumbotron">
  			<h4>Unit Details</h4>
	<h6>${lease.unit.unitNumber}</h6>
	<p>Type: ${lease.unit.unitType}</p>
	<p>Description:${lease.unit.description}</p>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="lease" class="form-horizontal" action="../addlease" method="post">
			<fieldset>
				<legend>Add new Lease</legend>

				<div class="form-group">
					<label class="control-label col-lg-2" for="startDate">Start Date:</label>
					<div class="col-lg-10">
						<form:input path="startDate" type="text" class="form:input-large"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="endDate">End Date:</label>
					<div class="col-lg-10">
						<form:input path="endDate" type="text" class="form:input-large"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="dateSigned">Date Signed:</label>
					<div class="col-lg-10">
						<form:input path="dateSigned" type="text" class="form:input-large"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="monthlyRate">Monthly Rate:</label>
					<div class="col-lg-10">
						<form:input path="monthlyRate" type="text" class="form:input-large"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="notes">Notes/Comments:</label>
					<div class="col-lg-10">
						<form:textarea path="notes" rows = "2"/>
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
						<form:select path="status">
							<form:option value="Current">Current</form:option>
							<form:option value="Expired">Expired</form:option>
							<form:option value="Terminated">Terminated</form:option>
							</form:select>
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
					<input type="hidden" name="unit.unitId" value="${lease.unit.unitId}"/>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
		
	</section>
</body>
</html>
