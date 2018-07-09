document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
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
$(document).ready(function() {
	// 自动搜索
	$('#fettler').combobox({
		mode : 'remote',
		url : 'fettler/queryAll',
		valueField : 'fettlerId',
		textField : 'empName',
		delay : 500
	});

});
function Myquery() {
	$("#tables").datagrid("load", {
		fettlerId : $("#fettler").val(),
		state : $("#status").val(),
	});
}
var url;
var data;

$(function() {
	// 数据窗口隐藏
	$("#datawindow,#fault").window("close");
	$("#allotWindow").window("close");
	$("#doneWindow").window("close");
	$('#brandId').combobox({
		url : 'brand/queryBrand',
		editable : false, // 不可编辑状态
		cache : false,
		panelHeight : 'auto',// 自动高度适合
		valueField : 'brandId',
		textField : 'brandName',

		onSelect : function(record) {
			$("#seriesId").combobox("setValue", '');
			var brandId = $('#brandId').combobox('getValue');

			$.ajax({
				type : "POST",
				url : "series/querySeries?brandId=" + record.brandId,
				cache : false,
				dataType : "json",
				success : function(data) {
					$("#seriesId").combobox("loadData", data);
				}
			});
		}
	});
	$('#seriesId').combobox({
		editable : false, // 不可编辑状态
		cache : false,
		panelHeight : 'auto',// 自动高度适合
		valueField : 'seriesId',
		textField : 'seriesName',
		onSelect : function(record) {
			$("#modelId").combobox("setValue", '');
			var seriesId = $('#seriesId').combobox('getValue');

			$.ajax({
				type : "POST",
				url : "model/queryAll?seriesId=" + record.seriesId,
				cache : false,
				dataType : "json",
				success : function(data) {
					$("#modelId").combobox("loadData", data);
				}
			});
		}
	});
	var orderPrice = "";
	$('#modelId').combobox({
		editable : false, // 不可编辑状态
		cache : false,
		panelHeight : 'auto',// 自动高度适合
		valueField : 'modelId',
		textField : 'modelName',
		onSelect : function(record) {
			$("#faultId").combobox("setValue", '');
			var modelId = $('#modelId').combobox('getValue');
			$.ajax({
				type : "POST",
				url : "fault/queryAll?modelId=" + record.modelId,
				cache : false,
				dataType : "json",
				success : function(data) {
					/*
					 * console.log(data[0].faultPrice);
					 * alert(data[0].faultPrice);
					 */
					orderPrice = data[0].faultPrice;
					// alert(orderPrice);
					$("#faultId").combobox("loadData", data);
					$("#orderPrice").textbox("setValue", orderPrice);
					// alert($("#orderPrice").val());
				}
			});
		}
	});

	$('#faultId').combobox({
		editable : false, // 不可编辑状态
		cache : false,
		panelHeight : 'auto',// 自动高度适合
		valueField : 'faultId',
		textField : 'faultName',

	});

});
/*
 * 添加订单
 */
// 打开新增窗口
function add() {
	$("#fm").form('reset');
	loadSelect("fettlerId", "fettler/queryByState", "empName", "fettlerId",
			true);
	$("#datawindow").window("open").window('setTitle', "添加订单");
	url = "order/add";
	$('#tables').datagrid('clearSelections');
}


// 提交
function submits() {
	if ($("#orderId").textbox("getValue") == "自动生成") {
		$("#orderId").textbox("setValue", -1);
	}
	alert($("#orderPrice").val());
	alert($("#operator").val());
	alert($("#fettlerId").val());
	$.post(url, {
		"orderId" : $("#orderId").val(),
		"fettlerId" : $("#fettlerId").val(),
		"color" : $("#color").val(),
		"modelId" : $("#modelId").val(),
		"brandId" : $("#brandId").val(),
		"seriesId" : $("#seriesId").val(),
		"faultId" : $("#faultId").val(),
		"address" : $("#address").val(),
		"userName" : $("#userName").val(),
		"orderPrice" : $("#orderPrice").val(),
		"payWay" : $("#payWay").val(),
		"realBegin" : $("#realBegin").val(),
		"realEnd" : $("#realEnd").val(),
		"diagnosisResult" : $("#diagnosisResult").val(),
		"realSolution" : $("#realSolution").val(),
		"forecastPrice" : $("#orderPrice").val(),
		"assigner" : $("#assigner").val()
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
/*
 * 完成订单
 */
function orderDone() {
	// 判断是否有选中项
	var rows = $("#tables").datagrid("getSelections");
	if (rows.length == 1) {
		var fettlerId = rows[0].fettlerId;
		if (typeof (fettlerId) == "undefined") {
			$.messager.show({
				title : '提示',
				msg : "请先分配订单再完成订单！"
			});
			return;
		}
		// 重置表单
		$("#fmDone").form('reset');
		// 加载修改的数据信息
		$("#done_orderId").textbox("setValue", rows[0].orderId);
		$("#done_fettlerId").textbox("setValue", rows[0].fettlerId);
		// 设置表单提交路径
		url = "order/orderDone";
		// 打开窗口
		$("#doneWindow").window("open").window('setTitle', "完成订单");
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
function done() {
	$.post(url, {
		"orderId" : $("#done_orderId").val(),
		"fettlerId" : $("#done_fettlerId").val(),
		"payWay" : $("#done_payWay").val(),
		"realBegin" : $("#done_realBegin").val(),
		"realEnd" : $("#done_realEnd").val(),
		"diagnosisResult" : $("#done_diagnosisResult").val(),
		"realSolution" : $("#done_realSolution").val(),
		"orderPrice" : $("#done_orderPrice").val()
	}, function(data) {

		if (data == 1) {
			$.messager.show({
				title : '提示',
				msg : "操作成功！"
			});
			$("#doneWindow").window("close");
			$("#tables").datagrid("reload");
		} else {
			$.messager.show({
				title : '提示',
				msg : "操作失败！"
			});
		}
	});
}
/*
 * 订单分配
 */
function allot() {
	$.post(url, {
		"orderId" : $("#allot_orderId").val(),
		"fettlerId" : $("#allot_fettlerId").combobox("getValue"),
		"assigner" : $("#allot_assigner").val()
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
		if (typeof (fettlerId) != "undefined") {
			$.messager.show({
				title : '提示',
				msg : "该订单已经分配过维修工！请勿重复分配！"
			});
			return;
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
						console.log(row);
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
/*
 * 常规操作
 */
// 取消
function concel() {
	$("#datawindow").window("close");
	$("#allotWindow").window("close");
	$("#doneWindow").window("close");
}
function cancel() {
	$("#allotWindow").window("close");
	$("#datawindow").window("close");
	$("#doneWindow").window("close");
}

// 重置
function resets() {
	$("#fm").form('reset');
}
function queryFault() {
	var rows = $("#tables").datagrid("getSelections");
	if (rows.length == 1) {
		var si = rows[0].orderId;
		$('#fault').datagrid({
			url : 'order/queryAll?orderId=' + si,
			columns : [ [ {
				field : 'faultName',
				width : 30,
				title : '故障名称'
			}, {
				field : 'modelName',
				width : 30,
				title : '机型名称'
			}, {
				field : 'typeName',
				width : 30,
				title : '类型名称'
			}, ] ],
			fitColumns : true,

		});
		$("#fault").window("open");

	} else if (rows.length > 1) {
		$.messager.show({
			title : '提示',
			msg : "一次只能查看一个订单,请重新选择！"
		});
	} else {
		$.messager.show({
			title : '提示',
			msg : "请选择要查看的订单！"
		});
	}
}

