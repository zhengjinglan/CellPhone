<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>维修方式</title>
    <meta name="Description" content="闪修侠-高品质的手机上门维修平台,提供苹果、三星、华为等主流机型的专业维修服务,正规认证、方便快捷、专业靠谱。维修从未如此好用,一个电话,服务到家:4000105678。 "/>
    <meta name="Keywords" content="闪修侠官网,手机上门维修,苹果手机维修,iPhone维修,三星手机维修,小米手机维修"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <link type="image/x-icon" href="/favicon.ico" rel="shortcut icon">
    <link href="http://static.shanxiuxia.com/weadoc/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/bootstrap-datetimepicker.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/public.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/fixWay.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/laydate.css" rel="stylesheet">
    <script>
        if(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE6.0" || navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE7.0" || navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE8.0" || navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE9.0")
        {
            alert("您的浏览器版本过低，请下载IE9以上版本（双核浏览器请切换到极速模式）")}
    </script>	
</head>
<body>

<!--Navigation star-->
<div id="menu" class="navbar navbar-default navbar-fixed-top publicNavBar">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">iosButton</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand logo" href="index.html"><img src="http://static.shanxiuxia.com/weadoc/logo.png"></a>
        </div>
        <div class="collapse navbar-collapse navList" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right navListR">
                <li><a href="index.html" class="page-scroll">首页</a></li>
                <li><a href="repairOrder.html" class="page-scroll">维修报价</a></li>
                <li class="clild-list"><a href="http://best.weadoc.com/neicun.html" class="page-scroll">内存升级</a></li> 
    			<li class="clild-list"><a href="colorOrder.html">外壳换新</a></li>
                <li><a href="brand.html" class="page-scroll">品牌相关</a></li>
                <li><a href="customer.html" class="page-scroll">大客户预约</a></li>
            </ul>
        </div>
    </div>
</div>

<!--Navigation over-->

