<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- 引入easyui -->
	<%@include file="top.jsp" %>

  </head>
  
  <body class="easyui-layout">
  	<div class="user-info-panel" data-options="region:'north'" style="width:100%;height:11%;background-color: #99CCFF">
  		<div class="center">
  		<h1><span style="color: white;font-family:'宋体';font-style: italic;font-size:larger;">客户</span>
  		<span style="color:'#DDDDDD';font-family:'宋体';font-style: italic;font-size:larger;">无忧</span>
  		<span style="color:'#C0C0C0';font-family:'宋体';font-style: italic;font-size:larger;">手机维修管理系统</span>
  		<span><img src="image/top1.jpg" width="30px" height="30px">	</span>
  		<span style="color:'#C0C0C0';font-family:'宋体';font-style: italic;font-size:30px;">登录人：<a href="javascript:void(0)" onclick="addTab('jsp/back/personal.jsp','个人中心')"><span style="font-size:30px">${logUser.uname }</span></a></span>
  		<span style="color:'#C0C0C0';font-family:'宋体';font-style: italic;font-size:30px;"><a href="manager/outlogin"><span style="font-size:30px">退出</span></a></span>
  		</h1>
  		</div>
  		</div>
  	</div>
  	
  	<div data-options="region:'west',title:'导航栏'" style="width:15%;">
  		<ul id="tree"></ul>
  	</div>
  	
  	<div data-options="region:'center'">
  		<div class="easyui-tabs" style="height:100%" id="tabs"></div>
  	</div>
  	<div data-options="region:'south'" style="width:100%;height:5%">
  		<center>版权所有***一组***</center>
  	</div>
  </body>
  <script type="text/javascript" src="jsp/back/js/home.js"></script>
</html>
