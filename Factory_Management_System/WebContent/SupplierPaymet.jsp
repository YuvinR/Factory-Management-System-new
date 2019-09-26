<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.itp.common.utils.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.itp.common.utils.CommonUtilities"%>
<%@page import="com.itp.supplierPayment.model.supplierPayment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itp.supplierPayment.services.supPaymentServiceImpl"%>
<%@page import="com.itp.supplierPayment.services.ISupPaymentServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supplier Payment List</title>

 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

	<!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <!-- Bootstrap CDN and external CSS -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="./css/dashBoardStyleSheet.css">
    <link rel="stylesheet" href="./css/header.css">
    <link rel="stylesheet" href="./css/table.css">
    
        <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<style>
.has-search .form-control {
	padding-left: 2.375rem;
}

.has-search .form-control-feedback {
	position: absolute;
	z-index: 2;
	display: block;
	width: 2.375rem;
	height: 2.375rem;
	line-height: 2.375rem;
	text-align: center;
	pointer-events: none;
	color: #aaa;
}
</style>
	
</head>
<body>

<%-- <%
	double val = 0;
%> --%>
  <div class="container-fluid">

        <nav class="navbar navbar-expand-md navbar-light bg-transparent shadow-sm bg-white rounded row nav-margin">
            <a class="navbar-brand logo" href="#">
                Bakthi Herbal Lanka
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link navbar-brand">
                            Home
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link">
                            Features
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link">
                            Staff
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link">
                            Help
                        </a>
                    </li>
                   
                    <li class="nav-item avatar">
                        <a class="nav-link p-0" href="#">
                            <span>

                            </span>
                          
                            <span class="mr-2 d-none d-lg-inline text-gray-600 small name">Administrator</span>
                            <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg" class="rounded-circle z-depth-0" alt="avatar image" height="45">
                        </a>
                    </li>
                </ul>
               
            </div>
        </nav>
    </div>

	  <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar" class="navbar-expand-md mb-5" style="margin-top: -40px">
            <div class="sidebar-header  row" style="width: 265px;">
               
                <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg" class="rounded-circle z-depth-0" alt="avatar image" height="65">
                <h5 class="mt-4 ml-3">Name</h5>
            </div>

            <ul class="list-unstyled components mb-2">
                <p>Dashboard</p>
              <!--   <li class="active">
                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Home</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">Home 1</a>
                        </li>
                        <li>
                            <a href="#">Home 2</a>
                        </li>
                        <li>
                            <a href="#">Home 3</a>
                        </li>
                    </ul>
                </li> -->
                
                <li>
                    <a href="#">Profile</a>
                </li>
                
                 <li>
                    <a href="supplierList.jsp">Add Supplier</a>
                </li>
                
                  <li>
                    <a href="supplierList.jsp">Supplier List</a>
                </li>
                
                 <li>
                    <a href="rawMaterialList.jsp">Add Raw Material</a>
                </li>
                
                 <li>
                    <a href="rawMaterialList.jsp">Raw Material List</a>
                </li>
                
                <li>
                    <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Reports</a>
                    <ul class="collapse list-unstyled" id="pageSubmenu">
                        <li>
                            <a href="#">Supplier Report</a>
                        </li>
                        <li>
                            <a href="#">Raw Material Report</a>
                        </li>
                       
                    </ul>
                </li>
                <li>
                    <a href="#">Settings</a>
                </li>
               
            </ul>


        </nav>

        <!-- Page Content  -->
        <div id="content">

            <nav class="navbar-expand-md mb-4 toggle-bar">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info" style="background:#4628B8">
                        <i class="fas fa-align-left"></i>
                        <span>Dashboard</span>
                    </button>
                </div>
            </nav>



            <div class="container">

              <div class="row">
    <div class="col">
      <h4 style="text-align: left;">Supplier Payment List Table</h4>
    </div>

    <div class="col-md-auto">

     <div class="form-group has-search">
		<span class="fa fa-search form-control-feedback"></span>
		<input type="text" id="search" name="search" onkeyup="Search()"
			class="form-control purple lighten-1" placeholder="Search">
	</div>

     

    </div>

    <div class="col col-lg-2">

      <button class="btn btn-primary" type="button" data-toggle="modal" data-target="#exampleModal" style="background:#4628B8; color:white; width:150px; height:35px;">
          <i class="fas fa-plus"></i>
          <span>Add Payment</span>
      </button>


    </div>
  </div>
