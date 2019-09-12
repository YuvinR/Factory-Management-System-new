 
<%@page import="com.itp.financial.model.modelcost"%>


<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">

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


    
    <%ArrayList<modelcost> data = (ArrayList)request.getAttribute("data");%>

<title>Insert title here</title>
</head>
<body>
<br> 

     	<%for(int rec=0;rec<data.size();rec++) { %>

<% modelcost pr = (modelcost)data.get(rec);System.out.println(pr.getCostCode()); %>

 <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
    			<div class="modal-content">
      				<div class="modal-header">
       				 <h5 class="modal-title" id="exampleModalCenterTitle">Update Cost</h5>
       				
     		   </div>
     		 <div class="modal-body">

<form method ="post" action="updatecost" id = "log" class="needs-validation" novalidate>

                   <div class="form-group">
                        <label for="validation1">Cost Code</label>
                        <input type="text" class="form-control" id="validation1"name ="CostCode" requiredn value=<%= pr.getCostCode()%>>
                        <div class="invalid-feedback">
                            Please provide a Cost Code.
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="validation3">Description</label>
                        <input type="text" class="form-control" id="validation3" name ="Description" required value=<%= pr.getDescription()%>>
                        <div class="invalid-feedback">
                            Please provide a Description.
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="validation4">Type</label>
                        <input type="text" class="form-control" id="validation4" name ="Type" required value=<%= pr.getType()%>>
                        <div class="invalid-feedback">
                            Please provide a Type.
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="validation5">Date</label>
                        <input type="date" class="form-control" id="validation5"name ="date" required value=<%= pr.getDate()%>>
                        <div class="invalid-feedback">
                            Please provide a Date.
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="validation6">Amount</label>
                        <input type="text" class="form-control" id="validation6"  name ="Amount" required value=<%= pr.getAmount()%>>
                        <div class="invalid-feedback">
                            Please Enter the Amount.
                        </div>
                    </div>
                 
              <div class="modal-footer">
                    <button class="btn btn-primary btn-block" type="submit">Update</button>
					<a href=Cost&Income.jsp> <button type="button" class="btn btn-secondary" data-dismiss="modal">back</button></a></div>
                </form>
                </div>
                
               

                  </div>
                  
              </div>
            
  
  				
  				
  				
  				
  				
  				<%} %>
  				
  				
  				
  				</body>
</html>