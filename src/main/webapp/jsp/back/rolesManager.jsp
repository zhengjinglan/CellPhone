<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>权限设置</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<%@include file="top.jsp" %>

  </head>
  
  <body>
    <table id="tables" style="width:100%;height:100%"></table>
    <div id="dl" style="width:300px;height:400px" >
    	<ul id="tt"></ul>
    </div>
    <div id="dataWindow" class="easyui-window" style="width:100%;max-width:400px;padding:30px 40px">
    	<form id="fm" method="post">
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'角色名:'" style="width:100%"
					id="rname" name="rname"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input type="hidden" name="uid" value="${logUser.uid }"/>
				<input class="easyui-textbox" value="${logUser.uname }" disabled="disabled"
					data-options="label:'操作人:'" style="width:100%"/>
			</div>
		
			<div style="margin-bottom: 20px;text-align: center">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="submits()">提交</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="resets()">重置</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="concel()">取消</a>
			</div>
		</form>
    </div>
  </body>
  <script type="text/javascript" src="jsp/back/js/roles.js"></script>
</html>
