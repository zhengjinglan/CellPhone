document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tables").datagrid({
		url:"order/query",
		columns:[[
		  {field:'orderId',title:'订单编号',width:40,checkbox:true},  
		  {field:'userId',title:'用户编号',width:40,hidden:true},  
		  {field:'userName',title:'用户姓名',width:40},  
		  {field:'fettlerId',title:'维修工编号',width:60,hidden:true},
		  {field:'fettlerName',title:'维修工姓名',width:60},
		  {field:'orderPrice',title:'订单价格',width:60},
		  {field:'payWay',title:'支付途径',width:100},
		  {field:'state',title:'当前状态',width:60},
		  {field:'predeterminedTime',title:'预订时间',width:100},
		  {field:'realBegin',title:'实际开始时间',width:60},
		  {field:'realEnd',title:'实际结束时间',width:60},
		  {field:'assignTime',title:'分配时间',width:100},
		  {field:'address',title:'地址',width:60},
		  {field:'diagnosisResult',title:'诊断结果',width:100},
		  {field:'realSolution',title:'处理方式',width:60},
		  {field:'color',title:'设备颜色',width:100},
		  {field:'forecastPrice',title:'预测价格',width:60},
		  {field:'gmtCreate',title:'创建时间',width:100},
		  {field:'gmtModified',title:'修改时间',width:100},
		  {field:'assigner',title:'修改人',width:100},
		]],
		idField:'orderId',
		fitColumns:true,
		pagination:true, //显示分页工具栏
		pageList:[10,15,20],
		pageSize:10,
		striped:true,
	});
});
$(document).ready(function(){
	//自动搜索 
	$('#fettler').combobox({
	mode:'remote' ,
	url:'fettler/queryAll' ,
	valueField:'fettlerId' ,
	textField:'empName' ,
	delay:500
	});
	
	});
function Myquery(){
	$("#tables").datagrid("load",{
		fettlerId:$("#fettler").val(),
		state:$("#status").val(),
	});
}
var url;
var data;
function queryFault(){
		var rows = $("#tables").datagrid("getSelections");
		alert(JSON.stringify(rows));
		if(rows.length == 1){
			var si = rows[0].orderId;
			alert(si);
			$('#tables').datagrid({    
			    url:'order/queryAll?id=rows.orderId',    
			    columns:[[    
			          
			    ]]    
			}); 
			$("#fault").window("open");


		}else if(rows.length > 1){
			$.messager.show({
				title:'提示',
				msg:"一次只能查看一个订单,请重新选择！"
			});
		}else{
			$.messager.show({
				title:'提示',
				msg:"请选择要查看的订单！"
			});
		}
}
$(function(){
	//数据窗口隐藏
	$("#datawindow,#fault").window("close");
	$('#brandId').combobox({
	    url:'brand/queryBrand', 
	    editable:false, //不可编辑状态
	    cache: false,
	    panelHeight: 'auto',//自动高度适合
	    valueField:'brandId',   
	    textField:'brandName',
	    
	    onSelect: function(record){
		    $("#seriesId").combobox("setValue",'');
			var brandId = $('#brandId').combobox('getValue');		
			
			$.ajax({
				type: "POST",
				url: "series/querySeries?brandId="+record.brandId,
				cache: false,
				dataType : "json",
				success: function(data){
				$("#seriesId").combobox("loadData",data);
							   }
						}); 	
					}		
		});
	$('#seriesId').combobox({ 
	    editable:false, //不可编辑状态
	    cache: false,
	    panelHeight: 'auto',//自动高度适合
	    valueField:'seriesId',   
	    textField:'seriesName',
	    onSelect: function(record){
		    $("#modelId").combobox("setValue",'');
			var seriesId = $('#seriesId').combobox('getValue');		
			
			$.ajax({
				type: "POST",
				url: "model/queryAll?seriesId="+record.seriesId,
				cache: false,
				dataType : "json",
				success: function(data){
				$("#modelId").combobox("loadData",data);
							   }
						}); 	
					}		
	   });
	$('#modelId').combobox({ 
	    editable:false, //不可编辑状态
	    cache: false,
	    panelHeight: 'auto',//自动高度适合
	    valueField:'modelId',   
	    textField:'modelName',
	    onSelect: function(record){
		    $("#faultId").combobox("setValue",'');
			var modelId = $('#modelId').combobox('getValue');		
			
			$.ajax({
				type: "POST",
				url: "fault/queryAll?modelId="+record.modelId,
				cache: false,
				dataType : "json",
				success: function(data){
				$("#faultId").combobox("loadData",data);
							   }
						}); 	
					}		
	   });
	$('#faultId').combobox({ 
	    editable:false, //不可编辑状态
	    cache: false,
	    panelHeight: 'auto',//自动高度适合
	    valueField:'faultId',   
	    textField:'faultName'
	   });
	
});

//打开新增窗口
function add(){
	$("#fm").form('reset');
	loadSelect("fettlerId","fettler/queryByState","empName","fettlerId",true);
	//loadSelect("brandId","brand/queryBrand","brandName","brandId",true);
/*	loadSelect("faultId","fault/queryAll?modelId="+$("#modelId").val(),"faultName","faultId",true);
	loadSelect("modelId","model/queryAll?seriesId="+$("#seriesId").val(),"modelName","modelId",true);
	loadSelect("seriesId","series/querySeries?brandId="+$("#brandId").val(),"seriesName","seriesId",true);*/
	$("#datawindow").window("open").window('setTitle',"添加订单");
	url = "order/add";
}

// 打开修改窗口
function edit(){
	
	//alert($("#tables").datagrid("getSelections"));
	// 判断是否有选中项
	var rows = $("#tables").datagrid("getSelections");
	alert(JSON.stringify(rows.orderId));
	if(rows.length == 1){
		//loadSelect("fettlerId","fettler/queryByState?city=","empName","fettlerId",true);
		// 重置表单
		$("#fm").form('reset');
		// 加载修改的数据信息
		$("#fm").form('load',rows[0]);				
		// 设置表单提交路径
		url = "order/update";
		// 打开窗口
		$("#datawindow").window("open").window('setTitle',"分配订单");
		
	}else if(rows.length > 1){
		$.messager.show({
			title:'提示',
			msg:"一次只能分配一个订单,请重新选择！"
		});
	}else{
		$.messager.show({
			title:'提示',
			msg:"请选择要分配的订单！"
		});
	}
}

// 提交
function submits(){
	if($("#orderId").textbox("getValue")=="自动生成"){
		$("#orderId").textbox("setValue",-1);
	}	
	alert($("#orderPrice").val());
	alert($("#operator").val());
	alert($("#fettlerId").val());
	$.post(url,{"orderId":$("#orderId").val(),"fettlerId":$("#fettlerId").val(),
		"color":$("#color").val(),"modelId":$("#modelId").val(),
		"brandId":$("#brandId").val(),"seriesId":$("#seriesId").val(),
		"faultId":$("#faultId").val(),"assignTime":$("#assignTime").val(),
		"address":$("#address").val(),"userName":$("#userName").val(),
		"payWay":$("#payWay").val(),"realBegin":$("#realBegin").val(),
	"realEnd":$("#realEnd").val(),"diagnosisResult":$("#diagnosisResult").val(),
	"realSolution":$("#realSolution").val(),"forecastPrice":$("#orderPrice").val(),
	"assigner":$("#operator").val()},function(data){
	
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