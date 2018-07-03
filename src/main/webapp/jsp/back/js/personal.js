document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#submits,#repwd,#cancle").hide();
	$("#uid").textbox("disable");
	$("#uname").textbox("disable");
	$("#pwd").textbox("disable");
	$("#uptime").textbox("disable");
	
	
	$("#edit").click(function(){
		$("#submits,#repwd,#cancle").show();
		$("#edit").hide();
	$("#uname").textbox("enable");
	$("#pwd").textbox("enable");		
	});
	//修改提交
	$("#submits").click(function(){
	$.post("manager/edit",{"uid":$("#uid").val(),
	"uname":$("#uname").val(),"pwd":$("#pwd").val()},
	function(data){
	if(data ==1){
		window.open('jsp/back/login.jsp');//重新打开一个页面
		
	}
		});
	});
	
	$("#cancle").click(function(){
		$("#submits,#repwd,#cancle").hide();
		$("#edit").show();
		// 重新加载
		$.post("manager/getLogUsers",function(data){
			$("#fm").form('load',data);
		});
	});
	
});
