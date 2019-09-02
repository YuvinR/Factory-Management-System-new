<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Insert title here</title>
</head>
<body>

<form  method="post" action=addstore>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Store name</label>
      <input type="text" class="form-control" id="storeName" name="storeName" placeholder="Store Name">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Phone number</label>
      <input type="text" class="form-control" id="phoneno" name="phoneno" placeholder="Phone number">
    </div>
  </div>
  
  <div class="form-group">
    <label for="inputAddress">Address line 1</label>
    <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="1234 Main St">
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">Address line 2</label>
    <input type="text" class="form-control" id="inputAddress2" name="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  
  <div class="form-group">
    <label for="inputAddress">Store Email</label>
    <input type="text" class="form-control" id="email" name="email" placeholder="E-mail">
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-2">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity" name="inputCity">
  </div>
  
  <div class="form-group col-md-4">
      <label for="inputState">Province</label>
      <select id="inputState" name="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>Western Province</option>
        <option>Eastern Province</option>
        <option>Southern Province</option>
        <option>North Province</option>
      </select>
   </div>
   
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip" name="inputZip">
    </div>
    
    <div class="form-group col-md-4">
      <label for="inputCity">Maximum item count can be stored</label>
      <input type="text" class="form-control" id="maxitem" name="maxitem">
    </div>
    
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">submit</button>
</form>

</body>
</html>