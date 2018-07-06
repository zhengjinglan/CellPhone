<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'brandManager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->	
	<!-- 引入easyui -->
	<%@include file="top.jsp" %>

  </head>
  
  <body>
  	<!-- url:访问路径,返回json, fitColumns:true列宽自动调整,th中设置width -->
    <table id="tables" class="easyui-datagrid" style="width:100%;height: 100%"
    	data-options="url:'series/query',fitColumns:true,toolbar:'#tools',idField:'seriesId',pagination:true,pageList:[10,15,20],pageSize:10,striped:true">
    	<thead>
    		<tr>
    			<th data-options="field:'seriesId',width:20,checkbox:true,align:'center'">编号</th>	
    			<th data-options="field:'seriesName',width:40,align:'center'">名称</th>
    			<th data-options="field:'brandId',width:20,align:'center',hidden:true">品牌Id</th>
    			<th data-options="field:'brandName',width:20,align:'center'">品牌名称</th>
    			<th data-options="field:'gmtCreate',width:40,align:'center'">创建时间</th>
    			<th data-options="field:'gmtModified',width:40,align:'center'">修改时间</th>
    			<th data-options="field:'operator',width:40,align:'center'">修改人</th>
    		</tr>
    	</thead>
    </table>
    
    <div id="tools">
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="add()">新增</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="edit()">修改</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="dels()">删除</a>
    	<input type="text" id="brand" size="24" maxlength="50" class="easyui-combobox" data-options="label:'品牌名称:',required:false,validType:'special'"/>
   		<a onclick="Myquery()" class="easyui-linkbutton" iconCls="icon-search">搜索</a>	
    </div>
    
	<div id="datawindow" class="easyui-window" style="width:100%;max-width:400px;padding:30px 40px">
		<form id="fm" method="post" enctype="multipart/form-data">
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%" readonly="readonly"
					id="seriesId" name="seriesId" data-options="label:'系列编号:'" value="自动生成"/>
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-combobox" data-options="label:'品牌:'" style="width:100%"
					id="brandId" name="brandId" data-options="required:true" validtype="idcard"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'产品名称:'" style="width:100%"
					id="seriesName" name="seriesName"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input type="hidden" name="uid" value="${logUser.uid }"/>
				<input class="easyui-textbox" value="${logUser.uname }" 
				name="operator" readonly="readonly" id="operator"
					data-options="label:'操作人:'" style="width:100%"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input  type="hidden" easyui-datebox" data-options="label:'创建时间时间:'" 
				name="gmtCreate" id="gmtCreate" style="width:100%"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-datebox" data-options="label:'修改时间:'" 
				name="gmtModified" id="gmtModified" style="width:100%" disabled="disabled"/>
			</div>
			
			<div style="margin-bottom: 20px;text-align: center">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="submits()">提交</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="resets()">重置</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="concel()">取消</a>
			</div>
		</form>
	</div>
  </body>
  <script type="text/javascript" src="jsp/back/js/series.js"></script>
</html>
	