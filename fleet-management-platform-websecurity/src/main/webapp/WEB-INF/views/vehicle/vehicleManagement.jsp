<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Naresh IT Fleet Management">
<meta name="author" content="GeeksLabs">
<meta name="keyword" content="Naresh IT Fleet Management">
<link rel="shortcut icon" href="${requestContextPath}/img/favicon.png">

<title>Vehical Management|Naresh IT Fleet Management</title>

<!-- Bootstrap CSS -->
<link href="${requestContextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap theme -->
<link href="${requestContextPath}/css/bootstrap-theme.css"
	rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link href="${requestContextPath}/css/elegant-icons-style.css"
	rel="stylesheet" />
<link href="${requestContextPath}/css/font-awesome.min.css"
	rel="stylesheet" />
<!-- Custom styles -->
<link href="${requestContextPath}/css/style.css" rel="stylesheet">
<link href="${requestContextPath}/css/style-responsive.css"
	rel="stylesheet" />

<script
	src="http://scripts.getsourcecodes.com/vms/assets/js/common/js/jquery-3.4.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

<script
	src="http://scripts.getsourcecodes.com/vms/assets/plugins/table/jquery.dataTables.min.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/plugins/table/dataTables.bootstrap4.min.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/js/vendors/jquery.validate.min.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/plugins/datepicker/bootstrap-datepicker.js"></script>

<script
	src="http://scripts.getsourcecodes.com/vms/assets/js/vendors/selectize.min.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/plugins/charts-c3/apexcharts.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/js/require.min.js"></script>
<script>
  </script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/js/dashboard.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/plugins/charts-c3/plugin.js"></script>
<script
	src="http://scripts.getsourcecodes.com/vms/assets/plugins/input-mask/plugin.js"></script>
<script src="http://scripts.getsourcecodes.com/vms/assets/js/custom.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>



</head>

<!-- container section start -->
<section id="container" class="">


	<header class="header dark-bg">
		<div class="toggle-nav">
			<div class="icon-reorder tooltips"
				data-original-title="Toggle Navigation" data-placement="bottom">
				<i class="icon_menu"></i>
			</div>
		</div>

		<!--logo start-->
		<a href="index.html" class="logo">Naresh IT <span class="lite">Fleet
				Management</span></a>
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
			<!--     <b class="caret"></b>
                        </a>
           <ul class="dropdown-menu extended logout">
              <div class="log-arrow-up"></div>
              <li class="eborder-top">
                <a href="http://Naresh ITsolutions.com"><i class="icon_profile"></i>about the company</a>
              </li>
  
               <li>
                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>-
              </li>-->
			<style>
