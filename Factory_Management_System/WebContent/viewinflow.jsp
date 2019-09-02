<%@page import="com.itp.inv.services.stockhandlerImpl"%>
<%@page import="com.itp.inv.model.stock"%>
<%@page import="com.itp.inv.services.stockhandler"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%--  <%ArrayList<stock> data = (ArrayList)request.getAttribute("data");%> --%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <title>Stock Inflow</title>
    <link rel="stylesheet" href="styles/stylesheet.css"> <!--***nav bar css*** -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://kit.fontawesome.com/a65579f16a.js"></script>



</head>
<body>
<jsp:include page="commonheader.jsp"></jsp:include>
<br><br>

<h2><center>Stock Inflow<center></h2>
<br><br><br><br><br><br>

       

<div class="container bg-light text-dark Bootstrap heading">
<br>

 
 <div class="bt text-right"> <button class="btn btn-primary btn btn-danger" type="submit"  data-toggle="modal" data-target="#exampleModalCenter6">Add Stock</button></div>
        
         <div class="modal fade" id="exampleModalCenter6" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
 			 <div class="modal-dialog modal-dialog-centered modal-xl" role="document">
    			<div class="modal-content">
      				<div class="modal-header">
       				 <h5 class="modal-title" id="exampleModalCenterTitle">Stock Inflow</h5>
       				 <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          				<span aria-hidden="true">&times;</span>
        			 </button>
     		   </div>
     		 <div class="modal-body">
     		 <jsp:include page="stockinflow.jsp"></jsp:include>
       				 
      		 </div>
      		<div class="modal-footer">
       			 <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
     </div>
  	</div>
   </div><br>
  <!-- Content here -->

<table class="table table-bordered table-hover">
  <thead>
    <tr>
      <th scope="col">Entry number</th>
      <th scope="col">Product Code</th>
      <th scope="col">Amount</th>
      <th scope="col">Date</th>
    </tr>
  </thead>
  <tbody>
  <%-- <%for(int rec=0;rec<data.size();rec++) { %>

<% stock stocki = (stock)data.get(rec); %> --%>

<%
		stockhandler sthandler = new stockhandlerImpl();
		ArrayList<stock> stList = sthandler.viewinflow();
		
		for(stock s : stList){
			
		
%>
    <tr>
      <td><%= s.getEntryNo() %></td>
      <td><%= s.getProcode() %></td>
      <td><%= s.getAmount() %></td>
      <td><%= s.getDate() %></td>
    </tr>

<%} %>
  </tbody>
</table>
<div class="bt text-right">
<a href=inventory.jsp>
<button type="button" class="btn btn-danger ">Back</button></a></div><br><br>
</div>
</body>
</html>