<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta charset="utf-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">


<title>Distribution Home Page</title>

<link rel="stylesheet" href="css/stylesheet.css">

<!--***nav bar css*** -->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900"
	rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Fontawesome  -->
<script src="https://kit.fontawesome.com/a65579f16a.js"></script>



</head>
<body>
	<!-- ****starting of header (nav bar)**** -->
	<section id="nav-bar">
		<div class="container-fluid">

			<nav
				class="navbar navbar-expand-md navbar-light  shadow-sm bg-white rounded row nav-margin">
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
						<li class="nav-item avatar"><a class="nav-link p-0" href="#">
								<span> </span> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small name">Administrator</span>
								<img
								src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg"
								class="rounded-circle z-depth-0" alt="avatar image" height="45">
						</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</section>
	<!--****End of header*** -->
	<br>
	<br>
	<br>
	<br>
	<br>

	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-md-6 col-lg-3">
				<div class="distributionopt">
					<div class="pic">
						<i class="fas fa-cart-arrow-down fa-3x"></i>
					</div>
					<div class="card-content">
						<h3 class="title">Stock Inflow</h3>
						<span class="post"> add new Stock</span>
					</div>
					<div class="bt">
						<a href=addStockList.jsp>
							<button class="btn btn-primary" type="submit">Add Stock</button>
						</a>
					</div>
				</div>
			</div>
			<div class="col-sm-12 col-md-6 col-lg-3">
				<div class="distributionopt">
					<div class="pic">
						<i class="fas fa-store-alt fa-3x"></i>
					</div>
					<div class="card-content">
						<h3 class="title">Distributed Shops</h3>
						<span class="post">add a new Shop</span>
					</div>
					<div class="bt">
						<a href=addShopList.jsp>
							<button class="btn btn-primary" type="submit">Add Shop</button>
						</a>
					</div>
				</div>
			</div>
			<div class="col-sm-12 col-md-6 col-lg-3">
				<div class="distributionopt">
					<div class="pic">
						<i class="fas fa-box-open fa-3x"></i>
					</div>
					<div class="card-content">
						<h3 class="title">Distributed Items</h3>
						<span class="post">View Distributed Item List</span>
					</div>
					<div class="bt">
						<a href=addItemList.jsp>
							<button class="btn btn-primary" type="submit">View Items</button>
						</a>
					</div>
				</div>
			</div>
			<div class="col-sm-12 col-md-6 col-lg-3">
				<div class="distributionopt">
					<div class="pic">
						<i class="fas fa-truck fa-3x"></i>
					</div>
					<div class="card-content">
						<h3 class="title">Delivery Vehicles</h3>
						<span class="post">View Delivery Vehicle list</span>
					</div>
					<div class="bt">
						<a href=addVehicleList.jsp>
							<button class="btn btn-primary" type="submit">View
								Vehicles</button>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>