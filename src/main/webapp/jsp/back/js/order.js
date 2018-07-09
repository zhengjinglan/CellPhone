document
		.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function() {
	$("#tables").datagrid({
		url : "order/query",
		columns : [ [ {
			field : 'orderId',
			title : '订单编号',
			width : 40,
			checkbox : true
		}, {
			field : 'userId',
			title : '用户编号',
			width : 40,
			hidden : true
		}, {
			field : 'userName',
			title : '用户姓名',
			width : 40
		}, {
			field : 'fettlerId',
			title : '维修工编号',
			width : 60,
			hidden : true
		}, {
			field : 'fettlerName',
			title : '维修工姓名',
			width : 60
		}, {
			field : 'orderPrice',
			title : '订单价格',
			width : 60
		}, {
			field : 'payWay',
			title : '支付途径',
			width : 100
		}, {
			field : 'state',
			title : '当前状态',
			width : 60
		}, {
			field : 'predeterminedTime',
			title : '预订时间',
			width : 100
		}, {
			field : 'realBegin',
			title : '实际开始时间',
			width : 60
		}, {
			field : 'realEnd',
			title : '实际结束时间',
			width : 60
		}, {
			field : 'assignTime',
			title : '分配时间',
			width : 100
		}, {
			field : 'address',
			title : '地址',
			width : 60
		}, {
			field : 'diagnosisResult',
			title : '诊断结果',
			width : 100
		}, {
			field : 'realSolution',
			title : '处理方式',
			width : 60
		}, {
			field : 'color',
			title : '设备颜色',
			width : 100
		}, {
			field : 'forecastPrice',
			title : '预测价格',
			width : 60
		}, {
			field : 'gmtCreate',
			title : '创建时间',
			width : 100
		}, {
			field : 'gmtModified',
			title : '修改时间',
			width : 100
		}, {
			field : 'assigner',
			title : '分配人',
			width : 100
		}, ] ],
		idField : 'orderId',
		fitColumns : true,
		pagination : true, // 显示分页工具栏
		pageList : [ 10, 15, 20 ],
		pageSize : 10,
		striped : true,
	});
});

var url;
var data;

$(function() {
	// 数据窗口隐藏
	$("#datawindow").window("close");
	$("#allotWindow").window("close");
});

function orderDone(){
	// 判断是否有选中项
	var rows = $("#tables").datagrid("getSelections");
	console.log(rows[0]);
	if (rows.length == 1) {
		var fettlerId = rows[0].fettlerId;
		if(typeof(fettlerId) == "undefined"){
			$.messager.show({
				title : '提示',
				msg : "请先分配订单再完成订单！"
			});
			return ;
		}
		// 重置表单
		$("#fm").form('reset');
		// 加载修改的数据信息
		
		$("#fm").form('load', rows[0]);
		// 设置表单提交路径
		url = "order/orderDone";
		// 打开窗口
		$("#datawindow").window("open").window('setTitle', "完成订单");

	} else if (rows.length > 1) {
		$.messager.show({
			title : '提示',
			msg : "一次只能分配一个订单,请重新选择！"
		});
	} else {
		$.messager.show({
			title : '提示',
			msg : "请选择要分配的订单！"
		});
	}
	 $('#tables').datagrid('clearSelections'); 
}

// 提交
function submits() {
	$.post(url, {
		"orderId" : $("#orderId").val(),
		"fettlerId" : $("#fettlerId").val(),
		"payWay" : $("#payWay").val(),
		"realBegin" : $("#realBegin").val(),
		"realEnd" : $("#realEnd").val(),
		"diagnosisResult" : $("#diagnosisResult").val(),
		"realSolution" : $("#realSolution").val(),
		"orderPrice" : $("#orderPrice").val(),
		"operator" : $("#operator").val()
	}, function(data) {

		if (data == 1) {
			$.messager.show({
				title : '提示',
				msg : "操作成功！"
			});
			$("#datawindow").window("close");
			$("#tables").datagrid("reload");
		} else {
			$.messager.show({
				title : '提示',
				msg : "操作失败！"
			});
		}
	});
}
// 取消
function concel() {
	$("#datawindow").window("close");
}
function cancel() {
	$("#allotWindow").window("close");
}

// 重置
function resets() {
	$("#fm").form('reset');
}
function allot() {
	$.post(url, {
		"orderId" : $("#allot_orderId").val(),
		"fettlerId" : $("#allot_fettlerId").combobox("getValue"),
		"assigner" : $("#assigner").val()
	}, function(data) {
		if (data == 1) {
			$.messager.show({
				title : '提示',
				msg : "操作成功！"
			});
			$("#allotWindow").window("close");
			$("#tables").datagrid("reload");
		} else {
			$.messager.show({
				title : '提示',
				msg : "操作失败！"
			});
		}
	});
	 $('#tables').datagrid('clearSelections'); 
}
function initAllot() {
	// 判断是否有选中项
	var rows = $("#tables").datagrid("getSelections");
	if (rows.length == 1) {
		var fettlerId = rows[0].fettlerId;
		if(typeof(fettlerId) != "undefined"){
			$.messager.show({
				title : '提示',
				msg : "该订单已经分配过维修工！请勿重复分配！"
			});
			return ;
		}
		console.log(rows[0]);
		$("#allot_fettlerId").combobox(
				{
					url : "fettler/queryWithOrder?orderId=" + rows[0].orderId,
					required : true,
					editable : false,
					valueField : 'fettlerId',
					textField : 'empName',
					panelHeight : 'auto',
					formatter : function(row) {
						return '<span class="item-text">' + row.emp.empName
								+ '(工作点:' + row.workCity + ')' + '</span>';
					},
					onSelect : function(row) {
						$('#allot_fettlerId').combobox('setText',
								row.emp.empName);
					}
				});
		// 重置表单
		$("#fmAllot").form('reset');
		// 加载修改的数据信息
		$("#allot_orderId").textbox("setValue", rows[0].orderId);
		// 设置表单提交路径
		url = "order/allot";
		// 打开窗口
		$("#allotWindow").window("open").window('setTitle', "分配订单");
	} else if (rows.length > 1) {
		$.messager.show({
			title : '提示',
			msg : "一次只能分配一个订单,请重新选择！"
		});
	} else {
		$.messager.show({
			title : '提示',
			msg : "请选择要分配的订单！"
		});
	}
}