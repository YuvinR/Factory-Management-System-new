<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Slab|Work+Sans&display=swap"
	rel="stylesheet">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">


<!-- Bootstrap CDN and external CSS -->
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="./css/Employee_List.css">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/header.css">

<title>Leave List</title>

</head>
<body>

	<div class="container-fluid">

		<nav
			class="navbar navbar-expand-md navbar-light bg-transparent shadow-sm bg-white rounded row nav-margin">
			<a class="navbar-brand logo" href="index.jsp"> Bakthi Herbal Lanka </a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link navbar-brand">
							Home </a></li>
					<li class="nav-item"><a class="nav-link"> Features </a></li>
					<li class="nav-item"><a class="nav-link"> Staff </a></li>
					<li class="nav-item"><a class="nav-link"> Help </a></li>
					<!-- <h6 class="pt-3 ml-auto" style="font-size: 0.9rem;">User Name</h5> -->
					<li class="nav-item avatar"><a class="nav-link p-0" href="#">
							<span> </span> <!-- <div class="topbar-divider d-none d-sm-block"></div> -->
							<span class="mr-2 d-none d-lg-inline text-gray-600 small name">Administrator</span>
							<img
							src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg"
							class="rounded-circle z-depth-0" alt="avatar image" height="45">
					</a></li>
				</ul>
				<!-- <div class="nav-item avatar">
                            <a class="nav-link p-0" href="#">
                                    <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg" class="rounded-circle z-depth-0"
                                      alt="avatar image" height="45">
                                  </a>
                    </div> -->
			</div>
		</nav>
	</div>

	<div class="wrapper">
		<!-- Sidebar  -->
		<nav id="sidebar" class="navbar-expand-md mb-5 navbar-position"
			style="margin-top: -40px">
			<div class="sidebar-header  row" style="width: 265px;">
				<!-- <h3>Bootstrap Sidebar</h3> -->
				<img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg"
					class="rounded-circle z-depth-0" alt="avatar image" height="65">
				<h5 class="mt-4 ml-3">Name</h5>
			</div>
			<hr class="sidebar-hr my-0">
			<ul class="list-unstyled components">
				<i class="fas fa-fw fa-tachometer-alt"></i>
				<span>Dashboard</span>
				<hr class="sidebar-hr" style="margin-top: 1.2rem;">
				<li><a href="#homeSubmenu" data-toggle="collapse"
					aria-expanded="false">Profile</a></li>
				<li><a href="EmployeeList.jsp">Employee List</a></li>
				<li><a href="#pageSubmenu" data-toggle="collapse"
					aria-expanded="false" class="dropdown-toggle">Reports</a></li>
				<li><a href="LoginCreds.jsp">Login
						Authentication</a></li>
				<li class="active"><a href="Leave_List.jsp">Leaves</a></li>
				<li><a href="#">Settings</a></li>
			</ul>
			<!-- <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div> -->

		</nav>

		<!-- Page Content  -->
		<div id="content">

			<nav class="navbar-expand-md mb-4 toggle-bar">
				<div class="container-fluid">

					<button type="button" id="sidebarCollapse" class="btn btn-info">
						<i class="fas fa-bars"></i>
					</button>


				</div>
			</nav>

			<div class="container">

				<div class="row">
					<div class="col"></div>

					<div class="col-md-auto">

						<div class="input-group md-form form-sm form-2 pl-0">
							<input class="form-control my-0 py-1 purple-border" type="text"
								placeholder="Search" aria-label="Search" style="width: 300px;">
							<div class="input-group-append">
								<button class="btn btn-search input-group-text purple lighten-1"
									id="basic-text1"
									style="background: #4628B8; height: 39px; margin-left: 2px;">
									<i class="fas fa-search text-white" aria-hidden="true"></i></span>
							</div>
						</div>

					</div>

					<div class="col col-md-1">
						<button class="btn btn add-btn" type="button" data-toggle="modal"
							data-target="#exampleModal"
							style="background: #4628B8; color: white; width: 120px; height: 39px;">
							<i class="fas fa-plus"></i> <span>Add New</span>
						</button>
					</div>
				</div>
			</div>



			<div class="table-wrapper-scroll-y my-custom-scrollbar"
				style="margin-top: 40px; height: 500px;">
				<table class="table table-bordered table-striped mb-0">
					<thead>
						<tr>
							<th scope="col">Leave ID</th>
							<th scope="col">Employee ID</th>
							<th scope="col">Name</th>
							<th scope="col">Date</th>
							<th scope="col">Description</th>
							<th scope="col">Edit</th>
							<th scope="col">Delete</th>
						</tr>
					</thead>
					<tbody>
						<tr class="grid">
							<td>asdasdasd</td>
							<td>yuiyuiui</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>

						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>


							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

						<tr class="grid">
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>
							<td>asdasdasd</td>

							<td><button class="btn btn-success">
									<i class="fas fa-pen-square center"></i>
								</button></td>
							<td><button class="btn btn-danger"
									style="margin-left: 10px;">
									<i class="far fa-trash-alt"></i>
								</button></td>
						</tr>

					</tbody>

				</table>

			</div>
		</div>

	</div>


	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true"
		style="background-color: rgba(0, 0, 0, 0.5);">
		<div class="modal-dialog registration-modal" role="document">
			<div class="modal-content"
				style="width: 700px; margin-bottom: 30px; margin-left: 260px;">
				<div class="modal-header">
					<h4 class="title col-md-6">Add Leave</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container">
						<form id="registerForm" class="justify-content-center"
							style="margin-left: 100px; margin-bottom: 30px;">


							<div class="form-group col-md-10">

								<input type="text" class="form-control" id="formGroupUsernam"
									aria-describedby="" placeholder="Leave ID" name="leaveId" disabled>
							</div>

							<div class="form-group col-md-10">
								<label for="formGroupUsername" class="text-center">Employee
									ID</label> <input type="text" class="form-control"
									id="formGroupUsernam" aria-describedby=""
									placeholder="Employee ID" name="empId">
							</div>

							<div class="form-group form-align col-md-10">
								<label for="formGroupPassword" class="">Name</label> <input
									type="text" class="form-control" id="formGroupPassword"
									aria-describedby="" placeholder="Name" nam="ename">

							</div>

							<div class="form-group form-align col-md-10">
								<label for="formGroupPassword" class="">Date</label> <input
									type="date" class="form-control" id="formGroupPassword"
									aria-describedby="" placeholder="Name" name="date">

							</div>

							<div class="form-group form-align col-md-10">
								<label for="formGroupPassword" class="">Description</label>
								<textarea type="text" class="form-control"
									id="formGroupPassword" aria-describedby=""
									placeholder="Enter descroption here" rows="3" name="description"></textarea>

							</div>

							<div class="">
								<button class="btn btn-primary col-md-10"
									style="margin-left: 14px; width: 420px;">Add</button>
							</div>
						</form>
					</div>

				</div>

			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script src="./js/jquery-3.4.1.min.js"></script>
</body>
</html>