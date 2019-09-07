<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
        integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <!-- Bootstrap CDN and external CSS -->
    <link rel="stylesheet" href="./css/bootstrap.css">
    <link rel="stylesheet" href="./css/home.css">

    
    <title>Bakthi Herbal Lanka</title>
</head>

<body>
    
    <section id="main">
        <div class="container-fluid navbar-position">

            <nav class="navbar navbar-expand-lg navbar-light shadow-sm p-3 mb-5 bg-white row">
                <a class="navbar-brand logo" href="Home.html">
                    Bakthi Herbal Lanka
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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

                    </ul>
                    <button class="btn btn-outline-dark mr-1 btn-sign-in" style="margin-right: -20px;margin-left: 20px;"
                        data-toggle="modal" data-target="#exampleModal"><i class="fas fa-sign-in-alt"></i> Sign
                        In</button>
                    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
                        aria-labelledby="exampleModalLabel" aria-hidden="true" style="background-color:rgba(0,0,0,0.5)">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">

                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <div class="container mb-5 signin">
                                        <div class="row justify-content-center">
                                            <img src="./images/team.png" alt="login_image" class="login-photo">
                                        </div>
                                        <h2 class="text-center pt-4">
                                            Sign In
                                        </h2>

                                        <form class="form-sign-in pt-3 pb-4"
                                            style="width: 100%;max-width:330px;margin:0 auto;">
                                            <div class="form-group">
                                                <label for="formGroupUsername" class="text-center">Username</label>
                                                <input type="text" class="form-control" id="formGroupUsernam"
                                                    aria-describedby="" placeholder="Username">
                                            </div>
                                            <div class="form-group form-align">
                                                <label for="formGroupPassword" class="">Password</label>
                                                <input type="password" class="form-control" id="formGroupPassword"
                                                    aria-describedby="" placeholder="Password">
                                            </div>
                                            <div class="form-check">
                                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                                <label class="form-check-label" for="exampleCheck1">Remember Me</label>
                                                <a href="#" class="ml-5" style="font-size: 15px;cursor: pointer;">forgot
                                                    password
                                                </a>
                                            </div>
                                            <div class="pt-4">
                                                <button class="btn btn-outline-primary btn-block">SIGN IN</button>
                                            </div>
                                        </form>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <h2 class="text-center section-title pt-1">Welcome..!</h2>
        <div class="container-fluid">
            

            <div class="row overview-row">
                <a class="col-md-2 text-center btn btn-light border border-dark border border-dark feature-cards" href="EmployeeDash.jsp" >
                    <img src="./images/team.png" class="image">
                    <h3 class="overview-header">Employee Management</h3>
                    <p class="info-width mx-auto">Employee Management</p>
                </a>

                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards" href="distributionHomepage.jsp">
                    <img src="./images/delivery-truck.png" class="image">
                    <h3 class="overview-header">Distribution Management</h3>
                    <p class="info-width mx-auto">Distribution Management</p>
                </a>

                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards" href="supplierIndex.jsp">
                    <img src="./images/supplies.png" class="image" style="width: 100px;">
                    <h3 class="overview-header">Supplier Management</h3>
                    <p class="info-width mx-auto">Supplier Management</p>
                </a>

                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards" href="inventory.jsp">
                    <img src="./images/warehouse.png" class="image">
                    <h3 class="overview-header">Inventory Management</h3>
                    <p class="info-width mx-auto">Inventory Management</p>
                </a>

                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards" href="SalHome.jsp">
                    <img src="./images/Salary.jpg" class="image" style="width: 100px;">
                    <h3 class="overview-header">Salary Management</h3>
                    <p class="info-width mx-auto">Salary Management</p>
                </a>

                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards">
                    <img src="./images/investment.png" class="image">
                    <h3 class="overview-header">Financial Management</h3>
                    <p class="info-width mx-auto">Financial Management</p>
                </a>

                
                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards">
                    <img src="./images/invoice.png" class="image">
                    <h3 class="overview-header">Direct Purchasing </h3>
                    <p class="info-width mx-auto">Direct Purchasing </p>
                </a>

                
                <a class="col-md-2 text-center btn btn-light border border-dark feature-cards">
                    <img src="./images/settings.png" class="image">
                    <h3 class="overview-header">Maintainance Management</h3>
                    <p class="info-width mx-auto">Maintainance Management</p>
                </a>
            </div>

        </div>
    </section>
   


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

        <!-- <div>Icons made by <a href="https://www.flaticon.com/authors/vectors-market" title="Vectors Market">Vectors Market</a> from <a href="https://www.flaticon.com/"                 title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div> -->
</body>
