<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,900" rel="stylesheet">
    <link rel="stylesheet" href="./css/bootstrap.css">
    <link rel="stylesheet" href="./css/EmployeeDash.css">
    <title>Menu</title>
</head>

<body>
    <section id="nav-bar">
        <div class="container-fluid back-img">

            <nav class="navbar navbar-expand-md navbar-light  shadow-sm bg-white row nav-margin">
                <a class="navbar-brand logo" href="index.jsp">
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
                        <!-- <h6 class="pt-3 ml-auto" style="font-size: 0.9rem;">User Name</h5> -->
                        <li class="nav-item avatar">
                            <a class="nav-link p-0" href="#">
                                <span>

                                </span>
                                <!-- <div class="topbar-divider d-none d-sm-block"></div> -->
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small name">Administrator</span>
                                <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-5.jpg"
                                    class="rounded-circle z-depth-0" alt="avatar image" height="45">
                            </a>
                        </li>
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
    </section>
    <!--****End of header*** -->
    <br><br><br><br><br>

    <section id="dash-body" >
        <div class="container container-img">
            <div class="col-5 mx-auto title pb-5">
                <h3>Employee Management</h2>
            </div>
            <div class="row">
                <div class="col-sm-12 col-md-6 col-lg-3">
                    <div class="inventryopt shadow">
                          <div class="pic">

                        </div>
                        <div class="card-content">
                            <h3 class="title">Add Employee</h3>
                            <span class="post"> Employee Registration</span>

                        </div>
                        <div class="bt"><a href="EmployeeList.jsp" ><button class="btn btn-primary" type="submit">Add new</button></a></div>
                    </div>
                </div>

                <div class="col-sm-12 col-md-6 col-lg-3">
                    <div class="inventryopt shadow">
                        <div class="pic">

                        </div>
                        <div class="card-content">
                            <h3 class="title">View Employees</h3>
                            <span class="post">view existing employees</span>

                        </div>
                        <div class="bt"> <button class="btn btn-primary" type="submit">View</button></div>
                    </div>
                </div>

                <div class="col-sm-12 col-md-6 col-lg-3">
                    <div class="inventryopt shadow">
                        <div class="pic">


                        </div>
                        <div class="card-content">
                            <h3 class="title">Add Leave</h3>
                            <span class="post">Manage leaves</span>

                        </div>
                        <div class="bt"> <button class="btn btn-primary" type="submit">Add new</button></div>
                    </div>
                </div>

                <div class="col-sm-12 col-md-6 col-lg-3">
                    <div class="inventryopt shadow">
                        <div class="pic">


                        </div>
                        <div class="card-content">
                            <h3 class="title">Statistics</h3>
                            <span class="post">Generate reports</span>

                        </div>
                        <div class="bt"> <button class="btn btn-primary" type="submit">Reports</button></div>
                    </div>
                </div>
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
</body>

</html>