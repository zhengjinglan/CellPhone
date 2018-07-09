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
	  <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <script type="text/javascript">
			$(function(){
				//$("#fm").hide();
				$("#mailNum").hide();
				$("#sb").hide();
				$("#o").show();
				
			});
			function check(){
					//$("fm").show();
					$("#mailNum").show();
					$("#sb").show();
					$("#o").hide();
				}
			function sbcheck(){
			$("#mailNum").hide();
				$("#sb").hide();8
				$.post("../mail/updateMail",{"mailNum":$("#mailNum").val(),"infoId":$("#infoId").val()},
			function(data){
					if(data==1){
					alert("确认成功");
						$("#tables").datagrid("reload");
					}else{
						$.messager.show({
							title:'提示',
							msg:"操作失败！"
						});
						
					}
				});
			}
	  </script>


</head>

<body id="home">
 <div class="shopping-cart">
 <a href="../jsp/before/macservice.jsp">返回首页</a>
	 <table class="table table-hover text-center" id="tables">
			<thead>
				<tr>
					
					<th>用户姓名</th>
					<th>故障机型</th>
					<th>故障信息</th>
					<th>价格</th>
					<th>创建时间</th>
					<th>维修状态</th>
					<th>维修方式</th>
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
					<td>
					<c:if test="${ofa.info_id != null }">
					
					<c:if test="${ofa.mail_num == null }">					
					<a href="javascrpt:void(0)" id="o" onclick="check()" >
        			请填写快递单号</a>
        			<form method="post" id="fm">
        			<input type="hidden" id="infoId" name="infoId" value="${ofa.info_id}"/>
        				<input type="number" id="mailNum" name="mailNum"/>
        				<input type="submit" value="确定" id="sb" onclick="sbcheck()" />
        			</form>
					</c:if>
					<c:if test="${ofa.mail_num != null }">	
					<a href="javascrpt:void(0) " >邮寄维修</a>
					</c:if>
					</c:if>
					
					<c:if test="${ofa.info_id == null }">
					<a href="javascrpt:void(0) " >上门维修</a>
					</c:if>
					</td>
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
