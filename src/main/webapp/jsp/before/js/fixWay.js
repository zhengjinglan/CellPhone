//校验
$("#userName").change(function(){
    var username = $(this).val();
    var length = username.length;
    if(length >=2 && length <= 16){
        if(/(^(([\u4e00-\u9fa5]|[a-zA-Z0-9])+)$)/.test(username)){
            $("#nameFixTips").hide();
        }else{
            $("#nameFixTips").show();
        }
    }else{
        $("#nameFixTips").show();
    }
});

$("#telPhone").change(function(){
    var filter1 = /^0?1[3|4|5|7|8][0-9]\d{8}$/;
    if(!filter1.test($("#telPhone").val())){
        $("#telFixTips").show();
    }else{
        $("#telFixTips").hide();
    }
});

$("#street").change(function(){
    var streetname = $(this).val();
    var length = streetname.length;
    if(length >=6 && length <= 32){
        if(/(^(([\u4e00-\u9fa5]|[a-zA-Z0-9])+)$)/.test(streetname)){
            $("#streetFixTips").hide();
        }else{
            $("#streetFixTips").show();
        }
    }else{
        $("#streetFixTips").show();
    }
});

if($("#brandId").val()=="请选择"){	
	$("#seriesId").html("");
	  $("#modelId"). html("");
	  $("#faultId"). html("");
	  $("#price"). val("");
 }

//提交
$("#orderBtn").click(function() { 
	  if($("#brandId").val()=="请选择"){		 
		  alert("请选择机型");
		   return false;
	   }
	
	var length = $("#userName").val().length;
    if(length <2 || length > 16){
        $("#nameFixTips").show();
        return false;
    }

    var filter1 = /^0?1[3|4|5|7|8][0-9]\d{8}$/;
    if(!filter1.test($("#telPhone").val())){
        $("#telFixTips").show();
        return false;
    }

    var length = $("#street").val().length;
    if(length <6 || length > 32){
        $("#streetFixTips").show();
        return false;
    }
	
    var params = $("#orderfm").serialize();  
    $.ajax( {  
        type : "POST",  
        url : url,  
        data : params,  
        success : function(msg) { 
        	alert(111);
        	alert("订单提交成功");
            window.location="login.jsp";
        }
    });  
});  

