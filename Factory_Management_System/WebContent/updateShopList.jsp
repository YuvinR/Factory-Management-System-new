<!--  -->
<%@page import="com.itp.distribution.services.*"%>
<%@page import="com.itp.distribution.model.*"%>

<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">

<link rel="stylesheet" href="styles/stylesheet.css">
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
<script src="https://kit.fontawesome.com/a65579f16a.js"></script>

<%
	ArrayList<IDistShop> data = (ArrayList) request.getAttribute("data");
%>

<title>Insert title here</title>
</head>
<body>

	<%
		for (int rec = 0; rec < data.size(); rec++) {
	%>

	<%
		DistShop idi = (DistShop) data.get(rec);
			System.out.println(idi.getShopId());
	%>

	<div class="modal-dialog modal-dialog-centered modal-lg"
		role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalCenterTitle">Update
					Shop</h5>

			</div>
			<div class="modal-body">

				<form id="log" class="needs-validation" novalidate method="post"
					action="updateDistShopList">

					<div class="form-group">
						<label for="validation1">Shop ID</label> <input type="text"
							class="form-control" id="validation1" name="shopid"
							value=<%=idi.getShopId()%> required>
						<div class="invalid-feedback">Please provide a Shop ID.</div>
					</div>

					<div class="form-group">
						<label for="validation2">Shop Name</label> <input type="text"
							class="form-control" id="validation2" name="shopname"
							value=<%=idi.getShopName()%> required>
						<div class="invalid-feedback">Please provide a Shop Name.</div>
					</div>
					<div class="form-group">
						<label for="validation3">Owner Name</label> <input type="text"
							class="form-control" id="validation3" name="ownername"
							value=<%=idi.getOwnerName()%> required>
						<div class="invalid-feedback">Please provide a Owner Name.</div>
					</div>

					<div class="form-group">
						<label for="validation4">Contact No</label> <input type="text"
							class="form-control" id="validation4" name="contactno"
							value=<%=idi.getContactNo()%> required>
						<div class="invalid-feedback">Please provide Contact Number.</div>
					</div>

					<div class="form-group">
						<label for="validation5">Email</label> <input type="text"
							class="form-control" id="validation5" name="email"
							value=<%=idi.getEmail()%> required>
						<div class="invalid-feedback">Please provide an Email
							Address.</div>
					</div>

					<div class="form-group">
						<label for="validation6">Address</label> <input type="text"
							class="form-control" id="validation6" name="address"
							value=<%=idi.getAddress()%> required>
						<div class="invalid-feedback">Please provide an Address.</div>
					</div>

					<div class="modal-footer">
						<button class="btn btn-primary btn-block" type="submit">Update</button>
					</div>
				</form>

			</div>
		</div>
	</div>

	<%
		}
	%>



</body>
</html>