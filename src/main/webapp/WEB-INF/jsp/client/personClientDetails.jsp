<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
 	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/resource/js/cart.js"/>"></script>
	
<title>Person Client</title>
</head>
<body>


	<section>
		<div class="jumbotron">
  			<div class="pull-left" style="padding-right:50px">
				<h3>Person Client Details</h3>					
			</div>
			
		</div>
	</section>
	
 	<section class="container" >
	
		<div class="row">
		
			<div class="col-md-5">
			<table>
				<tr>
					<td><spring:message code="addPersonClient.form.person.firstName.label"/></td>
					<td>${personClient.person.firstName}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.lastName.label"/></td>
					<td>${personClient.person.lastName}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.sex.label"/></td>
					<td>${personClient.person.sex}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.birthDate.label"/></td>
					<td>${personClient.person.birthDate}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.contact.email.label"/></td>
					<td>${personClient.person.contact.email}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.contact.phone.label"/></td>
					<td>${personClient.person.contact.areaCode}-${personClient.person.contact.prefix}-${personClient.person.contact.number}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.contact.city.label"/></td>
					<td>${personClient.person.contact.city}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.contact.state.label"/></td>
					<td>${personClient.person.contact.state}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="addPersonClient.form.person.contact.zipCode.label"/></td>
					<td>${personClient.person.contact.zipCode}</td>
				</tr>
				
				
				</table>
				
				<a href="<spring:url value="/listPersonClients" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Person Client List
				</a>
		
			</div>
		</div>
	</section>
</body>
</html>
