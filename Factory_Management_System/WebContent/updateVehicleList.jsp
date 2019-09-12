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
	ArrayList<IDistVehicle> data = (ArrayList) request.getAttribute("data");
%>

<title>Insert title here</title>
</head>
<body>

	<%
		for (int rec = 0; rec < data.size(); rec++) {
	%>

	<%
		DistVehicle idi = (DistVehicle) data.get(rec);
			System.out.println(idi.getVehicleNumber());
	%>

	<div class="modal-dialog modal-dialog-centered modal-lg"
		role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalCenterTitle">Update
					Item</h5>

			</div>
			<div class="modal-body">

				<form id="log" class="needs-validation" novalidate method="post"
					action="updateDistVehicleList">

					<div class="form-group">

						<label for="validation1">Vehicle Number</label> <input type="text"
							class="form-control" id="validation1"
							value=<%=idi.getVehicleNumber()%> name="vehiclenumber" required>
						<div class="invalid-feedback">Please provide a Vehicle
							Number.</div>
					</div>

					<div class="form-group">
						<label for="validation2">Vehicle Name</label> <input type="text"
							class="form-control" id="validation2"
							value=<%=idi.getVehicleName()%> name="vehiclename" required>
						<div class="invalid-feedback">Please provide a Vehicle Name.</div>
					</div>

					<div class="form-group">
						<label for="validation2">Area</label> <input type="text"
							class="form-control" id="validation3" value=<%=idi.getArea()%>
							name="area" required>
						<div class="invalid-feedback">Please provide the Delivering
							area.</div>
					</div>

					<div class="form-group">
						<label for="validation3">Driver Id</label> <input type="text"
							class="form-control" id="validation4"
							value=<%=idi.getDriverCode()%> name="driverid" required>
						<div class="invalid-feedback">Please provide a Driver Id.</div>
					</div>

					<div class="form-group">
						<label for="validation4">Assistant Id</label> <input type="text"
							class="form-control" id="validation5"
							value=<%=idi.getAssistantCode()%> name="assistantid" required>
						<div class="invalid-feedback">Please provide an Assistant
							Id.</div>
					</div>

					<div class="form-group">
						<label for="validation4">Date</label> <input type="date"
							class="form-control" id="validation5" value=<%=idi.getDate()%>
							name="date" required>
						<div class="invalid-feedback">Please provide a Date.</div>
					</div>

					<div class="modal-footer">
						<button class="btn btn-primary btn-block" type="submit">Update</button>
						<a href="addVehicleList.jsp">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Back</button>
						</a>

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