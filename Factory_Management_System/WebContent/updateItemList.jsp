<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<!-- start of action button -->

	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content" style="background-color: #fefefe;">
				<div class="modal-header">
					<h4 class="modal-title">Add Item</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<form id="log" class="needs-validation" novalidate method="post"
						action="addDistItemServlet">

						<div class="form-group">
							<label for="validation1">Distributed Code</label> <input
								type="text" class="form-control" id="validation1"
								placeholder="Please enter a Distribution Code"
								name="distributioncode" required>
							<div class="invalid-feedback">Please provide a Distributed
								Code.</div>
						</div>

						<div class="form-group">
							<label for="validation2">Item Code</label> <input type="text"
								class="form-control" id="validation2"
								placeholder="Please enter a Item Code" name="itemcode" required>
							<div class="invalid-feedback">Please provide a Item Code.</div>
						</div>

						<div class="form-group">
							<label for="validation3">Shop Id</label> <input type="text"
								class="form-control" id="validation3"
								placeholder="Please enter Shop Id" name="shopid" required>
							<div class="invalid-feedback">Please provide a Shop Id.</div>
						</div>

						<div class="form-group">
							<label for="validation4">Distributed Count</label> <input
								type="number" class="form-control" id="validation4"
								placeholder="Please enter a Distributed Count"
								name="distributioncount" required>
							<div class="invalid-feedback">Please provide a Distributed
								Count.</div>
						</div>

						<div class="form-group">
							<label for="validation5">Return Count</label> <input
								type="number" class="form-control" id="validation5"
								placeholder="Please enter a Return Count" name="returncount"
								required>
							<div class="invalid-feedback">Please provide a Return
								Count.</div>
						</div>

						<div class="form-group">
							<label for="validation6">Income</label> <input type="number"
								class="form-control" id="validation6"
								placeholder="Please enter the Income" name="income" required>
							<div class="invalid-feedback">Please provide the Income.</div>
						</div>

						<div class="form-group">
							<label for="validation6">Date</label> <input type="date"
								class="form-control" id="validation7"
								placeholder="Please enter a Date" name="date" required>
							<div class="invalid-feedback">Please provide a Date.</div>
						</div>

						<div class="modal-footer">
							<button class="btn btn-primary btn-block" type="submit">Add</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>



</body>
</html>