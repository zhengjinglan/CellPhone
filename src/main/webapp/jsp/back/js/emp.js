document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tables").datagrid({
		url:"emp/query",
		columns:[[
		  {field:'empId',title:'员工编号',width:40,checkbox:true},
		  {field:'deptId',title:'部门编号',width:40,hidden:true},
		  {field:'deptName',title:'部门名称',width:40},
		  {field:'jobId',title:'职位编号',width:60,hidden:true},
		  {field:'jobName',title:'职位名称',width:60},
		  {field:'empName',title:'员工名称',width:60},
		  {field:'empSex',title:'员工性别',width:100},
		  {field:'empPhone',title:'员工联系方式',width:60},
		  {field:'state',title:'状态',width:60},
		  {field:'address',title:'员工地址',width:100},
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
		loadFilter:function(data){//所有数据,源数据被修改
			var rows = data.rows;

			for(var i=0;i<rows.length;i++){
				if(rows[i].state==0){
					rows[i].state ="在职";
				}else if(rows[i].state==1){
					rows[i].state ="离职";
				}
			}
			return data;
		}
	});
});
$(document).ready(function(){
	//自动搜索
	$('#dept').combobox({
	mode:'remote' ,
	url:'dept/queryAll' ,
	valueField:'deptId' ,
	textField:'deptName' ,
	delay:500
	});
	//自动搜索
	$('#job').combobox({
	mode:'remote' ,
	url:'job/queryAll' ,
	valueField:'jobId' ,
	textField:'jobName' ,
	delay:500
	});

	});
function Myquery(){
	$("#tables").datagrid("load",{
		deptId:$("#dept").val(),
		jobId:$("#job").val(),
		empName:$("#Name").val(),
	});
}
var url;
var data;

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
			ids[i] = rows[i].empId;
		}

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
	loadSelect("jobId","job/queryAll","jobName","jobId",true);
	loadSelect("deptId","dept/queryAll","deptName","deptId",true);
	url = "emp/add";
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
	$.post(url,{"empId":$("#empId").val(),"deptId":$("#deptId").val(),
	"jobId":$("#jobId").val(),"empName":$("#empName").val(),
	"empSex":$("input[name='empSex']").val(),"empPhone":$("#empPhone").val(),
	"empAddress":$("#empAddress").val(),"operator":$("#operator").val()},function(data){

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
