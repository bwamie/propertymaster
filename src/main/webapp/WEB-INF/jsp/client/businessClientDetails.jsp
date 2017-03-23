<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
 	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/resource/js/cart.js"/>"></script>
	
<title>Business Client</title>
</head>
<body>
 	<section class="container" >
	
		<div class="row">
		
			<div class="col-md-5">
			
			<table>
				<tr>
					<td><spring:message code="addBusinessClient.form.business.name.label"/></td>
					<td>${businessClient.name}</td>
				</tr>
				
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contactPerson.label"/></td>
					<td>${businessClient.contactPerson}</td>
				</tr>
				
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contact.email.label"/></td>
					<td>${businessClient.contact.email}</td>
				</tr>
				
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contact.areaCode.label"/></td>
					<td>${businessClient.contact.areaCode}</td>
				</tr>
				
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contact.phone"/></td>
					<td>${businessClient.contact.areaCode}-${businessClient.contact.prefix}&nbsp;${businessClient.contact.number}</td>
				</tr>
				
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contact.city.label"/></td>
					<td>${businessClient.contact.city}</td>
				</tr>
				
					
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contact.state.label"/></td>
					<td>${businessClient.contact.state}</td>
				</tr>
				
					
				<tr>
					<td><spring:message code="addBusinessClient.form.business.contact.zipCode.label"/></td>
					<td>${businessClient.contact.zipCode}</td>
				</tr>
				
				
			</table>
				<a href="<spring:url value="/listBusinessClients" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Business Client List
				</a>
		
			</div>
		</div>
	</section>
</body>
</html>