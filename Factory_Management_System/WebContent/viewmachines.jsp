<%--  <%@page import="com.itp.services.Iaddequipmentimpi"%>
<%@page import="com.itp.util.CommonUtilities"%>
<%@page import="com.itp.services.IaddmachineImpl"%>
<%@page import="com.itp.services.Iaddmachine"%>
<%@page import="com.itp.model.addmechine"%>
<%@page import="java.util.*" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%ArrayList<addmechine> data = (ArrayList)request.getAttribute("data");  %>    
     
<!DOCTYPE html>
<html>
<head>
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

    <title>View Machines</title>
    
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
                    <!-- <h6 class="pt-3 ml-auto" style="font-size: 0.9rem;">User Name</h5> -->
                    <li class="nav-item avatar">
                        <a class="nav-link p-0" href="#">
                            <span>

                            </span>
                            <!-- <div class="topbar-divider d-none d-sm-block"></div> -->
                            <span class="mr-2 d-none d-lg-inline text-gray-600 small name">Administrator</span>
                            <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg" class="rounded-circle z-depth-0" alt="avatar image" height="45">
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

    <div class="wrapper">
        <!-- SideBar  -->
        <nav id="sidebar" class="navbar-expand-md mb-5" style="margin-top: -40px">
            <div class="sidebar-header  row" style="width: 265px;">
                <!-- <h3>Bootstrap SideBar</h3> -->
                <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg" class="rounded-circle z-depth-0" alt="avatar image" height="65">
                <h5 class="mt-4 ml-3">Name</h5>
            </div>

            <ul class="list-unstyled components mb-2">
                <p>DashBoard</p>
                <li class="active">
                    <a href=viewmachines.jsp>View Machines</a>
                </li>
                <li>
                    <a href=industrialequipment.jsp>Industrial Equipment</a>
                </li>
                <li>
                    <a href=invoicedetails.jsp>Invoice details</a>
                </li>
            </ul>


        </nav>

        <!-- Page Content  -->
        <div id="content">

            <nav class="navbar-expand-md mb-4 toggle-bar">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info" style="background:#4628B8">
                        <i class="fas fa-align-left"></i>
                        <span>DashBoard</span>
                    </button>
                </div>
            </nav>



            <div class="container">

              <div class="row">
    <div class="col">
      <h4 style="text-align: left;">View Machines Table</h4>
    </div>

<!-- Search -->
     <div class="col-md-auto">

     <div class="form-group has-search">
		<span class="fa fa-search form-control-feedback"></span>
		<input type="text" id="search" name="search" onkeyup="Search()"
			class="form-control purple lighten-1" placeholder="Search">
	</div>

    </div>

    <div class="col col-lg-2">
    
    
    
      <button class="btn btn-primary" type="button" data-toggle="modal" data-target="#exampleModal" style="background:#4628B8; color:white; width:165px; height:39px;">
          <i class="fas fa-plus"></i>
          <span>Add Machines</span> 
      </button>
      
      
      
      
    </div>
  </div>
</div>




<br/>
  <div class="table-wrapper-scroll-y my-custom-scrollbar">
          <table id="dtBasicExample" class="table table-striped table-bordered table-sm">
                <thead>
                    <tr class="p-3 mb-2 bg-success text-white">
                        <th scope="col">Machine Number</th>
                        <th scope="col">Machine Brand</th>
                        <th scope="col">Value</th>
                        <th scope="col">Date of buy</th>
                        <th scope="col">Date of fixed</th>
                        <th scope="col">edit</th>
                        <th scope="col">delete</th>
                    </tr>
                </thead>
                <tbody>
                <%
               
                IaddmachineImpl iaddmachineImpl = new IaddmachineImpl();
                ArrayList<addmechine> addmList = iaddmachineImpl.getMachines();
                
                for(addmechine iAddmechine : addmList){
                	
                %>
                    <tr id="<%=iAddmechine.getMachine_Number()%>">
                        <td data-target="mid"><%=iAddmechine.getMachine_Number() %></td>
                        <td data-target="mbrand"><%=iAddmechine.getMachine_Brand() %></td>
                        <td data-target="mvalue"><%=iAddmechine.getValue() %></td>
                        <td data-target="mgdate"><%=iAddmechine.getDate_of_buy() %></td>
                        <td data-target="mfdate"><%=iAddmechine.getDate_of_fixed() %></td>                                    
                        <!-- <td><i class="material-icons" style="color:red;">&#xe150;</i></td>
                        <td><i class='fas fa-times' style="color:red;"></i></td> -->
                       <td> <a href="#" data-role="update" data-id="<%=iAddmechine.getMachine_Number()%>" class="btn btn-success" ><i class="fas fa-pen-square"></i></a></td>
                       <td> <a data-toggle="modal" data-id="<%=iAddmechine.getMachine_Number()%>" class="deletemodal btn btn-danger" href="#deleteModal"><i class="far fa-trash-alt"></i></a></td>
                    </tr>
                    <%} %>
                </tbody>
            </table>
            </div>
            </div>
            </div>
            
            
            <!-- start of action button -->

            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"  aria-hidden="true">
              <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content" style=" background-color: #fefefe;">
                  <div class="modal-header">
                    <h4 class="modal-title">Add Machine</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                  </div>
                  <div class="modal-body">

                    <form id = "log" class="needs-validation" novalidate method="post" action="addmechineList">
						
					<%
					IaddmachineImpl machineService = new IaddmachineImpl();
					String mid = CommonUtilities.generateMachineID(machineService.getMachineIDs());
					%>

					<div class="form-group">
                        <label for="validation2">Machine number</label>
                        <input type="text" class="form-control" id="validation2" placeholder="Please enter a Machine number" value="<%=mid %>" disabled>
                        <input type="hidden" name="machineID" value="<%=mid %>"> 
                        <div class="invalid-feedback">
                            Please enter a Machine number.
                        </div>
                    </div>
					
                    <div class="form-group">
                        <label for="validation2">Machine brand</label>
                        <input type="text" class="form-control" id="validation2" placeholder="Please enter a Machine brand" name="Machine_Brand" required>
                        <div class="invalid-feedback">
                            Please enter a Machine brand.
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="validation2">Value</label>
                        <input type="text" class="form-control" id="validation3" placeholder="Please enter the value" name="Value" required>
                        <div class="invalid-feedback">
                            Please enter the value.
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="validation4">Date of buy</label>
                        <input type="date" class="form-control" id="validation4" placeholder="Please enter Date of buy" name="Date_of_buy" required>
                        <div class="invalid-feedback">
                            Please enter Date of buy.
                        </div>
                    </div>

                  <div class="form-group">
                        <label for="validation4">Date of fixed</label>
                        <input type="date" class="form-control" id="validation4" placeholder="Please enter Date of fixed" name="Date_of_fixed" required>
                        <div class="invalid-feedback">
                            Please enter Date of fixed.
                        </div>
                    </div>

                

                  <div class="modal-footer">
                    <button class="btn btn-primary btn-block" type="submit"> Add</button>
                  </div>
