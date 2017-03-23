<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
 	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/resource/js/staff.js"/>"></script>
<title>Staff List</title>

</head>
<body>

<section>
		<div class="jumbotron">
  			<div class="pull-left" style="padding-right:50px">
				<h3>Staff List</h3>					
			</div>
			
		</div>
	</section>

<div id="global">


<!-- Query Parameter passing  -->
<spring:url value="/addStaff" var="addStaff_url" >
</spring:url>
<a href="${addStaff_url}">Add staff</a><br/>

 
 
<table>
<tr style="width: 100%;">
 <!--    <th style="width: 19%;">Staff Id</th> -->
    <th style="width: 21%;">Name</th>
     <th style="width: 21%;">Position</th>
    <th style="width: 21%;"> Sex</th>   
     <th style="width: 21%;">DateOfBirth</th>
     <th style="width: 21%;">Phone</th>
    <th style="width: 23%;">Address</th>
    <th style="width: 15%;"></th>
</tr>
<c:forEach items="${StaffList}" var="staff">
    <tr>
        
        <td>${staff.person.firstName}&nbsp;${staff.person.lastName}</td>
         <td>${staff.position}</td>
        <td>${staff.person.sex}</td>
         <td>${staff.person.birthDate}</td>
        <td>${staff.person.contact.areaCode}-${staff.person.contact.prefix}-${staff.person.contact.number}</td>				
        <td>${staff.person.contact.city} &nbsp; ${staff.person.contact.state}&nbsp; ${staff.person.contact.zipCode}</td>
     

        
        <!-- Spring:url for handling Spring template/@PathVariable -->
        <spring:url value="/deleteStaff"  var="delete" >
   				<spring:param name="staffId" value="${staff.staffId}" />
 		</spring:url>
 		
 		 <spring:url value="/updateStaff"  var="edit" >
   				<spring:param name="staffId" value="${staff.staffId}" />
 		</spring:url>
 		
 		 <spring:url value="/seeStaffDetails"  var="staffdetails" >
   				<spring:param name="staffId" value="${staff.staffId}" />
 		</spring:url>
         
        <td><a href="${delete}">Delete</a>|<a href="${edit}">Update</a>| <a href="#" onclick="showDetails('${staff.staffId}');">Show Details</a> </td>
   
    </tr>
</c:forEach>
</table>
 
 

</div>
 
 		<!-- Success - or Validation errors -->
    	<div id="result" style="display:none" >   	
    	    <p id="success" > 
    
    		</p> 
    		<p id="errors" > 
    
    		</p>
    	</div>
 
   	<div id="formInput" style="display:none; background-color:CornflowerBlue; color:white; width = 300px; align:center;" > 

<%-- 	<h3 align="center">Category</h3>

	<!-- No action method handled by AJAX-->
	<form id="categoryForm" method="post">

			<input type="hidden" name="id" value="0">
          
          <p>
            <label for="name"> Name    : </label>
             <input type="text" name="name" id="name" value="" />
        </p>
 
         <p>
            <label for="description"> Description: </label>
            <input id="description" name="description" type="text"/>
        </p>
 
             <input type="button" value="Add Category" onclick="categorySubmit();return false;">
    
    </form>
  <h4 align="center"> 
     <a href="#" onclick="make_hidden('formInput'); make_hidden('result');resetForm('categoryForm');"> <b>EXIT</b> </a> 
  </h4> --%>

</div>
 
</body>
</html>
