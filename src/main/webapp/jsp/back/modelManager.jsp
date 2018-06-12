<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>机型管理</title>
    
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
				url:"model/queryPage",
				columns:[[
				  {field:'modelId',title:'机型编号',width:40,checkbox:true},  
				  {field:'seriesId',title:'系列编号',width:40},  
				  {field:'modelName',title:'机型名称',width:60},
				  {field:'modelPhoto',title:'机型图片',width:100},
				  {field:'colors',title:'颜色',width:100},
				  {field:'modelDescription',title:'机型描述',width:40},  
				  {field:'gmtCreate',title:'创建时间',width:100},
				  {field:'gmtModified',title:'修改时间',width:100},
				  {field:'operator',title:'修改人',width:100},
				]],
				idField:'modelId',
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
		
		
		var url;
	
		$(function(){
			//数据窗口隐藏
			$("#datawindow").window("close");
		});
		
		// 删除
		function dels(){
			// 获取所有选中行
			var rows = $("#tables").datagrid("getChecked");
			
			if(rows!=""){
				var ids=[];
				for(var i=0;i<rows.length;i++){
					ids[i] = rows[i].modelId;
				}
				$.post("model/dels",{"ids":ids.toString()},function(data){
					if(data==0){
						$.messager.show({
							title:'提示',
							msg:"删除成功！"
						});
						$("#tables").datagrid("reload");	
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
			url = "model/add";
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
				url = "model/update";
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
			if($("#modelId").textbox("getValue")=="自动生成"){
				$("#modelId").textbox("setValue",-1);
			}	
			$.post(url,{"modelId":$("#modelId").val(),"seriesId":$("#seriesId").val(),
			"modelName":$("#modelName").val(),"modelPhoto":$("#modelPhoto").val(),
			"colors":$("#colors").val(),
			"modelDescription":$("#modelDescription").val(),"operator":$("#operator").val()}
				,function(data){
				
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
					id="modelId" name="modelId" data-options="label:'机型编号:'" value="自动生成"/>
			</div>
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-textbox" style="width:100%"
					id="seriesId" name="seriesId" data-options="label:'系列编号:'"/>
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-textbox" data-options="label:'机型名称:'" style="width:100%"
					id="modelName" name="modelName" />
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'机型图片:'" style="width:100%"
					id="modelPhoto" name="modelPhoto" />
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'颜色:'" style="width:100%"
					id="colors" name="colors" />
			</div>
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'机型描述:'" style="width:100%"
					id="modelDescription" name="modelDescription" />
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
</html>
