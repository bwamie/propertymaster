<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>

<link href="http://getbootstrap.com/dist/css/bootstrap.css"
	rel="stylesheet">

<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"
	rel="stylesheet">

</head>

<body>

	<div class="container">
	<table width="100%" align="center">
			<tr valign="middle"  align="center">
			<td><img src="<c:url value="/resource/images/curiosity.jpg"></c:url>" alt="image"  style = "width:150px"/></td>
			<td><h1 class="text-muted">Property Management System</h1></td>
			<td><img src="<c:url value="/resource/images/home1.jpg"></c:url>" alt="image"  style = "width:100px"/></td>
			</tr>
			</table>
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<tiles:insertAttribute name="navigation" />
			</ul>
		</div>
		
		<hr />
		
		<h2>
				<tiles:insertAttribute name="heading" />
			</h2>

		<%-- <div class="jumbotron">
			<h1>
				<tiles:insertAttribute name="heading" />
			</h1>
			<p>
				<tiles:insertAttribute name="tagline" />
			</p>
		</div> --%>

		<div class="row">
			<tiles:insertAttribute name="body" />
		</div>

		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>
