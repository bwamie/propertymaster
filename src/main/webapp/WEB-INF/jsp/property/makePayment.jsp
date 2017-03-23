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
<title>Payment Form</title>
</head>
<body>
	<h4>Unit: ${payment.lease.unit.unitNumber}</h4>
	<h4>Monthly Rate:<fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${payment.lease.monthlyRate}" /> </h4>
	<h4>Lease Start Date: <fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${payment.lease.startDate}" /></h4>
	<h4>Lease End Date: <fmt:formatDate type="date" dateStyle="long" timeStyle="long"
			value="${payment.lease.endDate}" /></h4>

	<h2>Payment Details Form</h2>

	<section class="container">
		<form:form modelAttribute="payment" class="form-horizontal"
			action="../makepayment" method="post">
			<fieldset>
				<legend>Add new Unit</legend>

				<div class="form-group">
					<label class="control-label col-lg-2" for="amount">Amount:</label>
					<div class="col-lg-10">
						<form:input path="amount" type="text" value="${payment.lease.monthlyRate}" class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="type">Month:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select path="month">
								<form:option value="1">January</form:option>
								<form:option value="2">February</form:option>
								<form:option value="3">March</form:option>
								<form:option value="4">April</form:option>
								<form:option value="5">May</form:option>
								<form:option value="6">June</form:option>
								<form:option value="7">July</form:option>
								<form:option value="8">August</form:option>
								<form:option value="9">September</form:option>
								<form:option value="10">October</form:option>
								<form:option value="11">November</form:option>
								<form:option value="12">December</form:option>
							</form:select>
						</div>
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="city">Year:</label>
					<div class="col-lg-10">
						<form:input path="year" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="paymentDate">Payment Date:</label>
					<div class="col-lg-10">
						<form:input path="paymentDate" type="text" class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="city">Payment
						Method:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select path="paymentMethod">
								<form:option value="Cash">Cash</form:option>
								<form:option value="Cheque">Cheque</form:option>
								<form:option value="Online">Online</form:option>
							</form:select>
						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<form:hidden path="lease.leaseId"
							value="${payment.lease.leaseId}" /> <input type="hidden"
							name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
							type="submit" id="btnAdd" class="btn btn-primary" value="Add" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>