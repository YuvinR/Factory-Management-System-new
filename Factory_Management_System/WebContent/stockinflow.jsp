<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="stockinflow">
 <div class="form-row">
    
    <div class="col-md-5 mb-5">
      <label for="validationCustom02">Product code</label>
      <input type="text" class="form-control" id="validationCustom02" name="pcode" placeholder="P0001" value="" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
    
    <div class="col-md-7 mb-3">
      <label for="validationCustom01">stock amount</label>
      <input type="text" class="form-control" id="validationCustom01" name="amount" placeholder="Stock amount" value="" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
    
     <div class="col-md-12 mb-3">
      <label for="validationCustom05">Date</label>
      <input type="date" class="form-control" id="validationCustom04" name="date" name="date"  placeholder="Date" required>
      <div class="invalid-feedback">
        Please provide a valid date.
      </div>
      
    </div>
    
    
    
   
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>