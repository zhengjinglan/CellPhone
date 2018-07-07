<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <meta name="Description" content="闪修侠-高品质的手机上门维修平台,提供苹果、三星、华为等主流机型的专业维修服务,正规认证、方便快捷、专业靠谱。维修从未如此好用,一个电话,服务到家:4000105678。 "/>
    <meta name="Keywords" content="闪修侠官网,手机上门维修,苹果手机维修,iPhone维修,三星手机维修,小米手机维修"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <link type="image/x-icon" href="/favicon.ico" rel="shortcut icon">
    <link href="http://static.shanxiuxia.com/weadoc/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/public.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>
</head>
<body style="background:url(images/login-banner.jpg) ">

<div class="login">
	<p class="login-title">让每一个手机的主人不再烦恼</p>
	<p class="login-item">采用严选品质配件，免费的快速上门服务，来自手机生产一线的专业设备和队伍，为每一部手机保驾护航</p>
	<form id="loginfm" method="post">
	<div class="loginPhoneBox">
       <div class="loginPhone">
           <input id="phone" name="userPhone" type="tel" class="login-text" maxlength="11" placeholder="输入我的手机号码">
       </div>
       <span id="phoneTips" class="phoneTips">请输入正确的手机号码</span>
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
        var phone=$("#phone").val();
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
         
             alert("请输入手机号");
           return false;
        }

    });  
    $("#loginSubmit").click(function(){
        var code=$("#code").val();
        if(code==""){
            alert("请输入验证码");
        }else{
            if(sms==code){
	 				$.post("../../user/checkUser",{userPhone:$("#phone").val()},function(data){
	 				alert(data);
					if(data==0){
					window.location.href="../../user/queryOfa?userPhone="+$("#phone").val();	 	             	
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