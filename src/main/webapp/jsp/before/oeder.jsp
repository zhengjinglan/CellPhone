<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'oeder.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 引入easyui -->
	<%@include file="/jsp/back/top.jsp" %>
	<script type="text/javascript">
		var url;
				$(function(){
				$("#brandId").combobox({
				url:"brand/queryBrand",
				valueField:'brandId', //提交
				textField:'brandName'
			});
				$("#seriesId").combobox({
				url:"series/querySeries",
				valueField:'seriesId', //提交
				textField:'seriesName'
			});
				/* $("#colorId").combobox({
				url:"color/queryPage",
				valueField:'colorId', //提交
				textField:'colorName'
			});
				$("#faultId").combobox({
				url:"fault/queryPage",
				valueField:'faultId', //提交
				textField:'faultName'
			}); */						
		});
		
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
   <div id="demo1" class="form">
  <p class="f-name">我要预约</p>
  <div class="listbox">
  <form action="order/add" method="post">
      <div class="modelbox">
          <p class="mode-name">机型选择</p>        
          <div class="model-info">
           <!-- 品牌 -->
              <div class="inputbox">
				<input class="easyui-combobox" style="width:100%"
					id="brandId" name="brandId" data-options="required:true" validtype="idcard"/>

              </div>
               <!-- 系列 -->
              <div class="inputbox">
 				<input class="easyui-combobox" style="width:100%"
					id="seriesId" name="seriesId" data-options="required:true" validtype="idcard"/>

              </div>
               <!-- 颜色 -->
              <div class="inputbox" id="breakbox">
 				<input class="easyui-combobox" style="width:100%"
					id="colorId" name="colorId" data-options="required:true" validtype="idcard"/>

              </div>
              <div class="clear"></div>
          </div>
           <!-- 故障 -->
          <div class="model-info">
              <div class="inputbox" id="colorbox">
				<input class="easyui-combobox"  style="width:100%"
					id="faultId" name="faultId" data-options="required:true" validtype="idcard"/>

              </div>         
          </div>
          <div class="clear"></div>
      </div>

     <div class="modelbox clearfix">
         <div class="model-info">
        <div style="margin-bottom: 20px">
				<input class="easyui-combo" style="width:100%" data-options="label:'维修方式:'"
					id="modelbox"/>
         </div>
         </div>
     </div>
     <div class="modelbox">
            <div class="model-info">
                    <div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'用户名:'" style="width:100%"
					id="userName" name="userName"/>
                    </div>
                    <div style="margin-bottom: 20px">
				<input class="easyui-textbox" data-options="label:'联系方式:'" style="width:100%"
					id="userPhone" name="userPhone"  />
                    </div>
                    <div style="margin-bottom: 20px">
				<input class="easyui-combo" data-options="label:'性别:'" style="width:100%"
					id="userSex" name="userSex" />
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="clear"></div>
            </div>
            <div id="centerDetails" class="centerDetails">
			</div>
            <div class="modelbox return">
                <p class="mode-name mode-name2">您的地址</p>
                <div id="alladress"  class="model-info">
                    <div class="inputbox allprovince" style="margin-bottom: 20px">
                        <select id="province"  name="province" data-province="浙江省"></select>
                    </div>
                    <div class="inputbox">
                        <select id="city">
                        </select>
                        <!--<img class="arrow" src="http://static.shanxiuxia.com/activity/mi_arrow.png">-->
                    </div>
                    <div class="inputbox clean">
                        <select id="areap">
                        </select>
                       <!-- <img class="arrow" src="http://static.shanxiuxia.com/activity/mi_arrow.png">-->
                    </div>
                    <div class="clear"></div>
                </div>
                <div id="homeadress" class="model-info">
                    <div class="inputbox allprovince">
                        <select id="provinceOne" name="province"></select>
                    </div>
                    <div class="inputbox">
                        <select id="cityOne">
                        </select>
                        <!--<img class="arrow" src="http://static.shanxiuxia.com/activity/mi_arrow.png">-->
                    </div>
                    <div class="inputbox clean">
                        <select id="areaOne">
                        </select>
                       <!-- <img class="arrow" src="http://static.shanxiuxia.com/activity/mi_arrow.png">-->
                    </div>
                    <div class="clear"></div>
                </div>
               <div class="clear"></div>
                <input id="Street" class="street" type="text" placeholder="输入具体街道地址"><br>
                <span id="streettips">请填写街道地址</span>
            </div>            
            <div class="modelbox" id="imei">
                <div class="clear"></div>
            </div>   
            <div class="modelbox lg clearfix">
                <p class="mode-name">备注信息</p>
                <div class="model-info">
                    <input id="message" class="message" type="text" placeholder="备注：部分机型可提供贴膜">
                </div>
            </div>
            <button id="fixSubmit" class="submitbtn" type="submit">提交订单</button>
    </from>
   </div>
</div>
  </body>
</html>
