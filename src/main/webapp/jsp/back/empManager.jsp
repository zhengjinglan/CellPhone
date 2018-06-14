<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>员工管理</title>
    
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
				url:"emp/queryPage",
				columns:[[
				  {field:'empId',title:'员工编号',width:40,checkbox:true},  
				  {field:'deptId',title:'部门编号',width:40},  
				  {field:'jobId',title:'职位',width:60},
				  {field:'empName',title:'员工名称',width:60},
				  {field:'empSex',title:'员工性别',width:100},
				  {field:'empPhone',title:'员工联系方式',width:60},
				  {field:'empAddress',title:'员工地址',width:100},
				  {field:'gmtCreate',title:'创建时间',width:100},
				  {field:'gmtModified',title:'修改时间',width:100},
				  {field:'operator',title:'修改人',width:100},
				]],
				idField:'empId',
				fitColumns:true,
				pagination:true, //显示分页工具栏
				pageList:[10,15,20],
				pageSize:10,
				striped:true,
				
			});
		});
		
		
		var url;
	
		$(function(){
			//数据窗口隐藏
			$("#datawindow").window("close");
			$("#deptId").combobox({
				url:"dept/queryPage",
				valueField:'deptId', //提交
				textField:'deptName',
			
			});
		});
		
		// 删除
		function dels(){
			// 获取所有选中行
			var rows = $("#tables").datagrid("getChecked");
			
			if(rows!=""){
			
				var ids=[];
				
				for(var i=0;i<rows.length;i++){
					ids[i] = rows[i].empId;
				}
				alert(ids);
				$.post("emp/dels",{"ids":ids.toString()},function(data){
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
			url = "emp/add";
		}
		
		// 打开设置管理员窗口
		function edit(){
			// 判断是否有选中项
			var rows = $("#tables").datagrid("getSelections");
			if(rows.length == 1){
				// 重置表单
				$("#fm").form('reset');
				// 加载修改的数据信息
				$("#fm").form('load',rows[0]);				
				// 设置表单提交路径
				url = "";
				// 打开窗口
				$("#managerwindow").window("open").window('setTitle',"设置管理员");
				
			}else if(rows.length > 1){
				$.messager.show({
					title:'提示',
					msg:"一次只能设置一个管理员,请重新选择！"
				});
			}else{
				$.messager.show({
					title:'提示',
					msg:"请选择要设置管理员的员工！"
				});
			}
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
				url = "emp/update";
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
			if($("#empId").textbox("getValue")=="自动生成"){
				$("#empId").textbox("setValue",-1);
			}	
			$.post(url,
			{"empId":$("#empId").val(),"deptId":$("#deptId").val(),
			"jobId":$("#jobId").val(),"empName":$("#empName").val(),
			"empSex":$("#empSex").val(),"empPhone":$("#empPhone").val(),
			"empAddress":$("#empAddress").val(),"operator":$("#operator").val()}
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
					id="empId" name="empId" data-options="label:'员工编号:'" value="自动生成"/>
			</div>
			<div style="margin-bottom: 20px">
				<!-- disabled：不提交 -->
				<input class="easyui-combobox" style="width:100%"
					id="deptId" name="deptId" data-options="label:'部门编号:'"/>
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-combobox" data-options="label:'职位编号:'" style="width:100%"
					id="jobId" name="jobId" />
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-textbox" data-options="label:'员工姓名:'" style="width:100%"
					id="empName" name="empName" />
			</div>
			<div style="margin-bottom: 20px"> 
				<input class="easyui-textbox" data-options="label:'员工性别:'" style="width:100%"
					id="empSex" name="empSex" />
			</div>
			
			<div style="margin-bottom: 20px"> 
				<input class="easyui-textbox" data-options="label:'员工联系方式:'" style="width:100%"
					id="empPhone" name="empPhone" />
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'地址:'" style="width:100%"
					id="empAddress" name="empAddress" />
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
