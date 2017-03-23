var contextRoot = "/" + window.location.pathname.split( '/' )[1];
function showDetails(staffId){
	
	
   	//var dataToSend = JSON.stringify(serializeObject($('#categoryForm')));
   	 $.ajax({
		type: 'GET',
		url: contextRoot + '/getStaffDetails',
		dataType: "json",           // Accept header
		data:"staffId=" + staffId,
		
		success: function(staff){
			$('#formInput').html("");
			$("#formInput").append('<H3 align="center"> Staff Information </H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " + staff.person.firstName  + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " + staff.person.lastName  + "</h4>" );
			$('#formInput').append("<H4 align='center'>Position: " + staff.position  + "</h4>");
			$('#formInput').append("<H4 align='center'>Email: " + staff.person.contact.email  + "</h4>");
			$('#formInput').append("<H4 align='center'>City: " + staff.person.contact.city  + "</h4>");
			$('#formInput').append("<H4 align='center'>State: " + staff.person.contact.state  + "</h4>");
			$('#formInput').append("<H4 align='center'>Zip Code: " + staff.person.contact.zipCode  + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');"><b color:Crimson>EXIT</b> </a> </h4>');
			make_visible('formInput');
			//make_hidden('errors');
			
		},
 
		error: function(error){

				alert("Error in getting Staff"+error);   // "non" Validation Error
			}
	});
}

 
resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

}	  
	 

make_visible = function(id) {
    var e = document.getElementById(id);
    e.style.display = 'block';
 }	   

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	



 