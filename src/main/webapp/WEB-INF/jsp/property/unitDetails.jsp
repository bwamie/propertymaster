<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Unit Details</title>
</head>
<body>
	<h2>${unit.unitType} Details</h2>
	<h3>${unit.unitNumber}</h3>
							<p>Description: ${unit.description}</p>
							<p>Size: ${unit.size}</p>
							<p>Status ${unit.unitType}</p>
							<p>Number of rooms: ${unit.rooms}</p>
							<p>Status: ${unit.status}</p>
	<a
		href=" <spring:url value="/property/addlease/${unit.unitId}" /> "
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Add Lease
	</a>
	
	<a
		href=" <spring:url value="/property/unitlease/${unit.unitId}" /> "
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> View Lease
	</a>
	
	<a
		href=" <spring:url value="/property/unitView/${unit.unitId}" /> "
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Add Comment
	</a>
</body>
</html>