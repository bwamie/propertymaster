<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Building Details</title>
</head>
<body>
	<h2>Building Details</h2>
	<h3>${building.name}</h3>
	<p>Type: ${building.type}</p>
	<p>Description: ${product.description}</p>
	<p>Address: ${building.address}</p>
	<p>City: ${building.city}</p>
	<p>State: ${building.state}</p>
	<p>Zip Code: ${building.zipCode}</p>
	<p>Status ${building.status}</p>
	<p>Floors: ${building.floors}</p>
	<a href="<spring:url value="/property/units/${building.propertyId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Units
	</a>
	<a href="<spring:url value="/property/addunit/${building.propertyId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Add Unit
	</a>
</html>