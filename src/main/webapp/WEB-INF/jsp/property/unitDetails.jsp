<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Building Details</title>
</head>
<body>
	<h2>Building Details</h2>
	<h3>${building.name}</h3>
	<p>Status ${building.type}</p>
	<p>${product.description}</p>
	<p>Status ${building.address}</p>
	<p>Status ${building.city}</p>
	<p>Status ${building.state}</p>
	<p>Status ${building.zipCode}</p>
	<p>Status ${building.status}</p>
	<a
		href=" <spring:url value="/property/units/${building.propertyId}" /> "
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Units
	</a>
	
	<a
		href=" <spring:url value="/property/addunit/${building.propertyId}" /> "
		class="btn btn-primary"> <span
		class="glyphicon-info-sign glyphicon" /></span> Add Unit
	</a>
</body>
</html>