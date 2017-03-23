<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Person Clients</title>
</head>
<body>

	<section>
		<div class="jumbotron">
  			<div class="pull-left" style="padding-right:50px">
				<h3>Business Client List</h3>					
			</div>
			
		</div>
	</section>
	
	
 	<section class="container">
 	<a href=" <spring:url value="/addBusinessClient" /> " class="btn btn-primary"> 
				<span class="glyphicon-info-sign glyphicon" /></span> Add Business Client
	</a>
	
	<a href=" <spring:url value="/listPersonClients" /> " class="btn btn-primary"> 
				<span class="glyphicon-info-sign glyphicon" /></span> List Person Clients
	</a>
	<br><br>
		<div class="row">
		<table>
			<tr>
				<th><spring:message code="addBusinessClient.form.business.name.label"/></th>
				<th><spring:message code="addBusinessClient.form.business.type.label"/></th>
				<th><spring:message code="addBusinessClient.form.business.contactPerson.label"/></th>
				<th><spring:message code="addBusinessClient.form.business.contact.email.label"/></th>
				<th><spring:message code="addBusinessClient.form.business.contact.phone.label"/></th>
				<th><spring:message code="addBusinessClient.form.business.contact.action.label"/></th>
			</tr>
			<c:forEach items="${businessClientList}" var="businessClient">
			
				<!-- construct an "update" link with customer id -->
				<c:url var = "businessClientUpdateLink" value = "/updateBusinessClient">
					<c:param name = "businessClientId" value = "${businessClient.clientId}" />
				</c:url>
				
				<!-- construct a "delete" link with customer id -->
				<c:url var = "businessClientDeleteLink" value = "/deleteBusinessClient">
					<c:param name = "businessClientId" value = "${businessClient.clientId}" />
				</c:url>
				
				<tr>
					<td>${businessClient.business.name}</td>
					<td>${businessClient.business.type}</td>
					<td>${businessClient.business.contactPerson}</td>
					<td>${businessClient.business.contact.email}</td>
					<td>${businessClient.business.contact.areaCode}-${businessClient.business.contact.prefix}-${businessClient.business.contact.number}</td>
					<td>
							<!-- display the update link -->
							<a href = "${businessClientUpdateLink}">Update</a> | 
							<a href = "${businessClientDeleteLink}" onclick="if (!(confirm('Are you sure you want to delete this customer'))) return false">Delete</a>
					</td>
				</tr>	

			</c:forEach>
			</table>
		</div>
	</section>
</body>
</html>
