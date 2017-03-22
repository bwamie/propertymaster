<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Property Management</title>
</head>
<body>
<h3>Property Management</h3>
<a href="<spring:url value="/property/register" />">Register Property</a> |
<a href="<spring:url value="/property/buildings" />">Buildings</a>

</body>
</html>