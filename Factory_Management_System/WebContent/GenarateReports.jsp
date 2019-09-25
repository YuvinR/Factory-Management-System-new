<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900"
	rel="stylesheet">

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">

<!-- Bootstrap CDN and external CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="./css/dashBoardStyleSheet.css">
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/table.css">


<title>Generate Reports</title>
</head>

<body>

	<div class="container-fluid">

		<nav
			class="navbar navbar-expand-md navbar-light bg-transparent shadow-sm bg-white rounded row nav-margin">
			<a class="navbar-brand logo" href="#"> Bakthi Herbal Lanka </a>
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
		<nav id="sidebar" class="navbar-expand-md mb-5"
			style="margin-top: -40px">
			<div class="sidebar-header  row" style="width: 265px;">
				<!-- <h3>Bootstrap SideBar</h3> -->
				<img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg"
					class="rounded-circle z-depth-0" alt="avatar image" height="65">
				<h5 class="mt-4 ml-3">Name</h5>
			</div>
			<ul class="list-unstyled components mb-2">
				<p>DashBoard</p>
				<li><a href="Cost&Income.jsp">Cost & Income Analysis</a></li>
				<li><a href="BankTransaction.jsp">Bank Transaction</a></li>
				<li><a href="ProfitCalc.jsp">Profit Calculation</a></li>
				<li class="active"><a href="GenarateReports.jsp">Generate Reports</a></li>
			</ul>



		</nav>

		<!-- Page Content  -->
		<div id="content">

			<nav class="navbar-expand-md mb-4 toggle-bar">
				<div class="container-fluid">

					<button type="button" id="sidebarCollapse" class="btn btn-info"
						style="background: #4628B8">
						<i class="fas fa-align-left"></i> <span>DashBoard</span>
					</button>
				</div>
			</nav>



			<div class="container">

				<div class="row">
					<div class="col">
						<h4 style="text-align: left;">Generate Reports</h4>
						<br>
						<h5 style="text-align: right;">3:25 P.M</h5>
						<h4 style="text-align: center;">Bakthi Herbal Lanka(pvt)Ltd</h4>
						<h2 style="text-align: center;">Monthly Financial Statement
							Report</h2>
						<h4 style="text-align: center;">As of Date</h4>
					</div>


					<button class="btn btn-primary" type="button" data-toggle="modal"
						data-target="#exampleModal"
						style="background: #4628B8; color: white; width: 165px; height: 39px;">

						<span><h5>Print</h5></span>
					</button>


					<table id="dtBasicExample"
						class="table table-striped table-bordered table-sm">
						<thead>
							<tr class="p-3 mb-2 bg-success text-white">
								<th scope="col">Reference No</th>
								<th scope="col">Description</th>
								<th scope="col">Type</th>
								<th scope="col">Date</th>
								<th scope="col">Debit</th>
								<th scope="col">Credit</th>
								<th scope="col">Balance</th>

							</tr>
						</thead>


						<tbody>

							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>

							</tr>

							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>

							</tr>

							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>

							</tr>
							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>


							</tr>
							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>


							</tr>
							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>

							</tr>
							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>

							</tr>
							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>

							</tr>
							<tr>
								<td><h3></h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>


							</tr>

							<tr>
								<td><h3>Total</h3></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td><h4>____________________</h4></td>

							</tr>
						</tbody>
					</table>


				</div>




			</div>
		</div>
</body>

</html>