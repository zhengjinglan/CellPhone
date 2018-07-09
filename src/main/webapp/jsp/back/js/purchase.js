document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tables").datagrid({
		url:"purchase/queryPage",
		columns:[[
		  {field:'purchaseId',title:'进货编号',width:40,checkbox:true},
		  {field:'itemName',title:'耗材名称',width:60,formatter: function(value,row,index){
			  console.log(row.consumeItem);
		  	return row.consumeItem.itemName;
		  }},
		  {field:'companyName',title:'供货商',width:100,formatter: function(value,row,index){
			  console.log(row.company);
		  	return row.company.companyName;
		  }},
		  {field:'purchaseNum',title:'采购数量',width:100},
		  {field:'purchasePrice',title:'采购单价',width:100},
		  {field:'purchaseSum',title:'采购总价',width:100},
		  {field:'purchaseBuyer',title:'采购人',width:100},
		  {field:'gmtCreate',title:'创建时间',width:100},
		  {field:'gmtModified',title:'修改时间',width:100},
		  {field:'operator',title:'操作人',width:100},
		]],
		idField:'purchaseId',
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
$.fn.combobox.defaults.filter = function(q, row){  
    var opts = $(this).combobox('options');  
    return row[opts.textField].indexOf(q) >= 0;  
}  
var url;
$(function(){
	$("input",$("#purchaseNum").next("span")).blur(function(){  
		var price = $("#purchasePrice").val();
		var num = $("#purchaseNum").val();
		var res = price * num;
		$("#purchaseSum").textbox("setValue", res.toFixed(2));
	});
	$("input",$("#purchasePrice").next("span")).blur(function(){  
		var price = $("#purchasePrice").val();
		var num = $("#purchaseNum").val();
		var res = price * num;
		$("#purchaseSum").textbox("setValue", res.toFixed(2));
	});
	 
	loadSelect('itemId','consumeItem/queryAll','itemName','itemId',true);
	loadSelect('companyId','company/queryAll','companyName','companyId',false);
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
			ids.push(rows[i].purchaseId);
		}
		alert(ids);
		$.post("purchase/dels",{"ids":ids.toString()},function(data){
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
	initSelect("itemId","itemId");
	initSelect("companyId","companyId");
	url = "purchase/add";
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
		url = "purchase/update";
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
	if($("#purchaseId").textbox("getValue")=="自动生成"){
		$("#purchaseId").textbox("setValue",-1);
	}
	var stop = false;
	if(isNaN(Number($("#itemId").combobox('getValue')))){
		var name = $("#itemId").combobox('getText');
		$("#itemId").combobox('setValue','0');
		$("#newName").val(name);
		$.messager.confirm('Confirm','将会新建一个耗材，是否继续？',function(r){
			if(!r){
				stop = true;
				return ;
			}
		});
	}
	if(stop){
		alert('终止');
		return ;
	}
	$.post(url,{
		"purchaseId":$("#purchaseId").val(),
		"itemId":$("#itemId").combobox('getValue'),
		"companyId":$("#companyId").combobox('getValue'),
		"purchaseNum":$("#purchaseNum").val(),
		"purchasePrice":$("#purchasePrice").val(),
		"purchaseSum":$("#purchaseSum").val(),
		"purchaseBuyer":$("#purchaseBuyer").val(),
		"gmtCreate":$("#gmtCreate").val(),
		"gmtModified":$("#gmtModified").val(),
		"operator":$("#operator").val(),
		"newName" : $("#newName").val()
		}
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


