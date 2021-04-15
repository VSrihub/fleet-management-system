<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Naresh ITFleet Management">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="Naresh ITFleet Management">
  <link rel="shortcut icon" href="${requestContextPath}/img/favicon.png">

  <title>Add Vehicle |Naresh ITFleet Management</title>

  <!-- Bootstrap CSS -->
  <link href="${requestContextPath}/css/bootstrap.min.css" rel="stylesheet">
  <!-- bootstrap theme -->
  <link href="${requestContextPath}/css/bootstrap-theme.css" rel="stylesheet">
  <!--external css-->
  <!-- font icon -->
  <link href="${requestContextPath}/css/elegant-icons-style.css" rel="stylesheet" />
  <link href="${requestContextPath}/css/font-awesome.min.css" rel="stylesheet" />
  <!-- Custom styles -->
  <link href="${requestContextPath}/css/style.css" rel="stylesheet">
  <link href="${requestContextPath}/css/style-responsive.css" rel="stylesheet" />

<script src="http://scripts.getsourcecodes.com/vms/assets/js/common/js/jquery-3.4.1.min.js"></script>
  <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

  <script src="http://scripts.getsourcecodes.com/vms/assets/plugins/table/jquery.dataTables.min.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/plugins/table/dataTables.bootstrap4.min.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/js/vendors/jquery.validate.min.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/plugins/datepicker/bootstrap-datepicker.js"></script>

  <script src="http://scripts.getsourcecodes.com/vms/assets/js/vendors/selectize.min.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/plugins/charts-c3/apexcharts.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/js/require.min.js"></script>
  <script>
  </script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/js/dashboard.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/plugins/charts-c3/plugin.js"></script>
  <script src="http://scripts.getsourcecodes.com/vms/assets/plugins/input-mask/plugin.js"></script>
    <script src="http://scripts.getsourcecodes.com/vms/assets/js/custom.js"></script>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
 
</head>

 <!-- container section start -->
  <section id="container" class="">


    <header class="header dark-bg">
      <div class="toggle-nav">
        <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
      </div>

      <!--logo start-->
      <a href="index.html" class="logo">Naresh IT <span class="lite">Fleet Management</span></a>
      <!--logo end-->

      <div class="nav search-row" id="top_menu">
        <!--  search form start -->
        <ul class="nav top-menu">
          <li>
            <form class="navbar-form">
              <input class="form-control" placeholder="Search" type="text">
            </form>
          </li>
        </ul>
        <!--  search form end -->
      </div>

        <!-- notificatoin dropdown start-->
        <ul class="nav pull-right top-menu">

          <!-- user login dropdown start-->
        <!--  <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">-->
                         
                          <h4>Naresh i Technologies</h4>
                        <!--    <b class="caret"></b>
                        </a>
            <ul class="dropdown-menu extended logout">
              <div class="log-arrow-up"></div>
              <li class="eborder-top">
                <a href="http://razessolutions.com"><i class="icon_profile"></i>about the company</a>
              </li>
  
               <li>
                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
              </li>-->
               <style >
                h4{
                color:#fd9f08;
              }
              </style>
           
           
        </ul>
        <!-- notificatoin dropdown end-->
      </div>
    </header>
    <!--header end-->
    <!--header end-->

    <!--sidebar start-->
<aside>
 <div id="sidebar" class="nav-collapse ">
 <!-- sidebar menu start-->
<ul class="sidebar-menu">
 <li class="active">
 <a class="" href="index.html">
 <i class="icon_house_alt"></i>
 <span>Dashboard</span>
 </a>
  </li>
  
 <!--vehicle-->
 <li class="sub-menu">
 <a href="javascript:;" class="">
<i class="fa fa-car" aria-hidden="true"></i>
 <span>Vehicle</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
          
              <li><a href="Vehicle Management.html">Vehicle Management</a></li>
              <li><a href="Add Vehicle.html">Add Vehicle</a>
            </ul>
            <!--driver-->
             <li class="sub-menu">
 <a href="javascript:;" class="">
<i class="icon_id"></i>
 <span>Drivers</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
              <li><a href="Drivers Management.html">Drivers Management</a></li>
              <li><a href="Add Driver.html">Add Driver</a>
            </ul>
          </li>
     <!--trips-->
     <li class="sub-menu">
 <a href="javascript:;" class="">
<i class="fa fa-retweet" aria-hidden="true"></i>
 <span>Trips</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
          
              <li><a href="Trips Management.html">Trips Management</a></li>
              <li><a href="Add Trips.html">Add Trips</a>
            </ul>
      
         <!--customers-->
         <li class="sub-menu">
 <a href="javascript:;" class="">
