<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit"> 
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>闪修侠-手机上门维修首选 正规认证、品质保障</title>
    <meta name="Description" content="闪修侠-高品质的手机上门维修平台,提供苹果、三星、华为等主流机型的专业维修服务,正规认证、方便快捷、专业靠谱。维修从未如此好用,一个电话,服务到家:4000105678。 "/>
    <meta name="Keywords" content="闪修侠官网,手机上门维修,苹果手机维修,iPhone维修,三星手机维修,小米手机维修"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta name="baidu-site-verification" content="SzhqztTcKi" />
    <meta name="360-site-verification" content="5dcec7c40392eb08c822926f8d13a44f" />
	<meta name="sogou_site_verification" content="ZtrmcDfnnx"/>
	<meta name="baidu-site-verification" content="VgG27uMFcA"/>
	<meta name="baidu-site-verification" content="bDOJ91NQ0g" />
	<meta name="baidu-site-verification" content="ycXROhQjjH" />
    <link type="image/x-icon" href="/favicon.ico" rel="shortcut icon">
    <link href="http://static.shanxiuxia.com/weadoc/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="http://static.shanxiuxia.com/weadoc/css/swiper.min.css"/>
    <link rel="stylesheet" type="text/css" href="http://static.shanxiuxia.com/weadoc/css/index.css">
    <link rel="stylesheet" type="text/css" href="http://static.shanxiuxia.com/weadoc/css/navStyle.css">
    <link rel="stylesheet" type="text/css" href="http://static.shanxiuxia.com/weadoc/css/navResponsive.css">
    <link rel="stylesheet" type="text/css" href="http://static.shanxiuxia.com/weadoc/css/public.css">
    <link rel="stylesheet" type="text/css" href="http://static.shanxiuxia.com/weadoc/css/animate.min.css">
    <script>
        if(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE6.0" || navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE7.0" || navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE8.0" || navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion .split(";")[1].replace(/[ ]/g,"")=="MSIE9.0")
        {
            alert("您的浏览器版本过低，请下载IE9以上版本（双核浏览器请切换到速模式）")}
    </script>
</head>
<body>
	<img style="display: none;" src="images/logo.jpg" alt="闪修侠" />
<!--<a href="notice.html"><div class="notice-box clearfix"><span class="notice">郑重声明：近期网络上有不少商家为了非正常手段获利，在网络上不断仿冒闪修侠品牌及相关运营体系。用假冒大品牌、作假数据</span><img class="notice-btn" src="http://static.shanxiuxia.com/weadoc/notice-btn.png"></div></a>-->	
<!--Navigation star-->
<div id="menu" class="navbar navbar-default navbar-fixed-top">
    <div class="nav-box">
    	<div class="container">
	        <div class="navbar-header">
	            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	                <span class="sr-only">iosButton</span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	            </button>
	            <a class="navbar-brand" href="index.html"><img src="http://static.shanxiuxia.com/weadoc/logo.png"></a>
	        </div>
	        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	            <ul class="nav navbar-nav navbar-right">
	                <!--<li class="nav-list indexChoice"><a href="index.html" class="page-scroll indexChoice">首页</a></li>-->
	                <li class="nav-list active-btn2"><a href="repairOrder.html" class="page-scroll">维修报价</a></li>                
	                <li class="nav-list"><a href="http://www.huishoubao.com/?pid=1323" class="page-scroll">手机回收</a></li>
	                <li class="clild-list"><a href="http://best.weadoc.com/neicun.html" class="page-scroll">内存升级</a></li>         			       
	                <li class="nav-list"><a href="meizu.html" class="page-scroll">魅族授权</a></li>
	                <li class="nav-list"><a href="brand.html" class="page-scroll">品牌相关</a></li>
	                <li class="clild-list"><a href="recruit2.html">工程师招聘</a></li>
	                <li class="nav-list"><a href="customer.html" class="page-scroll">大客户预约</a></li>
	                <li class="list-end nav-list"><a href="login.html" class="page-scroll findbtn">查询订单</a></li>
	            </ul>
	        </div>
	    </div>
    </div>
</div>
<!--Navigation over-->

<!-- Header star -->
<header class="banner">
    <div class="container bannerWarp">
        <p class="p1 text-center">恭喜闪修侠入选杭州「1亿美金以上」准独角兽榜单</p>
        <p class="p2 text-center"><span class="numNull">累计服务用户<span class="userNum"></span>人，</span>用户满意率99.5%</p>
        <!--<div class="search-box">
        	<input type="text" class="search-main" id="autocomplete-ajax" placeholder="输入需要维修的手机型号" value="" />
        	<img src="http://static.shanxiuxia.com/weadoc/search.png" alt="" class="seach-img" />
        </div>-->
        <div class="hot-active clearfix">       	
        	<a class="hot-list" href="http://best.weadoc.com/uav.html">无人机维修</a>
        	<a class="hot-list" href="repairOrder.html">手机维修</a>
        	<a class="hot-list" href="http://best.weadoc.com/mac.html">Mac维修</a>
        </div>
        <div class="buttons">
            <p class="myRepair pull-left">电话咨询</p>
            <p class="myright pull-left"></p>
            <p class="myOrder"><span>400-010-5678</span></--></p>
        </div>
        <div class="bannerIcon-box">
        	<img id="bannerIcon" class="bounce animated bannerIcon" src="http://static.shanxiuxia.com/weadoc/i_arrow.png">
        </div>
    </div>
</header>

<!-- Header over -->

<div class="service">
	<p class="ser-title">优质服务</p>
	<div class="service-box clearfix">
		<div class="ser-box1 clearfix">
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list1.png" alt="" />
				<p class="ser-title1">免费上门</p>
				<p class="ser-title2">在线下单，极速响应，预约上门，现场维修，足不出户轻松搞定</p>
			</li>
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list2.png" alt="" />
				<p class="ser-title1">专业工程师</p>
				<p class="ser-title2">专业培训，初中高评级，千人一面，每个上门工程师都经过千锤百炼</p>
			</li>
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list3.png" alt="" />
				<p class="ser-title1">全程录像</p>
				<p class="ser-title2">当面维修，全程录像，公开透明，杜绝偷换零件隐患</p>
			</li>
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list4.png" alt="" />
				<p class="ser-title1">透明报价</p>
				<p class="ser-title2">登录网站，选择故障，显示价格，透明报价，拒绝宰人</p>
			</li>
		</div>
		<div class="ser-box2 clearfix">
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list5.png" alt="" />
				<p class="ser-title1">20分钟快修</p>
				<p class="ser-title2">专业服务，现场维修，平均维修耗时20分钟，让手机焕然一新</p>
			</li>
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list6.png" alt="" />
				<p class="ser-title1">全国覆盖</p>
				<p class="ser-title2">直营网络覆盖<span id="cityLen"></span>城，30个运营中心，召唤闪修侠，1小时上门</p>
			</li>
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list7.png" alt="" />
				<p class="ser-title1">高品质配件</p>
				<p class="ser-title2">28道检测工艺，一件一码独立标识，每一个选用的零件都是严选</p>
			</li>
			<li class="ser-list">
				<img class="ser-img" src="http://static.shanxiuxia.com/weadoc/ser-list8.png" alt="" />
				<p class="ser-title1">全国联保</p>
				<p class="ser-title2">维修零件享受6个月全国联保，售后服务免费上门</p>
			</li>
		</div>
		
	</div>
</div>

<!--content star-->
<div class="indexContent">
	<!--<div class="bannerL clearfix">
		<div class="swiper-container">
		    <div class="swiper-wrapper">
		        <div class="swiper-slide picL"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic5.png"></div>
		        <div class="swiper-slide picL"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic1.png"></div>
		        <div class="swiper-slide picL"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic2.png"></div>
		        <div class="swiper-slide picL"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic3.jpg"></div>
		        <div class="swiper-slide picL"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic4.jpg"></div>
		    </div>
		    
		    <div class="swiper-pagination"></div>
	        
		    <div class="left-btn clickBtn"><div class="swiper-button-prev"></div></div>
		    <div class="right-btn clickBtn"><div class="swiper-button-next"></div></div>
		</div>
	</div>	-->
    <div class="bannerL clearfix">
    	<div class="picL"><a href="javascript:;"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic5.png"></a></div>
        <div class="picL"><a href="http://best.weadoc.com/uav.html"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic6.png"></a></div>
        <div class="picL"><a href="http://best.weadoc.com/mac.html"><img src="http://static.shanxiuxia.com/weadoc/i_bannerpic2.png"></a></div>
    </div>    
</div>

<div class="ser-select clearfix">
	<div class="select-box clearfix">
		<img src="http://static.shanxiuxia.com/weadoc/repair.png" alt="" />
	</div>
	<div class="select-left clearfix">
		<div class="list-box clearfix">
			<li align="center" class="select-list list1 list-act">
				<img class="select-img select-img1" src="http://static.shanxiuxia.com/weadoc/suggest1-1.png" alt="" />
				<p class="select-title coloer-active">上门维修</p>
			</li>
			<li align="center" class="select-list list2">
				<img class="select-img select-img2" src="http://static.shanxiuxia.com/weadoc/suggest2.png" alt="" />
				<p class="select-title">邮寄维修</p>
			</li>
			<li align="center" class="select-list list3">
				<img class="select-img select-img3" src="http://static.shanxiuxia.com/weadoc/suggest3.png" alt="" />
				<p class="select-title">到店维修</p>
			</li>
		</div>
	</div>	
	<div class="select-right select1 clearfix">
		<h4 class="right-title"><img class="right-img" src="http://static.shanxiuxia.com/weadoc/ri-suggest1.png" alt="" /><span class="right-title2">上门维修</span></h4>
		<p class="ser-suggest">在线定价，免费上门，20分钟解决问题，全程录像，售后有保障</p>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">1</span><span class="suggest-title">用户预约下单</span></p>
			<p class="suggest-main">用户通过闪修侠微信公众号、网站、APP、400电话等方式预约下单。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">2</span><span class="suggest-title">客服确认信息</span></p>
			<p class="suggest-main">10分钟内客服会通过电话与用户确认手机故障及工程师上门的时间地点。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">3</span><span class="suggest-title">工程师接单</span></p>
			<p class="suggest-main">1分钟内闪修侠LBS派单系统会智能匹配附近的工程师，将订单派发给能最快上门的工程师。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">4</span><span class="suggest-title">工程师上门维修</span></p>
			<p class="suggest-main">通常1小时内接到订单的工程师会准时上门为您提供维修服务，维修平均耗时20分钟。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">5</span><span class="suggest-title">确认支付及评价</span></p>
			<p class="suggest-main">用户确认维修完成后，在工程师的指引下进行线上支付，并对维修服务进行评价。</p>
		</li>
	</div>
	<div class="select-right select2 clearfix">
		<h4 class="right-title"><img class="right-img" src="http://static.shanxiuxia.com/weadoc/ri-suggest2.png" alt="" /><span class="right-title2">邮寄维修</span></h4>
		<p class="ser-suggest">覆盖全国范围，顺丰取送，快速修复，72小时回到你手中</p>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">1</span><span class="suggest-title">用户预约下单</span></p>
			<p class="suggest-main">用户通过闪修侠微信公众号、网站、APP、400电话等方式预约下单。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">2</span><span class="suggest-title">客服确认信息</span></p>
			<p class="suggest-main">10分钟内客服会通过电话与用户确认手机故障、提醒维修前注意事项与邮寄事项。 </p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">3</span><span class="suggest-title">用户邮寄设备</span></p>
			<p class="suggest-main">用户预约顺丰快递上门收件，将设备寄往对应闪修侠维修服务网点，在订单详情页填入快递单号</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">4</span><span class="suggest-title">确认维修方案</span></p>
			<p class="suggest-main">闪修侠收到设备后，工程师进行检测，客服致电用户沟通确认维修方案和价格。工程师通常会在收到设备的24小时之内完成维修。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">5</span><span class="suggest-title">线上付款和顺丰寄回</span></p>
			<p class="suggest-main">维修完成后，用户会收到支付宝或微信的付款链接。用户支付后，闪修侠会使用顺丰快递将修好的设备和维修服务单寄回，同时为用户提供为期半年的保修服务</p>
		</li>
	</div>
	<div class="select-right select3 clearfix">
		<h4 class="right-title"><img class="right-img" src="http://static.shanxiuxia.com/weadoc/ri-suggest3.png" alt="" /><span class="right-title2">到店维修</span></h4>
		<p class="ser-suggest">更全面直观的维修场景，更丰富的服务项目和休闲吧式维修氛围。</p>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">1</span><span class="suggest-title">用户预约下单</span></p>
			<p class="suggest-main">用户通过闪修侠微信公众号、官网、电话等方式进行预约下单。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">2</span><span class="suggest-title">客服确认信息</span></p>
			<p class="suggest-main">客服通过电话与用户确认手机故障、提醒维修前注意事项，预约到店时间。</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">3</span><span class="suggest-title">用户到店</span></p>
			<p class="suggest-main">客服会告知用户当地维修中心地址，用户可以自行前往维修中心现场维修</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">4</span><span class="suggest-title">检测维修</span></p>
			<p class="suggest-main">工程师检测问题，与用户确认维修方案与价格，进行现场维修</p>
		</li>
		<li class="suggest-list">
			<p class="suggest"><span class="suggest-num">5</span><span class="suggest-title">完成维修线上支付</span></p>
			<p class="suggest-main">维修完成后，由用户亲自验机确认，无误后在线付款，并对服务进行评价。</p>
		</li>
	</div>
</div>
<div class="partner clearfix">
	<p class="partner-title">合作伙伴</p>
	<div class="partner-main">
		<div class="clearfix">
			<span class="partner-item">电商行业</span>
			<div class="partner-box clearfix">
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner2.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner1.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner3.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner4.png" alt="" /></li>
			</div>
		</div>
		<div class="clearfix">
			<span class="partner-item">本地生活行业</span>
			<div class="partner-box clearfix">
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner5.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner6.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner7.png" alt="" /></li>
				<li class="partner-list"><a href="http://www.daoway.com"><img src="http://static.shanxiuxia.com/weadoc/partner13.png" alt="" /></a></li>
			</div>
			
		</div>
		<div class="clearfix">
			<span class="partner-item">合作公司</span>
			<div class="partner-box clearfix">
				<!--<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner8.png" alt="" /></li>-->
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner12.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner16.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner14.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner15.png" alt="" /></li>
			</div>	
		</div>
		<div class="clearfix">
			<span class="partner-item">保险合作</span>
			<div class="partner-box clearfix">
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner9.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner10.png" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner17.png" alt="" /></li>
			</div>
			
		</div>
		<div class="clearfix">
			<span class="partner-item">手机厂商</span>
			<div class="partner-box clearfix">
				<li class="partner-list"><img style="width: 100%;" src="http://static.shanxiuxia.com/weadoc/partner12.jpg" alt="" /></li>
				<li class="partner-list"><img src="http://static.shanxiuxia.com/weadoc/partner11.png" alt="" /></li>
				<li class="partner-more"><a href="aboutUs.html?about=7">更多>></a></li>
			</div>
			
		</div>	
		
	</div>
</div>

<!--content over-->
<div class="repair clearfix">
	<div class="repair-img">
		<p class="visit text-center">上门维修<p>
		<img class="repair_main" src="http://static.shanxiuxia.com/weadoc/repair(1).png" alt="" />
	</div>
	<img class="repair_main2" src="http://static.shanxiuxia.com/weadoc/repair(1).png" alt="" />
</div>

<!--footer start-->
<div class="foot-box">
	<div class="container-fluid footer">
	    <div class="container">
	        <div class="footerL pull-left">
	            <img class="logoWhite" src="http://static.shanxiuxia.com/weadoc/logo_white.png">
	            <div class="footList">
	                <ul class="listMenu pull-left">
	                    <li class="menu" role="presentation">关于我们</li>
	                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=1">了解我们</a></li>
	                    <li class="subMenu" role="presentation"><a href="aboutUs.html?about=2">闪修侠动态</a></li>
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
					<ul class="listMenu pull-left">
	                    <li class="menu" role="presentation">闪修名录</li>
	                    <li class="subMenu" role="presentation"><a href="/sxxdirectory.html">查询名录</a></li>
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
					<p style="color: #fff; font-size: 12px;margin-left: 8px;line-height: 36px;">关注微信公众号</p>				
				</div>
				<div class="footerRl pull-right">
					<img width="100" height="100" src="http://static.shanxiuxia.com/weadoc/download-app.png">
					<p style="color: #fff; font-size: 12px;margin-left: 8px;line-height: 36px;">下载闪修侠APP</p>
	            </div>
	        </div>
	    </div>
	</div>
</div>

<!--footer over-->
<script src="http://static.shanxiuxia.com/weadoc/js/jquery.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/bootstrap.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/swiper-3.4.1.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/respond.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/config.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/jquery.autocomplete.min.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/index.js"></script>
<script src="https://m.shanxiuxia.com/js/spread/address.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/baidu.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/nav.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/public.js"></script>
<script src="http://static.shanxiuxia.com/weadoc/js/statistics.js"></script>
<script type="text/javascript">
    function browserRedirect() {
        var sUserAgent = navigator.userAgent.toLowerCase();
        var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
        var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
        var bIsMidp = sUserAgent.match(/midp/i) == "midp";
        var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
        var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
        var bIsAndroid = sUserAgent.match(/android/i) == "android";
        var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
        var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
        if (bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) {
              window.location.href='http://m.shanxiuxia.com';//取消注释，手机设备跳转到手机站主页
        }
    }
    browserRedirect();
</script>
<script>
  url = window.location.href;
  if (url.indexOf('shanxiuxia.cn')>= 0){
    $('.companyNumber').html('杭州维时科技有限公司北京分公司 京ICP备17069378号-1');
  }else if(url.indexOf('shanxiuxia.com')>=0){
  	$('.companyNumber').html('杭州维时科技有限公司 浙ICP备15007035号-2');
  }else if(url.indexOf('weadoc.com')>=0){
  	$('.companyNumber').html('杭州维时科技有限公司 浙ICP备15007035号-1');
  }else{
  	$('.companyNumber').html('杭州维时科技有限公司 浙ICP备15007035号-1');
  }

</script>
</body>
</html>