<section class="fixWay">
    <!--tabBar star-->
    <div class="container tabBar">
        <div class="row tabBarWarp">
            <div class="col-md-12 col-xs-12">
                <ul class="main-icons text-center">
                    <li id="fixMenuBtnOne" class="fixMenuBtn">
                        <img id="menuL" src="http://static.shanxiuxia.com/weadoc/fix_tabmenu1_select2.png">
                        <p id="smText" class="title">上门维修</p>
                    </li>
                    <li id="fixMenuBtnTwo" class="fixMenuBtn">
                        <img id="menuR" src="http://static.shanxiuxia.com/weadoc/fix_tabmenu2-2.png">
                        <p id="yjText" class="title">邮寄维修</p>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--tabBar star-->

    <!--from star-->
    <div class="container-fluid listContent">
        <div class="container listBox">
            <div class="listBox-left">
            	<div id="nameBox" class="input-group nameBox">
	                <span class="input-group-addon namePic">
	                    <img class="nameIcon" src="http://static.shanxiuxia.com/weadoc/fix_name2.png">	
                    	<p class="listTitle">姓名：</p>
	                </span>
	                
	                <input id="userName" type="text" class="form-control nameText" placeholder="输入我的姓名">
	                
	            </div>
				<span id="nameFixTips" class="fixTips">请输入2-4个中文英文或者数字</span>
	            <div id="phoneBox" class="input-group phoneBox">
	                <span class="input-group-addon phonePic">
	                   <img class="phoneIcon" src="http://static.shanxiuxia.com/weadoc/fix_telnum2.png">
	                   	<p class="listTitle">手机号码：</p>
	                </span>
	                <input id="telPhone" type="number" maxlength="11" class="form-control phoneText" placeholder="输入我的手机号码">
	                
	            </div>
				<span id="telFixTips" class="fixTips">请输入正确的手机号码</span>
	            <!--<div id="verificationBox" class="input-group verificationBox">
	                <span class="input-group-addon verificationPic">
	                     <img class="verificationIcon" src="http://static.shanxiuxia.com/weadoc/fix_street.png">
	                </span>
	                <input id="verificationCode" type="text" class="form-control pull-left verificationText"
	                       placeholder="输入短信验证码">
	                <button id="enterCode" onclick="codeButton()" class="btn btn-default codeBtn" type="submit">获取验证码
	                </button>
	                <span id="codeFixTips" class="fixTips">请输入正确的验证码</span>
	            </div>-->
	
	            <div id="serviceCenterBox" class="input-group serviceCenterBox">
	                <span class="input-group-addon serviceCenterPic">
                     	<img class="serviceCenterIcon" src="http://static.shanxiuxia.com/weadoc/fix_name2.png">
                     	<p class="listTitle">地址：</p>
	                </span>
	                <select id="provinceService" data-city="杭州市" class="form-control provinceService">
	                </select>
	               <span>请选择寄修网点</span>
	            </div>
	
	            <div id="serviceCenterInfoBox" class="input-group serviceCenterInfoBox">
	                <span class="input-group-addon serviceCenterInfoPic">
	                  <img class="serviceCenterInfoIcon" src="http://static.shanxiuxia.com/weadoc/fix_street.png">
	                </span>
	                <div id="centerDetails" class="centerDetails">
	                </div>
	            </div>
	
	            <div id="addressBox" class="input-group addressBox">
	                <span class="input-group-addon addressPic">
                     	<img class="addressIcon" src="http://static.shanxiuxia.com/weadoc/fix_address2.png">
                     	<p class="listTitle">地址：</p>
	                </span>
	                <select id="provinceOne" class="form-control province">
	                </select>
	                <select id="cityOne" class="form-control province">
	                </select>
	                <select id="areaOne" class="form-control province area">
	                </select>
	            </div>
	
	            <div id="addressAll" class="input-group addressBox">
	                <span class="input-group-addon addressPic">
                     	<img class="addressIcon" src="http://static.shanxiuxia.com/weadoc/fix_address2.png">
                     	<p class="listTitle">地址：</p>
	                </span>
	                <div data-toggle="distpicker">
	                    <select id="province" name="province" data-province="浙江省" class="form-control province"></select>
	                    <select id="city" name="city" data-city="杭州市" class="form-control province"></select>
	                    <select id="areap" name="area" data-district="西湖区" class="form-control province area"></select>
	                </div>
	            </div>
	            <div class="xiaomi">闪修侠已于小米官方售后合作，请至小米官网下单，非常抱歉</div>	
	            <div id="streetBox" class="input-group streetBox">
	                <span class="input-group-addon streetPic">
	                    <img class="streetIcon" src="http://static.shanxiuxia.com/weadoc/fix_street.png">
	                </span>
	                <textarea id="street" class="form-control streetText" placeholder="输入具体街道地址"></textarea>
	                <span id="streetFixTips" class="fixTips">请输入6-32个文字</span>
	            </div>
	
	            <!--<div id="voteBox" class="input-group voteBox">-->
	                <!--<span class="input-group-addon votePic">-->
	                   <!--<img class="voteIcon" src="http://static.shanxiuxia.com/weadoc/fix_youhuima.png">-->
	                <!--</span>-->
	                <!--<input id="vote" type="text" class="form-control voteText" placeholder="输入优惠码（非必填）">-->
	            <!--</div>-->
	
	            <div id="imeiBox" class="input-group imeiBox">
	                <span class="input-group-addon imeiPic">
	                   <img class="imeiIcon" src="http://static.shanxiuxia.com/weadoc/fix_imei2.png">
	                   	<p class="listTitle">IMEI：</p>
	                </span>
	                <input id="imei" type="text" class="form-control imeiText" placeholder="输入IMEI码">
	                <span class="fixTips">请输入IMEI码</span>
	            </div>
	            <div id="imeiTips"  class="imeiTipsBox">
	                <p class="tips">在拨号面板入输 *#06#；或查看设置－通用－关于本机即可获得IMEI码</p>
	            </div>	
	            <div class="fixBtn">
	                <p class="btn btn-default pre" href="repairOrder.html" role="button"><img src="http://static.shanxiuxia.com/weadoc/fix_arrow.png">上一步</p>
	                <button id="fixSubmit" class="btn btn-default  next" type="submit">提交订单<img src="http://static.shanxiuxia.com/weadoc/r_arrow.png"></button>
	            </div>
            </div>
            <div class="listBox-right">
            	<li class="fault-title">故障维修信息</li>
            	<li class="type-box"><span class="phoneType">设备型号：</span><span class="fault-right phoneName"></span></li>
            	<li class="type-box phone_color"><span class="phoneType">设备颜色：</span><span class="fault-right phoneColor"></span></li>
            	<li class="type-box clearfix">
            		<p class="phoneType pull-left">故障详情：</p>
            		<div class="malBox">
            		</div>
            	</li>
            	<li class="type-box price-box"><span class="phoneType">预计费用：</span><span class="priceItel">￥</span><span class="phonePrice"></span></li>
            </div>
        </div>
    </div>
    <!--from over-->
	<div class="invoice-box">
    	<div class="invoice-prompt">
	    	<p class="prompt-title">开票须知</p>
	    	<p class="prompt-text">应国家税务总局要求，自2017年7月1日起，您若开具增值税普通发票，须同时提供企业抬头及税号，否则发票将无法用于企业报销。</p>
	    	<p class="prompy-btn">我知道了</p>
	    </div>
    </div>
    <!--bottom star-->
    <div class="container-fluid fixBottom">
        <div class="container bottomBox">
            <p class="step">
                <a id="stepB" class="btn btn-default menuBtn">上门服务</a>
                <a id="stepA" class="btn btn-default menuBtn">邮寄服务</a>
                <a id="stepC" class="btn btn-default menuBtn" type="button">到店服务</a>
            </p>
            <ul id="contentA" class="list-group content">
                <li class="list-group-item pull-left menu">01 提交订单</li>
                <li class="list-group-item pull-left menuPic"><img src="http://static.shanxiuxia.com/weadoc/fix_button_arrow.png"></li>
                <li class="list-group-item pull-left menu">02 客服确认</li>
                <li class="list-group-item pull-left menuPic"><img src="http://static.shanxiuxia.com/weadoc/fix_button_arrow.png"></li>
                <li id="stepThree" class="list-group-item pull-left menu">03 邮寄设备</li>
                <li class="list-group-item pull-left menuPic"><img src="http://static.shanxiuxia.com/weadoc/fix_button_arrow.png"></li>
                <li class="list-group-item pull-left menu">04 维修完成</li>
                <li class="list-group-item pull-left menuPic"><img src="http://static.shanxiuxia.com/weadoc/fix_button_arrow.png"></li>
                <li id="stepFive" class="list-group-item pull-left menu">05 转账付款</li>
                <li class="list-group-item pull-left menuPic"><img src="http://static.shanxiuxia.com/weadoc/fix_button_arrow.png"></li>
                <li id="stepSix" class="list-group-item pull-left menu">06 寄回设备</li>
            </ul>
        </div>
    </div>
    <!--bottom over-->
