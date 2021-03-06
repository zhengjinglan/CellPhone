document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
			$("#tables").datagrid({
				url:"fault/query",
				columns:[[ 
				  {field:'faultId',title:'故障编号',width:40,checkbox:true},  
				  {field:'typeId',title:'类型编号',width:40,hidden:true},
				  {field:'typeName',title:'类型名称',width:50},
				  {field:'modelId',title:'机型编号',width:60,hidden:true},
				  {field:'modelName',title:'机型名称',width:50},
				  {field:'faultPrice',title:'故障价格',width:100},
				  {field:'faultName',title:'故障名称',width:100},
				  {field:'faultDescription',title:'故障描述',width:40},  
				  {field:'predictionFault',title:'故障预测',width:40},  
				  {field:'predictionSolution',title:'预测解决方案',width:60},
				  {field:'gmtCreate',title:'创建时间',width:100},
				  {field:'gmtModified',title:'修改时间',width:100},
				  {field:'operator',title:'修改人',width:100},
				]],
				idField:'faultId',
				fitColumns:true,
				pagination:true, //显示分页工具栏
				pageList:[10,15,20],
				pageSize:10,
				striped:true,
				order:"desc",
				loadFilter:function(data){// 所有数据,源数据被修改
					console.log(data);
					return data;
				}
			});
		});
$(document).ready(function(){
	//自动搜索 
	$('#type').combobox({
	mode:'remote' ,
	url:'faultType/queryAll' ,
	valueField:'typeId' ,
	textField:'typeName' ,
	delay:500
	});
	//自动搜索 
	$('#model').combobox({
	mode:'remote' ,
	url:'model/queryAll' ,
	valueField:'modelId' ,
	textField:'modelName' ,
	delay:500
	});

	});
function Myquery(){
	$("#tables").datagrid("load",{
		typeId:$("#type").val(),
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
					ids[i] = rows[i].faultId;
				}
				$.post("fault/dels",{"ids":ids.toString()},function(data){
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
			url = "fault/add";
			loadSelect("typeId","faultType/queryAll","typeName","typeId",true);
			loadSelect("modelId","model/queryAll","modelName","modelId",true);
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
				url = "fault/update";
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
			if($("#faultId").textbox("getValue")=="自动生成"){
				$("#faultId").textbox("setValue",-1);
			}	
			$.post(url,{"faultId":$("#faultId").val(),"typeId":$("#typeId").val(),
			"modelId":$("#modelId").val(),"faultPrice":$("#faultPrice").val(),
			"faultName":$("#faultName").val(),
			"faultDescription":$("#faultDescription").val(),"predictionFault":$("#predictionFault").val(),
			"predictionSolution":$("#predictionSolution").val(),
			"operator":$("#operator").val()}
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
		
		