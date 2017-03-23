<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
 	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/resource/js/cart.js"/>"></script>
	
<title>Staff</title>
</head>
<body>


	<section>
		<div class="jumbotron">
  			<div class="pull-left" style="padding-right:50px">
				<h3>Staff Details</h3>					
			</div>
			
		</div>
	</section>
	
 	<section class="container" >
	
		<div class="row">
		
			<div class="col-md-5">
			<table>
				<tr>
					<td><spring:message code="form.firstName.label"/></td>
					<td>${staff.person.firstName}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.lastName.label"/></td>
					<td>${staff.person.lastName}</td>
				</tr>
				
					
				<tr>
					<td><spring:message code="form.position.label"/></td>
					<td>${staff.position}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.sex.label"/></td>
					<td>${staff.person.sex}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.birthDate.label"/></td>
					<td>${staff.person.birthDate}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.email.label"/></td>
					<td>${staff.person.contact.email}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.phone.label"/></td>
					<td>${staff.person.contact.areaCode}-${staff.person.contact.prefix}-${staff.person.contact.number}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.city.label"/></td>
					<td>${staff.person.contact.city}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.state.label"/></td>
					<td>${staff.person.contact.state}</td>
				</tr>
				
				
				<tr>
					<td><spring:message code="form.zipCode.label"/></td>
					<td>${staff.person.contact.zipCode}</td>
				</tr>
				
				
				</table>
				
				<a href="<spring:url value="/staffList" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Staff List
				</a>
		
			</div>
		</div>
	</section>
</body>
</html>
