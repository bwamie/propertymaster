<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<link href="<c:url value="/resource/css/style.css" />" rel="stylesheet">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/resource/js/personClient.js"/>"></script>

<title>Person Clients</title>
</head>
<body>

	<section>
		<div class="jumbotron">
  			<div class="pull-left" style="padding-right:50px">
				<h3>Person Client List</h3>					
			</div>
			
		</div>
	</section>
	
	
			
 	<section class="container">
 	<a href=" <spring:url value="/addPersonClient" /> " class="btn btn-primary"> 
				<span class="glyphicon-info-sign glyphicon" /></span> Add Person Client
	</a>
	
	<a href=" <spring:url value="/listBusinessClients" /> " class="btn btn-primary"> 
				<span class="glyphicon-info-sign glyphicon" /></span> List Business Clients
	</a>
	<br><br>
		<div class="row">
		<table>
			<tr>
				<th><spring:message code="addPersonClient.form.person.firstName.label"/></th>
				<th><spring:message code="addPersonClient.form.person.lastName.label"/></th>
				<th><spring:message code="addPersonClient.form.person.sex.label"/></th>
				<th><spring:message code="addPersonClient.form.person.birthDate.label"/></th>
				<th><spring:message code="addPersonClient.form.person.contact.email.label"/></th>
				<th><spring:message code="addPersonClient.form.person.contact.phone.label"/></th>
				<th><spring:message code="addPersonClient.form.person.contact.action.label"/></th>
			</tr>
			
			<c:forEach items="${personClientList}" var="personClient">
			
				<!-- construct an "update" link with customer id -->
				<c:url var = "personClientUpdateLink" value = "/updatePersonClient">
					<c:param name = "personClientId" value = "${personClient.clientId}" />
				</c:url>
				
				<!-- construct a "delete" link with customer id -->
				<c:url var = "personClientDeleteLink" value = "/deletePersonClient">
					<c:param name = "personClientId" value = "${personClient.clientId}" />
				</c:url>
				
				<tr>
					<td>${personClient.person.firstName}</td>
					<td>${personClient.person.lastName}</td>
					<td>${personClient.person.sex}</td>
					<td>${personClient.person.birthDate}</td>
					<td>${personClient.person.contact.email}</td>
					<td>${personClient.person.contact.areaCode}-${personClient.person.contact.prefix}-${personClient.person.contact.number}</td>
					<td>
							<!-- display the update link -->
							<a href = "${personClientUpdateLink}">Update</a> | 
							<a href = "${personClientDeleteLink}" onclick="if (!(confirm('Are you sure you want to delete this customer'))) return false">Delete</a> |
							<a href="#" onclick="showPeronClientDetails('${personClient.clientId}');">Details</a>
					</td>
				</tr>	

			</c:forEach>
			</table>
		</div>
		
		<div id="formInput" style="display:none; background-color:Chartreuse; color:white; width = 300px; align:center;">
		</div>
		
	</section>
</body>
</html>