</div>


<br/>
  <div class="table-wrapper-scroll-y my-custom-scrollbar" style="height: 600px;">
          <table id="dtBasicExample" class="table table-striped table-bordered table-sm" width="100%">
                <thead>
                    <tr class="p-3 mb-2 bg-success text-white">
                        <th scope="col">Payment ID</th>
                        <th scope="col">Supplier ID</th>
                        <th scope="col">Raw ID</th>
                        <th scope="col">Raw Name</th>
                        <th scope="col">Qty</th>
                        <th scope="col">Unit Price</th>
                         <th scope="col">Total Price</th>
                        <th scope="col">edit</th>
                        <th scope="col">delete</th>
                    </tr>
                </thead>
		
                <tbody>
                
                 <%
                                 	ISupPaymentServices iSupPaymentServices = new supPaymentServiceImpl();
                 				
                                 	ArrayList<supplierPayment> arrayList = iSupPaymentServices.getSupPayments();
                                 	
                                 			for(supplierPayment spPayment : arrayList){
                                 %>
			
                   <tr id="<%=spPayment.getSupPaymentID()%>">
                    	<td data-target="idSP"><%=spPayment.getSupPaymentID() %></td>
                        <td data-target="supnameSP"><%=spPayment.getSupplierID() %></td>
                        <td data-target="rawIDSP"><%=spPayment.getRawID() %></td>
                        <td data-target="rawNameSP"><%=spPayment.getRawName() %></td>
                        <td data-target="qtySP"><%=spPayment.getQty() %></td>
						<td data-target="uPriceSP"><%=spPayment.getUnitPrice() %></td>
						<td data-target="tPriceSP"><%=spPayment.getTotalPrice() %></td>
						
		
					
						
					<!-- 	<input type="hidden" id ="getsupplierid"> -->
						
							<td> <a data-toggle="modal" data-target="#updateModal" data-role="update" data-id="<%=spPayment.getSupPaymentID() %>" class="btn btn-success"><i class="fas fa-pen-square" style="font-size:15px;"></i></a> </td>
						
							<td> <a data-toggle="modal" data-id="<%=spPayment.getSupPaymentID() %>" class="deletemodal btn btn-danger" href="#deleteModal"><i class="far fa-trash-alt"></i></a></td>				
                    </tr>
                     <% 
                     }%>
                         
                </tbody>

                 <tfoot>
                  <tr class="p-3 mb-2 bg-success text-white">
                       <th scope="col">Payment ID</th>
                        <th scope="col">Supplier ID</th>
                        <th scope="col">Raw ID</th>
                        <th scope="col">Raw Name</th>
                        <th scope="col">Qty</th>
                        <th scope="col">Unit Price</th>
                         <th scope="col">Total Price</th>
                        <th scope="col">edit</th>
                        <th scope="col">delete</th>
                  </tr>
                </tfoot> 
                
            </table>
            </div>

