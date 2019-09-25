$(function(){

    $.validator.setDefaults({
        highlight: function(element) {
            $(element)
            .closest('.form-control')
            .addClass('is-invalid');
        },
        unhighlight: function(element) {
            $(element)
            .closest('.form-control')
            .removeClass('is-invalid');
        }
    });

    $("#registerForm").validate({
        rules: {
        	fname: {
        		required:true
        	},
        	lname: {
        		required:true
        	},
        	designation: {
        		required: {
        			depends: function(element){
        				return $("#inputDesig").val() == "none";
        			}
        		}
        	},
            email: {
                required: true,
                email: true

            },
            address: {
            	required: true
            	
            },
            contact: {
            	required: true
            },
            username: {
            	required: true
            },
            createPwrd: "required",
            confirmPwrd: {
                required: true,
                equalTo: "#inputPwrd"
            }
        },
        messages: {
        	email: {
        		required: 'Please enter an email address',
                email: 'Please enter a <em>valid</em> email address'
        	},
        	designation: {
        		required: "Please select an option",
        	},
        }

    });

});

$(".submit").click(function(){
	
	var name = $("#inputFname").val();
	
	if(name==""){
		swal("Error!", "Some fields has been missed!", "error");
	}
})

