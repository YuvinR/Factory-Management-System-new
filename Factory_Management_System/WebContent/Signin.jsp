<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
        integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <!-- Bootstrap CDN and external CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
    <link rel="stylesheet" href="./css/Login.css">
    <title>Log In</title>
</head>

<body>

    <div class="container-fluid">

        <nav class="navbar navbar-expand-md navbar-light bg-transparent shadow-sm p-3 mb-5 bg-white rounded row">
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
                        <a class="nav-link" href="Home.html">
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
               
        </nav>
    </div>
    <!-- 
    <section id="login"> -->

    <div class="container shadow p-3 mb-5 signin">

        <h2 class="text-center pt-4">
            Sign In
        </h2>
        <div class="row justify-content-center mt-4">
            <img src="./images/team.png" alt="login_image" class="login-photo">
        </div>
        <form method="POST" action="LoginHandlingServlet" class="form-sign-in pt-3 pb-4" style="width: 100%;max-width:330px;margin:0 auto;">
            <div class="form-group">
                <label for="formGroupUsername" class="text-center">Username</label>
                <input type="text" class="form-control" id="formGroupUsernam" aria-describedby=""
                    placeholder="Username" name="username">
            </div>
            <div class="form-group form-align">
                <label for="formGroupPassword" class="">Password</label>
                <input type="password" class="form-control" id="formGroupPassword" aria-describedby=""
                    placeholder="Password" name="password">
                <a>
                    <h5 class="my-2 forgot-password" style="font-size: 13px;cursor: pointer;">forgot password</h5>
                </a>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Remember Me</label>
            </div>
            <div class="pt-3">
                <button class="btn btn-primary btn-block">Sign In</button>
            </div>
        </form>
    </div>

    <!-- </section> -->
    <div class="container">
        <!-- Footer -->
        <footer class="page-footer font-small special-color-dark pt-4">

            <!-- Footer Elements -->


            <!-- Social buttons -->
            <ul class="list-unstyled list-inline text-center">
                <li class="list-inline-item">
                    <a class="btn-floating btn-fb mx-1">
                        <i class="fab fa-facebook"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-tw mx-1">
                        <i class="fab fa-twitter"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-gplus mx-1">
                        <i class="fab fa-google-plus-g"> </i>
                    </a>
                </li>
                <li class="list-inline-item">
                    <a class="btn-floating btn-li mx-1">
                        <i class="fab fa-linkedin-in"> </i>
                    </a>
                </li>
            </ul>
            <!-- Social buttons -->

            <!-- Footer Elements -->

            <!-- Copyright -->
            <div class="footer-copyright text-center py-3">� 2019 Copyright:
                <a href="https://mdbootstrap.com/education/bootstrap/"> Bakthi Herbal Lanka</a>
            </div>
            <!-- Copyright -->

        </footer>
    </div>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

</body>