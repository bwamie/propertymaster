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
	<h2>Lease Details</h2>
	<h3>${lease.unit.unitNumber}</h3>
	<p>Start Date: ${lease.startDate}</p>
	<p>End Date: ${lease.endDate}</p>
	<p>Unit Rate: ${lease.unitRate}</p>
	<p>Date Signed: ${lease.dateSigned}</p>
	<p>Notes: ${lease.notes}</p>
	<a href="<spring:url value="/property/client/${lease.client.cleintId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Client Details
	</a>
	<a href="<spring:url value="/property/unit/${lease.unit.unitId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Unit Details
	</a>
</html>