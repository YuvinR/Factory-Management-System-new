$(function(){
	
	$.validator.setDefaults({
		highlight: function(element){
			$(element)
			.closest('.form-control')
			.addClass('is-invalid');
		},
		unhighlight: function(element){
			$(element)
			.closest('.form-control')
			.removeClass('is-invalid');
		}
	});
	
	$('#supplierRegistration').validate({
		rules: {
			supName:{
				requird:true
			},
			telNo:{
				required:true
			},
			email:{
				required:true
			},
			address:{
				required:true
			}
		},
		messages:{
			email:{
				requied:'Please enter an email address',
				email:'Please enter a <em>valid</em> email address'
			}
		}
	})
})