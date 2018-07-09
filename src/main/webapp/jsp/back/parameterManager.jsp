<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'parameterManager.jsp' starting page</title>
    
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
    	data-options="url:'parameter/queryParameter',fitColumns:true,toolbar:'#tools',idField:'parameterId'
    	">
    	<thead>
    		<tr>
    			<th data-options="field:'parameterId',width:20,checkbox:true,align:'center'">编号</th>
    			<th data-options="field:'modelId',width:20,align:'center'">机型</th>
    			<th data-options="field:'os',width:40,align:'center'">操作系统</th>
    			<th data-options="field:'touchscreenType',width:40,align:'center'">触摸屏类型</th>
    			<th data-options="field:'resolvingPower',width:40,align:'center'">分辨率</th>
    			<th data-options="field:'cpuBrand',width:40,align:'center'">CPU品牌</th>
    			<th data-options="field:'cpuVersion',width:40,align:'center'">CPU型号</th>
    			<th data-options="field:'coreNum',width:40,align:'center'">核心数</th>
    			<th data-options="field:'ram',width:40,align:'center'">运行内存</th>
    			<th data-options="field:'rom',width:40,align:'center'">储存空间</th>
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
    </div>
    
	<div id="datawindow" class="easyui-window" style="width:100%;max-width:400px;padding:30px 40px">
		<form id="fm" method="post" enctype="multipart/form-data">
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%" readonly="readonly"
					id="parameterId" name="parameterId" data-options="label:'参数编号:'" value="自动生成"/>
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-combobox" data-options="label:'机型:'" style="width:100%"
					id="modelId" name="modelId" data-options="required:true" validtype="idcard"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'操作系统:'" style="width:100%"
					id="os" name="os"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'触摸屏类型:'" style="width:100%"
					id="touchscreenType" name="touchscreenType"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'分辨率:'" style="width:100%"
					id="resolvingPower" name="resolvingPower"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'CPU品牌:'" style="width:100%"
					id="cpuBrand" name="cpuBrand"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'CPU型号:'" style="width:100%"
					id="cpuVersion" name="cpuVersion"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'核心数:'" style="width:100%"
					id="coreNum" name="coreNum" validType="integ"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'运行内存:'" style="width:100%"
					id="ram" name="ram"/>
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'存储内存:'" style="width:100%"
					id="rom" name="rom"/>
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
				name="gmtModified" id="gmtModified" style="width:100%"/>
			</div>
			
			<div style="margin-bottom: 20px;text-align: center">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="submits()">提交</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="resets()">重置</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="concel()">取消</a>
			</div>
		</form>
	</div>
  </body>
  <script type="text/javascript" src="jsp/back/js/parameter.js"></script>
</html>
	