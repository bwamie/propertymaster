<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<li><a href="<spring:url value="/welcome"/>">Home</a></li>
<li><a href="<spring:url value="/users/"/>">Users</a></li>
<li><a href="<spring:url value="/profile/"/>">Profile</a></li>
<li><a href="<spring:url value="/staff/"/>">Staff</a></li>
<li><a href="<spring:url value="/clients"/>">Clients</a></li>
<li><a href="<spring:url value="/property"/>">Property</a></li>
<li><a href="<spring:url value="contactus"/>">Contact Us</a></li>
<li><a href="<spring:url value="/logout"/>">Logout</a></li>
<!-- Language : <a href="?language=en_US">English</a>|<a href="?language=fr_CA">French</a> -->

<%-- 
<li><a href="<spring:url value="/welcome"/>">Home</a></li>
<li><a href="<spring:url value="/profile/"/>">Products</a></li>
<li><a href="<spring:url value="/products/"/>">Products</a></li>
<li><a href="<spring:url value="/products/add"/>">Add Product</a></li>
<li><a href="<spring:url value="/cart/"/>">Cart</a></li> 
 --%>