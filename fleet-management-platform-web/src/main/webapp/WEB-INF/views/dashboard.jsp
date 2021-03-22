<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Razes Fleet Management">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="Razes Fleet Management">
  <link rel="shortcut icon" href="img/favicon.png">

  <title>Fleet Management Platform</title>

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
  
</head>

<body>
  <!-- container section start -->
  <section id="container" class="">


    <header class="header dark-bg">
      <div class="toggle-nav">
        <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
      </div>

      <!--logo start-->
      <a href="index.html" class="logo">Naresh IT  <span class="lite">Fleet Management Platform</span></a>
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
          <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
              
                         
                          <h4>Naresh i Technologies</h4>
                            <b class="caret"></b>
                        </a>
            <ul class="dropdown-menu extended logout">
              <div class="log-arrow-up"></div>
              <li class="eborder-top">
                <a href="http://razessolutions.com"><i class="icon_profile"></i>about the company</a>
              </li>
  
               <li>
                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
              </li>
           
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
 <a class="" href="./dashboard">
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
          
              <li><a href="./vehicle">Vehicle Management</a></li>
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
              <li><a href="./drivers">Drivers Management</a></li>
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
          
              <li><a href="./customers">Customer Management</a></li>
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
            <h3 class="page-header"><i class="fa fa-laptop"></i><strong> Dashboard</h3></strong>
            <ol class="breadcrumb">
              <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
              <li><i class="fa fa-laptop"></i>Dashboard</li>
            </ol>
          </div>
        </div>

      <!--dashboard-->
 <div class="my-3 my-md-5">
          <div class="container">
            <div class="page-header">
              <h4 class="page-title"><strong>
                Dashboard</strong>
                <style>
                  strong{
                    color: black;
                  }
                </style>
              </h4>
            </div>

        <div class="row">
           <div class="col-6 col-sm-4 col-lg-2">
            <div class="info-box blue-bg">
          <!--  <i class="material-icons">vehicle</i>-->
              <div class="count">9</div>
              <div class="title">Total vehicles</div>
            </div>
            <!--/.info-box-->
          </div>
          <!--/.col-->

           <div class="col-6 col-sm-4 col-lg-2">
            <div class="info-box brown-bg">
              <div class="count">4</div>
              <div class="title">Total Drivers</div>
            </div>
            <!--/.info-box-->
          </div>
          <!--/.col-->

           <div class="col-6 col-sm-4 col-lg-2">
            <div class="info-box dark-bg">
              <div class="count">4</div>
              <div class="title">Total Customer</div>
            </div>
            <!--/.info-box-->
          </div>
          <!--/.col-->

           <div class="col-6 col-sm-4 col-lg-2">
            <div class="info-box green-bg">
              <div class="count">0</div>
              <div class="title">Today Trips</div>
            </div>
            <!--/.info-box-->
          </div>
          <!--/.col-->
           <div class="col-6 col-sm-4 col-lg-2">
            <div class="info-box red-bg">
              <div class="count">5</div>
              <div class="title">Today Income</div>
            </div>
            <!--/.info-box-->
          </div>
          <!--/.col-->
           <div class="col-6 col-sm-4 col-lg-2">
            <div class="info-box blue-bg">
              <div class="count">0</div>
              <div class="title">Today Expenses</div>
            </div>
            <!--/.info-box-->
          </div>
          <!--/.col-->

        </div>
<!--income and expenses-->
              <div class="col-lg-12">
                <div class="card">
                  <div class="card-header">
                    <h4 class="card-title"><strong>Income and Expenses</strong><h4>
                  </div>
                  <div style="padding-left: px;" id="iechart" color="danger"></div>
 
                </div>
           
              </div>
              <br><br>


          
           <!--vehicle current location-->
             <div class="col-lg-12">
          <div class="container">

            <div class="col-md-12">
                                 </div>       
           <div class="col-12">
                <div class="card">
                  <div class="card-header">
                  <!--  <h3 class="card-title">List of Vehicle's</h3>-->
                   <header class="panel-heading">
            <h4><strong>  Vehical Current Location</strong></h4>

                    
                      </header>
                    
                     </div>
                   </div>

          
                   <table class="table">
                  <thead>
                <tr class="success">
               <th class="w-1">S.No</th>
                           <th>Vehicle Name</th>
                          <th>Registration Number</th>
                          <th>Model</th>
                          <th>Driver Name</th>
                          <th> Vehicle Current Location</th>
                         
                        
                          </tr>
     </thead>
 <tbody>
 <tr class="warning">
 <td> 1</td>
 <td> van</td>
 <td> 5232</td>
 <td>b5467</td>
 <td>manohar</td>
 <td>Eluru</td>

                           
 
 </tr>  
 <tr class="danger">
 <td> 2</td>
 <td> minivan</td>
 <td> 3232</td>
 <td> bc327632</td>
 <td>manoj</td>
 <td>Hyderabad</td>
 

 </tr>    
 <tr class="success">
 <td> 3</td>
 <td> benz</td>
 <td> 7832</td>
 <td> c3279</td>
 <td>Sunil</td>
 <td>Vizag</td>
 
 </tr>  
 <tr class="danger">
 <td> 4</td>
 <td> Temo Traveller</td>
 <td> 3232</td>
 <td> bZ3272</td>
 <td>anil</td>
 <td>Bhimavaram</td>
 
 </tr>       
 </tbody>
</table>



