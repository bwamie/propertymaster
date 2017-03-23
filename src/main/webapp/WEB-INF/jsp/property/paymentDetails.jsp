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
<title>Payment Details</title>
</head>
<body>
<h1>Payment Details</h1>
<p>Payment Date: <fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${payment.paymentDate}" /></p>
							<p>Month: ${payment.month}</p>
							<p>Year: ${payment.year}</p>
							<p>Amount: ${payment.amount}</p>
							<p>Payment method: ${payment.paymentMethod}</p>
							<p>
								<a
									href=" <spring:url value="/property/payments/${payment.lease.leaseId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Back
								</a>
							</p>
</body>
</html>