<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单管理</title>
    
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
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="allot()">订单分配</a>
    </div>
    
	<div id="datawindow" class="easyui-window" style="width:100%;max-width:400px;padding:30px 40px">
		<form id="fm" method="post">
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%" readonly="readonly"
					id="orderId" name="orderId" data-options="label:'订单编号:'" value="自动生成"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-combobox" style="width:100%"
					id="fettlerId" name="fettlerId" data-options="label:'维修工:'"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" style="width:100%" 
					id="payWay" name="payWay" data-options="label:'支付途径:'"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-datetimebox" style="width:100%"
					id="realBegin" name="realBegin" data-options="label:'实际开始时间:'"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-datetimebox" style="width:100%"
					id="realEnd" name="realEnd" data-options="label:'实际结束时间:'"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" style="width:100%"
					id="diagnosisResult" name="diagnosisResult" data-options="label:'诊断结果:'"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" style="width:100%"
					id="realSolution" name="realSolution" data-options="label:'处理方式:'"/>
			</div>	
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" style="width:100%"
					id="orderPrice" name="orderPrice" data-options="label:'订单价格:'"/>
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
		<form id="fmAllot" method="post">
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%" readonly="readonly"
					id="orderId" name="orderId" data-options="label:'订单编号:'" value="自动生成"/>
			</div>	
			
			<div style="margin-bottom: 20px;text-align: center">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="submits()">提交</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="resets()">重置</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="concel()">取消</a>
			</div>
		</form>
	</div>
  </body>
  <script type="text/javascript" src="jsp/back/js/order.js"></script>
</html>
