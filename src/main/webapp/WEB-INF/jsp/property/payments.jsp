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
<title>Payments</title>
</head>
<body>
<h2>Previous Payments</h2>
 	<section class="container">
		<div class="row">
			<c:forEach items="${payments}" var="payment">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<p>Payment Date: <fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${payment.paymentDate}" /></p>
							<p>Month: ${payment.month}</p>
							<p>Year: ${payment.year}</p>
							<p>Amount: ${payment.amount}</p>
							<p>Payment method: ${payment.paymentMethod}</p>
							<p>
								<a
									href=" <spring:url value="/property/paymentDetails/${payment.paymentId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> more...
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
