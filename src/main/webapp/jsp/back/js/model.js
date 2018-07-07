document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tables").datagrid({
		url:"model/query",
		columns:[[
		  {field:'modelId',title:'机型编号',width:40,checkbox:true},  
		  {field:'seriesId',title:'系列编号',width:40,hidden:true}, 
		  {field:'seriesName',title:'系列名称',width:40}, 
		  {field:'modelName',title:'机型名称',width:60},
		  {field:'modelPhoto',title:'机型图片',width:100,formatter:function(value, rec){//使用formatter格式化刷子
			  return '<img src='+value+'/>';
 }},
		  {field:'colors',title:'颜色',width:100},
		  {field:'modelDescription',title:'机型描述',width:40},  
		  {field:'gmtCreate',title:'创建时间',width:100},
		  {field:'gmtModified',title:'修改时间',width:100},
		  {field:'operator',title:'修改人',width:100},
		]],
		idField:'modelId',
		fitColumns:true,
		pagination:true, //显示分页工具栏
		pageList:[10,15,20],
		pageSize:10,
		striped:true,
		loadFilter:function(data){// 所有数据,源数据被修改
			//console.log(data);
			return data;
		}
	});
});
$(document).ready(function(){
	//自动搜索 
	$('#series').combobox({
	mode:'remote' ,
	url:'series/querySeries' ,
	valueField:'seriesId' ,
	textField:'seriesName' ,
	delay:500
	});
	});
function Myquery(){
	$("#tables").datagrid("load",{
		seriesId:$("#series").val(),
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
			ids[i] = rows[i].modelId;
		}
		$.post("model/dels",{"ids":ids.toString()},function(data){
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
	loadSelect("seriesId","series/querySeries","seriesName","seriesId",true);
	url = "model/add";
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
		url = "model/update";
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

/*// 提交
function submits(){
	if($("#modelId").textbox("getValue")=="自动生成"){
		$("#modelId").textbox("setValue",-1);
	}
	alert($("#modelPhoto").val());
	$.post(url,{"modelId":$("#modelId").val(),"seriesId":$("#seriesId").val(),
	"modelName":$("#modelName").val(),"photo":$("#modelPhoto").val(),
	"colors":$("#colors").val(),
	"modelDescription":$("#modelDescription").val(),"operator":$("#operator").val()}
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
	}*/
//图片上传
function submits() {
	if($("#modelId").textbox("getValue")=="自动生成"){
		$("#modelId").textbox("setValue",-1);
	}
    var formdata = new FormData($("#usercodeform")[0]);
    $.ajax({
        async: false,
        cache:false,
        url:url,
        data:formdata,
        type:'POST',
        contentType: false,
        processData: false,
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