var contectRoot = "/" + window.location.pathname.split("/")[1];

function makeAjaxCall() {
alert(5667);
	$.ajax({
		url : contectRoot + "/property/searchClient/",
		type : "GET",
		dataType : "json",
		contentType : "application/json",
		data : "firstName="+$('#search'), 
		success : function(clients) {
			renderClientsTable(clients);
		},

		error : function(errorsObject) {
			renderEmployeeFormErrors(errorsObject)
		}

	});
}

var renderEmployeeFormErrors = function(errorsObject) {
	alert("Fail");
//	if(errorsObject.responseJSON.errorType == "ValidationError"){
//		$('#errors').html("");
//		$("#errors").append('<H3 align="center">Error(s)!!</H3>');
//		$("#result").append('<p>');
//		let errorsList = errorsObject.responseJSON.errors;
//		$.each(errorsList, function(i, error){
//			$("#errors").append(error.message+'<br>');
//		});
//		$("#errors").append('</p>');
//		make_visible('errors');
//		make_hidden('formInput');
//	}
	
	
}

var renderClientsTable = function(clients) {
	//alert("success!");
//	$('#formInput').html("");
//	$("#formInput").append('<H3 align="center"> New Employee Information <H3>');
//	$('#formInput').append("<H4 align='center'>First Name:  " + employee.firstName +"</h4>");
//	$('#formInput').append("<H4 align='center'>Last Name: " + employee.lastName +"</h4>");
//	$('#formInput').append("<H4 align='center'>Email: " + employee.email +"</h4>");
//	$("#formInput")
//			.append(
//					'<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
//	make_visible('formInput');
//	make_hidden('errors');
}

toggle_visibility = function(id) {
	var element = document.getElementById(id);
	if (element.style.display == 'block')
		element.style.display = 'none';
	else
		element.style.display = 'block';
}

make_hidden = function(id) {
	var element = document.getElementById(id);
	element.style.display = 'none';
}

make_visible = function(id) {
	var element = document.getElementById(id);
	element.style.display = 'block';
}

resetForm = function(id) {
	var element = document.getElementById(id);
	$(element)[0].reset();

}

// Translate form to array
// Then put in JSON format
function serializeObject(form) {
	var jsonObject = {};
	var array = form.serializeArray();
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;

};

