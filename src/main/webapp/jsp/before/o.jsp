<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
 <%@include file="/jsp/back/top.jsp" %>
	<script type="text/javascript">
		$().ready(function(){
			$("#province").change(
				function() {
					$.ajax( {
						type : "post",
						url : "<%=basePath %>/queryCity.do",
						data : "pid=" + $("#province").val(),
						cache : false,
						dataType : "json",
						success : function(json) {
							var str = "<option>请选择</option>";
							$("#city").html("");
							for ( var i = 0; i < json.length; i++) {
								str += "<option value='" + json[i].cid
										+ "'>" + json[i].cname
										+ "</option>";
							}
							$("#city").append(str);
							$("#town").html("");
							$("#town").append("<option>请选择</option>");
						},
						error : function() {
							alert("请与管理员联系");
						}
					});
				});
			$("#city").change(
				function() {
					var params = $("#city").val();
					$.ajax( {
						type : "post",
						url : "<%=basePath %>/queryTown.do",
						data : "cid=" + params,
						cache : false,
						dataType : "json",
						success : function(json) {
							var str = "<option>请选择</option>";
							$("#town").html("");
							for ( var i = 0; i < json.length; i++) {
								str += "<option value='" + json[i].tid
										+ "'>" + json[i].tname
										+ "</option>";
							}
							$("#town").append(str);
						},
						error : function() {
							alert("请与管理员联系");
						}
				});
			});
		})
	</script>
  </head>
  
  <body>
    <select  id="province"  list="provinceList" listKey="pid" listValue="pname" >
    <option>请选择</option></select>
    <select id="city" name="city"><option>请选择</option></select>
    <select id="town" name="town"><option>请选择</option></select>
    <select id="town" name="town"><option>请选择</option></select>
    <select id="town" name="town">
    <option>请选择</option>
    </select><!-- 颜色 -->
  </body>
</html>
