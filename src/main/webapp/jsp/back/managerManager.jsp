<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入easyui -->
	<%@include file="top.jsp" %>

  </head>
  
  <body>
  <table id="tables" style="width:100%;height:100%" data-options="toolbar:'#tools'"></table>
    <div id="tools">
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="add()">新增</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="edit()">修改</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="dels()">删除</a>
    </div>
    
	<div id="datawindow" class="easyui-window" style="width:100%;max-width:400px;padding:30px 40px">
		<form id="fm" method="post">
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%" readonly="readonly"
					id="uid" name="uid" data-options="label:'用户编号:'" value="自动生成"/>
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-textbox" data-options=" label:'用户名:'" style="width:100%"
					id="uname" name="uname" />
			</div>
			
			<div style="margin-bottom: 20px" id="password">
				<input class="easyui-passwordbox" data-options="label:'密码:'" style="width:100%"
					id="pwd" name="pwd" value="111"/>
			</div>
			
			<div style="margin-bottom: 20px" id="repassword">
				<input class="easyui-passwordbox" data-options="label:'确认密码:'" style="width:100%"
					id="repwd" value="111"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-combobox" data-options="label:'员工:'" style="width:100%"
					id="empId" name="empId"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-combobox" data-options="label:'角色:'" style="width:100%"
					id="rid" name="rid"/>
			</div>
			<div style="margin-bottom: 20px">
				<select class="easyui-combobox" data-options="label:'状态:'" style="width:100%"
					id="state" name="state">
					<option value="0">启用</option>
					<option value="1">禁用</option>
					</select>
			</div>
			<div style="margin-bottom: 20px">
				<input type="hidden" name="upuid" value="${logUser.uid }"/>
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
  <script type="text/javascript" src="jsp/back/js/manager.js"></script>
</html>
