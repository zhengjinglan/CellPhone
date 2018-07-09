<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
 <html>
  <head>
    <base href="<%=basePath%>">

    <title>My JSP 'Login.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="jsp/before/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="jsp/before/css/bootstrap-datetimepicker.min.css"/>
    <script type="text/javascript" src="jsp/before/js/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="jsp/before/js/bootstrap.min.js"></script>
    <style type="text/css">
        #login{ width:450px; height:100px; margin:50px auto;}
        #btn{ margin-left:100px; margin-top:-25px; width: 120px;height: 25px; font-size: 11px; }
        body{ background-color: #ecfcf9;}
    </style>
</head>
<body style="background:url(images/login-banner.jpg) ">

<div class="login">
	<p class="login-title">让每一个手机的主人不再烦恼</p>
	<p class="login-item">采用严选品质配件，免费的快速上门服务，来自手机生产一线的专业设备和队伍，为每一部手机保驾护航</p>
	<form id="loginfm" method="post">
	<div class="loginPhoneBox">
       <div class="loginPhone">
           <input id="telPhone" name="userPhone" type="tel"
           class="login-text" maxlength="11" placeholder="输入我的手机号码">
       </div>
       <span id="telFixTips" class="fixTips" style="color:#F4A460" >请输入正确的手机号码</span>
   </div>
   <div class="loginCodeBox">
       <div class="loginCode ">
           <input  id="code" name="code" type="text" class="pull-left login-text" placeholder="验证码">
           <input id="enterCodeLogin" type="submit" class="pull-right loginSend"
           name="btn" value="发送验证码" onclick="sendMessage()" />
          <!--  </button> -->
           <div class="clearfix"></div>
       </div>
       <span id="codeTips" class="codeTips"></span>
   </div>
   <button id="loginSubmit" type="submit" class="btn-default loginSubmit">查询订单</button>
	</form>
</div>
<script type="text/javascript">
    var InterValObj; //timer变量，控制时间
    var count = 60; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
   $(function(){
   		 $("#telFixTips").hide();
   });

   $("#telPhone").change(function(){
    var filter1 = /^0?1[3|4|5|7|8][0-9]\d{8}$/;
    if(!filter1.test($("#telPhone").val())){
        $("#telFixTips").show();
        return false;
    }else{
        $("#telFixTips").hide();
    }
});

    function sendMessage(){curCount = count;
        $("#enterCodeLogin").attr("disabled", "true");
        $("#enterCodeLogin").val(curCount + "秒后可重新发送");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次请求后台发送验证码 TODO
    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#enterCodeLogin").removeAttr("disabled");//启用按钮
            $("#enterCodeLogin").val("重新发送验证码");
        }
        else {
            curCount--;
            $("#enterCodeLogin").val(curCount + "秒后可重新发送");
        }
    }


    var sms="";

    $("#enterCodeLogin").click(function(){

        var phone=$("#telPhone").val();
        if(phone!="")
        {
            $.ajax({
                url:"../../sendSMS",
                type:"post",
                data:{"userPhone":phone},
                success:function(result){
                    sms=result;
                }
            });
        }else{
            //checkTel();
           alert("请正确填写手机号");
           return false;
        }

    });
    $("#loginSubmit").click(function(){
        var code=$("#code").val();
        if(code==""){
            alert("请输入验证码");
        }else{
            if(sms==code){
	 				$.post("../../user/checkUser",{userPhone:$("#telPhone").val()},function(data){
					if(data==0){
					window.location.href="../../user/queryOfa?userPhone="+$("#telPhone").val();
	 	             }else{
	 	            	alert("您还没有过订单！");
            			$("#loginfm").form('reset');
	 	             }
	 	       });
            }else{
                alert("验证码错误");

            };
        };

    });
</script>
</body>
</html>
