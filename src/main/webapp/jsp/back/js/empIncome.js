document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tables").datagrid({
		url:"income/queryPage",
		columns:[[
		  {field:'incomeId',title:'薪资编号',width:40,checkbox:true},  
		  {field:'incomeTypeId',title:'类型编号',width:60,hidden:true},
		  {field:'incomeTypeName',title:'类型名称',width:60},
		  {field:'empId',title:'员工编号',width:60,hidden:true},
		  {field:'empName',title:'员工姓名',width:60},
		  {field:'incomePrice',title:'薪资金额',width:60},
		  {field:'gmtCreate',title:'创建时间',width:100},
		  {field:'gmtModified',title:'修改时间',width:100},
		  {field:'operator',title:'修改人',width:100},
		]],
		idField:'incomeId',
		fitColumns:true,
		pagination:true, //显示分页工具栏
		pageList:[10,15,20],
		pageSize:10,
		striped:true,
		
	});
});

$(document).ready(function(){
	//自动搜索 
	$('#incomeType').combobox({
	url:'incomeType/queryAll',
	valueField:'incomeTypeId',
	textField:'incomeTypeName',
	delay:500
	});
	});
function Myquery(){
	$("#tables").datagrid("load",{
		incomeTypeId:$("#incomeType").val(),
		empName:$("#name").val(),
	});
}
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
			ids[i] = rows[i].incomeId;
		}
		alert(ids);
		$.post("income/dels",{"ids":ids.toString()},function(data){
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
	loadSelect("empId","emp/queryAll","empName","empId",true);
	loadSelect("incomeTypeId","incomeType/queryAll","incomeTypeName","incomeTypeId",true);
	url = "income/add";
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
		url = "income/update";
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
	if($("#incomeId").textbox("getValue")=="自动生成"){
		$("#incomeId").textbox("setValue",-1);
	}	
	
	$("#fm").form('submit',{
    	url:url,
    	onSubmit:function(){
    		return $(this).form('validate');
    	},
        success:function (data) {
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