<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Buildings</title>
</head>
<body>
	<section class="container">
		<div class="row">
			<c:forEach items="${buildings}" var="building">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<%-- <img src="<c:url value="/resource/images/${building.propertyId}.png"></c:url>" alt="image"  style = "width:100%"/> --%>
						<div class="caption">
							<h3>${building.name}</h3>
							<p>${product.description}</p>
							<p>Status ${building.address}</p>
							<p>Status ${building.city}</p>
							<p>Status ${building.state}</p>
							<p>Status ${building.zipCode}</p>
							<p>
								<a
									href=" <spring:url value="/property/building/${building.propertyId}" /> "
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
