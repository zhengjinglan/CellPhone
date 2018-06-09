<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<!-- 引入easyui -->
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="easyui/invalid.js"></script>
	<script type="text/javascript">
		function submits(){
		$('#ff').form('submit',{
                onSubmit:function(){
                    return $(this).form('enableValidation').form('validate');
                }
   }); 
    
	/* 	alert(111);
    $('#form1').form({
        onSubmit:function(){
            return $(this).form('validate');
        },
        success:function(data){
            $.messager.alert(data);
            window.location="jsp/back/home.jsp";
        }
    }); */
}
	</script>
  </head>
  
  <body>
  <form id="ff" class="easyui-form" method="post">
    <input id="pwd" name="pwd" class="easyui-passwordbox" data-options="required:true" />   
	<input id="rpwd" name="rpwd" class="easyui-passwordbox"   
    required="required" validType="equals['#pwd']" />
    身份证验证：<input class="easyui-textbox" name="idcard" 
    data-options="required:true" validtype="idcard" /><br />
  <a class="easyui-linkbutton" href="javascript:void(0)" 
	onclick="submits()" data-options="iconCls:'icon-save'">提交</a> 
	</form>
  </body>
</html>
