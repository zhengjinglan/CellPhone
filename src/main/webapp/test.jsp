<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="jsp/before/js/jquery-2.2.3.min.js"></script>
	<script type="text/javascript">
	function submits(){
	var p=$("#phone").val();
	 $.post("user/checkUser",{userPhone:p},function(data){
	 alert(data);
					if(data==0){
					window.location.href="user/queryOfa?userPhone="+p;	 	             	
	 	             }else{
	 	            	alert("您还没有过订单！");           		
            			$("#loginfm").form('reset');
	 	             }
	 	       }); 
	 
	}
		            
	</script>
  </head>
  
  <body>
   <form id="loginfm" method="post">
	<div class="loginPhoneBox">
       <div class="loginPhone">
           <input id="phone" name="userPhone" type="tel" class="login-text" maxlength="11" placeholder="输入我的手机号码">
       </div>
       <span id="phoneTips" class="phoneTips">请输入正确的手机号码</span>
   </div>
   <button id="loginSubmit" type="submit" class="btn-default loginSubmit" onclick="submits()">查询订单</button>
	</form>
  </body>
</html>
>>>>>>> refs/remotes/origin/lqx
