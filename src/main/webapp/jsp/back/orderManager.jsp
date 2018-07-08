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
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="edit()">订单分配</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="add()">添加订单</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="queryFault()">订单故障详情</a>
    <input type="text" id="fettler" size="24" maxlength="50" class="easyui-combobox" data-options="label:'维修工姓名:',required:false,validType:'special'"/>
    <select type="text" id="status" size="24" maxlength="100" style="width: 150px" class="easyui-combobox" data-options="label:'状态:',required:false,validType:'special'">
    	<option>---请选择---</option>
    	<option value="待处理">待处理</option>
    	<option value="处理中">处理中</option>
    	<option value="邮寄中">邮寄中</option>
    	<option value="已完成">已完成</option>
    </select>
   		<a onclick="Myquery()" class="easyui-linkbutton" iconCls="icon-search">搜索</a>	
    </div>
    
	<div id="datawindow" class="easyui-window" style="width:100%;max-width:700px;padding:30px 40px">
		<form id="fm" method="post">
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:30%" readonly="readonly"
					id="orderId" name="orderId" data-options="label:'订单编号:'" value="自动生成"/>
			<input class="easyui-textbox" style="width:30%"
					id="color" name="color" data-options="label:'颜色:'"/>
					<input class="easyui-combobox" style="width:30%"
					id="brandId" name="brandId" data-options="label:'品牌名称:'"/>
			</div>
			<div style="margin-bottom: 20px">
			<input class="easyui-combobox" style="width:30%"
					id="seriesId" name="seriesId" data-options="label:'系列名称:'"/>
					<input class="easyui-combobox" style="width:30%"
					id="modelId" name="modelId" data-options="label:'手机型号:'"/>
				<input class="easyui-combobox" style="width:30%"
					id="faultId" name="faultId" data-options="label:'故障信息:'"/>
					
			</div>	
			<div style="margin-bottom: 20px">
			<input class="easyui-textbox" style="width:30%" 
					id="orderPrice" name="orderPrice" data-options="label:'预测价格:'"/>
				<input class="easyui-textbox" style="width:30%" 
					id="payWay" name="payWay" data-options="label:'支付途径:'"/>
					<input class="easyui-datetimebox" style="width:30%"
					id="realBegin" name="realBegin" data-options="label:'实际开始时间:'"/>
			</div>	
			<div style="margin-bottom: 20px">
			<input class="easyui-textbox" style="width:30%" 
					id="userName" name="userName" data-options="label:'用户姓名:'"/>
				<input class="easyui-datetimebox" style="width:30%"
					id="realEnd" name="realEnd" data-options="label:'实际结束时间:'"/>
					<input class="easyui-textbox" style="width:30%"
					id="diagnosisResult" name="diagnosisResult" data-options="label:'诊断结果:'"/>
			</div>	
			<div style="margin-bottom: 20px">
			<input class="easyui-combobox" style="width:30%"
					id="fettlerId" name="fettlerId" data-options="label:'维修工:'"/>
				<input class="easyui-textbox" style="width:30%"
					id="realSolution" name="realSolution" data-options="label:'处理方式:'"/>
					<input class="easyui-textbox" style="width:30%"
					id="orderPrice" name="orderPrice" data-options="label:'订单价格:'"/>
			</div>	
			<div style="margin-bottom: 20px,auto;">
			<input class="easyui-textbox" style="width:30%"
					id="address" name="address" data-options="label:'地址:'"/>
					<input class="easyui-datetimebox" style="width:30%"
					id="assignTime" name="assignTime" data-options="label:'分配时间:'"/>
				<input name="operator" id="operator" class="easyui-textbox" value="${logUser.uname }" readonly="readonly"
					data-options="label:'修改人:'" style="width:50%,auto;" />
			</div>
			
			<div style="margin-bottom: 20px;text-align: center">
				<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="submits()">提交</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" onclick="resets()">重置</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="concel()">取消</a>
			</div>
		</form>
	</div>
	<div id="fault" class="easyui-window" style="width:100%;max-width:700px;padding:30px 40px">
	<table id="tables" style="width:100%;height: 100%">
    	<thead>
    		<tr>
    			<th data-options="field:'faultName',width:20,align:'center'">故障名称</th>
    			<th data-options="field:'modelName',width:40,align:'center'">机型名称</th>
    			<th data-options="field:'typeName',width:40,align:'center'">类型名称</th>
<!--     			<th data-options="field:'gmtCreate',width:40,align:'center'">创建时间</th>
    			<th data-options="field:'gmtModified',width:40,align:'center'">修改时间</th>
    			<th data-options="field:'operator',width:40,align:'center'">修改人</th> -->
    		</tr>
    	</thead>
    </table>
	</div>
  </body>
  <script type="text/javascript" src="jsp/back/js/order.js"></script>
</html>
