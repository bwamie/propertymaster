<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
  			<div class="pull-right" style="padding-right:50px">
				<a href="?language=en" >English</a>|<a href="?language=nl_NL" >Dutch</a>					
			</div>
			
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="building" class="form-horizontal" action="register" method="post"  enctype="multipart/form-data">
			<fieldset>
				<legend>Add new product</legend>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Name:</label>
					<div class="col-lg-10">
						<form:input path="name" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="type">Type:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:select path="type">
							<form:option value="HOME">Home</form:option>
							<form:option value="HOME">Apartments</form:option>
							</form:select>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description:</label>
					<div class="col-lg-10">
						<form:textarea path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="address">Address:</label>
					<div class="col-lg-10">
						<form:input path="address" type="text" class="form:input-large"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="address">Levels/Floors:</label>
					<div class="col-lg-10">
						<form:input path="floors" type="text" class="form:input-large"/>
					</div>
				</div>
				

				<div class="form-group">
					<label class="control-label col-lg-2" for="city">City:</label>
					<div class="col-lg-10">
						<form:input path="city" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitsInStock">State</label>
					<div class="col-lg-10">
						<form:input path="state" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="activeDate">Zip Code</label>
					<div class="col-lg-10">
						<form:input path="zipCode" type="text" class="form:input-large"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="status">Status:</label>
					<div class="col-lg-10">
						<form:radiobutton path="status" value="New" />Occupied 
						<form:radiobutton path="status" value="Old" />Available 
					</div>
				</div>
				
					<div class="form-group">
					<label class="control-label col-lg-2" for="status">Photo</label>
					<div class="col-lg-10">
            <form:input id="photo" path="photo" type="file" /> 
					</div>
				</div>
				


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
		
	</section>
</body>
</html>
