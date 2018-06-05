<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- 引入easyui -->
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript">
		$(function(){
			$("#tree").tree({
				url:"lib/getTreeByRid",
				onClick:function(node){					
					// 没有子节点,打开标签页
					if(null == node.children){
						if(null != node.attributes && undefined != node.attributes.url){
							var url = node.attributes.url;
							var title = node.text;
							addTab(url,title);
						}
					}else{
						if(node.state == "closed"){
							$("#tree").tree("expand",node.target);
						}else{
							$("#tree").tree("collapse",node.target);
						}
					}
				}
			});
		});
		
		function refreshtab(tab,url){
			// 刷新选项卡
			$("#tabs").tabs("update",{
				tab:tab,// 刷新指定选项卡
				options:{
					href:url
				}
			});
		}
		
		function addTab(url,title){
			// 判断是否已经打开窗口
			var tab = $("#tabs").tabs("getTab",title);
			if(tab == null){
				// 添加选项卡
				$("#tabs").tabs('add',{
					title:title,
					content:"<iframe src="+url+" width='100%' height='100%' frameborder='0'></iframe>",
					closable:true,
					tools:[{
						iconCls:"icon-mini-refresh",
						handler:function(){
							refreshtab($("#tabs").tabs("getTab",title),url);
						}
					}]
				});
			}else{
				$("#tabs").tabs("select",title);
				// 获取ifream路径
				var url = $(tab.panel("options").content).attr("src");
				refreshtab(tab,url);
			}
		}
	</script>
  </head>
  
  <body class="easyui-layout">
  	<div data-options="region:'north',title:'导航栏'" style="width:100%;height:10%">
  		背景图
  		<a href="javascript:void(0)" onclick="addTab('jsp/back/personal.jsp','个人中心')">${logUser.uname }</a><br/>
  		<a href="#">退出</a>
  	</div>
  	<div data-options="region:'west',title:'导航栏'" style="width:15%;">
  		<ul id="tree"></ul>
  	</div>
  	
  	<div data-options="region:'center'">
  		<div class="easyui-tabs" style="height:100%" id="tabs"></div>
  	</div>
  	
  	<div data-options="region:'south'" style="width:100%;height:5%">
  		<center>版权所有GS397</center>
  	</div>
  </body>
</html>
