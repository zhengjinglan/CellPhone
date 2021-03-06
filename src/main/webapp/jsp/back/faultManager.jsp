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

  </head>

  <body>
    <table id="tables" style="width:100%;height:100%" data-options="toolbar:'#tools'"></table>

     <div id="tools">
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="add()">新增</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="edit()">修改</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="dels()">删除</a>
   			<input type="text" id="type"  size="24" maxlength="50" class="easyui-combobox" data-options="label:'故障类型:',required:false,validType:'special'"/>
   			<input type="text" id="model"  size="24" maxlength="50" class="easyui-combobox" data-options="label:'机型:',required:false,validType:'special'"/>
   			<a onclick="Myquery()" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
    </div>

	<div id="datawindow" class="easyui-window" style="width:100%;max-width:400px;padding:30px 40px">
		<form id="fm" method="post">
		<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%" readonly="readonly"
					id="faultId" name="faultId" data-options="label:'故障编号:'" value="自动生成"/>
			</div>
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%"
					id="typeId" name="typeId" data-options="label:'类型编号:'" required="true"/>
			</div>

			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'机型编号:'" style="width:100%"
					id="modelId" name="modelId" required="true"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'故障名称:'" style="width:100%"
					id="faultName" name="faultName" required="true" validType="remote['fault/existFaultName','faultName']"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'故障价格:'" style="width:100%"
					id="faultPrice" name="faultPrice" required="true" validType="money"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'故障描述:'" style="width:100%"
					id="faultDescription" name="faultDescription" required="true" />
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'故障预测:'" style="width:100%;datebox"
					name="predictionFault" id="predictionFault" required="true"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'预测解决方案:'" style="width:100%;datebox"
					name="predictionSolution" id="predictionSolution" required="true"/>
			</div>


			<div style="margin-bottom: 20px">
				<input name="operator" id="operator" class="easyui-textbox" value="${logUser.uname }" readonly="readonly"
					data-options="label:'修改人:'" style="width:100%"/>
			</div>

			<div style="margin-bottom: 20px;text-align: center">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="submits()">提交</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="resets()">重置</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="concel()">取消</a>
			</div>
		</form>
	</div>
  </body>
  <script type="text/javascript" src="jsp/back/js/fault.js"></script>
</html>
