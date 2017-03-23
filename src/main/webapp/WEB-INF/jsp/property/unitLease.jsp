<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Lease Details</title>
</head>
<body>
	<h2>Lease Details</h2>
	<h3>${lease.unit.unitNumber}</h3>
	<p>
		Start Date:
		<fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${lease.startDate}" />
	</p>
	<p>
		End Date:
		<fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${lease.endDate}" />
	</p>
	</p>
	<p>Unit Rate: ${lease.monthlyRate}</p>
	<p>
		Date Signed:
		<fmt:formatDate type="date" dateStyle="long"
			value="${lease.dateSigned}" />
	</p>
	</p>
	<p>Notes: ${lease.notes}</p>
	<a
		href="<spring:url value="/property/client/${lease.client.clientId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Client Details
	</a>
	<a href="<spring:url value="/property/unit/${lease.unit.unitId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Unit Details
	</a>
	<a href="<spring:url value="/property/makepayment/${lease.leaseId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Make Payment
	</a>

<a href="<spring:url value="/property/payments/${lease.leaseId}" />"
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> View Previous Payments
	</a>
	<br />
	<div>
		<h2>Preivious Leases:</h2>
		<table cellpadding="5">
			<tr>
				<td>No.</td>
				<td>Start Date:</td>
				<td>End Date:</td>
				<td>Monthly Rate:</td>
				<td>Status:</td>
				<td>Action</td>
			</tr>
			<c:forEach items="${leases }" var="leasex" varStatus="status">
				<tr>
					<td>${status.index + 1 }</td>
					<td><fmt:formatDate type="date" dateStyle="long"
							timeStyle="long" value="${leasex.startDate }" /></td>
					<td><fmt:formatDate type="date" dateStyle="long"
							timeStyle="long" value="${leasex.endDate }" /></td>
					<td>${leasex.monthlyRate }</td>
					<td>${leasex.status }</td>
					<td><a
						href="<spring:url value="/property/lease/${leasex.leaseId}" />"
						class="btn btn-primary"> <span
							class="glyphicon-info-sign glyphicon" /></span> Lease Details
					</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>