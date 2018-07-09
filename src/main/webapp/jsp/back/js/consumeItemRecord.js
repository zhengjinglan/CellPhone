//document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
function loadTab() {
	$("#tables").datagrid({
		url : "record/queryPage",
		columns : [ [ {
			field : 'recordId',
			title : '记录编号',
			width : 40,
			checkbox : true
		}, {
			field : 'orderId',
			title : '订单编号',
			width : 100
		}, {
			field : 'itemName',
			title : '耗材名称',
			width : 60,
			formatter : function(value, row, index) {
				return row.consumeItem.itemName;
			}
		}, {
			field : 'useNum',
			title : '使用数量',
			width : 100
		}, {
			field : 'gmtCreate',
			title : '使用时间',
			width : 100
		}, {
			field : 'gmtModified',
			title : '修改时间',
			width : 100
		}, ] ],
		idField : 'recordId',
		fitColumns : true,
		pagination : true, // 显示分页工具栏
		pageList : [ 10, 15, 20 ],
		pageSize : 10,
		striped : true,
		loadFilter : function(data) {// 所有数据,源数据被修改
			return data;
		}
	});
}
$(function() {
	loadTab();
});

var url;

$(function() {
	// 数据窗口隐藏
	$("#datawindow").window("close");
});

//function dels() {
//	var rows = $("#tables").datagrid("getChecked");
//	if (rows != "") {
//		var ids = [];
//		for (var i = 0; i < rows.length; i++) {
//			ids.push(rows[i].itemId);
//		}
//		alert(ids);
//		$.post("consumeItem/dels", {
//			"ids" : ids.toString()
//		}, function(data) {
//			if (data == 0) {
//				$.messager.show({
//					title : '提示',
//					msg : "删除成功！"
//				});
//				$("#tables").datagrid("reload");
//			}
//		});
//	} else {
//		$.messager.alert('提示', '请选择要删除的数据');
//	}
//}

//function add() {
//	$("#fm").form('reset');
//	$("#datawindow").window("open").window('setTitle', "新增");
//	initSelect('cc', 'typeId');
//	url = "consumeItem/add";
//}

//function edit() {
//	var rows = $("#tables").datagrid("getSelections");
//	if (rows.length == 1) {
//		$("#fm").form('reset');
//		$("#fm").form('load', rows[0]);
//		url = "consumeItem/update";
//		$("#datawindow").window("open").window('setTitle', "修改");
//	} else if (rows.length > 1) {
//		$.messager.show({
//			title : '提示',
//			msg : "一次只能修改一条数据,请重新选择！"
//		});
//	} else {
//		$.messager.show({
//			title : '提示',
//			msg : "请选择修改的数据！"
//		});
//	}
//}

//function submits() {
//	if ($("#itemId").textbox("getValue") == "自动生成") {
//		$("#itemId").textbox("setValue", -1);
//	}
//	var typeId = ($("#cc").combobox('getValue'));
//	$.post(url, {
//		"itemId" : $("#itemId").val(),
//		"typeId" : typeId,
//		"itemName" : $("#itemName").val(),
//		"itemNum" : $("#itemNum").val(),
//		"gmtCreate" : $("#gmtCreate").val(),
//		"gmtModified" : $("#gmtModified").val(),
//		"operator" : $("#operator").val()
//	}, function(data) {
//		console.log(url);
//		console.log(data);
//		if (data == 1) {
//			$.messager.show({
//				title : '提示',
//				msg : "操作成功！"
//			});
//			$("#datawindow").window("close");
//			$("#tables").datagrid("reload");
//		} else {
//			$.messager.show({
//				title : '提示',
//				msg : "操作失败！"
//			});
//		}
//	});
//}

// 取消
function concel() {
	$("#datawindow").window("close");
}

// 重置
function resets() {
	$("#fm").form('reset');
}
