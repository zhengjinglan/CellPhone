<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>故障管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	
<!-- 引入easyui -->
	<%@include file="top.jsp" %>
	<script type="text/javascript">
		$(function(){
			$("#tables").datagrid({
				url:"user/queryUser",
				columns:[[
				  {field:'userName',title:'用户姓名',width:40},  
				  {field:'userPhone',title:'联系方式',width:60},
				]],
				idField:'faultId',
				fitColumns:true,
				pagination:true, //显示分页工具栏
				pageList:[10,15,20],
				pageSize:10,
				striped:true,
				loadFilter:function(data){// 所有数据,源数据被修改
					
					return data;
				}
			});
		});

	</script>
  </head>
  
  <body>
    <table id="tables" style="width:100%;height:100%" data-options="toolbar:'#tools'"></table>
    
    
  </body>
</html>