</section>


<!--footer start-->
<div class="container-fluid footer">
    <div class="container">
        <div class="footerL pull-left">
            <img class="logoWhite" src="http://static.shanxiuxia.com/weadoc/logo_white.png">
            <div class="footList">
                <ul class="listMenu pull-left">
                    <li class="menu" role="presentation">关于我们</li>
                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=1">了解我们</a></li>
                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=2">行业资讯</a></li>
                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=3">联系我们</a></li>
                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=4">加入我们</a></li>
                </ul>
                <ul class="listMenu pull-left">
                    <li class="menu" role="presentation">帮助中心</li>
                    <li class="subMenu" role="presentation"><a href="login.html">查询订单</a></li>
                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=5">常见问题</a></li>
                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=6">服务条款</a></li>
                    <li class="subMenu" role="presentation"><a href="feedback.html">意见反馈</a></li>
                </ul>
                <ul class="listMenu pull-left">
                    <li class="menu" role="presentation">关注我们</li>
                    <li class="subMenu" role="presentation"><a href="http://weibo.com/shanxiuxia">官方微博</a></li>
                    <li id="weixinBtn" class="subMenu" role="presentation"><a>官方微信</a></li>
                </ul>
                <div class="clearfix"></div>
            </div>
            <p class="companyNumber">维时科技有限公司 ©浙ICP备15007035号-1</p>
            <img id="weixin" class="weixin" src="http://static.shanxiuxia.com/weadoc/foot_weixin.jpg">
        </div>
        <div class="footerR pull-right">
            <div class="footerRr pull-right">
                <p class="phoneWhite"><img src="http://static.shanxiuxia.com/weadoc/i_phone_white.png">400-010-5678</p>
                <p onclick="kefu()" class="serversWhite"><img src="http://static.shanxiuxia.com/weadoc/i_phone_servers.png">在线客服</p>
                <p class="timer">服务时间：07:00-22:00</p>
            </div>
            <div class="footerRl pull-right">
                <img src="http://static.shanxiuxia.com/weadoc/code.png">
            </div>
        </div>
    </div>
</div>

<!--footer over-->



<script src="http://static.shanxiuxia.com/weadoc/js/jquery.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/bootstrap.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/respond.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/data/bootstrap-datetimepicker.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/data/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="https://static.shanxiuxia.com/lib/cookie.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/config.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/baidu.js"></script>
<script src="js/fixWay.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/laydate.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/public.js"></script>
<!--<script src="http://static.shanxiuxia.com/weadoc/js/laiyuan.js"></script>-->
<script src="http://static.shanxiuxia.com/weadoc/js/statistics.js"></script>

</body>
</html> 
