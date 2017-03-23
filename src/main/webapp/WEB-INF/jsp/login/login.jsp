<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Welcome to Login!! </h1>
        </div>
    </div>
</section>

<c:if test="${not empty error}">
    <div class="alert alert-danger">
        <%--<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />--%>
        <label class="error"> ${error}</label>

    </div>
</c:if>

<div class="container">
    <form:form modelAttribute="user" action="postlogin" method="post">
        <div>
            <div>
                <label for="username">Username: </label>
                <form:input path="username" />
                <form:errors path="username" cssStyle="color: red" />

                <br />

                <label for="password">Password: </label>
                <form:password path="password" />
                <form:errors path="password" cssStyle="color: red" />
                <br />

            </div>
			
			<br />
            <br />
            <button type="submit"> Start Login </button> <br />
            	<a href="<spring:url value='/register' />" class="btn btn-default">
				<span class="glyphicon-hand-left glyphicon"></span> Go to Register Page
			</a>
            
        </div>

    </form:form>

</div>
</body>
