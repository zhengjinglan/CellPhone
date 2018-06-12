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
	
	<script type="text/javascript">
	
		var url;
	
		$(function(){
			//数据窗口隐藏
			$("#datawindow").window("close");
			
			$("#brandId").combobox({
				url:"brand/queryBrand",
				valueField:'brandId', //提交
				textField:'brandName'
			});
			
		});
	
		
		// 删除
		function dels(){
			// 获取所有选中行
			var rows = $("#tables").datagrid("getChecked");
			
			if(rows!=""){
				var ids=[];
				for(var i=0;i<rows.length;i++){
					ids[i] = rows[i].seriesId;
				}
				
				$.messager.confirm('提示','确定删除选中品牌么?',function(r){
					if(r){
						$.post("series/del",{"ids":ids.toString()},function(data){
							if(data==0){
								$.messager.show({
									title:'提示',
									msg:"删除成功！"
								});
								$("#tables").datagrid("reload");	
							}
						});
					}
				});
				
			}else{
				$.messager.alert('提示','请选择要删除的数据');
			}
		}
		
		// 打开新增窗口
		function add(){
			$("#fm").form('reset');
			$("#datawindow").window("open").window('setTitle',"新增");
			url = "series/add";
		}
		
		// 打开修改窗口
		function edit(){
			// 判断是否有选中项
			var rows = $("#tables").datagrid("getSelections");
			if(rows.length == 1){
				// 重置表单
				$("#fm").form('reset');
				// 加载修改的数据信息
				$("#fm").form('load',rows[0]);
				
				// 设置表单提交路径
				url = "series/update";
				// 打开窗口
				$("#datawindow").window("open").window('setTitle',"修改");
				
			}else if(rows.length > 1){
				$.messager.show({
					title:'提示',
					msg:"一次只能修改一条数据,请重新选择！"
				});
			}else{
				$.messager.show({
					title:'提示',
					msg:"请选择修改的数据！"
				});
			}
		}
		
		
		// 提交
		function submits(){
			if($("#seriesId").textbox("getValue")=="自动生成"){
				$("#seriesId").textbox("setValue",-1);
			}
			$.post(url,{"seriesId":$("#seriesId").val(),"brandId":$("#brandId").val(),
			"seriesName":$("#seriesName").val(),
			"operator":$("#operator").val()/* ,"gmtModified":$("#gmtModified").val()
			,"gmtCreate":$("#gmtCreate").val() */},
			function(data){
					if(data==1){
						$.messager.show({
							title:'提示',
							msg:"操作成功！"
						});
						$("#datawindow").window("close");
						$("#tables").datagrid("reload");
					}else{
						$.messager.show({
							title:'提示',
							msg:"操作失败！"
						});
						
					}
				});
		}
		
		// 取消
		function concel(){
			$("#datawindow").window("close");
		}
		
		// 重置
		function resets(){
			$("#fm").form('reset');
		}
		
	</script>
  </head>
  
  <body>
  	<!-- url:访问路径,返回json, fitColumns:true列宽自动调整,th中设置width -->
    <table id="tables" class="easyui-datagrid" style="width:100%;height: 100%"
    	data-options="url:'series/querySeries',fitColumns:true,toolbar:'#tools',idField:'seriesId'
    	">
    	<thead>
    		<tr>
    			<th data-options="field:'seriesId',width:20,checkbox:true,align:'center'">编号</th>	
    			<th data-options="field:'seriesName',width:40,align:'center'">名称</th>
    			<th data-options="field:'brandId',width:20,align:'center'">品牌</th>
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
					id="seriesId" name="seriesId" data-options="label:'品牌编号:'" value="自动生成"/>
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
</html>
	