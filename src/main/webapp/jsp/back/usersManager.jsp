<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'usersManager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入easyui -->
	<%@include file="top.jsp" %>
	
	<script type="text/javascript">
	
		var url;
	
		$(function(){
			//数据窗口隐藏
			$("#datawindow").window("close");
			
			$("#empid").combobox({
				url:"emp/queryAll",
				valueField:'eid', //提交
				textField:'ename'
			});
			
			$("#rid").combobox({
				url:"roles/queryAll",
				valueField:'rid', //提交
				textField:'rname' //显示文本
			});
		});
	
		
		// 删除
		function dels(){
			// 获取所有选中行
			var rows = $("#tables").datagrid("getChecked");
			
			if(rows!=""){
				var ids=[];
				for(var i=0;i<rows.length;i++){
					ids[i] = rows[i].uid;
				}
				
				$.messager.confirm('提示','确定删除选中用户么?',function(r){
					if(r){
						$.post("users/dels",{"ids":ids.toString()},function(data){
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
			url = "users/add";
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
				// 设置重复密码值等于密码
				$("#repwd").passwordbox("setValue",rows[0].pwd);
				
				// 设置表单提交路径
				url = "users/edit";
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
			if($("#uid").textbox("getValue")=="自动生成"){
				$("#uid").textbox("setValue",-1);
			}
			$("#fm").form("submit",{
				url:url,
				success:function(data){
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
    	data-options="url:'users/queryUsers',fitColumns:true,toolbar:'#tools',idField:'uid',
    	pagination:true,rownumbers:true">
    	<thead>
    		<tr>
    			<th data-options="field:'uid',width:20,checkbox:true,align:'center'">用户编号</th>
    			<th data-options="field:'uname',width:20,align:'center'">用户名</th>
    			<th data-options="field:'eid',width:40,hidden:true,align:'center'">员工编号</th>
    			<th data-options="field:'ename',width:40,align:'center'">员工姓名</th>
    			<th data-options="field:'rid',width:40,hidden:true,align:'center'">角色编号</th>
    			<th data-options="field:'rname',width:40,align:'center'">角色</th>
    			<th data-options="field:'upuid',width:40,hidden:true,align:'center'">最后修改用户编号</th>
    			<th data-options="field:'upuname',width:40,align:'center'">修改人</th>
    			<th data-options="field:'uptime',width:50,align:'center'">修改时间</th>
    		</tr>
    	</thead>
    </table>
    
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
				<input class="easyui-textbox" data-options="label:'用户名:'" style="width:100%"
					id="uname" name="uname" />
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-passwordbox" data-options="label:'密码:'" style="width:100%"
					id="pwd" name="pwd" value="111"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-passwordbox" data-options="label:'重复密码:'" style="width:100%"
					id="repwd" value="111"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-combobox" data-options="label:'员工:'" style="width:100%"
					id="empid" name="empid"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-combobox" data-options="label:'角色:'" style="width:100%"
					id="rid" name="rid"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input type="hidden" name="upuid" value="${logUser.uid }"/>
				<input class="easyui-textbox" value="${logUser.uname }" disabled="disabled"
					data-options="label:'操作人:'" style="width:100%"/>
			</div>
			
			<div style="margin-bottom: 20px">
				<input class="easyui-datebox" data-options="label:'修改时间:'"  name="uptime" style="width:100%"/>
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
