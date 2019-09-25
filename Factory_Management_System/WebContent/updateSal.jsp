
<%@page import="com.itp.salary.model.Setting"%>
<%@page import="com.itp.inv.services.*"%>
<%@page import="com.itp.inv.model.*"%>

<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">

 <link rel="stylesheet" href="styles/stylesheet.css"> <!--***nav bar css*** -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://kit.fontawesome.com/a65579f16a.js"></script>

 <%ArrayList<Setting> data = (ArrayList)request.getAttribute("data");%>

<title>Insert title here</title>
</head>
<body>

	<%for(int rec=0;rec<data.size();rec++) { %>

<% Setting st = (Setting)data.get(rec);System.out.println(st.getPayment_Type()); %>
 <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
    			<div class="modal-content">
      				<div class="modal-header">
       				 <h5 class="modal-title" id="exampleModalCenterTitle">Update Product</h5>
       				
     		   </div>
     		 <div class="modal-body">
     		 
     		  <form id = "log" class="needs-validation" novalidate method="post" action="updateform">
  
                      <div class="form-group">
  
                          <label for="validation1">Payment_Type</label>
                          <input type="text" class="form-control" id="validation1" placeholder="Payment_Type" name="Payment_Type" value=<%= st.getPayment_Type() %> required >
                          <div class="invalid-feedback">
                             Payment_Type
                          </div>
                      </div>
  
                      <div class="form-group">
                          <label for="validation2">Value</label>
                          <input type="number" class="form-control" id="validation2" placeholder="Value" name="value" value=<%=st.getValue() %> required >
                          <div class="invalid-feedback">
                              Value
                          </div>
                      </div>
                   <div class="modal-footer">
                      <button class="btn btn-primary btn-block" type="submit"> Submit</button>
                    </div>
                    
                   
  				 
       			<a href="viewproduct.jsp"> <button type="button" class="btn btn-secondary" data-dismiss="modal">back</button></a>
      </div>
  </form>
  </div>
  </div>
  <% }%>
  </div>
 
</body>
</html>