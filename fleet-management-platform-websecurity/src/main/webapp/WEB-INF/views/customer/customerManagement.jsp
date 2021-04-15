<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Naresh IT Fleet Management">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="">
  <link rel="shortcut icon" href="img/favicon.png">

  <title>Customer management|Naresh IT Fleet Management</title>

  <!-- Bootstrap CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- bootstrap theme -->
  <link href="css/bootstrap-theme.css" rel="stylesheet">
  <!--external css-->
  <!-- font icon -->
  <link href="css/elegant-icons-style.css" rel="stylesheet" />
  <link href="css/font-awesome.min.css" rel="stylesheet" />
  <!-- full calendar css-->
  <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
  <link href="assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
  <!-- easy pie chart-->
  <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen" />
  <!-- owl carousel -->
  <link rel="stylesheet" href="css/owl.carousel.css" type="text/css">
  <link href="css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
  <!-- Custom styles -->
  <link rel="stylesheet" href="css/fullcalendar.css">
  <link href="css/widgets.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <link href="css/style-responsive.css" rel="stylesheet" />
  <link href="css/xcharts.min.css" rel=" stylesheet">
  <link href="css/jquery-ui-1.10.4.min.css" rel="stylesheet">




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

<body>
  <!-- container section start -->
  <section id="container" class="">


    <header class="header dark-bg">
      <div class="toggle-nav">
        <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
      </div>

      <!--logo start-->
      <a href="index.html" class="logo">Naresh IT  <span class="lite">Fleet Management</span></a>
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
                         
                          <h4>Naresh IT IT SOLUTIONS</h4>
                          <!--  <b class="caret"></b>
                        </a>
            <ul class="dropdown-menu extended logout">
              <div class="log-arrow-up"></div>
              <li class="eborder-top">
                <a href="http://Naresh ITsolutions.com"><i class="icon_profile"></i>about the company</a>
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
            <h3 class="page-header"><i class="fa fa-users" aria-hidden="true"></i><strong>Customer Management</h3></strong>
            <ol class="breadcrumb">
              <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
             <i class="fa fa-users" aria-hidden="true"></i>
              <li></i>Customer Management</li>
            </ol>
          </div>


<!--Customer management-->
<div class="row">
          <div class="col-lg-12">
            <div class="container">
            <section class="panel">
              <header class="panel-heading">
            <strong> List of Customer's</strong>
              <style>
              strong{
                color: black;
              }
            </style>
               <div class="text-right">
                      <div class="btn">
                     <a href="Add Customer.html" class="btn btn-primary btn-sm" >Add New Customer</a>
              </header>
              <br>
              <table class="table">
                <br>
                <tbody>
                  <tr>
                    <th><i class="icon_profile"></i> Full Name</th>
                    <th><i class="icon_mobile"></i> Mobile</th>
                    <th><i class="fa fa-envelope" aria-hidden="true"></i> Email</th>
                     <th><i class="icon_pin_alt"></i>Address</th>
                    <th><i class="icon_cogs"></i> Action</th>
                  </tr>
                  <tr class="danger" >
                    <td>ramu</td>
                    <td>9876543210</td>
                    <td>ramu@gamil.com</td>
                    <td>Hyderabad</td>
                       <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
        
                  </tr >
                   <tr class="info">
                    <td>ajith</td>
                    <td>8765432110</td>
                    <td>ajith@gamil.com</td>
                    <td>Bhimavaramu</td>
                     <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
              
                   
                  </tr>
                  <tr class="warning">
                    <td>gopal</td>
                    <td>7654321089</td>
                    <td>gopal@gamil.com</td>
                    <td>vizg</td>
                     <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
                
                   
                  </tr>
                 <tr class="success">
                    <td>ajay</td>
                    <td>6543210789</td>
                    <td>ajay@gamil.com</td>
                    <td>Eluru</td>
                     <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
                
                   
                  </tr>
                  <tr class="active">
                    <td>praven</td>
                    <td>1234567890</td>
                    <td>praven@gamil.com</td>
                    <td>tanuku</td>
                     <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
                 
                          
                   
                  </tr>
                  <tr class="danger">
                    <td>kiran</td>
                    <td>9876543210</td>
                    <td>kiran@gamil.com</td>
                    <td>delhi</td>
                     <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
             
                          
                   
                  </tr>
                   <tr class="info">
                    <td>rahul</td>
                    <td>1234567890</td>
                    <td>rahul@gamil.com@gamil.com</td>
                    <td>banglore</td>
                     <td>
                              <a class="icon" href="Add Customer.html">
                             <span class="glyphicon glyphicon-edit"></span> 
                            </a>
                          
                          </td>
          
                    </tr>
                  </div>
                </div>
                          
                          
           
                </tbody>
              </table>
            </section>
          </section>
     <!--footer-->
 <div class="text-right">
      <div class="credits">
      
         <footer class="footer white-bg">

      
          <h4>Copyright &copy; 2020, Naresh IT it solutions</h4>
          Designed by <a href="http://Naresh ITsolutions.com">Naresh IT it Solutions</a>
          
        </div>
    </div>
     
  <!-- container section end -->
  <!-- javascripts -->
  <script src="js/jquery.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <!-- nice scroll -->
  <script src="js/jquery.scrollTo.min.js"></script>
  <script src="js/jquery.nicescroll.js" type="text/javascript"></script>

  <!-- jquery ui -->
  <script src="js/jquery-ui-1.9.2.custom.min.js"></script>

  <!--custom checkbox & radio-->
  <script type="text/javascript" src="js/ga.js"></script>
  <!--custom switch-->
  <script src="js/bootstrap-switch.js"></script>
  <!--custom tagsinput-->
  <script src="js/jquery.tagsinput.js"></script>

  <!-- colorpicker -->

  <!-- bootstrap-wysiwyg -->
  <script src="js/jquery.hotkeys.js"></script>
  <script src="js/bootstrap-wysiwyg.js"></script>
  <script src="js/bootstrap-wysiwyg-custom.js"></script>
  <script src="js/moment.js"></script>
  <script src="js/bootstrap-colorpicker.js"></script>
  <script src="js/daterangepicker.js"></script>
  <script src="js/bootstrap-datepicker.js"></script>
  <!-- ck editor -->
  <script type="text/javascript" src="assets/ckeditor/ckeditor.js"></script>
  <!-- custom form component script for this page-->
  <script src="js/form-component.js"></script>
  <!-- custome script for all page -->
  <script src="js/scripts.js"></script>


</body>

</html>
