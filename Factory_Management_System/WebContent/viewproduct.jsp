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




<title>Insert title here</title>
<style>
.pt-3-half {
padding-top: 1.4rem;
}
</style>

</head>
<body>

 <!-- ****starting of header (nav bar)**** -->
	<jsp:include page="commonheader.jsp"></jsp:include>
    
    <!--****End of header*** -->


<!-- Editable table -->
<div class="card">
  <h3 class="card-header text-center font-weight-bold text-uppercase py-4">Product </h3>
  <div class="card-body">
    <div id="table" class="table-editable">
      <span class="table-add float-right mb-3 mr-2">
     
      
      
      
      
      
      <i class="fas fa-plus fa-2x" aria-hidden="true"  type="submit"data-toggle="modal" data-target="#exampleModalCenter3"></i></span>
      
      <div class="modal fade" id="exampleModalCenter3" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
 			 <div class="modal-dialog modal-dialog-centered modal-xl" role="document">
    			<div class="modal-content">
      				<div class="modal-header">
       				 <h5 class="modal-title" id="exampleModalCenterTitle">Add Product</h5>
       				 <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          				<span aria-hidden="true">&times;</span>
        			 </button>
     		   </div>
     		 <div class="modal-body">
     		 <jsp:include page="addproduct.jsp"></jsp:include>
       				 
      		 </div>
      		<div class="modal-footer">
       			 <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
     </div>
  	</div>
   </div>
      
      
      
      <table class="table table-bordered table-responsive-md table-striped text-center">
        <thead>
       
          <tr>
            <th class="text-center">Product ID</th>
            <th class="text-center">Product Name</th>
            <th class="text-center">Store id</th>
            <th class="text-center">Date</th>
            <th class="text-center">Price</th>
            <th class="text-center">Update</th>
            <th class="text-center">Remove</th>
          </tr>
        </thead>
        <tbody>
          <% 
        productfunction prd = new implProduct();
		ArrayList<product> prlist = prd.getproduct();
				
		for(product p : prlist){
			 %>
			 
          <tr>
         
            <td class="pt-3-half" contenteditable="true"><%= p.getPid() %></td>
            <td class="pt-3-half" contenteditable="true"><%= p.getPname() %></td>
            <td class="pt-3-half" contenteditable="true"><%= p.getPstore() %></td>
            <td class="pt-3-half" contenteditable="true"><%= p.getDate() %></td>
            <td class="pt-3-half" contenteditable="true"><%= p.getPrice() %></td>
            
             <form action="tableOperation" method="post">
            <td>
            
              <span class="table-remove"><button type="submit"
                  class="btn btn-danger btn-rounded btn-sm my-0" name="update" value=<%= p.getPid() %>>Update</button></span>
                  
                 
                  
            </td>
            
            <td>
              <span class="table-remove"><button type="submit"
                  class="btn btn-danger btn-rounded btn-sm my-0" name="remove" value=<%= p.getPid() %>>Remove</button></span>
            </td>
            </form>
          </tr>
         
          <%} %>
         
        </tbody>
      </table>
    </div>
  </div>
</div>

 
</body>
</html>