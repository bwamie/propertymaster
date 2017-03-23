var contextRoot = "/" + window.location.pathname.split( '/' )[1];
function showPeronClientDetails(personClientId){
	
	alert("Crying inside ajax");
   	 $.ajax({
		type: 'GET',
		url: contextRoot + '/showPersonClientDetail',
		dataType: "json",           // Accept header
		data:"personClientId=" + personClientId,
		
		success: function(personClient){
			$('#formInput').html("");
			$("#formInput").append('<H3 align="center"> Staff Information </H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " + personClient.person.firstName  + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " + personClient.person.lastName  + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " + personClient.person.contact.email  + "</h4>");
			$('#formInput').append("<H4 align='center'>City: " + personClient.person.contact.city  + "</h4>");
			$('#formInput').append("<H4 align='center'>State: " + personClient.person.contact.state  + "</h4>");
			$('#formInput').append("<H4 align='center'>Zip Code: " + personClient.person.contact.zipCode  + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			
		},
 
		error: function(error){

				alert("Getting an error while getting person clients");   // "non" Validation Error
			}
	});
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



 