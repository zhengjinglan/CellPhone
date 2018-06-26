document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tables").datagrid({
		url:"fettler/queryPage",
		columns:[[
		  {field:'fettlerId',title:'维修工编号',width:40,checkbox:true},  
		  {field:'empId',title:'员工编号',width:60},
		  {field:'fettlerPhone',title:'维修工电话',width:100},
		  {field:'workCity',title:'所在城市',width:100},
		  {field:'state',title:'当前状态',width:100},
		  {field:'gmtCreate',title:'创建时间',width:100},
		  {field:'gmtModified',title:'修改时间',width:100},
		  {field:'operator',title:'修改人',width:100},
		]],
		idField:'fettlerId',
		fitColumns:true,
		pagination:true, //显示分页工具栏
		pageList:[10,15,20],
		pageSize:10,
		striped:true,
		loadFilter:function(data){// 所有数据,源数据被修改
			var rows = data.rows;
			for(var i=0;i<rows.length;i++){
				if(rows[i].state==0){
					rows[i].state ="维修中";
				}else if(rows[i].state==1){
					rows[i].state ="休息中";
				}
			}
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
			ids[i] = rows[i].fettlerId;
		}
		alert(ids);
		$.post("fettler/dels",{"ids":ids.toString()},function(data){
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
	url = "fettler/add";
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
		url = "fettler/update";
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
	if($("#fettlerId").textbox("getValue")=="自动生成"){
		$("#fettlerId").textbox("setValue",-1);
	}	
	$.post(url,
	{"fettlerId":$("#fettlerId").val(),"empId":$("#empId").val(),
	"fettlerPhone":$("#fettlerPhone").val(),"workCity":$("#workCity").val(),
	"state":$("#state").val(),"operator":$("#operator").val()}
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