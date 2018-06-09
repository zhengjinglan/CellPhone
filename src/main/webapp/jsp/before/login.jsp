<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目管理系统后台登录界面模板</title>
<style>
*{
	padding:0px;
	margin:0px;
	}

body{
	font-family:Arial, Helvetica, sans-serif;
	background:url(images/grass.jpg);
	font-size:13px;
    
	}
img{
	border:0;
	}
.lg{width:468px; height:468px; margin:100px auto; background:url(../images/login_bg.png) no-repeat;}
.lg_top{ height:200px; width:468px;}
.lg_main{width:400px; height:180px; margin:0 25px;}
.lg_m_1{
	width:290px;
	height:100px;
	padding:60px 55px 20px 55px;
}
.ur{
	height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(images/users.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.pw{
	height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(images/password.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.bn{width:330px; height:72px; background:url(images/enter.png) no-repeat; border:0; display:block; font-size:18px; color:#FFF; font-family:Arial, Helvetica, sans-serif; font-weight:bolder;}
.lg_foot{
	height:80px;
	width:330px;
	padding: 6px 68px 0 68px;
}
</style>
</head>

<body class="b">
<div class="lg">
<form action="#">
    <div class="lg_top"></div>
    <div class="lg_main">
        <div class="lg_m_1">
        
        <input name="username" value="username" class="ur" />
        <input name="password" type="password" value="password" class="pw" />
        
        </div>
    </div>
    <div class="lg_foot">
    <input type="submit" value="Login In" class="bn" /></div>
</form>
</div>

</body>
</html>


<!-- 

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
</head>
<body>

<div class="login">
	<p class="login-title">让每一个手机的主人不再烦恼</p>
	<p class="login-item">采用严选品质配件，免费的快速上门服务，来自手机生产一线的专业设备和队伍，为每一部手机保驾护航</p>
	<div class="loginPhoneBox">
       <div class="loginPhone">
           <input name="myInput" id="loginPhone" type="tel" class="login-text" maxlength="11" placeholder="输入我的手机号码">
       </div>
       <span id="phoneTips" class="phoneTips">请输入正确的手机号码</span>
   </div>
   <div class="loginCodeBox">
       <div class="loginCode">
           <input id="feeedCode" type="text" class="pull-left login-text" placeholder="输入图形验证码">
           <p id="code-box" class="pull-right"></p>
           <div class="clearfix"></div>
       </div>
       <span id="codeTips" class="codeTips"></span>
   </div>
   <div class="loginCodeBox">
       <div class="loginCode ">
           <input id="loginCode" type="text" class="pull-left login-text" placeholder="验证码">
           <button id="enterCodeLogin" type="submit" class="pull-right loginSend">
               发送验证码
           </button>
           <div class="clearfix"></div>
       </div>
       <span id="codeTips" class="codeTips"></span>
   </div>
   <button id="loginSubmit" type="submit" class="btn-default loginSubmit">查询订单</button>
	
</div>

<script type="text/javascript" src="http://static.shanxiuxia.com/weadoc/js/jquery.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/respond.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/baidu.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/config.js"></script>
<script type="text/javascript" src="http://static.shanxiuxia.com/weadoc/js/public.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/laiyuan.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/statistics.js"></script>
<script>
	var newDate = new Date();
	var newhour = newDate.getTime();
	if(newhour - localStorage.myHour < 10800000){
		window.location.href = 'personalCenter.html';
	}else{
		localStorage.removeItem("mobile");
	}
</script>
</body>
</html> -->