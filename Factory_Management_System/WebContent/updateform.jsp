 
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
    
    <%ArrayList<product> data = (ArrayList)request.getAttribute("data");%>

<title>Insert title here</title>
</head>
<body><br> 

     	<%for(int rec=0;rec<data.size();rec++) { %>

<% product pr = (product)data.get(rec);System.out.println(pr.getPname()); %>

 <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
    			<div class="modal-content">
      				<div class="modal-header">
       				 <h5 class="modal-title" id="exampleModalCenterTitle">Update Product <%= pr.getPid()%></h5>
       				
     		   </div>
     		 <div class="modal-body">
<form action="updateProduct" method="post" class="p-3 mb-2 bg-light text-dark modal-lg ">


  				<div class="form-group">
   				 <label for="Productname">Product name</label>
    				<input type="text" class="form-control form-control-sm" id="pname" name="pname" value=<%= pr.getPname() %> >
   					 
  				</div>
  				
  				<div class="form-group">
   				 <label for="exampleInputEmail1">Product Id</label>
    				<input type="text" class="form-control form-control-sm" id="pid" name="pid" value=<%= pr.getPid() %>>
   					 
  				</div>
  				
  				<div class="form-group">
   				 <label for="exampleInputEmail1">Store Id</label>
    				<input type="text" class="form-control form-control-sm" id="store" name="store" value=<%= pr.getPstore() %>>
   					 
  				</div>
  				
  				<div class="form-group">
   				 <label for="exampleInputEmail1">Date</label>
    				<input type="date" class="form-control form-control-sm" id="date" name="date" value=<%= pr.getDate() %>>
   					 
  				</div>
  				
  				<div class="form-group">
   				 <label for="exampleInputEmail1">Price</label>
    				<input type="text" class="form-control form-control-sm" id="price" name="price" value=<%= pr.getPrice() %>>
   					 
  				</div>
  				
  				
  				
  				
  				
      		<div class="modal-footer">
      			<button type="submit" class="btn btn-primary">Update</button>
  				 
       			<a href="viewproduct.jsp"> <button type="button" class="btn btn-secondary" data-dismiss="modal">back</button></a>
      </div>
  				</form>
  				</div>
  				</div>
  				</div>
  				
  				<%} %>
  				
  				
  				
  				</body>
</html>