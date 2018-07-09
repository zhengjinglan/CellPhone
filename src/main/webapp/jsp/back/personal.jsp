<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<%@ include file="top.jsp" %>

  </head>
  
  <body>
    <form id="fm" action="">
    	<table>
    		<tr>
    			<td>用户编号：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.uid }"
    				id="uid" name="uid"/>
    			</td>
    		</tr>
    		<tr>
    			<td>用户名：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.uname }" 
    				id="uname" name="uname" />
    			</td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td>
    				<input class="easyui-passwordbox" value="${logUser.pwd }" 
    				id="pwd" name="pwd"/>
    			</td>
    		</tr>
    		<tr id="repwd">
    			<td>重复密码：</td>
    			<td>
    				<input class="easyui-passwordbox" value="${logUser.pwd }" />
    			</td>
    		</tr>
    		<tr>
    			<td>修改时间：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.uptime }" 
    				id="uptime" name="uptime"/>
    			</td>
    		</tr>
			<tr>
				<td>
					<a class="easyui-linkbutton" href="javascript:void(0)" id="edit" data-options="iconCls:'icon-edit'">修改</a>
					<a class="easyui-linkbutton" href="javascript:void(0)" id="submits" data-options="iconCls:'icon-save'">提交</a>
					<a class="easyui-linkbutton" href="javascript:void(0)" id="cancle" data-options="iconCls:'icon-cancel'">取消</a>
				</td>
			</tr>
    	</table>
    
    </form>
  </body>
  <script type="text/javascript" src="jsp/back/js/personal.js"></script>
</html>
