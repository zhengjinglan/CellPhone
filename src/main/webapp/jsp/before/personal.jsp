<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Old+Standard+TT:400,400italic' rel='stylesheet' type='text/css'>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="../jsp/before/assets/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="../jsp/before/assets/animate.css" />
<link href="../jsp/before/assets/owl-carousel/owl.carousel.css" rel="stylesheet">
<link  href="../jsp/before/assets/style.css" rel="stylesheet">


</head>

<body id="home">
 <div class="shopping-cart">
 <a href="../jsp/before/macservice.jsp">返回首页</a>
	 <table class="table table-hover text-center">
			<thead>
				<tr>
					
					<th>用户姓名</th>
					<th>故障机型</th>
					<th>故障信息</th>
					<th>价格</th>
					<th>创建时间</th>
					<th>维修状态</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${olist }" var="ofa">
				<tr>		
					<td>${ofa.user_name }</td>
					<td>${ofa.model_name }</td>
					<td>${ofa.fault_name }</td>
					<td>${ofa.fault_price }</td>
					<td>${ofa.gmt_create }</td>
					<td>${ofa.state }</td>
					<td><a href="#" onclick="return confirm('你确定要删除吗？')">评价</a></td>
				</tr>
				</c:forEach>
					</tbody>
		</table> 
	
</div>
<!-- form -->
<script src="../jsp/before/assets/jquery.js"></script>
<script src="../jsp/before/assets/owl-carousel/owl.carousel.min.js"></script>
<script src="../jsp/before/assets/bootstrap/js/bootstrap.js" type="text/javascript" ></script>
<script src="../jsp/before/assets/mobile/touchSwipe.min.js"></script>
<script src="../jsp/before/assets/respond/respond.js"></script>
<script src="../jsp/before/assets/script.js"></script> 

</body>
</html>