<!--drivers management-->
 <!--vehicle Running status-->
      <div class="row">

          <div class="col-sm-12 col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4><strong>Vehicle Running Status</strong></h4>
                <div class="panel-actions">
                  <a href="index.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
                  <a href="index.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
                  <a href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
                </div>

          
                  <table class="table card-table">
                                       <tr>
                      <td>TCM123_Benz</td>
                      <td class="text-right">
                        <td>
                      <span class="badge bg-success">In Trip</span>
                    </td>
                       
                      </td>
                    </tr>
                                        <tr>
                      <td>QWE321_FastLane</td>
                      <td class="text-right">
                        <td>
                        <span class="badge bg-primary">In Trip</span>
                      </td>
                      </td>
                    </tr>
                                        <tr>
                      <td>ABC123_Xylo</td>
                      <td class="text-right">
                        <td>
                        <span class="badge bg-danger">In Trip</span>
                      </td>
                      </td>
                    </tr>
                                        <tr>
                      <td>XYZ123_Mini Van</td>
                      <td class="text-right">
                        <td>
                        <span class="badge bg-dark">Idle</span>
                        <td>
                      </td>
                    </tr>
                                        <tr>
                      <td>ZXC123_Tempo Traveller</td>
                      <td class="text-right">
                        <td>
                        <span class="badge bg-danger">Idle</span>
                      </td>
                      </td>
                    </tr>
                                        <tr>
                      <td>QWE123_Volvo</td>
                      <td class="text-right">
                        <td>
                        <span class="badge bg-success">Idle</span>
                      </td>
                      </td>
                    </tr>
                                      </table>
                </div>
            
                </div>
              </div>
              
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--drivers management-->

<script type='text/javascript'>
     
        var options = {
            chart: {
                height: 350,
                type: 'line',
                shadow: {
                    enabled: true,
                    color: '#6B8E23',
                    top: 18,
                    left: 7,
                    blur: 10,
                    opacity: 1
                },
                toolbar: {
                    show: false
                }
            },
            colors: ['red', 'green'],
            dataLabels: {
                enabled: true,
            },
            stroke: {
                curve: 'smooth'
            },
            series: [{
                    name: 'Income',
                    data: ['0', '0', '1500', '0', '1234', '0', '0', '700', '0', '0', '1200', '0', '0', '0', '0', '0', '0', '0', '1000', '0', '0', '500', '0', '0', '0', '1000', '0', '800', '0', '0']
                },
                {
                    name: 'Expense',
                    data: ['0', '0', '0', '0', '917', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0']
                }
            ],
            title: {
                text: '',
                align: 'left'
            },
            grid: {
                borderColor: '#e7e7e7',
                row: {
                    colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                    opacity: 0.5
                },
            },
            markers: {
                
                size: 6
            },
            xaxis: {
                categories: ['2020-03-30', '2020-03-31', '2020-04-01', '2020-04-02', '2020-04-03', '2020-04-04', '2020-04-05', '2020-04-06', '2020-04-07', '2020-04-08', '2020-04-09', '2020-04-10', '2020-04-11', '2020-04-12', '2020-04-13', '2020-04-14', '2020-04-15', '2020-04-16', '2020-04-17', '2020-04-18', '2020-04-19', '2020-04-20', '2020-04-21', '2020-04-22', '2020-04-23', '2020-04-24', '2020-04-25', '2020-04-26', '2020-04-27', '2020-04-28'],
                title: {
                    text: 'Date'
                }
            },
            yaxis: {
                title: {
                    text: 'Amount'
                },
              
            },
            legend: {
                position: 'top',
                horizontalAlign: 'right',
                floating: true,
                offsetY: -25,
                offsetX: -5
            }
        }

        var chart = new ApexCharts(
            document.querySelector('#iechart'),
            options
        );

        chart.render();
  </script>   


        
<!--foter-->

 <!-- break -->
<div class="break"></div>

    <!--footer end-->
    <div class="text-right">
      <div class="credits">
      
         <footer class="footer white-bg">

      
          <h4>Copyright &copy; 2020, Razes it solutions</h4>
          Designed by <a href="http://razessolutions.com">Razes it Solutions</a>
          
        </div>
    </div>

  <!-- javascripts -->
  <script src="js/jquery.js"></script>
  <script src="js/jquery-ui-1.10.4.min.js"></script>
  <script src="js/jquery-1.8.3.min.js"></script>
  <script type="text/javascript" src="js/jquery-ui-1.9.2.custom.min.js"></script>
  <!-- bootstrap -->
  <script src="js/bootstrap.min.js"></script>
  <!-- nice scroll -->
  <script src="js/jquery.scrollTo.min.js"></script>
  <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
 <!-- charts scripts -->
  <script src="assets/jquery-knob/js/jquery.knob.js"></script>
  <script src="js/jquery.sparkline.js" type="text/javascript"></script>
  <script src="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
  <script src="js/owl.carousel.js"></script>
  <!-- jQuery full calendar -->
  <script src="js/fullcalendar.min.js"></script>
   <!--  Full Google Calendar - Calendar--> 
    <script src="assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
  <!--  script for this page only-->
    <script src="js/calendar-custom.js"></script>
    <script src="js/jquery.rateit.min.js"></script>
    <!--custom select--> 
    <script src="js/jquery.customSelect.min.js"></script>
    <script src="assets/chart-master/Chart.js"></script>

   <!-- custome script for all page-->
    <script src="js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="js/sparkline-chart.js"></script>
    <script src="js/easy-pie-chart.js"></script>
    <script src="js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="js/jquery-jvectormap-world-mill-en.js"></script>
    <script src="js/xcharts.min.js"></script>
    <script src="js/jquery.autosize.min.js"></script>
    <script src="js/jquery.placeholder.min.js"></script>
    <script src="js/gdp-data.js"></script>
    <script src="js/morris.min.js"></script>
    <script src="js/sparklines.js"></script>
    <script src="js/charts.js"></script>
    <script src="js/jquery.slimscroll.min.js"></script>
    <script>

</script>
</body>
</html>