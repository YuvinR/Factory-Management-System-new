
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
	ArrayList<IDistItem> data = (ArrayList) request.getAttribute("data");
%>

<title>Insert title here</title>
</head>
<body>

	<%
		for (int rec = 0; rec < data.size(); rec++) {
	%>

	<%
		DistItem idi = (DistItem) data.get(rec);
			System.out.println(idi.getDistributedCode());
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
					action="updateDistItemList">

					<div class="form-group">
						<label for="validation1">Distributed Code</label> <input
							type="text" class="form-control" id="validation1"
							name="distributioncode" value=<%=idi.getDistributedCode()%>
							required>
						<div class="invalid-feedback">Please provide a Distributed
							Code.</div>
					</div>

					<div class="form-group">
						<label for="validation2">Item Code</label> <input type="text"
							class="form-control" id="validation2" name="itemcode"
							value=<%=idi.getItemCode()%> required>
						<div class="invalid-feedback">Please provide a Item Code.</div>
					</div>

					<div class="form-group">
						<label for="validation3">Shop Id</label> <input type="text"
							class="form-control" id="validation3" name="shopid"
							value=<%=idi.getShopId()%> required>
						<div class="invalid-feedback">Please provide a Shop Id.</div>
					</div>

					<div class="form-group">
						<label for="validation4">Distributed Count</label> <input
							type="number" class="form-control" id="validation4"
							name="distributioncount" value=<%=idi.getDistributedCount()%>
							required>
						<div class="invalid-feedback">Please provide a Distributed
							Count.</div>
					</div>
					<div class="form-group">
						<label for="validation5">Return Count</label> <input type="number"
							class="form-control" id="validation5" name="returncount"
							value=<%=idi.getReturnedCount()%> required>
						<div class="invalid-feedback">Please provide a Return Count.</div>
					</div>

					<div class="form-group">
						<label for="validation6">Income</label> <input type="number"
							class="form-control" id="validation6" name="income"
							value=<%=idi.getIncome()%> required>
						<div class="invalid-feedback">Please provide the Income.</div>
					</div>

					<div class="form-group">
						<label for="validation6">Date</label> <input type="date"
							class="form-control" id="validation7" name="date"
							value=<%=idi.getDate()%> required>
						<div class="invalid-feedback">Please provide a Date.</div>
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