<i class="fa fa-users" aria-hidden="true"></i>
 <span>Customers</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
          
              <li><a href="Customer Management.html">Customer Management</a></li>
              <li><a href="Add Customer.html">Add Customer</a>
            </ul>
       
         
         <!--fuel-->
          <li class="sub-menu">
            <a href="javascript:;" class="">
              <i class="fa fa-bolt" aria-hidden="true"></i>
                          <span>Fuel</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
              <li><a href="Fuel Management.html">Fuel Management</a></li>
                <li><a href="Add Fuel.html">Add Fuel </a></li>
            </ul>
          </li>
          <!--income&expenses-->
          <li class="sub-menu">
 <a href="javascript:;" class="">
  <i class="fa fa-usd" aria-hidden="true"></i>
 <span>Inc&Exp</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
          
              <li><a href=" Inc&Exp Management.html"> Inc&Exp Management</a></li>
              <li><a href="Add Income.html">Add Income</a>
            </ul>

              <li><a href="Tracking.html">
              <i class="fa fa-map-marker" aria-hidden="true"></i></i><span>Tracking</span></a></li>
              <li><a href="login.html"><i class="fa fa-lock" aria-hidden="true"></i><span>Login Page</span></a></li>
              <li><a class="" href="contact.html"><i class="fa fa-phone" aria-hidden="true"></i><span>Contact Page</span></a></li>
           
          
        </ul>
        <!-- sidebar menu end-->
      </div>
    </aside>
    <!--sidebar end-->

    <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
        <div class="row">
          <div class="col-lg-12">
            <h3 class="page-header"><img src="${requestContextPath}/img/car.png"> <strong>Add Vehicle</h3></strong>
            <ol class="breadcrumb">
              <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
              <li> <img src="${requestContextPath}/img/car.png"></i>Vehicle</li>
              <li></i>Add Vehicle</li>
            </ol>
          </div>
        </div>
        <!-- Form validations -->
        <div class="row">
          <div class="col-lg-12">
            <section class="panel">
              <header class="panel-heading">
             <strong>  Add Vehicle</strong>
             <style >
              strong{
                color:black;
              }


            </style>
              </header>
               <div class="my-3 my-md-5">
          <div class="container">
            <div class="row row-cards">

    <div class="col-md-6">
                                 </div>
     <div class="col-6">
     <form:form method="post" id="vehicle_add" class="card" action="${requestContextPath}/vehicle/updateVehicle" modelAttribute="vehicleData"> 
     
    <%-- <form method="post" id="vehicle_add" class="card" action="Vehicle Management.html/ Add Vehicle/insertVehicle"> --%>
                <div class="card-body">

                  <h3 class="card p-4 card-title bg-light border-0"></h3>

                  <div class="row">
                   <!-- <input type="hidden" name="v_id" id="v_id"> -->
                   <form:hidden path="v_id" id="v_id"/>
  <div class="container">


                    <div class="col-sm-6 col-md-4">
                        <label class="form-label">Registration Number</label>
                      <div class="form-group">
                        <!-- <input type="text" name="v_registration_no" id="v_registration_no" class="form-control" placeholder="Registration Number" value=""> -->
                        <form:input path="v_registration_no" id="v_registration_no" class="form-control" placeholder="Registration Number"/>
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-4">
                        <label class="form-label">Vehicle Name</label>
                      <div class="form-group">
                        <!-- <input type="text" name="v_name" id="v_name" class="form-control" placeholder="Vehicle Name" value=""> -->
                        <form:input path="v_name" id="v_name" class="form-control" placeholder="Vehicle Name" value=""/>
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">Model</label>
                        <!-- <input type="text" name="v_model" value="" class="form-control" placeholder="Model"> -->
                        <form:input path="v_model" value="" class="form-control" placeholder="Model"/>
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">Chassis No</label>
                        <form:input path="v_chassis_no" value="" class="form-control" placeholder="Chassis No"/>
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">Engine No</label>
                        <form:input path="v_engine_no" value="" class="form-control" placeholder="Engine No"/>
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">Manufactured By</label>
                        <form:input path="v_manufactured_by" value="" class="form-control" placeholder="Manufactured By"/>
                      </div>
                    </div>
                    </div>
                    <hr>
                    <div class="container">
                    <div class="form-label"><b>GPS API Details(Feed GPS Data)</b></div>
                     <div class="row">
                    <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">API URL</label>
                        <input type="text" name="v_api_url" class="form-control" placeholder="API URL" value="Vehicle.html" readonly>
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">API Username</label>
                        <input type="text" id="v_api_username" value="" name="v_api_username" class="form-control" placeholder="API Username" readonly>
                      </div>
                    </div>
                  <div class="col-sm-6 col-md-4">
                      <div class="form-group">
                        <label class="form-label">API Password</label>
                        <input type="text" name="v_api_password" class="form-control" placeholder="API Password" value="123456"  readonly>
                      </div>
                    </div>
                  </div>
                </div>
                   <div class="col-sm-6 col-lg-11">
                <div class="card-footer text-right">
                  <button type="submit" class="btn btn-primary btn-lg">update</button>
                 <!-- <a class="btn btn-danger" href="Add Vehicle.html" title="Add Vehicle">Add Vehicle</a>-->
                </div>
              <%-- </form> --%>
              </form:form>
            </div>
     
              </div>
            </div>
          </div><br><br><br>
       
    <!--footer content end-->
 <div class="text-right">
      <div class="credits">
      
         <footer class="footer white-bg">

      
          <h4>Copyright &copy; 2020, Naresh isolutions</h4>
          Designed by <a href="http://razessolutions.com">Naresh iSolutions</a>
          
        </div>
    </div>
  <!-- Footer section end -->

  <!-- javascripts -->
  <script src="js/jquery.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <!-- nice scroll -->
  <script src="js/jquery.scrollTo.min.js"></script>
  <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
  <!-- jquery validate js -->
  <script type="text/javascript" src="js/jquery.validate.min.js"></script>

  <!-- custom form validation script for this page-->
  <script src="js/form-validation-script.js"></script>
  <!--custome script for all page-->
  <script src="js/scripts.js"></script>


</body>

</html>