h4 {
	color: #fd9f08;
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
				<li class="active"><a class="" href="./dashboard"> <i
						class="icon_house_alt"></i> <span>Dashboard</span>
				</a></li>
				<!--vehicle-->
				<!--vehicle-->
				<li class="sub-menu"><a href="javascript:;" class=""> <i
						class="fa fa-car" aria-hidden="true"></i> <span>Vehicle</span> <span
						class="menu-arrow arrow_carrot-right"></span>
				</a>
					<ul class="sub">

						<li><a href="Vehicle Management.html">Vehicle Management</a></li>
						<li><a href="./vehicle/addView">Add Vehicle</a>
					</ul> <!--driver-->
				<li class="sub-menu"><a href="javascript:;" class=""> <i
						class="icon_id"></i> <span>Drivers</span> <span
						class="menu-arrow arrow_carrot-right"></span>
				</a>
					<ul class="sub">
						<li><a href="Drivers Management.html">Drivers Management</a></li>
						<li><a href="Add Driver.html">Add Driver</a>
					</ul></li>
				<!--trips-->
				<li class="sub-menu"><a href="javascript:;" class=""> <i
						class="fa fa-retweet" aria-hidden="true"></i> <span>Trips</span> <span
						class="menu-arrow arrow_carrot-right"></span>
				</a>
					<ul class="sub">

						<li><a href="Trips Management.html">Trips Management</a></li>
						<li><a href="Add Trips.html">Add Trips</a>
					</ul> <!--customers-->
				<li class="sub-menu"><a href="javascript:;" class=""> <i
						class="fa fa-users" aria-hidden="true"></i> <span>Customers</span>
						<span class="menu-arrow arrow_carrot-right"></span>
				</a>
					<ul class="sub">

						<li><a href="Customer Management.html">Customer
								Management</a></li>
						<li><a href="Add Customer.html">Add Customer</a>
					</ul> <!--fuel-->
				<li class="sub-menu"><a href="javascript:;" class=""> <i
						class="fa fa-bolt" aria-hidden="true"></i> <span>Fuel</span> <span
						class="menu-arrow arrow_carrot-right"></span>
				</a>
					<ul class="sub">
						<li><a href="Fuel Management.html">Fuel Management</a></li>
						<li><a href="Add Fuel.html">Add Fuel </a></li>
					</ul></li>
				<!--income&expenses-->
				<li class="sub-menu"><a href="javascript:;" class=""> <i
						class="fa fa-usd" aria-hidden="true"></i> <span>Inc&Exp</span> <span
						class="menu-arrow arrow_carrot-right"></span>
				</a>
					<ul class="sub">

						<li><a href=" Inc&Exp Management.html"> Inc&Exp
								Management</a></li>
						<li><a href="Add Income.html">Add Income</a>
					</ul>
				<li><a href="Tracking.html"> <i class="fa fa-map-marker"
						aria-hidden="true"></i></i><span>Tracking</span></a></li>
				<li><a href="login.html"><i class="fa fa-lock"
						aria-hidden="true"></i><span>Login Page</span></a></li>
				<li><a class="" href="contact.html"><i class="fa fa-phone"
						aria-hidden="true"></i><span>Contact Page</span></a></li>


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
					<h3 class="page-header">
						<img src="${requestContextPath}/img/car.png"></img><strong>Vehicle
							Management</strong>
					</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><img src="${requestContextPath}/img/car.png"></i>Vehicle</li>
						<li></i>Vehicle Management</li>
					</ol>
				</div>

				<!--vehicle management-->


				<div class="sm-12 col-lg-12">
					<div class="container">

						<div class="col-md-12"></div>
						<div class="col-12">
							<div class="card">
								<div class="card-header">
									<!--  <h3 class="card-title">List of Vehicle's</h3>-->
									<header class="panel-heading">
										<strong> List of Vehicle's</strong>
										<style>
strong {
	color: black;
}
</style>

										<div class="text-right">
											<div class="btn">
												<a href="${requestContextPath}/vehicle/addView" class="btn btn-primary btn-sm">Add
													New Vehicle</a>
									</header>
								</div>

							</div>
						</div>


						<table class="table">
							<thead>
								<tr class="success">
									<th class="w-1">S.No</th>
									<th>Vehicle Name</th>
									<th>Registration Number</th>
									<th>Model</th>
									<th>Chassis No</th>
									<th>Engine No</th>
									<th>Is Active</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${vbeanList}" var="vbean">
									<tr class="warning">
										<td>${vbean.v_id}</td>
										<td>${vbean.v_name}</td>
										<td>${vbean.v_registration_no}</td>
										<td>${vbean.v_model}</td>
										<td>${vbean.v_chassis_no}</td>
										<td>${vbean.v_engine_no}</td>
										<td><span class="status-icon bg-success "></span> Active
										</td>
										
										<td><a href="${requestContextPath}/vehicle/editVehicle/${vbean.v_id}"
											class="btn btn-info btn-sm"> <span
												class="glyphicon glyphicon-edit">Edit</span>
										</a> | 
										<a href="${requestContextPath}/vehicle/deleteVehicle/${vbean.v_id}"
											class="btn btn-info btn-sm"> <span
												class="glyphicon glyphicon-trash"></span>
										</a>
										</td>
									</tr>
								</c:forEach>

								<!-- <tr class="danger">
									<td>2</td>
									<td>van</td>
									<td>3232</td>
									<td>b327632</td>
									<td>7632g23</td>
									<td>832hj23</td>
									<td><span class="status-icon bg-info "></span> Active</td>
									<td><a href="Add Vehicle.html" class="btn btn-info btn-sm">
											<span class="glyphicon glyphicon-edit"></span>
									</a></td>
								</tr>
								<tr class="success">
									<td>3</td>
									<td>benz</td>
									<td>3232</td>
									<td>b327632</td>
									<td>7632g23</td>
									<td>832hj23</td>
									<td><span class="status-icon bg-danger "></span> Active</td>

									<td><a href="Add Vehicle.html" class="btn btn-info btn-sm">
											<span class="glyphicon glyphicon-edit"></span>
									</a></td>
								</tr>
								<tr class="danger">
									<td>4</td>
									<td>van</td>
									<td>3232</td>
									<td>b327632</td>
									<td>7632g23</td>
									<td>832hj23</td>
									<td><span class="status-icon bg-success "></span> Active</td>

									<td><a href="Add Vehicle.html" class="btn btn-info btn-sm">
											<span class="glyphicon glyphicon-edit"></span>
									</a></td>
								</tr> -->
							</tbody>
						</table>

						<!-- break -->
						<div class="break"></div>

						<!--main content end-->
						<div class="text-right">
							<div class="credits">

								<footer class="footer white-bg">


									<h4>Copyright &copy; 2020, Naresh IT it solutions</h4>
									Designed by <a href="http://Naresh ITsolutions.com">Naresh
										IT it Solutions</a>
							</div>
						</div>
		</section>
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
