<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    
    <link rel="stylesheet" href="styles/stylesheet.css"> <!--***nav bar css*** -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://kit.fontawesome.com/a65579f16a.js"></script>


</head>
<body>


<form class="needs-validation" novalidate method="post" action="addproduct">
  <div class="form-row">
    <div class="col-md-7 mb-3">
      <label for="validationCustom01">Product name</label>
      <input type="text" class="form-control" id="validationCustom01" name="pname" placeholder="Product name" value="" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
    <div class="col-md-5 mb-5">
      <label for="validationCustom02">Product code</label>
      <input type="text" class="form-control" id="validationCustom02" name="pcode"  placeholder="P001" value="" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
    
  </div>
  <div class="form-row">
  
  
  
    <div class="col-md-6 mb-3">
      <label for="validationCustom04">Store ID</label>
      <input type="text" class="form-control" id="validationCustom04" name="stid"  placeholder="1" required>
      <div class="invalid-feedback">
        Please provide a valid state.
      </div>
    </div>
       <div class="col-md-3 mb-3">
      <label for="validationCustom05">Date</label>
      <input type="date" class="form-control" id="validationCustom04" name="date"  placeholder="Date" required>
      <div class="invalid-feedback">
        Please provide a valid date.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationCustom04">Price</label>
      <input type="text" class="form-control" id="validationCustom04" name="price"  placeholder="00.00" required>
      <div class="invalid-feedback">
        Please provide a valid price.
      </div>
    </div>
    
    
    
   
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      <label class="form-check-label" for="invalidCheck">
        Agree to terms and conditions
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>

<script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>

</body>
</html>