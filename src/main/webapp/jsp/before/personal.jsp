<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>订单详情</title>

<!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Old+Standard+TT:400,400italic' rel='stylesheet' type='text/css'>


<!-- font awesome -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<!-- bootstrap -->
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />


<!-- animate.css -->
<link rel="stylesheet" href="assets/animate.css" />



<!-- Owl Carousel Assets -->
<link href="assets/owl-carousel/owl.carousel.css" rel="stylesheet">

<link  href="assets/style.css" rel="stylesheet">

<!-- favicon -->
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
<link rel="icon" href="images/favicon.png" type="image/x-icon">


</head>

<body id="home">






<div class="header">
<nav class="navbar  navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
   
    </div>

   


<div class="container">

<!-- checkout -->
<div class="content inside-page checkout">
		

<div class="shopping-cart">
	<!-- fieldsets -->

			
			<div class="row product-list title hidden-xs">
            	<div class="col-xs-8">订单详情</div>
            	<div class="col-xs-2 center price">Price</div>
            	<div class="col-xs-1">Qty</div>
            	<div class="col-xs-1 center">Action</div>
          	</div>
            <hr>
			<div class="row product-list">
            	<div class="col-xs-3 col-sm-2"><a href="product.html"><img src="images/photos/1.jpg" class="img-responsive"  alt="product"></a></div>
            	<div class="col-xs-9 col-sm-6 title"><a href="product.html">White V-neck Tshirt</a></div>
            	<div class="col-xs-4 col-sm-2 center price">$1000.00</div>
            	<div class="col-xs-3 col-sm-1"><input class="form-control"></div>
            	<div class="col-xs-2 col-sm-1 center"><a href="#"><i class="fa fa-close"></i></a></div>
          	</div>

          	<div class="row product-list">
            	<div class="col-xs-3 col-sm-2"><a href="product.html"><img src="images/photos/2.jpg" class="img-responsive" alt="product"></a></div>
            	<div class="col-xs-9 col-sm-6 title"><a href="product.html">White V-neck Tshirt</a></div>
            	<div class="col-xs-4 col-sm-2 center price">$1000.00</div>
            	<div class="col-xs-3 col-sm-1"><input class="form-control"></div>
            	<div class="col-xs-2 col-sm-1 center"><a href="#"><i class="fa fa-close"></i></a></div>
          	</div>

          	

          	<div class="row product-list grandtotal">
            	<div class="col-xs-8">Total</div>
            	<div class="col-xs-2 center price">$3000.00</div>            	
          	</div>


</div>
<hr>
	
</div>
<!-- form -->



<script src="assets/jquery.js"></script>



<!-- owlcarousel -->
<script src="assets/owl-carousel/owl.carousel.min.js"></script>

<!-- boostrap -->
<script src="assets/bootstrap/js/bootstrap.js" type="text/javascript" ></script>

<!-- jquery mobile -->
<script src="assets/mobile/touchSwipe.min.js"></script>
<script src="assets/respond/respond.js"></script>





<!-- custom script -->
<script src="assets/script.js"></script>

</body>
</html>