</form>
                  </div>
                </div>
              </div>
            </div>
		<!-- end of action button-->

<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Confirmation
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
					<form action="DeleteMachineServlet" method="POST">
					<div class="float-right">
						<input type="hidden" id="deleteMachine" name="deleteText">
						 <button id="deleteServlet" class="btn btn-danger" >Confirm</button>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>

<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog update-modal" role="document">
		<div class="modal-content "
				style="width: 650px; margin-bottom: 30px;">
				<div class="modal-header">
					<h4 class="title col-md-6">Update</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container">
						<form method="POST" action="UpdateMachineServlet">
							<div class="form-group">
                        <label for="validation2">Machine number</label>
                        <input type="text" class="form-control" id="machineno" placeholder="Please enter a Machine number" disabled>
                        <input type="hidden" name="machineID" id="machinetext"> 
                        <div class="invalid-feedback">
                            Please enter a Machine number.
                        </div>
                    </div>
					
                    <div class="form-group">
                        <label for="validation2">Machine brand</label>
                        <input type="text" class="form-control" id="brandupdate"  name="Machine_Brand" required>
                        <div class="invalid-feedback">
                            Please enter a Machine brand.
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="validation2">Value</label>
                        <input type="text" class="form-control" id="valueupdate" placeholder="Please enter the value" name="Value" required>
                        <div class="invalid-feedback">
                            Please enter the value.
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="validation4">Date of buy</label>
                        <input type="text" class="form-control" id="gdateupdate" placeholder="Please enter Date of buy" name="Date_of_buy" required>
                        <div class="invalid-feedback">
                            Please enter Date of buy.
                        </div>
                    </div>

                  <div class="form-group">
                        <label for="validation4">Date of fixed</label>
                        <input type="text" class="form-control" id="fdateupdate" placeholder="Please enter Date of fixed" name="Date_of_fixed" required>
                        <div class="invalid-feedback">
                            Please enter Date of fixed.
                        </div>
                    </div>

                

                  <div class="modal-footer">
                    <div style="margin-left:65px; margin-top:20px;width:550px;padding-bottom:10px;">
									<button id="update" class="btn btn-success col-md-10">Update</button>
									</div>
                  </div>
						</form>
					</div>

				</div>

			</div>
		</div>
	</div>
	


            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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
            
            	<script>

		$(document).on("click", ".deletemodal", function () {
		     var mid = $(this).data('id');
		     $(".modal-footer #deleteMachine").val( mid );
		   
		})
	</script>
	
	<script>
$(document).ready(function(){
	
		$(document).on('click', 'a[data-role=update]', function () {
		    var id = $(this).data('id'); 
			var brand = $('#'+id).children('td[data-target=mbrand]').text();
		    var value = $("#"+id).children('td[data-target=mvalue]').text();
		    var getdate = $("#"+id).children('td[data-target=mgdate]').text();
		    var fixedate = $("#"+id).children('td[data-target=mfdate]').text();
		   
		   
		    
		    $('.modal-body #machinetext').val(id);
		    $('.modal-body #machineno').val(id);
		    $('.modal-body #brandupdate').val(brand);
		    $('.modal-body #valueupdate').val(value);
		    $('.modal-body #gdateupdate').val(getdate);
		    $('.modal-body #fdateupdate').val(fixedate);
		   
		     $('#updateModal').modal('toggle');
		})
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
</body>

</html>
  --%>