</div>
</div>
	
	
<!-- Modal -->
            <div class="modal fade " id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"  aria-hidden="true">
              <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
                <div class="modal-content" style=" background-color: #fefefe;">
                  
                  <div class="modal-header">
                    <h3 class="modal-title">Add Supplier Payment</h3> 
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                  </div>
                  
                  <div class="modal-body">

                    <form action="AddSupPaymentServlet" method="POST" id = "supplierPaymentForm" style="height:130%; width:100%;">
                    
                     <div class="form-group">
                     
                      <!--   To get auto increment supplier ID to the supplier registration form -->
                     <%
                 	ISupPaymentServices iSPaymentServices = new supPaymentServiceImpl();
                     String spID = CommonUtilities.generateSupplierPaymentID(iSupPaymentServices.getSupPaymentIDs());
                   	 
                     %>
                       <label>Payment ID</label>
                       <input type="text" value="<%=spID %>" class="form-control" name="supPaymentID" Readonly>
                    </div>
                    
                       <div class="form-group">
						<label>Supplier ID</label> 
						<select id="inputSupID" name="supId" class="form-control">
						
						<!-- to get the supplier IDs in the database to the drop down -->
                        <%Connection connection = DBConnection.getDBConnection();
						  Statement statement = connection.createStatement();
						  ResultSet resultSet = statement.executeQuery("SELECT supID FROM supplier");	  
							%>
                            <option selected="" value="Default">Choose...</option>
                            <%while(resultSet.next()){ %>
                            <option><%=resultSet.getString(1) %></option>
                          	<%} %>
                            
						</select>
					</div>

						<div class="form-group">
						<label>Raw Material ID</label> 
						<select id="inputProID" name="proId" class="form-control">
						
						<!-- to get the raw material IDs in the database to the drop down -->
                        <%Connection connection2 = DBConnection.getDBConnection();
						  Statement statement2 = connection.createStatement();
						  ResultSet resultSet2 = statement.executeQuery("SELECT rID FROM raw_material");	  
							%>
                            <option selected="" value="Default">Choose...</option>
                            <%while(resultSet2.next()){ 
                            /* 	String rawid = resultSet2.getString(1);
                            	supPaymentServiceImpl supPaymentServiceImpl = new supPaymentServiceImpl();
                            	val = supPaymentServiceImpl.getUnitPrice(rawid); */
                            %>
                            <option><%=resultSet2.getString(1) %></option>
                           
                          	<%} %>
                            
						</select>
					</div>
					
					
                    <div class="form-group">

                        <label for="validation4">Quantity</label>
                        <input type="text" class="form-control" name="qty" id="validation4" placeholder="Quantity" required>
                            <div class="invalid-feedback">
                                Please provide a contact number.
                            </div>

                    </div>

                    <div class="form-group">
                        <label for="validation5">Unit Price</label>
                        
                        
                        <input type="text" class="form-control" name="uPrice" id="validation5" >
                       
                    </div>
                    <div class="form-group">
                        <label for="validation6">Total</label>
                        
                        <input type="text" class="form-control" name="total" id="validation6" placeholder="Total" required>
                       
                    </div>

             

                  
                  <div class="modal-footer">
                  
                    <input class="btn btn-primary btn-block" type="submit" value="Confirm">
                  
                  </div>
                     </form>
                     </div>
                </div>
              </div>
            </div>
            <!-- Modal End -->
            
            <!--DELETE Modal -->
		<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="deleteModalLabel">Confirmation
						Alert!!!</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<p>Are you sure to delete this record?</p>
				</div>
				<div class="modal-footer">
					<div class="float-left">
						<button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
					</div>
					<form action="DeleteSupPaymentServlet" method="POST">
					<div class="float-right">
						<input type="hidden" id="deleteSupPayment" name="deleteText">
						 <button id="deleteServlet" class="btn btn-danger" >Confirm</button>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- Delete Modal End -->
            
            
             <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            	
                  <script type="text/javascript">
                $(document).ready(function() {
                    $('#sidebarCollapse').on('click', function() {
                        $('#sidebar').toggleClass('active');
                    });
                });
            </script>
            
             <script>
                $(document).ready(function () {
                  $('#dtBasicExample').DataTable();
                  $('.dataTables_length').addClass('bs-select');
                });
            </script>
            
            <!-- Search function -->
	<script>
		function Search() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("search");
			filter = input.value.toUpperCase();
			table = document.getElementById("dtBasicExample");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[0];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}
	</script>

<!-- <script>
		$(document).ready(

		function() {
			$(document).on('click', 'a[data-role=delete]', function() {

				var id = $(this).data('id');
				var spid = $('#' + id).children('td[data-target=spid]').text();

				$('#deleteSupPayment').val(spid);

			})
		});

	 	$('#deleteServlet').click(function() {

			var id = $('#deleteSupPayment').val();

			$.ajax({
				url : 'DeleteSupPaymentServlet',
				method : 'post',
				data : {
					id : id,
				},
				success : function(response) {

					$('#' + id).children('td[data-target=spid]').text(id);
				}
			});

		});
	</script>  -->
	
		<script>

		$(document).on("click", ".deletemodal", function () {
		     var spid = $(this).data('id');
		     $(".modal-footer #deleteSupPayment").val( spid );
		    
		})
	</script>
	

            	
</body>
</html>

	<!-- String rawid = resultSet2.getString(1);
                            	supPaymentServiceImpl supPaymentServiceImpl = new supPaymentServiceImpl();
                            	val = supPaymentServiceImpl.getUnitPrice(rawid); -->