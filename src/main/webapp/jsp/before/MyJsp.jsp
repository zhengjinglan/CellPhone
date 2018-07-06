<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript" src="jsp/before/js/jquery-2.2.3.min.js"></script>
  <script type="text/javascript">
  $(document).ready(function(){
  $.ajax({
  url: 'brand/queryBrand' ,
  success: function(data){
  if( !data)return;
  var html= "";
  for(var e in data){
  html += '<option value=' +data[e]. brandId+' >'+data[e]. brandName+' </option>';
 }
 $("#brandId").append(html);
 //通过change方法调用
  $("#brandId"). change(function(){
  $("#seriesId").html("");
  $("#modelId"). html("");
  $("#faultId"). html("");
  getSeries($(this).val());
  });
  }
  });
  
    //根据品牌获取系列
  function getSeries(id){
  $.ajax({
  url:'series/querySeries',
  data: {brandId:id},//传入的id
  success: function(data){
  if(! data)return;
  var html='';
  for(var i in data){
  html +='<option value='+data[i].seriesId+'>' +data[i]. seriesName+' </option>';
  }
  $("#seriesId").append(html);
  //通辻change方法去調用
  $("#seriesId"). change(function(){
  $("#modelId") . html("");
  $("#faultId"). html(""); 
  getModel($(this) .val());
  });
  $("#seriesId").get(0). selectedIndex=0;
 	getModel($("#seriesId").val());	
  }
  });
  }
  
  //根据系列选择机型
  function getModel(id){
  	$.ajax({
  		url:'model/queryAll',
  		data:{seriesId:id},
  		success:function(data){
			if(! data)return;
  			var html='';
  			for(var i in data){
  			html +='<option value='+data[i].modelId+'>' +data[i]. modelName+' </option>';
  			} 
  			 $("#modelId").append(html);
  			  $("#modelId"). change(function(){
              $("#faultId"). html(""); 
              getFault($(this) .val());
  });
  			$("#modelId").get(0). selectedIndex=0;
 			getFault($("#modelId").val());	  			
  		}
  	});  
  }
  
  function getFault(id){
  	$.ajax({
  		url:'fault/queryAll',
  		data:{modelId:id},
  		success:function(data){
			if(! data)return;
  			var html='';
  			var price='';
  			for(var i in data){
  			html +='<option value='+data[i].faultId+'>' +data[i]. faultName+' </option>';
  			price +='<div value='+data[i].faultId+'>'+data[i]. faultPrice+' </div>';
  			
  			} 
  			$("#price").html("");
  			 $("#faultId").append(html);
  			 $("#price").append(price);
  			
  		}
  	});  
  }
  
  
  
 });
</script>
  
  <body>
		<select id="brandId">  
		<option value="">请选择</option>                            
		</select>
		
		<select id="seriesId">                              
		</select> 
		
		 <select id="modelId">                               
		</select>
		
		 <select id="faultId">                               
		</select>  
		<div id="price"></div>
		
  </body>
</html>
