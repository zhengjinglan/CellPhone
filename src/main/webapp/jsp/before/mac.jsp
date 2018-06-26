<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html lang="en">
<head>
      <title>手机维修</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <meta http-equiv="Content-Language" content="zh-CN" />
  
      <meta http-equiv="X-UA-Compatible" content="IE=edge" >
      <meta itemprop="name" content="值得信赖的手机维修平台">
      <meta itemprop="image" content="images/logo.jpg">
	  <link rel="shortcut icon" href="images/faviconie.png" />
	  <script type="text/javascript" src="//rs.jikexiu.com/resources/js/jquery-1.7.2.min.js" ></script>
	  <script type="text/javascript" src="//rs.jikexiu.com/resources/js/common/message.js" ></script>
	  <link  type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/common.css" >
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/animate.min.css" />
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/landing2017.css"/>
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/web_index.css" />
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/tuiguang_order.css">
	  <script type="text/javascript" src="//rs.jikexiu.com/resources/js/web_index.js"></script>
 
    <script type="text/javascript" >
        window.ctx = "";
        window.resourcePath = "//rs.jikexiu.com";
        var _Width = $(window).width();
     
    </script>
    <style type="text/css">
 			.disabled{
 				pointer-events:none;
 			}
 		</style>
</head>

<body>

<header id="header">
    <div class="wrap">

            <h1 class="logo"><img src="images/8.jpg"/>手机维修平台</h1>
            <ul class="parentmenu"><li class="showmenu">
            <li><a href="#col2" target="_self">报价信息</a></li>
            <li><a id="appO" href='#maodian' target="_self">预约下单</a></li>
            <li><a href="#col5" target="_self">常见问题</a></li>
            <li><a href="company.jsp" target="_self">公司动态</a></li>
            <li><a href="contact.jsp" target="_self">意见反馈</a></li>
            
  
             <li><a href="personal.jsp" target="_self">个人中心</a></li>
        </ul>
        <span><s></s>预约热线:4008-112-112</span>
    </div>
</header>

<input type="hidden" id="currentDate">
<section id="main">
    <div style="display: none;" id="City_Door_Range_div">
        {"142":"上门范围：任城区","288":"测试城市","130":"上门范围：赣县区、章贡区","51":"上门范围：宽城区，二道区，南关区，朝阳区","60":"上门范围：南岗区、道里区、道外区、香坊区、松北区、平房区、呼兰区","177":"上门范围：孝南区城区（书院街道，车站街道，新华街道，广场街道）和卧龙乡北部区域，其他乡镇只能到店维修","314":"上门范围：城中区，城西区，城北区，城东区主城区","8":"上门范围：竞秀区，莲池区，新市区 ","7":"上门范围：桥东区、桥西区","79":"上门范围：崇川区、港闸区主城区","11":"上门范围：运河区、新华区、沧县","295":"上门范围：宝塔区 新城区 经开区，超范围可与工程师约中间点","269":"上门范围：红塔区、峨山县，属于玉溪地区都可以和工程师确认是否可以上门","88":"上门范围：江北区主城区，超出上门范围可与工程师约中间位置。","25":"上门范围：回民区、玉泉区、赛罕区、新城区，其它区域可与工程师约中间点。","208":"上门范围：惠城区，其他区域可与工程师约中间点","76":"上门范围：市区内，超出上门范围可与工程师约中间位置","201":"上门范围：香洲区","77":"上门范围：钟楼区、新北区、武进区、天宁区，超出上门范围内可与工程师约中间位置。","214":"上门范围：莞城区、东城区、南城区、石碣镇、石龙镇、厚街镇、虎门镇、万江镇、寮步镇、茶山镇，超出上门范围可与工程师约中间位置。","75":"上门范围：锡山区、梁溪区、滨湖区、新吴区主城区，超出上门范围可与工程师约市内中间位置","300":"上门范围：城关区、安宁区、七里河区、西固区，只要是在兰州地区的都可以询问工程师是否可以上门","322":"上门范围：兴庆区、西夏区、金凤区等主城区","203":"上门范围：禅城区及南海区桂城街道辖区内。其他区域，顺德、三水、高明和南海除桂城街道辖区以外可以与工程师约中间点。","78":"上门范围：姑苏区、吴中区、相城区、吴江区主城区，可与工程师约定上门地点","116":"上门范围：海沧区、思明区、湖里区、集美区，同安区和翔安区可约中间位置","290":"上门范围：西安城区，超出范围可与工程师约中间点","267":"上门范围：盘龙、西山、五华、官渡、高新技术产业开发区和经济技术开发区，超出范围可与工程师约中间点","258":"上门范围：白云区、观山湖区、乌当区、云岩区、南明区，超出范围可与工程师约中间点","237":"上门范围：四环路以内，地铁1、2、3、4号线全线，超出范围可与工程师约中间点","233":"上门范围：龙华区、美兰区、秀英区、琼山区，超出范围可与工程师约中间点","219":"上门范围：兴宁区、江南区主城区，超出范围可与工程师约中间点","200":"上门范围：南山区、福田区、罗湖区、盐田区（梅沙街道辖区除外）；龙华新区、龙岗区、宝安区；不在以上范围内可以与工程师约中间点或选择邮寄、到店。","198":"上门范围：白云区、天河区、黄埔区、越秀区、海珠区、荔湾区、萝岗区、番禺区地铁沿线三公里内、花都区部分区域和增城部分区域。不在以上范围内可以与工程师约中间点或选择邮寄、到店。","184":"上门范围：芙蓉区、岳麓区、开福区等主城区，超出范围可与工程师约中间点","170":"上门范围：三环以内，超出范围可与工程师约中间点","152":"上门范围：二七区、金水区，超出范围可与工程师约中间点","136":"上门范围：市北区、市南区、崂山区、李沧区，超出范围可与工程师约中间点","135":"上门范围：天桥区、市中区、历城区、历下区、高新区等绕城高速以内，超出范围可与工程师约定上门地点","124":"上门范围：东湖区，青山湖区，西湖区，青云谱区等主城区，超出范围可与工程师约中间点","115":"上门范围：鼓楼区、晋安区、台江区、仓山区等主城区，超出范围可与工程师约中间点","98":"上门范围：庐阳区、蜀山区、瑶海区，超出范围可与工程师约中间点","87":"上门范围：上城区、下城区、江干区、滨江区、西湖区、拱墅区内，超出范围可与工程师约中间点","74":"上门范围：鼓楼、玄武、秦淮、建邺、雨花台区，超出范围可与工程师约中间点","73":"上门范围：黄浦区、卢湾区、徐汇区、长宁区、静安区、普陀区、闸北区、虹口区、杨浦区、浦东新区等外环高速以内、地铁沿线。","38":"上门范围：大连中山区、西岗区、沙河口区、甘井子区、旅顺口区、瓦房店、开发区，超出范围可与工程师约中间","37":"上门范围：于洪区、铁西区、皇姑区、大东区、沈河区、和平区、浑南区","14":"上门范围：迎泽区、小店区、万柏林区、尖草坪区、杏花岭区、晋源区","3":"上门范围：长安区、桥西区、新华区、裕华区，超出范围可与工程师约中间点","2":"上门范围：塘沽城区、 经济技术开发区、 临港工业区 、免税区等，地铁1、2、3、6、9号线全线，超出范围均可约中间点","236":"上门范围：1、2、3、6号线轻轨沿线，主城区、内环高速以内；大学城等地区。超出范围可与工程师约定上门地点","1":"上门范围：五环以内，五环外包括上地、回龙观、通州片区、亦庄朝林广场附近、地铁沿线。超出范围可与工程师约中间点" }
    </div>
    <article class="jdbox" id="focus">
        <div class="jdpic">
            <ul></ul>
        </div>
        <div class="jdmenu">
            <ul></ul>
        </div>
    </article>

    <article class="col services">
        <div class="wrap">
            <ul>
                <li class="l1"><s></s><p>免费上门</p></li>
                <li class="l2"><s></s><p>寄修包邮</p></li>
                <li class="l3"><s></s><p>高品质配件</p></li>
                <li class="l4"><s></s><p>180天免费保修</p></li>
                <li class="l5"><s></s><p>30分钟完美复活</p></li>
                <li class="l6"><s></s><p>修好付费</p></li>
            </ul>
        </div>
    </article>
    <div class="numbox">
        已成功复活<span class="timer"  data-speed="500"></span>部手机
    </div>
    <article class="col brands_fault" id="col2">
        <div class="hd">
            <dl>
                <dd class="hotBrand" title="热门手机维修"><em></em>热门维修</dd>
                <dd brandid="8" title="苹果手机维修" class="iphone cur"><em></em><label>苹果</label><span><i></i>换屏送钢化膜</span></dd>
                <dd brandid="12"title="华为手机维修"><em></em><label>华为</label></dd>
                <dd brandid="10" title="小米手机维修"><em></em><label>小米</label></dd>
                <dd brandid="11" title="三星手机维修"><em></em><label>三星</label></dd>
                <dd brandid="14" title="魅族手机维修"><em></em><label>魅族</label></dd>
                <dd brandid="17" title="oppo手机维修"><em></em><label>oppo</label></dd>
                <dd brandid="16" title="vivo手机维修"><em></em><label>vivo</label></dd>
                <dd brandid="19" title="乐视手机维修"><em></em><label>乐视</label></dd>
            </dl>
        </div>
        <div class="wrap">
            <div class="tab-cont-brand">
                <div class="item tuijian" id="tuijian" style="display: none">
                    <ul>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="235" mid="70" deviceid="17">
                                    <div class="div1" deviceid="17">
                                        <p class="model">iPhone 6</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                159
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    988
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="280" mid="70" deviceid="18">
                                    <div class="div1" deviceid="18">
                                        <p class="model">iPhone 6 Plus</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                199
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    1188
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="5327" mid="70" deviceid="117">
                                    <div class="div1" deviceid="117">
                                        <p class="model">iPhone 6S</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                159
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    1188
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="5329" mid="70" deviceid="118">
                                    <div class="div1" deviceid="118">
                                        <p class="model">iPhone 6S Plus</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                179
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    1388
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="6256" mid="70" deviceid="260">
                                    <div class="div1" deviceid="260">
                                        <p class="model">iPhone 7 Plus</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                269
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    1388
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="6253" mid="70" deviceid="259">
                                    <div class="div1" deviceid="259">
                                        <p class="model">iPhone 7</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                249
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    1188
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="外屏碎（图像正常）" brandid="" fmid="12" smid="9317" mid="70" deviceid="153">
                                    <div class="div1" deviceid="153">
                                        <p class="model">Mate 8</p>
                                        <p class="fault">外屏碎（图像正常）</p>
                                        <p class="price">￥<big>
                                                329
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    770
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="升级为64G" brandid="" fmid="179" smid="5891" mid="181" deviceid="17">
                                    <div class="div1" deviceid="17">
                                        <p class="model">iPhone 6</p>
                                        <p class="fault">升级为64G</p>
                                        <p class="price">￥<big>
                                                309
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    暂无
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="升级为128G" brandid="" fmid="179" smid="6020" mid="180" deviceid="117">
                                    <div class="div1" deviceid="117">
                                        <p class="model">iPhone 6S</p>
                                        <p class="fault">升级为128G</p>
                                        <p class="price">￥<big>
                                                429
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    暂无
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="电池续航时间短" brandid="" fmid="52" smid="268" mid="55" deviceid="17">
                                    <div class="div1" deviceid="17">
                                        <p class="model">iPhone 6</p>
                                        <p class="fault">电池续航时间短</p>
                                        <p class="price">￥<big>
                                                95
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    280
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="电池续航时间短" brandid="" fmid="52" smid="5619" mid="55" deviceid="117">
                                    <div class="div1" deviceid="117">
                                        <p class="model">iPhone 6S</p>
                                        <p class="fault">电池续航时间短</p>
                                        <p class="price">￥<big>
                                                115
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    388
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="电池续航时间短" brandid="" fmid="52" smid="313" mid="55" deviceid="18">
                                    <div class="div1" deviceid="18">
                                        <p class="model">iPhone 6 Plus</p>
                                        <p class="fault">电池续航时间短</p>
                                        <p class="price">￥<big>
                                                95
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    300
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="电池续航时间短" brandid="" fmid="52" smid="5605" mid="55" deviceid="118">
                                    <div class="div1" deviceid="118">
                                        <p class="model">iPhone 6S Plus</p>
                                        <p class="fault">电池续航时间短</p>
                                        <p class="price">￥<big>
                                                125
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    398
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                                <a href="#maodian"><li sulotionid="" malfunction="电池续航时间短" brandid="" fmid="52" smid="9332" mid="55" deviceid="153">
                                    <div class="div1" deviceid="153">
                                        <p class="model">Mate 8</p>
                                        <p class="fault">电池续航时间短</p>
                                        <p class="price">￥<big>
                                                160
                                        </big></p>
                                        <p class="price_market">(市场价:￥<del>
                                                    暂无
                                        </del>)</p>
                                    </div>
                                    <span></span>
                                </li></a>
                    </ul>
                </div>
                <div class="item" id="item_device">
                    <dl class="model-hd">
                    </dl>
                    <div class="tab-cont-fault">
                        <div class="con">
                            <ul></ul>
                            <ul id="morefault"></ul>
                        </div>
                        <div class="load"><s></s></div>
                    </div>
                </div>
                <div class="load"><s></s></div>
                <p class="ps">*同一机型不同颜色换屏价格略有差异，请以客服最终报价为准<font>其他故障请咨询：4008-112-112。</font></p>
                
        </div>
    </article>

    <article class="col processBox">
        <h2>服务方式</h2>
        <div class="tabTitle">
            <a class="active" href="javascript:">上门维修</a>
            <a href="javascript:"  class="disabled">--------------</a>
            <a href="javascript:">免费邮寄维修</a>
        </div>
        <div class="wrap">
            <div class="process">
                <div class="selectP">
                    <span>上门维修流程</span><s></s>
                    <ul>
                        <li>上门维修流程</li>
                        <li>---------</li>
                        <li>邮寄维修流程</li>
                    </ul>
                </div>
                <div class="process_pic">
                    <ol>
                        <li class="l1"><span>提交订单</span><span>安排上门</span><span>维修完成</span><span>支付</span><span>评价</span></li>
                        <li class="l3"><span>订单提交</span><span>邮寄设备</span><span>检测维修</span><span>支付</span><span>回寄</span><span>评价</span></li>
                        <li class="l2"><span>提交订单</span><span>到店维修</span><span>支付</span><span>评价</span></li>
                    </ol>
                </div>
            </div>
            <div class="gcsPic"><img src="images/19.jpg"/></div>
            <div class="gcsPic"><img src="images/20.jpg"/></div>
        </div>
    </article>
    <article class="col showFigure">
        <div class="wrap">
            <ul>
                <li>
                    <img src="//rs.jikexiu.com/resources/Nimages/landing/showpic1.jpg"/>
                    <p class="red">工程师持证上岗</p>
                    <p>专业培训，维修经验均3年以上</p>
                </li>
                <li>
                    <img src="//rs.jikexiu.com/resources/Nimages/landing/showpic2.jpg"/>
                    <p class="red">高品质配件</p>
                    <p>真材实料，给您放心品质</p>
                </li>
                <li>
                    <img src="//rs.jikexiu.com/resources/Nimages/landing/showpic3.jpg"/>
                    <p class="red">技术精良服务好</p>
                    <p>128道操作标准，规范有序</p>
                </li>
            </ul>
            <ul>
                <li>
                    <img src="//rs.jikexiu.com/resources/Nimages/landing/showpic4.jpg"/>
                    <p class="red">当面维修，避开维修猫腻</p>
                    <p>专业维修平台，好口碑胜于一切自夸</p>
                <li>
                    <img src="//rs.jikexiu.com/resources/Nimages/landing/showpic5.jpg"/>
                    <p class="red">满意再付款，无任何隐形消费</p>
                    <p>免费上门，修好再付费，更具性价比</p>
                </li>
                <li>
                    <img src="//rs.jikexiu.com/resources/Nimages/landing/showpic6.jpg"/>
                    <p class="red">全国联保，售后无忧</p>
                    <p>开具质保单，承诺180超长质保</p>
                </li>
            </ul>
        </div>
    </article>


            <form  id="biddingForm" >
                <div class="ksxdUpdate">
                    <h3>我要报修</h3>
                    <div class="select_models" id="maodian">
                        <div class="table_div">
                            <div class="weixiu">
                                <span id="sjxh">选择需要维修的设备</span>
                                <input type="hidden" id="myself_data" value="" style="display: none">
                                <s></s>
                                <div id="weixiu-cotent">
                                    <div id="weixiu-dropdown-content" class="dropdown-content">
                                        <ul id="weixiu_ul">
                                        <select id="brandId">
                                <c:forEach items="${blist }" var="b">
                                	<option value="${b.brandId }">${b.brandName }</option>
                                </c:forEach>                                
                                </select>
                                        </ul>
                                    </div>
                                    <div id="xh1" class="sj-dropdown-content">
                                        <ul id="xh1_ul">
                                        <select id="seriesId">
                                <c:forEach items="${slist }" var="s">
                                	<option value="${s.seriesId }">${s.seriesName }</option>
                                </c:forEach>                                
                                </select>                                        </ul>
                                    </div>
                                    <div class="color-dropdown-content" id="color-dropdown">
                                        <ul>
                                       <select id="modelId">
                                <c:forEach items="${mlist }" var="m">
                                	<option value="${m.modelId }">${m.modelName }</option>
                                </c:forEach>                                
                                </select>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="guzhang">
                                <span id="jjfa">确认故障与维修方案</span>
                                <s></s>
                                <div id="sjgz-dropdown-content" class="dropdown-content">
                                    <div class="sjwt">
                                        <ul class="sjwt_ul">
                                        </ul>
                                    </div>

                                    <div class="wxfa" id="wxfa1" >
                                        <ul>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="table_div">
                        <div class="name">
                            <input type="text" placeholder="怎么称呼你" id="userName" class="txt">
                        </div>
                        <div class="tel">
                            <input type="text" placeholder="填写能联系到您的电话" class="txt" id="mobilePhone">
                        </div>
                    </div>
                    <div class="table_div" style="margin-bottom:0">
                        <div class="place" >
                            <span id="address" class="place_code">所在地区</span>
                            <input type="hidden" id="myself_palce" value="" style="display: none">
                            <s></s>
                            <div  id="area_box" class="dropdown-content">
                                <dl>
                                    <dd class="areaCur">省份</dd>
                                    <dd>城市</dd>
                                    <dd>区县</dd>
                                </dl>
                                <div class="area-tab">
                                    <ul class="province" id="mapPr">
                                        <li class="tj">
                                            <span>直辖市</span>
                                            <div>
                                                   <p data-type="province" data-id="1">北京</p>
                                                   <p data-type="province" data-id="2">天津</p>
                                                   <p data-type="province" data-id="9">上海</p>
                                                   <p data-type="province" data-id="22">重庆</p>
                                            </div>
                                        </li>
                                        <li>
                                            <span class="sf">A-G</span>
                                            <div>
                                                     <p data-type="province" data-id="19">广东</p>
                                                     <p data-type="province" data-id="20">广西</p>
                                                     <p data-type="province" data-id="24">贵州</p>
                                                     <p data-type="province" data-id="28">甘肃</p>
                                                     <p data-type="province" data-id="12">安徽</p>
                                                     <p data-type="province" data-id="13">福建</p>
                                            </div>
                                        </li>
                                        <li>
                                            <span class="sf">H-K</span>
                                            <div>
                                                  <p data-type="province" data-id="21">海南</p>
                                                  <p data-type="province" data-id="18">湖南</p>
                                                  <p data-type="province" data-id="17">湖北</p>
                                                  <p data-type="province" data-id="3">河北</p>
                                                  <p data-type="province" data-id="7">吉林</p>
                                                  <p data-type="province" data-id="8">黑龙江</p>
                                                  <p data-type="province" data-id="10">江苏</p>
                                                  <p data-type="province" data-id="14">江西</p>
                                                  <p data-type="province" data-id="16">河南</p>
                                            </div>
                                        </li>
                                        <li>
                                            <span class="sf">L-S</span>
                                            <div>
                                                     <p data-type="province" data-id="23">四川</p>
                                                     <p data-type="province" data-id="29">青海</p>
                                                     <p data-type="province" data-id="30">宁夏</p>
                                                     <p data-type="province" data-id="27">陕西</p>
                                                     <p data-type="province" data-id="4">山西</p>
                                                     <p data-type="province" data-id="5">内蒙古</p>
                                                     <p data-type="province" data-id="6">辽宁</p>
                                                     <p data-type="province" data-id="15">山东</p>
                                            </div>

                                        </li>
                                        <li>
                                            <span class="sf">T-Z</span>
                                            <div>
                                                  <p data-type="province" data-id="11">浙江</p>
                                                  <p data-type="province" data-id="25">云南</p>
                                                  <p data-type="province" data-id="26">西藏</p>
                                                  <p data-type="province" data-id="31">新疆</p>
                                            </div>

                                        </li>
                                    </ul>
                                    <ul class="city" id="cityMap">

                                    </ul>
                                    <ul class="area" id="areaMap">

                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="position">
                            <input type="text" placeholder="你所在的位置，如：街道名/小区/大厦名.." id="placePositon" class="txt">
                            <div class="area_position" style="display: none" >
                                <ul >
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="note" id="door_range_cite" ></div>
                    <div class="table_div" style="margin-bottom:0">
                        <div class="time" >
                            <span id="time_code">选择上门时间</span>
                            <input type="hidden" id="myself_time" value="" style="display: none">
                            <s></s>
                            <div id="sm-time" style="display:none" class="dropdown-content">
                                <div id="sm-dropdown-content">
                                    <ul>

                                    </ul>
                                </div>
                                <div class="sm-dropdown-content-sj" id="sm-dropdown-content-sj">
                                    <ul>
                                        <li class="t9" time="9">09:00</li>
                                        <li class="t10" time="10">10:00</li>
                                        <li class="t11" time="11">11:00</li>
                                        <li class="t12" time="12">12:00</li>
                                        <li class="t13" time="13">13:00</li>
                                        <li class="t14" time="14">14:00</li>
                                        <li class="t15" time="15">15:00</li>
                                        <li class="t16" time="16">16:00</li>
                                        <li class="t17" time="17">17:00</li>
                                        <li class="t18" time="18">18:00</li>
                                        <li class="t19" time="19">19:00</li>
                                    </ul>
                                </div>
                                <div class="sm-dropdown-content-js" id="sm-dropdown-content-js">
                                    <ul>
                                        <li class="t10" time="10">10:00</li>
                                        <li class="t11" time="11">11:00</li>
                                        <li class="t12" time="12">12:00</li>
                                        <li class="t13" time="13">13:00</li>
                                        <li class="t14" time="14">14:00</li>
                                        <li class="t15" time="15">15:00</li>
                                        <li class="t16" time="16">16:00</li>
                                        <li class="t17" time="17">17:00</li>
                                        <li class="t18" time="18">18:00</li>
                                        <li class="t19" time="19">19:00</li>
                                        <li class="t19" time="20">20:00</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="yzm">
                            <input type="text" placeholder="输入验证码" class="txt" id="yzm" style="width:258px">
                            <img onclick="this.src='/order/quick/authcodeImg?rnd=' + Math.random();" src='/order/quick/authcodeImg'id="yzmsx" >
                        </div>
                    </div>
                    <textarea name="describe" id="other" cols="30" rows="10" class="txt" placeholder="您可以详细描述手机故障或其他要求（选填）" style="width:764px;height:104px"></textarea>
                    <div class="agreement">
                        <input type="checkbox" id="agreement" checked>
                        <label for="agreement">我已阅读并同意
                            <a href="http://www.jikexiu.com/article/articleDetails/62.html" target="_blank">《极客修服务协议》</a>
                        </label>
                    </div>
                    <div class="butbox">
                        <button  type="button" id="OrderSubmit" >确认下单</button>
                    </div>
                </div>
            </form>
            <input type="hidden" id="malfunction_id" name="malfunction_id">
            <input type="hidden" id="f_malfunction_id" name="f_malfunction_id">
            <input type="hidden" id="sm_id" name="sm_malfunction_id">
            <input type="hidden"   id="repairMethod" name="repairMethod"/>
        <div class="tjts">
            <p>*工作时间(8:00-22:00)将有来自工程师或区号023的座机与您联系，请保持电话畅通</p>
        </div>
    <div class="kj-survice site-inner clearFix">
        <!--dyh1031-->
        <p class="title">用户对我们的信任</p>
        <div class="float-left user-evaluate">
            <div id="scroll">
                <ul class="user-evaluate-list" style="top: 0px;">
           
                            <li class="clearFix">
                                <div class="user-img float-left">
                                    <img src="//rs.jikexiu.com/resources/Nimages/landing/user.png" alt="">
                                    <p>159****6956</p>
                                </div>
                                <div class="user-name float-left">
                                    <p class="mar-b-10 stars">
                                        <i   class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i class="star"></i>
                                    </p>
                                    <p class="col-hui" title="下完订单后，夏师傅很快联系我，预约上门时间，全过程录像，很专业，有问必答，耐心。非常满意！会推荐给同事～">下完订单后，夏师傅很快联系我，预约上门时间，全过程录像，很专业，有问必答，耐心。非常满意！会推荐给同事～</p>
                                    <p class="timeShow">2018-06-01 17:06</p>
                                </div>
                            </li>
                            <li class="clearFix">
                                <div class="user-img float-left">
                                    <img src="//rs.jikexiu.com/resources/Nimages/landing/user.png" alt="">
                                    <p>155****9954</p>
                                </div>
                                <div class="user-name float-left">
                                    <p class="mar-b-10 stars">
                                        <i   class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i class="star"></i>
                                    </p>
                                    <p class="col-hui" title="服务态度专业认真，为了此次维修，耽误了维修人员的午饭时间，辛苦了，谢谢。">服务态度专业认真，为了此次维修，耽误了维修人员的午饭时间，辛苦了，谢谢。</p>
                                    <p class="timeShow">2018-06-01 16:35</p>
                                </div>
                            </li>
                            <li class="clearFix">
                                <div class="user-img float-left">
                                    <img src="//rs.jikexiu.com/resources/Nimages/landing/user.png" alt="">
                                    <p>186****7108</p>
                                </div>
                                <div class="user-name float-left">
                                    <p class="mar-b-10 stars">
                                        <i   class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i class="star"></i>
                                    </p>
                                    <p class="col-hui" title="如果有10分，我绝对不评5分！工程师技术熟练，重要的是服务够贴心，完全从我的角度考虑，帮我解决手机的问题，因为是老客户还主动给我打折，还顺手帮我解决了另一台手机的毛病！极客修的这种顾客至上的态度让我怎么能不成为你们的忠实客户，我已经推荐了4-5个朋友了，用过都说好！希望继续保持，你们会越来越成功！你们是手机维修届的海底捞！">如果有10分，我绝对不评5分！工程师技术熟练，重要的是服务够贴心，完全从我的角度考虑，帮我解决手机的问题，因为是老客户还主动给我打折，还顺手帮我解决了另一台手机的毛病！极客修的这种顾客至上的态度让我怎么能不成为你们的忠实客户，我已经推荐了4-5个朋友了，用过都说好！希望继续保持，你们会越来越成功！你们是手机维修届的海底捞！</p>
                                    <p class="timeShow">2018-06-01 15:31</p>
                                </div>
                            </li>
                            <li class="clearFix">
                                <div class="user-img float-left">
                                    <img src="//rs.jikexiu.com/resources/Nimages/landing/user.png" alt="">
                                    <p>155****6583</p>
                                </div>
                                <div class="user-name float-left">
                                    <p class="mar-b-10 stars">
                                        <i   class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i class="star"></i>
                                    </p>
                                    <p class="col-hui" title="小哥非常好，技术熟练，大晚上不辞辛苦上门来给修并且手机修好后跟修前一样流畅，值得放心。">小哥非常好，技术熟练，大晚上不辞辛苦上门来给修并且手机修好后跟修前一样流畅，值得放心。</p>
                                    <p class="timeShow">2018-06-01 09:13</p>
                                </div>
                            </li>
                            <li class="clearFix">
                                <div class="user-img float-left">
                                    <img src="//rs.jikexiu.com/resources/Nimages/landing/user.png" alt="">
                                    <p>188****5148</p>
                                </div>
                                <div class="user-name float-left">
                                    <p class="mar-b-10 stars">
                                        <i   class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i  class="star"></i>
                                        <i class="star"></i>
                                    </p>
                                    <p class="col-hui" title="工程师挺好的，技术熟练，态度很好。但是电池不耐用。售后答应给换，换了再看一下吧。">工程师挺好的，技术熟练，态度很好。但是电池不耐用。售后答应给换，换了再看一下吧。</p>
                                    <p class="timeShow">2018-06-01 08:34</p>
                                </div>
                            </li>
                          
                          
                            
                       
                </ul>
            </div>
        </div>
        <div class="img-right">
            <img src="//rs.jikexiu.com/resources/Nimages/landing/img-right.png" alt="">
        </div>
    </div>
    <article class="col problem" id="col5">
        <div class="wrap">
            <h3>您可能关心的问题</h3>
            <ol>
                <li>
                    <h4>1、哪些城市支持手机上门维修？</h4>
                    <p>目前支持上门的分别为北京、上海、广州、深圳、重庆、成都、天津、南京、武汉、郑州、西安、长沙、东莞、佛山、惠州、昆明、玉溪、贵阳、合肥、苏州、无锡、常州、徐州、杭州、宁波、济南、青岛、南昌、	延安、兰州、福州、厦门、海口、银川、大连、太原、南宁、石家庄、邢台、呼和浩特、南通、沧州、孝感、哈尔滨、沈阳等城市。</p>
                </li>
                <li>
                    <h4>2、不支持手机上门维修的城市想要维修怎么办？</h4>
                    <p>邮寄到距离最近的维修中心，极客修负责双向邮寄费用。</p>
                </li>
                <li>
                    <h4>3、手机上门维修收上门费吗？</h4>
                    <p>上门手机维修，免收上门费。</p>
                </li>
                <li>
                    <h4>4、手机维修后更换的配件保修期是多久？</h4>
                    <p>屏幕180天，电池180天，苹果内存扩容30天，主板30天，其余配件终身保修。</p>
                </li>
                <li>
                    <h4>5、在线预约之后的服务流程是怎样的?</h4>
                    <p>工作时间(8:00-22:00)将有来自工程师或区号023的座机与您联系，并在要求时间内上门进行维修，维修完成后在线支付。</p>
                </li>
                <li>
                    <h4>6、外屏碎和内屏碎有什么区别？</h4>
                    <p>如果屏幕碎了，但图像可以正常显示，表示只是外屏碎。如果图片显示不正常或者完全无法显示，则内屏已碎。</p>
                </li>
                <li>
                    <h4>7、外屏碎，但手机触摸和图像显示正常，不维修可以吗？</h4>
                    <p>手机外屏是保护内屏的屏障，外屏碎裂后，汗液或水渍直接 穿过外屏玻璃，或者一次微小的跌落或撞击，都会对手机屏幕总成造成无可挽回的损伤，强烈建议及时更换屏幕。</p>
                </li>
                <li>
                    <h4>8、能提供单独更换苹果手机外屏玻璃服务吗？</h4>
                    <p>不提供。单换iPhone手机外屏玻璃，会造成液晶屏漏液或者触摸不灵敏，经过温度变化出现不牢靠的现象，故障率高、体验差。</p>
                </li>
                <li>
                    <h4>9、下单时需要支付费用吗？</h4>
                    <p>您只需在维修完成后支付。</p>
                </li>
            </ol>
        </div>
    </article>
    <!--

     -->
</section>
<footer id="footer">
    <div class="wrap">
        <div class="webInfo">
               
             <p class="info_aboutUs"><a href="">关于我们</a></p>
                <p class="info_aboutUs"><a href="">联系我们</a></p>
 

            <p class="Cust_Ser"><a href="javascript:void(0);"class="robot">在线客服</a><span>40008-000-00<time>服务时间：8:00-22:00</time></span></p>
        </div>

            <div class="Copyright">Copyright &copy;  </div>
    </div>
</footer>

<!-- <div class="right_lay_jinjia">
    <ul>
        <li class="quickRepair"><span class='quickO'><a href="#maodian">快速下单</a></span></li>
        <li class="hotline">服务热线
            <div class="lay_hotline">
                <dl>
                    <dt>服务热线</dt>
                    <dd>4008-112-112</dd>
                </dl>
                <dl>
                    <dt>服务时间</dt>
                    <dd>8:00 ~ 22:00</dd>
                </dl>
            </div>
        </li>
        <li class="toTop"><a id="toTop">回到顶部</a></li>
    </ul>
</div>
 -->
<script>
    jQuery(function ($) {
        getSysTime();
        //根据渠道显示电话  begin
        var orderSource = getQueryString("orderSource");
        // orderSource=null
        if (null == orderSource) orderSource = '0';
        $("#orderSource").val(orderSource);
        if (null != orderSource && orderSource != '0') {

            $(".editOrderSource").each(function () {
                var url = $(this).attr("href");
                url = url.replace("orderSource=0", "orderSource=" + orderSource);
                $(this).attr("href", url);
            });
            /* 	$("#shell").attr("href","http://www.jikexiu.com/order/quick/shell?orderSource="+orderSource);
              $("#memory").attr("href","http://www.jikexiu.com/order/quick/memory?orderSource="+orderSource);*/
            var channel = getChannelPhone(orderSource);
            if (channel && channel != null) {
                var telphone = channel.phone;
                var viewphone = channel.disp_phone;

                $("#header span").html("<s></s>预约热线:" + viewphone);
                $(".lay_hotline").find("dl").eq(0).find("dd").text(viewphone);
                $(".Cust_Ser").find("span")[0].firstChild.data = viewphone;
                $(".ps font").html("其他故障请咨询:" + viewphone + "。");
            } else {
                $("#header span").html("<s></s>预约热线:4008-112-112");
                $(".Cust_Ser").find("span")[0].firstChild.data = '4008-112-112';
                $(".lay_hotline").find("dl").eq(0).find("dd").text("4008-112-112");
                $(".ps font").html("其他故障请咨询:4008-112-112。");
            }
        } else {
                $("#header span").html("<s></s>预约热线:4008-112-112");
                $(".Cust_Ser").find("span")[0].firstChild.data = '4008-112-112';
                $(".lay_hotline").find("dl").eq(0).find("dd").text("4008-112-112");
                $(".ps font").html("其他故障请咨询:4008-112-112。");
        }
        //根据渠道显示电话  end
        //初始化数据 begin
        focusFun("#focus",".jdpic",".jdmenu");
        //型号选择菜单样式
        $(".brands_fault .hd").find("dd").unbind().bind("click",function(){
            if($(this).hasClass("hotBrand")){
                $("#tuijian").show();
                $("#item_device").hide();
                var tj = $("#tuijian ul li");
                for(var i=0; i < tj.length; i++){
                    if (i % 2  != 0){
                        $(".tuijian").find("li:odd").css("background","#f5e9ce");
                    }
                }
            }else{
                var brandId=$(this).attr("brandId");
                loadingShow();
                deviceMalfunction(-1,brandId);
                loadingHide();
                $("#tuijian").hide();
                $("#item_device").show();
            }

            $(this).addClass("cur").siblings("dd").removeClass("cur");
        });

        $(".brands_fault").find(".model-hd").unbind().on("click","dd",function(){
            //loadingShow();
            $(this).addClass("cur").siblings("dd").removeClass("cur");
        });
        
        getPrivince();
        devicechanage();
        deviceMalfunction(-1, 8);
        //初始化数据 end

        //点击维修方案事件  begin
        $(".hotbaojia").find("ul").unbind().on("click", "li", function () {
            $(this).addClass("cur").siblings("li").removeClass("cur");
            $("#sm_id").val($(this).attr("smid"));
            var mal = $(this).find("p").eq(0).text();
            $("#malfunction").val(mal);
        });
        //点击维修方案事件  end
        //热门维修、维修方案点击  begin
        $(".tab-cont-fault").find("ul").unbind().on("click", "li a", function () {
            $(this).addClass("cur").closest("li").siblings("li").find("a").removeClass("cur");
            var malfunction = $(this).parent().find("p").eq(0).html();
            var method = $(this).parent().attr("method");
            var malfunctionId = $(this).parent().attr("malfunctionid");
            var fmid = $(this).parent().attr("fmid");
            var smid = $(this).parent().attr("smid");
            var brandName = $(".hd .cur").find("label").html();
            var deviceName = $(".model-hd .cur").html();
            var brandId = $(".hd .cur").attr("brandId");
            var deviceId = $(".model-hd .cur").attr("data-deviceid");
            $(".q_brand ul").siblings("code").text(brandName).css("color", "#666");
            // $(".q_fault ul").siblings("code").text(malfunction).css("color","#666");
            $(".q_model ul").siblings("code").text(deviceName).css("color", "#666");
            $("#brand").val(brandId);
            $("#model").val(deviceId);
            $("#malfunction").val(malfunction);
            $("#malfunction_id").val(malfunctionId);
            $("#sm_id").val(smid);
            $("#f_malfunction_id").val(fmid);
            //设备信息写入span
            writeDevice(brandId,deviceId);
            if (malfunctionId != null && malfunctionId != '') {
                getSolutionMalFunction2(brandId, deviceId, malfunctionId, 0);
                getMalFunction1(deviceId);
            } else {
                getMalFunction2(deviceId);
            }
            getDevice1(brandId);


        });
        //热门维修 锚点
        $(".tuijian").find("ul").unbind().on("click", "li", function () {
            var domId = $($(this).parent("a").attr('href')),scrollHeight = domId.offset().top;
            if (scrollHeight != 0) {
                var brandId = $(this).attr("brandId");
                var deviceId = $(this).attr("deviceid");
                var malfunctionid = $(this).attr("mid");
                var malfunction = $(this).attr("malfunction");
                var sulotionid = $(this).attr("sulotionid");
                var fmid = $(this).attr("fmid");
                var smid = $(this).attr("smid");
                var model = $(this).find("p").eq(0).text();
                var fault = $(this).find("p").eq(1).text();
                var price = $(this).find("p big").text();
                $(".q_model ul").siblings("code").text(model).css("color", "#666");
                    $("#jjfa").attr("malfunctionid",malfunctionid);
                    $("#jjfa").attr("smid",smid);
                    $("#jjfa").attr("sulotionid",sulotionid);
                    var jjfa = $("#jjfa").text();
                    if (jjfa.indexOf("￥") > 0) {
                        $("#jjfa").text(jjfa.replace(jjfa,fault+ "￥" +price)).css("color","#161938");

                    } else {
                        $("#jjfa").text(fault+ "￥" +price).css("color","#161938");
                    }
                        // $("#sjxh").text(model).css("color","#161938");

            }

            $("#sjxh").attr("deviceId", deviceId);
            $("#sjxh").attr("brandId", brandId);
            writeBrandClass();
            getDevice(brandId);
            initColorlist(smid,brandId,deviceId,malfunctionid);
            getColorlist(deviceId);
            // scrollToLocation();
            $('.q_brand ul').find("li").each(function () {
                if (brandId == $(this).attr("brandid")) {
                    var brandName = $(this).text();
                    $(".q_brand ul").siblings("code").text(brandName).css("color", "#666");

                }
            });
            $("html,body").animate({"scrollTop": scrollHeight - 100});
            return false;
        });

        $(document).click(function () {
            //$(".select_models ul").slideUp(0);
              $(".select_models .table_div").find("div").removeClass("error");
        });
    });
    var url=window.ctx;
    $(document).ready(function () {

        $(window).load(function () {
            $('#weixiu-dropdown-content ul li:first').addClass("mr");

        });
        $(".weixiu").click(function (even) {//设备选择点击事件
            $(".dropdown-content").hide();
            $("#weixiu-cotent").show();
            $("#weixiu-dropdown-content,#xh1 ,#color-dropdown").show();
            //设备选中则需展示该设备颜色，没有选中不需要展示
            var elementsByClassName = document.getElementsByClassName("mr").length;
            if (elementsByClassName < 2) {
                $("#color-dropdown ul").html("");
            }
           // getBrand();
           //  scrollToLocation();
        });
        $("#weixiu-dropdown-content ul").on("click"," li",function () {//设备-品牌 选择点击事件
            //清空隐藏域
            $("#myself_data").attr("value","");
            var brandId=$(this).attr("brandid");
            if(brandId != $("#sjxh").attr("brandid")){
                $('#weixiu-dropdown-content ul li').removeClass("mr");
            }
            $("#sjxh").text("选择需要维修的设备").css("color","#999");
            $(this).addClass("mr");
            $("#sjxh").attr("brandId",brandId);
            //点击产品，收回之前查询出的颜色
                $(".dropdown-content").hide();
                $("#weixiu-cotent").show();
                $("#weixiu-dropdown-content,#xh1").show();
                $("#color-dropdown ul").html("");
            getDevice(brandId);
        });

        
        $("#xh1 ul").on('click','li',function () {//设备-设备名 选择点击事件
            $("#sjxh").text("选择需要维修的设备").css("color","#999");
            if($('#weixiu-dropdown-content ul li').hasClass("mr")){
                $("#xh1 ul li").removeClass("mr");
                $(this).addClass("mr");
                /* $("#color-dropdown").show();*/
                var device=$(this).text();
                var deviceId=$(this).attr("deviceid");

                $("#sjxh").attr("deviceId",deviceId);
                // myself_data
                var jQuery = $(this).html();
                $("#myself_data").attr("value",jQuery);
                getColorlist(deviceId);

            }
        });
        $("#color-dropdown ul").on('click', 'li', function () {//设备-颜色-颜色纸 选择点击事件
            if ($("#xh1 ul li").hasClass("mr")) {
                $(".color-dropdown-content ul li").removeClass("mr");
                $(this).addClass("mr");
                var colorId = $(this).attr("colorid");
                var valueId = $(this).attr("valueid");
                $("#sjxh").attr("colorId", colorId);
                $("#sjxh").attr("valueId", valueId);
                var color = $(this).text();
                var textShow = $("#myself_data").attr("value");
                // if (textShow != "选择需要维修的设备") {
                    if (textShow.indexOf("(") > 0) {
                        var sjxhth = textShow.substring(textShow.indexOf("("));
                        $("#sjxh").text(textShow.replace(sjxhth, "(" + color + ")")).css("color","#161938");
                    } else {
                        $("#sjxh").text(textShow + "(" + color + ")").css("color","#161938");
                    }
                // }
                //清空故障栏
                $("#jjfa").text("确认故障与维修方案").css("color","#999");

                setTimeout(function () {
                    $("#weixiu-cotent").hide();
                    $("#sjgz-dropdown-content").show();
                    var deviceId = $("#sjxh").attr("deviceid");

                    if (deviceId == undefined || deviceId == "") {
                        $("#sjgz-dropdown-content").hide();
                    } else {
                        $(".dropdown-content").hide();
                        $("#sjgz-dropdown-content").show();
                        $.post(url + "/order/quick/getMalFunctionByModelId", {deviceId: deviceId}, function (d) {
                                    var data = JSON.parse(d);

                                    var condata = data.malfunctionList;
                                    var context = "";
                                    if (condata != undefined) {
                                        for (var i = 0; i < condata.length; i++) {
                                            if($("#jjfa").text().indexOf("确认故障与维修方案") >-1){
                                                // var malfunctionId = $("#jjfa").attr("fmid");
                                                // if(malfunctionId == null){
                                                    $("#jjfa").attr("fmid",condata[0].id);
                                                var malfunctionId = $("#jjfa").attr("fmid");
                                                var mr = (malfunctionId == condata[i].id) ?"mr":"";
                                                context = context + "<li malfunctionId='" + condata[i].id + "' class='"+mr+"'>" + condata[i].name + "</li>";
                                            }
                                        }
                                    }
                                    $(".sjwt ul").html(context);
                                    if($("#jjfa").text().indexOf("确认故障与维修方案") > -1){
                                        initSolution();
                                    }else{
                                        var malfunctionid = $("#jjfa").attr("malfunctionid");
                                        var solutionid = $("#jjfa").attr("solutionid");
                                        var smid = $("#jjfa").attr("smid");
                                        getSolution(smid,deviceId,malfunctionid,0)
                                    }
                                }
                        )
                    }
                }, 50);
                if($(".weixiu").hasClass("error")){
                    $(".weixiu").removeClass("error");
                }
            }
        });

        $('.weixiu').on('click', function (event) {
            event.stopPropagation();
            event.preventDefault();
        });

        $("body").click(function (e) {
            $("#weixiu-cotent").hide();
            e.stopPropagation();
        });

        //故障选择  这里冒泡了 怎么处理
        $(".guzhang").click(function () {

            var deviceId = $("#sjxh").attr("deviceId");
            var colorId = $("#sjxh").attr("colorId");
            if($("#jjfa").text().indexOf("确认故障与维修方案") > -1){
                $("#jjfa").attr("fmid",null);
            }
            $(".dropdown-content").hide();
            if (colorId == null) {
                $("#sjgz-dropdown-content").hide();
                $("#weixiu-cotent").show();
                $("#weixiu-dropdown-content,#xh1,#color-dropdown").show();
                $("#color-dropdown ul").html("");
            } else {

                $("#sjgz-dropdown-content,.sjwt,#wxfa1").show();
                $.post(url + "/order/quick/getMalFunctionByModelId", {deviceId: deviceId}, function (d) {//初始化故障大类
                            var data = JSON.parse(d);
                            var condata = data.malfunctionList;
                            var context = "";
                            if (condata != undefined) {
                                for (var i = 0; i < condata.length; i++) {
                                    if($("#jjfa").attr("fmid") == null){
                                        $("#jjfa").attr("fmid",condata[0].id);
                                    }
                                    var mr = ($("#jjfa").attr("fmid") == condata[i].id) ? "mr" : "";
                                    context = context + "<li malfunctionId='" + condata[i].id + "' class='"+mr+"'>" + condata[i].name + "</li>";
                                }
                            }
                            $(".sjwt ul").html(context);

                            if($("#jjfa").attr("malfunctionid") == null || $("#jjfa").text().indexOf("确认故障与维修方案") > -1){
                                initSolution();
                            }else{
                                var malfunctionid = $("#jjfa").attr("malfunctionid");
                                var solutionid = $("#jjfa").attr("solutionid");
                                var smid = $("#jjfa").attr("smid");
                                getSolution(smid,deviceId,malfunctionid,0)
                            }
                        }
                )

            }
        });
        //点击选择故障弹出故障信息
        $(".sjwt").on('click','li',function (event) {
            var malfunctionid=$(this).attr("malfunctionid");
            var deviceId=$("#sjxh").attr("deviceId");
            // $("#jjfa").attr("malfuntionId",malfuntionId);
            $("#jjfa").attr("fmid",$(this).attr("malfunctionid"));
            $('.sjwt ul li').removeClass("mr");
            $(this).addClass("mr");
            $("#jjfa").text("确认故障与维修方案").css("color","#999");
            var flag=1;
            if(malfunctionid==""||malfunctionid==0||malfunctionid=="null"){
                flag=0;
            }
            initSolutionMalFunction(deviceId,malfunctionid,flag);
            event.stopPropagation();

        });

        //百度地图  SDK
        $("#placePositon").keyup(function () {
            var placeposition=$("#placePositon").val();
            var region=$("#address").attr("region");
            //display: none;
            $(".area_position ul").css('display','block');
            $.ajax({
                url: '//api.map.baidu.com/place/v2/suggestion',
                type: 'get',
                data: {
                    q:placeposition,
                    region:region,
                    ak:'G1qcYAT3eYiTBK9PeenB1SL9',
                    output:'json'
                },
                dataType: 'JSONP',
                success: function (data) {
                    if(data.status==0){
                        var result = data.result;
                        var context="";
                        for(var i=0;i<result.length;i++){
                            context=context+"<li>"+result[i].name+"</li>"
                        }
                        $(".area_position").show();
                        $(".area_position ul").html(context);
                    }
                }
            });
        });
        $("body").click(function (e) {
            $(".area_position").hide();
            e.stopPropagation();
        });
        $(".area_position ul").on('click','li',function () {
            var position=$(this).text();
            $("#placePositon").val(position);
        });

        $('.guzhang').on('click', function (event) {
            event.stopPropagation();
            event.preventDefault();
        });

        $("body").click(function (e) {
            $("#sjgz-dropdown-content").hide();
            e.stopPropagation();
        });
        //地区选择
        $(".place").click(function (event) {
            $(".dropdown-content").hide();
            $("#area_box").show();
            if($("#address").text().indexOf("所在地区") > -1){
                // $(".area-tab .province").show();


            }
            event.stopPropagation();
        });
        $(".province p").click(function () {
            $("#mapPr").hide();
            $("#areaMap").show();
            $("#cityMap").show();
        });

        $("body").click(function (e) {
            $("#area_box").hide();
            var address = $("#address").text();
                var split = address.split("/");
                if(split.length < 3){
                    $(".dropdown-content .province li p").removeClass("mr");
                    $(".dropdown-content .city li").removeClass("mr");
                    $("#address").text("所在地区").css("color","#999");
                    $("#door_range_cite").html("");
                    $("#door_range_cite").css("background-color","transparent");
                    $(".dropdown-content dl dd").removeClass("areaCur");
                    $(".dropdown-content dl dd:first").addClass("areaCur");
                    $("#area_box .area-tab ul :first").css('display','block');
                    $(".dropdown-content .province ").css('display','block');

                    $(".dropdown-content .city ").css('display','none');
                    $(".dropdown-content .area ").css('display','none');
                    if(!$(".area-tab ul li p").hasClass("mr")){
                        $(".area-tab .city li").css('display','none');

                    }
                    if(!$(".area-tab .city li").hasClass("mr")){
                        $(".area-tab .area li").css('display','none');
                    }
                }

            e.stopPropagation();
        });
        //上门时间
        $(".time").click(function (e) {
            $(".dropdown-content").hide();
            $("#sm-time").show();
            $("#sm-dropdown-content,#sm-dropdown-content-sj,#sm-dropdown-content-js").show();
            $("#sm-dropdown-content ul").find("li").each(function () {
                // alert(!$("#sm-dropdown-content ul li").hasClass("mr"));
                if (!$("#sm-dropdown-content ul li").hasClass("mr")) {
                    $("#sm-dropdown-content ul li:first").addClass("mr");
                    $("#myself_time").attr("value", $("#sm-dropdown-content ul li:first").text()+"/");
                }
            });
            if(!$("#sm-dropdown-content ul li").hasClass("mr")){
                $("#sm-dropdown-content-sj").hide();
            }
            if(!$("#sm-dropdown-content-sj ul li").hasClass("mr")){
                $("#sm-dropdown-content-js ul li").css('display', 'none');
            }
            e.stopPropagation();
        });

        $("#sm-dropdown-content-sj ul").on('click','li',function () {
            $("#sm-dropdown-content-js ul li").removeClass("mr");
        });

        $('.time').on('click', function (event) {
            event.stopPropagation();
            event.preventDefault();
        });

        $("body").click(function (e) {
            $("#sm-time").hide();
            e.stopPropagation();
        });
        //点击省市区，清除地址栏
        $(".area-tab").click(function () {
            $("#placePositon").val("");
        });

        //选择省份城市 弹出 地级城市
        $(".province p").click(function () {
            var url=window.ctx;
            var provinceId=$(this).attr("data-id");
            //清除隐藏域value值
            $("#myself_palce").attr("value","");
            //清除所在地区的文本框值
            $("#address").text($(this).text()).css("color","#161938");
            $("#door_range_cite").css("background-color","#fdf3e9");
            // $("#address").attr("cityId","");

            $("#address").attr("distId",null);
            var name=$(this).text();
            $.post(url+"/getCity.json",{privinceId:provinceId},function (d) {
                var data=JSON.parse(d);
                var cityList=data.cityList;

                var context="";
                for(var i=0;i<cityList.length;i++){
                    context=context+"<li cityId="+cityList[i].id+">"+cityList[i].name+"</li>";
                }
                $("#cityMap").html(context);
            });
            $("#address").attr("provinceId",provinceId);
            $("#address").attr("region",name);
            var parent = $(this).parents('ul');
            $('#area_box dd').removeClass('areaCur').eq(1).addClass('areaCur');
            $('#area_box ul').hide().eq(1).show();
            $('.province p').removeClass('mr');
            var provinceName = $(this).addClass("mr").text();
            if (provinceName.indexOf("北京") >= 0 || provinceName.indexOf("重庆") >= 0 || provinceName.indexOf("天津") >= 0 || provinceName.indexOf("上海") >= 0) {
                provinceName = provinceName +"/" +provinceName+ "市";
                $("#address").text(provinceName).css("color","#161938");
                // $("#myself_palce").attr("value",provinceName)
                $.post(url+"/getCity.json",{privinceId:provinceId},function (d) {
                    var data=JSON.parse(d);
                    var cityList=data.cityList;
                    var context="";
                    for(var i=0;i<cityList.length;i++){
                        var mr = cityList.length == 1 ? "mr" : "";
                        context=context+"<li class='"+mr+"' cityId="+cityList[i].id+">"+cityList[i].name+"</li>";

                    }
                    $("#cityMap").html(context);
                    var cityId=$("#cityMap li:first").attr("cityId");
                    $.post(url+"/getDist.json",{cityId:cityId},function (d) {
                        var data=JSON.parse(d);
                        var distList=data.distList;
                        var context="";
                        for(var i=0;i<distList.length;i++){
                            context=context+"<li distId="+distList[i].id+">"+distList[i].name+"</li>";
                        }
                        $("#areaMap").html(context);
                        $("#address").attr("cityId",cityId);

                        initcityDoor();
                    });
                });

                $('#area_box dd').removeClass('areaCur');

                $('#area_box dd').eq(2).addClass('areaCur');
                $('#area_box ul').hide().eq(2).show();


            }else{
                // $("#myself_palce").attr("value",provinceName);
                $("#address").text(provinceName).css("color","#161938");
            }
            // place_click_body();
        });

        //点击城市 加载区县
        $("#cityMap").on('click','li',function () {
            var cityId=$(this).attr("cityId");
            //清除所在地区的文本框值
            // $("#address").text("所在地区").css("color","#999");
            $.post(url+"/getDist.json",{cityId:cityId},function (d) {
                var data=JSON.parse(d);
                var distList=data.distList;
                var context="";
                for(var i=0;i<distList.length;i++){
                    context=context+"<li distId="+distList[i].id+">"+distList[i].name+"</li>";
                }
                $("#areaMap").html(context);
                $("#address").attr("cityId",cityId);

                initcityDoor();
            });
            $('#area_box dd').removeClass('areaCur').eq(2).addClass('areaCur');
            $('#area_box ul').hide().eq(2).show();
            $('#cityMap li').removeClass('mr');
            var cityName = $(this).addClass("mr").text();
            // var place = $("#myself_palce").attr("value");
            var place = $("#address").text();
            if (place.indexOf("/") >= 0) {
                var sjxhth = place.substring(place.indexOf("/"));
                // $("#myself_palce").attr("value",place.replace(sjxhth, "/" + cityName));
                $("#address").text(place.replace(sjxhth, "/" + cityName));
            } else {
                // $("#myself_palce").attr("value",place + "/" + cityName);
                $("#address").text(place + "/" + cityName);
            }

        });
        //绑定区县ID
        $("#areaMap").on('click','li',function () {
            var  distId=$(this).attr("distId");

            $("#address").attr("distId",distId);
            $('#areaMap li').removeClass('mr');
            var mapName = $(this).addClass("mr").text();
            // var place = $("#myself_palce").attr("value");
            var place = $("#address").text();
            $("#address").text();
            if (place.indexOf("北京") >= 0 || place.indexOf("重庆") >= 0 || place.indexOf("天津") >= 0 || place.indexOf("上海") >= 0) {
                if (place.indexOf("/") >= 0) {
                    var sjxhth = place.substring(0,place.indexOf("市")+1);
                    $(".place_code").text(sjxhth+ "/" + mapName).css("color","#161938");
                } else {
                    $(".place_code").text(place + "/" + mapName).css("color","#161938");
                }
            } else {
                if (place.lastIndexOf("/") > 0) {
                    var arr = place.split("/");
                    $(".place_code").text(arr[0]+ "/" + arr[1] + "/" + mapName).css("color","#161938");
                } else {
                    $(".place_code").text(place + "/" + mapName).css("color","#161938");
                }
            }
            if($(".place").hasClass("error")){
                $(".place").removeClass("error");
            }
            setTimeout(function () {
                $("#area_box").hide();
                $("#placePositon").focus();

            }, 50);
            // place_click_body();
            return false;
        });

        //查看支持上门城市
        function initcityDoor() {

            var cityId=$("#address").attr("cityId");
            if(cityId != undefined && cityId != null){
                // $("#door_range_cite").css("background","#fdf3e9");
                $("#door_range_cite").show();
            }
            var doorRange = eval("(" + $.trim($("#City_Door_Range_div").text())+")");
            var range = eval("doorRange["+cityId+"]");
            if(range){
                $("#repairMethod").val(1);
                $("#door_range_cite").html(range);
            } else{
                $("#repairMethod").val(0);
                // $("#door_range_cite").html("该地区不支持上门服务，需要您把设备邮寄到维修中心处理，请按需选择！");
                $("#door_range_cite").html("");
                $("#door_range_cite").css("background-color","transparent");
            }

        }

        //加载复活成功手机数量(每天统计一次)
        var script = window.document.createElement("script");
        script.src="//rs.jikexiu.com/orderTotal/1";
        script.type="text/javascript";
        window.document.body.appendChild(script);

        window._jiekxiu_setI = function(n) {
            var num = parseInt(n);
            var str = "";
            while(num > 0) {
                var n = num%10;
                str = n + str;
                num = parseInt(num/10);
            }
            return str;
        };
        window._jikexiu_setNum = function(num) {
            $(".numbox .timer").attr("data-to",window._jiekxiu_setI(num));

            var script = window.document.createElement("script");
            script.src="//rs.jikexiu.com/resources/js/number_load.js";
            script.type="text/javascript";
            window.document.body.appendChild(script);
        };

        //上门时间
//        var date = getServerDate();
        var date = new Date(parseInt($("#currentDate").val()));
        var Week = date.getDay();
        var Hours = date.getHours();
        var m = date.getMinutes();
        var tMonth=date.getMonth()+1;
        if(tMonth<10){
            tMonth="0"+tMonth;
        }
        var tData=date.getDate();
        if(tData<10){
            tData="0"+tData;
        }
        var day1 =tMonth+"-"+ tData;
        if(m<10){
            m="0"+m;
        }
        var current_time = Hours+"."+m;
        var a=0,b=7,w=1;
        if(current_time > 18.3){
            a=1,b=8,Week=Week+1;
        }

        for(i=a;i<b;i++){
            var dat=new Date((+date)+i*24*3600*1000);
            Week = Week+1;
            if(Week%7==0){var week = "六";}
            if(Week%7==1){var week = "日";}
            if(Week%7==2){var week = "一";}
            if(Week%7==3){var week = "二";}
            if(Week%7==4){var week = "三";}
            if(Week%7==5){var week = "四";}
            if(Week%7==6){var week = "五";}
            var dateStr = dat.getFullYear()+"-";
            if(dat.getMonth()<9){
                dateStr += "0";
            }
            dateStr+= (dat.getMonth()+1)+"-";
            if(dat.getDate() <= 9) {
                dateStr+="0";
            }
            dateStr+=(dat.getDate());
            var month=dat.getMonth()+1;
            if (month < 10 )
            {
                month="0"+month;
            }
            var day=dat.getDate();
            if(dat.getDate()<10){
                day="0"+dat.getDate();
            }
            if(i==0){
                $("#sm-dropdown-content ul").append("<li date='"+dateStr+"'>"+ month+"-"+ day+"(今天)</li>");
            }else if(i==1){
                $("#sm-dropdown-content ul").append("<li date='"+dateStr+"'>"+ month+"-"+ day+"(明天)</li>");
            }else{
                $("#sm-dropdown-content ul").append("<li date='"+dateStr+"'>"+ month+"-"+ day+" 周"+week+"</li>");
            }
        }
        //初始化上门时间
        var _date = $("#sm-dropdown-content li:first").text();
        var T=0;
        var Y=0;
        if(_date.indexOf(day1) >= 0 ){
            T = Hours+1;

            if(m>30){
                T = Hours+2;
            }
            Y=T+1;
            if(current_time <18.3){

                $("#sm-dropdown-content-sj").show().find(".t"+T).prevAll("li").hide();
                // $("#sm-dropdown-content-js").show().find(".t"+Y).prevAll("li").hide();
            }
        }else{

            $("#sm-dropdown-content-sj ").show().find("li").show();
        }
        //点击事件获取上门时间
        $("#sm-dropdown-content ul ").on('click','li',function () {
            $("#sm-dropdown-content ul li").removeClass("mr");
            var date = $("#myself_time").attr("value",$(this).text());
            if($(this).text()!= date+"/"){
                $("#sm-dropdown-content-sj ul li").removeClass("mr");
            }

            $(this).addClass("mr");
            var _date = $(this).text();

            if(_date.indexOf(day1) >= 0 ){
                var T = Hours+1;
                if(m>30){
                    T = Hours+2;
                }
                var Y=T+1;
                if(current_time <18.3){
                    // $("#time_code").text(_date + "/").css("color", "#161938");
                    $("#myself_time").attr("value",_date + "/");
                    $("#sm-dropdown-content-sj").show().find(".t"+T).prevAll("li").hide();

                    $("#sm-dropdown-content-js").show().find(".t"+Y).prevAll("li").hide();
                }
            }else{
                // $("#time_code").text(_date + "/").css("color", "#161938");
                $("#myself_time").attr("value",_date + "/");
                $("#sm-dropdown-content-sj ").show().find("li").show();
                // $("#sm-dropdown-content-js ").show().find("li").show();

            }

        });

       /* $(".starttime,.endtime").find("span").unbind().bind("click",function(e){
            $(this).siblings("ul").toggle();
            $(this).parent(".thetime").siblings(".thetime").find("ul").hide();
            e.stopPropagation();
        });
        $("#Stimelay").unbind().on("click","li",function(e){
            var _stime = $(this).text();
            $("#beginTime").val($(this).attr("time"));
            $("#endTime").val("");
            var time = parseInt($(this).attr("time"))+1;
            $("#Etimelay").show().find(".t"+time).prevAll("li").hide();
            $("#Stimelay").hide().siblings("span").text(_stime).addClass("selectedfont");
            $("#Etimelay").show().siblings("span").text("结束时间").removeClass("selectedfont");
            e.stopPropagation();
        });

        $("#Etimelay").unbind().on("click","li",function(){
            var _etime = $(this).text();
            $("#endTime").val($(this).attr("time"));
            $("#Etimelay").hide().siblings("span").text(_etime).addClass("selectedfont");
        });*/

        //点击上门时间事件获取结束时间
        $("#sm-dropdown-content-sj ul").on("click","li",function (){

            if ($("#sm-dropdown-content li").hasClass("mr")) {
                $("#sm-dropdown-content-sj li").removeClass("mr");
                $(this).addClass("mr");
                var sj = $("#myself_time").attr("value");
                // var sj = $("#time_code").text();
                var smsj = $(this).text();
                var time = $(this).text();
                $("#sm-dropdown-content-js li").each(function () {
                    $(this).css('display', 'block');
                    if (time >= $(this).text()) {
                        $(this).css('display', 'none');
                    }
                   // $('#sm-dropdown-content-sj ul').append($(this));

                });
                if (sj.indexOf(":") >= 0) {

                    var sjxhth = sj.substring(sj.indexOf("/"));
                    // $("#time_code").text(sj.replace(sjxhth, "/" + time));
                    $("#myself_time").attr("value",sj.replace(sjxhth, "/" + time));
                } else {
                    // $("#time_code").text(sj + time);
                    $("#myself_time").attr("value",sj + time);
                }
            }
        });
        $("#sm-dropdown-content-js li").click(function () {
            if ($("#sm-dropdown-content-sj li").hasClass("mr")) {
                $("#sm-dropdown-content-js li").removeClass("mr");
                $(this).addClass("mr");
                // var sj = $("#time_code").text();
                var sj = $("#myself_time").attr("value");
                var jssj = $(this).text();
                if (sj.indexOf("~") >= 0) {
                    var sjxhth = sj.substring(sj.indexOf("~"));
                    $("#time_code").text(sj.replace(sjxhth, "~" + jssj)).css("color", "#161938");
                    $("#time_code").attr("startTime",sjxhth);
                    $("#time_code").attr("endTime",jssj);
                } else {
                    $("#time_code").text(sj + "~" + jssj).css("color", "#161938");
                    $("#time_code").attr("startTime",sj);
                    $("#time_code").attr("endTime",jssj);
                }
                setTimeout(function () {
                    $("#sm-time").hide();
                    $(".yzm input").focus();
                }, 50);
            }
                if($(".time").hasClass("error")){
                    $(".time").removeClass("error");
                }
        });



        $('#area_box dd').each(function (i) {//地区选择的导航栏点击效果
            $(this).click(function (e) {
                $('#area_box dd').removeClass('areaCur');
                $(this).addClass('areaCur');
                $('.area-tab ul').hide().eq(i).show();
                e.stopPropagation();
            })
        });
        /*$('.area-tab p').click(function (e) {  //点击省份
            var parent = $(this).parents('ul');
            $('#area_box dd').removeClass('areaCur').eq(1).addClass('areaCur');
            $('#area_box ul').hide().eq(1).show();
            $('.province p').removeClass('mr');
            var provinceName = $(this).addClass("mr").text();

            if (provinceName.indexOf("北京") >= 0 || provinceName.indexOf("重庆") >= 0 || provinceName.indexOf("天津") >= 0 || provinceName.indexOf("上海") >= 0) {
                provinceName = provinceName +"/"+provinceName +"市";
                $(".place_code").text(provinceName).css("color", "#161938");
                $('#area_box dd').removeClass('areaCur');
                $('#area_box dd').eq(2).addClass('areaCur');
                $('#area_box ul').hide().eq(2).show();
            }else{
                $(".place_code").text(provinceName).css("color", "#161938");
            }
        });*/
        //锚点
        $("body").on("click", ".baoxiu", function () {
            var domId = $($(this).children('a').attr('href')), scrollHeight = domId.offset().top;
            if (scrollHeight != 0) {
                $("#myself_data").attr("value","");
                var deviceid = $(".model-hd .cur").attr("data-deviceid");
                if ($(".tab-cont-fault .con ul li a").hasClass("cur")) {
                    var smid = $(this).parent("li").attr("smid");
                    var malfunctionid = $(this).parent("li").attr("malfunctionid");
                    var solutionId = $(this).parent("li").attr("solutionId");
                    var fmid = $(this).parent("li").attr("fmid");
                    $("#jjfa").attr("solutionId",solutionId);
                    $("#jjfa").attr("malfunctionid",malfunctionid);
                    $("#jjfa").attr("smid",smid);
                    $("#jjfa").attr("fmid",fmid);
                    var method = $(this).parent("li").attr("method");
                    var fm = $(this).parent("li").find("p").text();
                    var fm1 = fm.substring(0,fm.indexOf("市场价"));
                    var jjfa = $("#jjfa").text();

                    if (jjfa.indexOf("￥") > 0) {
                        $("#jjfa").text($(this).text()).css("color","#161938");
                        $("#jjfa").text(jjfa.replace(jjfa,fm1));

                    } else {
                        $("#jjfa").text($(this).text()).css("color","#161938");
                        $("#jjfa").text(fm1);
                    }

                }
            }
            if ($("dl dd").hasClass("cur")) {
                var brandId = $(".hd .cur").attr("brandId");
            }

            $("#sjxh").attr("deviceId", deviceid);
            $("#sjxh").attr("brandId", brandId);
            writeBrandClass();
            getDevice(brandId);
            initColorlist(smid,brandId, deviceid, malfunctionid);
            getColorlist(deviceid);
            // scrollToLocation();
            $("html,body").animate({"scrollTop": scrollHeight - 100});

            return false;

        });
//更多故障报价>>锚点
        $("body").on("click", ".morePrice", function () {
            var domId = $($(this).children('a').attr('href')), scrollHeight = domId.offset().top;
            var brandId = $(".hd .cur").attr("brandId");
            var deviceid = $(".model-hd .cur").attr("data-deviceid");
            $("#jjfa").text("确认故障与维修方案").css("color","#999");
            $("#jjfa").attr("fmid",null);
            $("#sjxh").attr("deviceId", deviceid);
            $("#sjxh").attr("brandId", brandId);
            writeBrandClass();
            getDevice(brandId);
            initColorlist2(brandId, deviceid);
            getColorlist(deviceid);
            // scrollToLocation();
            $("html,body").animate({"scrollTop": scrollHeight - 100});
            return false;
        });
        //回到顶部
        $("#toTop").on("click", function () {
            // var domId = $($(this).children('a').attr('href')), scrollHeight = domId.offset().top;
            $("html,body").animate({"scrollTop": 0});
            return false;
        });
        //快速报修 锚点
        // $(".right_lay_jinjia ul li").
        $("body").on("click", ".quickO", function () {
            var domId = $($(this).children('a').attr('href')), scrollHeight = domId.offset().top;
            $("html,body").animate({"scrollTop": scrollHeight - 100});
            return false;
        });
        //热门维修
        //产品提交
        $("#OrderSubmit").unbind().bind("click", function () {
            if ($(this).hasClass("bt-gray")) {
                return false;
            }
            var brand = $("#sjxh").attr("brandId");
            var model=$("#sjxh").attr("deviceId");

            var attributeId = $("#sjxh").attr("colorid");
            var  valueId= $("#sjxh").attr("valueid");
            var malfunction = $("#jjfa").attr('malfunctionid');

            var solutionId = $("#jjfa").attr('solutionId');
            var province=$("#address").attr("provinceid");
            var city=$("#address").attr("cityid");
            var area=$("#address").attr("distid");

            var describe=$("#other").val();
            var userName=$("#userName").val();
            var mobile=$("#mobilePhone").val();
            var address=$("#placePositon").val();

            var sjxh = $("#sjxh").text(),
                    jjfa = $("#jjfa").text(),
                    name = $("#userName").val(),
                    mobilePhone = $("#mobilePhone").val(),
                    place = $(".place_code").text(),
                    position = $("#placePositon").val(),
                    smsj = $("#time_code").text();
            //必传数据校验
            if(brand == null || brand == undefined){
                $(".weixiu").addClass("error");
                show_weixiu_error();
                return false;
            }else{
                $(".weixiu").removeClass("error");
            }
            if(model == null || model == undefined){
                $(".weixiu").addClass("error");
                show_weixiu_error();
                return false;
            }else{
                $(".weixiu").removeClass("error");
            }
            if(attributeId == null || attributeId == undefined){
                $(".weixiu").addClass("error");
                show_weixiu_error();
                return false;
            }else{
                $(".weixiu").removeClass("error");
            }
            if(valueId == null || valueId == undefined){
                $(".weixiu").addClass("error");
                show_weixiu_error();
                return false;
            }else{
                $(".weixiu").removeClass("error");
            }
            if(sjxh.indexOf("选择需要维修的设备")>=0){
                $(".weixiu").addClass("error");
                show_weixiu_error();
                return false;
            }else{
                $(".weixiu").removeClass("error");
            }
            if (jjfa.indexOf("确认故障与维修方案")>=0 ) {
                $(".guzhang").addClass("error");
                show_guzhang_error();
                return false;
            } else {
                $(".guzhang").removeClass("error");
            }

            if(malfunction == null || malfunction == undefined){
                $(".guzhang").addClass("error");
                show_guzhang_error();
                return false;
            }else{
                $(".guzhang").removeClass("error");
            }
            if(solutionId == null || solutionId == undefined){
                $(".guzhang").addClass("error");
                show_guzhang_error();
                return false;
            }else{
                $(".guzhang").removeClass("error");
            }

            if (name == "" || name == null) {
                $("#userName").addClass("error").focus();
                return false;
            } else {
                $("#userName").removeClass("error");
            }
            if (!/^[1]{1}\d{10}$/.test(mobilePhone)) {
                $("#mobilePhone").addClass("error").focus();
                return false;
            } else {
                $("#mobilePhone").removeClass("error");
            }
            if(province == null || province == undefined){
                $(".place").addClass("error");
                show_place_error();
                return false;
            }else{
                $(".place").removeClass("error");
            }
            if(city == null || city == undefined){
                $(".place").addClass("error");
                show_place_error();
                return false;
            }else{
                $(".place").removeClass("error");
            }
            if(area == null || area == undefined){
                $(".place").addClass("error");
                show_place_error();
                return false;
            }else{
                $(".place").removeClass("error");
            }
            if(place.indexOf("所在地区") > 0){
                $(".place").addClass("error");
                show_place_error();
                return false;
            }else{
                $(".place").removeClass("error");
            }

            if(position==""||position==null){
                $("#placePositon").addClass("error").focus();
                return false;
            }
            else{
                $("#placePositon").removeClass("error");
            }
            if(place.indexOf("你所在的位置")  > 0){
                $("#placePositon").addClass("error").focus();
                return false;
            }
            else{
                $("#placePositon").removeClass("error");
            }
            if (smsj.indexOf("~")<0) {
                $(".time").addClass("error");
                show_time_error();
                return false;
            } else {
                $(".time").removeClass("error");
            }

            if (!$('#agreement').attr('checked')) {
                alert("请阅读服务协议");
                return false;
            }

            var yzm = $.trim($("#yzm").val());//图形验证码
            if(yzm =='' || yzm == null){
                $("#yzm").val('');
                $("#yzm").attr("placeholder", "请输入验证码");
                $("#yzm").one("blur", function(){
                    $("#yzm").attr("placeholder", "请输入验证码");
                });
                $("#yzm").addClass("tips");
                $("#yzm").val('').addClass("error").focus();

                var offTop = $(".yzm").offset().top;
                $("body").stop().animate({scrollTop:offTop},1);
                return false;
            }else{
                var checkyzm =false;
                $.ajax({
                    url:"/order/quick/checkAuthcode",
                    data : {
                        authcode:yzm
                    },
                    async: false,
                    dataType:"JSON",
                    type:"POST",
                    success:function(data){
                        if(data.status != 0) {
                            $("#yzm").val('');
                            $("#yzm").attr("placeholder", "请输入正确的验证码");
                            $("#yzm").one("blur", function(){
                                $("#yzm").attr("placeholder", "请输入验证码");
                            });
                            $("#yzm").addClass("tips");
                            var offTop = $(".yzm").offset().top;
                            $("body").stop().animate({scrollTop:offTop},1);
                            $("#yzmsx").click();
                            $("#yzm").val('').addClass("error").focus();
                            // return;
                            checkyzm=false;
                        }else{
                            checkyzm=true;
                        }
                    }
                });
                if(!checkyzm){
                    return false;
                }
            }

            $(this).addClass("bt-gray").html("提交中...");

            //处理上门时间 02-28(今天)/16:00
            var startTime = $("#time_code").attr("startTime");
            var endTime = $("#time_code").attr("endTime");
            var startDate = "";
            var startHour = "";
            var dataArr = startTime.split("/");

            if (dataArr[0].indexOf(")") > 0) {
                startDate = dataArr[0].substring(0, dataArr[0].indexOf("("));
                startHour = dataArr[1] + ":00";
            } else if (dataArr[0].indexOf(" ") > 0) {
                startDate = dataArr[0].substring(0, dataArr[0].indexOf(" "));
                startHour = dataArr[1] + ":00";
            }

            //获取当前时间年份
            var date=new Date;
            var year=date.getFullYear().toString();
            startTime = year + "-"+ startDate.toString() + " "+startHour;
            endTime = year +"-"+  startDate.toString() + " "+endTime.toString() + ":00";

            var authcode = $("#yzm").val();
            var data = {'brand':brand,'solutionId':solutionId,'valueId':attributeId,'attributeId':valueId,'model':model,'malfunction':malfunction,'province':province,'city':city,'area':area,
                'describe':describe,'userName':userName,'mobile':mobile,'address':address,'startTime':startTime,'endTime':endTime,'authcode':authcode};
            save(data);
            return false;
        });

        $('#agreement').click(function () {
            if ($("#OrderSubmit").hasClass('bt-gray')) {
                $("#OrderSubmit").removeClass("bt-gray");
            } else {
                $("#OrderSubmit").addClass("bt-gray");
            }
        });
        // $(".hd dl dd"){}
    });
    function show_weixiu_error() {
        $(".dropdown-content").hide();
        $("#weixiu-cotent").show();
        $("#weixiu-dropdown-content,#xh1 ,#color-dropdown").show();
        //设备选中则需展示该设备颜色，没有选中不需要展示
        var elementsByClassName = document.getElementsByClassName("mr").length;
        if (elementsByClassName < 2) {
            $("#color-dropdown ul").html("");
        }
    }
    function show_guzhang_error(){
        var deviceId = $("#sjxh").attr("deviceId");
        var colorId = $("#sjxh").attr("colorId");
        $(".dropdown-content").hide();
        if (colorId == null) {
            $("#sjgz-dropdown-content").hide();
            $("#weixiu-cotent").show();
            $("#weixiu-dropdown-content,#xh1,#color-dropdown").show();
            $("#color-dropdown ul").html("");
        } else {

            $("#sjgz-dropdown-content,.sjwt,#wxfa1").show();
            $.post(url + "/order/quick/getMalFunctionByModelId", {deviceId: deviceId}, function (d) {//初始化故障大类
                        var data = JSON.parse(d);
                        var condata = data.malfunctionList;
                        var context = "";
                        if (condata != undefined) {
                            for (var i = 0; i < condata.length; i++) {
                                if($("#jjfa").attr("fmid") == null){
                                    $("#jjfa").attr("fmid",condata[0].id);
                                }
                                var mr = ($("#jjfa").attr("fmid") == condata[i].id) ? "mr" : "";
                                context = context + "<li malfunctionId='" + condata[i].id + "' class='"+mr+"'>" + condata[i].name + "</li>";
                                // context = context + "<li malfunctionId='" + condata[i].id + "'>" + condata[i].name + "</li>";
                            }
                        }
                        $(".sjwt ul").html(context);

                        if($("#jjfa").attr("malfunctionid") == null){
                            initSolution();
                        }else{
                            var malfunctionid = $("#jjfa").attr("malfunctionid");
                            var solutionid = $("#jjfa").attr("solutionid");
                            var smid = $("#jjfa").attr("smid");
                            getSolution(smid,deviceId,malfunctionid,0)
                        }
                    }
            )

        }
    }
    function show_place_error(){
        $(".dropdown-content").hide();
        $("#area_box").show();
    }
    function show_time_error() {
        /*$(".dropdown-content").hide();
        $("#sm-time").show();
        $("#sm-dropdown-content,#sm-dropdown-content-sj,#sm-dropdown-content-js").show();
        if(!$("#sm-dropdown-content ul li").hasClass("mr")){
            $("#sm-dropdown-content-sj").hide();
        }
        if(!$("#sm-dropdown-content-sj ul li").hasClass("mr")){
            $("#sm-dropdown-content-js").hide();
        }*/
        $(".dropdown-content").hide();
        $("#sm-time").show();
        $("#sm-dropdown-content,#sm-dropdown-content-sj,#sm-dropdown-content-js").show();
        $("#sm-dropdown-content ul").find("li").each(function () {
            // alert(!$("#sm-dropdown-content ul li").hasClass("mr"));
            if (!$("#sm-dropdown-content ul li").hasClass("mr")) {
                $("#sm-dropdown-content ul li:first").addClass("mr");
                $("#myself_time").attr("value", $("#sm-dropdown-content ul li:first").text()+"/");
            }
        });
        if(!$("#sm-dropdown-content ul li").hasClass("mr")){
            $("#sm-dropdown-content-sj").hide();
        }
        if(!$("#sm-dropdown-content-sj ul li").hasClass("mr")){
            $("#sm-dropdown-content-js ul li").css('display', 'none');
        }
    }
    function deviceMalfunction(deviceId,brandId){
        $.post(url+"/order/quick/deviceMalfunction",{deviceId:deviceId,brandId:brandId},function(d){
            var json=JSON.parse(d);
            var data=json.solutionMalfunctionList;
            var devices=json.deviceList;
            $(".tab-cont-fault .con").find("ul").eq(0).empty();
            $(".tab-cont-fault .con").find("ul").eq(1).empty();
            if(brandId>0){
                $(".tab-cont-brand .item .model-hd").empty();
            }
            for(var i=0;i<devices.length ;i++){
                if(i==0){
                    $(".tab-cont-brand .item .model-hd").append("<dd  class=\"cur\" data-deviceid='"+devices[i].id+"'>"+ devices[i].model+"</dd>");
                }else{
                    $(".tab-cont-brand .item .model-hd").append("<dd data-deviceid='"+devices[i].id+"'>"+ devices[i].model+"</dd>");
                }
            }
            var index=0;
            for(var i=0;i<data.length ;i++){
                var gfprice=data[i].officialPrice;
                if(data[i].officialPrice<=0){
                    gfprice="暂无";
                }
                if(i>=8){
                    index=1;
                }
                if(data[i].status==1){
                    $(".tab-cont-fault .con").find("ul").eq(index).append("<li deviceid ='"+deviceId+"' solutionid ='"+data[i].solutionId+"' fmid='"+data[i].malfunctionFid+"' smid ='"+data[i].id+"' malfunctionid ='"+data[i].malfunctionId+"' method='"+data[i].method+"'><p class=\"faultN\">"+data[i].malfunctionName+"</p><p class=\"price\">￥"+data[i].price+"<small>起</small><font>市场价:￥<del>"+gfprice+"</del></font></p><span class='baoxiu'><a href=\"#maodian\" >我要报修</a></span></li>");
                }else{
                    if(i<15){
                        $(".tab-cont-fault .con").find("ul").eq(index).append("<li deviceid ='"+deviceId+"' solutionid ='"+data[i].solutionId+"' fmid='"+data[i].malfunctionFid+"' smid ='"+data[i].id+"' malfunctionid ='"+data[i].malfunctionId+"' method='"+data[i].method+"'><p class=\"faultN\">"+data[i].malfunctionName+"</p><p class=\"price\">￥"+data[i].price+"<font>市场价:￥<del>"+gfprice+"</del></font></p><span class='baoxiu'><a href=\"#maodian\">我要报修</a></span></li>");
                    }
                }
            }
            var deviceId=$(".item .model-hd .cur").attr("data-deviceid");
            $("#morefault").append("<li class='more col4' deviceid ='"+deviceId +"' brandId='"+brandId+"'><span class='morePrice'><a href='#maodian'>更多故障报价>></a></span></li>");
            devicechanage();
        });
    }
    function devicechanage(){
        $(".model-hd dd").unbind().bind("click",function(){
            var index= $(".model-hd dd").index(this);
            var deviceId=$(this).attr("data-deviceid");
            deviceMalfunction(deviceId,-1);
            $(this).addClass("cur").siblings().removeClass("cur");
        });
    }
   
    //初始化设备
    function initDevice() {
        var brandId = $("#sjxh").attr("brandid");
        $.post(url + "/order/quick/getModelByBrand", {brandId: brandId}, function (d) {
            var data = JSON.parse(d);
            var devices = data.deviceList;
            var colorid = $("#sjxh").attr("colorid");
            var valueid = $("#sjxh").attr("valueid");
            var device = $("#sjxh").attr("deviceid");

            var context = "";
            if (devices != undefined) {
                for (var i = 0; i < devices.length; i++) {
                    /*if (device == undefined) {
                        device = devices[0].id;
                        $("#sjxh").attr("deviceid", device);
                    }*/
                    $('#xh1_ul li').removeClass("mr");
                    var mr = (devices[i].id == device)?"mr" :"";
                    context = context + "<li deviceid='" + devices[i].id + "' class='"+mr+"'>" + devices[i].model + "</li>";
                }
            }
            $('#xh1 ul').html(context);

        });
    }
    //点击事件 加载品牌
    function writeBrandClass(){
        $.post(url + "", function (d) {
            //品牌回显
            var brandId = $("#sjxh").attr("brandId");
            $("#weixiu-dropdown-content ul li").removeClass("mr");
            var data = JSON.parse(d);
            var brands = data.brandList;
            var context = "";
            for (var i = 0; i < brands.length; i++) {
                var mr = (brandId == brands[i].id) ? "mr" : "";
                context = context + "<li brandId='" + brands[i].id + "' class='"+mr+"'>" + brands[i].name + "</li>";
            }
            $('#weixiu_ul').html(context);
        });
    }
    function getServerDate(){

            var xhr = null;
            if(window.XMLHttpRequest){
                xhr = new window.XMLHttpRequest();
            }else{ // ie
                xhr = new ActiveObject("Microsoft");
            }
            xhr.open("GET","/",false);
            xhr.send(null);
//            xhr.async(false);
            var date = xhr.getResponseHeader("Date");
            return new Date(date);

    }
    function getDevice(brandId){

        $.post(url+"/order/quick/getModelByBrand",{brandId:brandId},function(d){
            var data=JSON.parse(d);
            var devices=data.deviceList;
            var deviceid = $("#sjxh").attr("deviceid");
            var context="";
            if(devices!=undefined){
                for(var i=0;i<devices.length;i++){
                    var mr = (deviceid == devices[i].id) ?"mr":"";
                    deviceid == devices[i].id ? $("#myself_data").attr("value",devices[i].model):"";
                    context=context+"<li deviceid='"+devices[i].id+"' class='"+mr+"'>"+devices[i].model+"</li>";
                    if(deviceid == devices[i].id){
                        $("#xh1_ul").removeClass("mr");
                    }
                }
            }
            $('#xh1 ul').html(context);
            if($("#xh1 ul li").hasClass("mr")){
                getColorlist(deviceid);
            }else{
                $("#color-dropdown ul").html("");
            }
        });
    }
    function save(data){
        $.post(url+"/order/quick/saveOrderEx",data,function(dd){
            var d=JSON.parse(dd);
            if(d.status==0){
                window.location.href=url+'/order/quick/endQuickRepair?orderId='+d.orderId;

            }else{
                $("#OrderSubmit").removeClass("but-gray").html("提交订单");
                if(d.status==1){
                    // refresh();

                }else if(d.status==-2) {
                    $("#yzmsx").click();
                    $("#yzm").val('').addClass("error").focus();

                }
            }
        });
    }
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return unescape(r[2]); return null;
    }
    function getMalFunction1(deviceId){
        $.post(url+"/order/quick/getMalFunctionByModelId",{deviceId:deviceId},function(d){
            var data=JSON.parse(d);
            var malfunctionList=data.malfunctionList;
            $('.q_fault ul').empty();
            if(malfunctionList){
                for(var i=0;i<malfunctionList.length;i++){
                    if( $("#f_malfunction_id").val()==malfunctionList[i].id){
                        $(".q_fault ul").siblings("code").text(malfunctionList[i].name).css("color","#666");
                    }
                    $('.q_fault ul').append("<li malfunctionid='"+malfunctionList[i].id+"'>"+malfunctionList[i].name+"</li>");
                }
            }
        });
    }
    function getMalFunction2(deviceId){
        $.post(url+"/order/quick/getMalFunctionByModelId",{deviceId:deviceId},function(d){
            var data=JSON.parse(d);
            var malfunctionList=data.malfunctionList;
            $('.q_fault ul').empty();
            if(malfunctionList){
                for(var i=0;i<malfunctionList.length;i++){
                    if( $("#f_malfunction_id").val()==malfunctionList[i].id){
                        $(".q_fault ul").siblings("code").text(malfunctionList[i].name).css("color","#666");
                    }
                    $('.q_fault ul').append("<li malfunctionid='"+malfunctionList[i].id+"'>"+malfunctionList[i].name+"</li>");
                }
            }
            $(".q_fault").find("ul").show();
        });
    }
    function getDevice1(brandId){

        $.post(url+"/order/quick/getModelByBrand",{brandId:brandId},function(d){
            var data=JSON.parse(d);
            var devices=data.deviceList;
            $('.q_model ul').empty();
            if(devices!=undefined){
                for(var i=0;i<devices.length;i++){
                    //修改为要提平板的数据
                    $('.q_model ul').append("<li deviceid='"+devices[i].id+"'>"+devices[i].model+"</li>");

                }
            }
        });
    }
    //添加初始地址 begin============================
    function getPrivince(){
            $.post(url+"/getPrivinceList.json",function(d){
                var data=JSON.parse(d);
                var privinceList=data.privinceList;
                $("#door_range_cite").css("background-color","transparent");
                for(var i=0;i<privinceList.length;i++){

                    $('.area_box .area-tab .province').append("<li privinceid='"+privinceList[i].id+"'>"+privinceList[i].name+"</li>");
                }
            //添加初始地址 end============================

        });
    }
    function getSolution(smid,deviceId,malfunctionId,flag){//获取维修方案  我要报修按钮的点击事件
        $.post(url+"/order/quick/getSolutionMalfunction.json",{deviceId:deviceId,malfunctionId:malfunctionId,flag:flag},function(d){
            var data=JSON.parse(d);
            var smlist=data.solutionMalfunctionList;
            var context="";
            for(var i=0;i<smlist.length;i++){
                context=context+"<li solutionId='" + smlist[i].solutionId + "' malfunctionId='" + smlist[i].malfunctionId + "' malfunctionName='"+smlist[i].malfunctionName+"' price='"+smlist[i].price+"' ><div class='p1'>"+smlist[i].malfunctionName+"<span >￥"+smlist[i].price+"</span></div><div class='p2' id='solutionMethod' >"+smlist[i].method+"</div></li>";

                if (smlist[i].id == smid) {
                    $("#jjfa").attr("solutionId", smlist[i].solutionId);
                    $("#jjfa").attr("malfunctionId", smlist[i].malfunctionId);
                    $("#jjfa").attr("malfunctionName", smlist[i].malfunctionName);
                    $("#jjfa").attr("fmid", smlist[i].malfunctionFid);
                    $("#jjfa").attr("price", smlist[i].price);
                    $("#jjfa").text(smlist[i].malfunctionName+"￥"+smlist[i].price);
                }
            }

            $("#wxfa1 ul").html(context);
            wxfa_bind_click_event();

        });
    }
    function initSolutionMalFunction(deviceId,malfunctionId,flag){

        $.post(url+"/order/quick/getSolutionMalfunction.json",{deviceId:deviceId,malfunctionId:malfunctionId,flag:flag},function(d){
            var data=JSON.parse(d);
            var smlist=data.solutionMalfunctionList;
            var context="";
            $("#jjfa").text("确认故障与维修方案").css("color","#999");
            if(smlist) {
                for(var i=0;i<smlist.length;i++){
                    context=context+"<li solutionId='" + smlist[i].solutionId + "' malfunctionId='" + smlist[i].malfunctionId + "' malfunctionName='"+smlist[i].malfunctionName+"' price='"+smlist[i].price+"' ><div class='p1'>"+smlist[i].malfunctionName+"<span >￥"+smlist[i].price+"</span></div><div class='p2' id='solutionMethod' >"+smlist[i].method+"</div></li>";
                }
            }
            $("#wxfa1 ul").html(context);

            wxfa_bind_click_event();
        });


    }
    function wxfa_bind_click_event() {//维修方案绑定点击事件
        $('#wxfa1 ul li').bind('click', function(e) {
            var solutionId = this.getAttribute("solutionId");
            var malfunctionId = this.getAttribute("malfunctionId");
            var malfunctionName = this.getAttribute("malfunctionName");
            var price = this.getAttribute("price");
            $("#jjfa").attr("solutionId",solutionId);
            $("#jjfa").attr("malfunctionId",malfunctionId);
            $("#jjfa").attr("malfunctionName",malfunctionName);
            $("#jjfa").attr("price",price);
            var jjfa = $("#jjfa").text();
            if (jjfa.indexOf("￥") > 0) {
                var s = malfunctionName+"￥"+price;
                // $("#jjfa").text(jjfa.replace(jjfa,s.substring(0,s.indexOf("更"))));
                $("#jjfa").text(jjfa.replace(jjfa,s)).css("color","#161938");
            } else {
                var s = malfunctionName+"￥"+price;
                $("#jjfa").text(s).css("color","#161938");
            }

            setTimeout(function () {
                $("#sjgz-dropdown-content").hide();
                $("#userName").focus();
            }, 50);
            if($(".guzhang").hasClass("error")){
                $(".guzhang").removeClass("error");
            }
            //阻止冒泡
            return false;
        });

    }
    function getMalFunction(deviceId){
        $(".q_fault ul").siblings("code").text("设备故障").css("color","#999");
        $.post(url+"/order/quick/getMalFunctionByModelId",{deviceId:deviceId},function(d){
            var data=JSON.parse(d);
            var malfunctionList=data.malfunctionList;
            $('.q_fault ul').empty();
            if(malfunctionList) {
                for (var i = 0; i < malfunctionList.length; i++) {
                    $('.q_fault ul').append("<li malfunctionid='" + malfunctionList[i].id + "'>" + malfunctionList[i].name + "</li>");
                }
            }
        });
    }
    ////热门维修、维修方案点击  end

    function writeDevice(brandId,deviceid){
        $.post(url+"/order/quick/getModelByBrand",{brandId:brandId},function(d){
            var data=JSON.parse(d);
            var devices=data.deviceList;
            var context="";
            if(devices!=undefined){
                for(var i=0;i<devices.length;i++){
                    if (devices[i].id == deviceid) {
                        // $("#sjxh").text(devices[i].model);
                        $("#myself_data").attr("value",devices[i].model);
                    }
                }
            }
        });

    }
    function getSolutionMalFunction(deviceId,malfunctionId,flag){
        $(".hotbaojia").hide();
        $('.hotbaojia ul').empty();
        $.post(url+"/order/quick/getSolutionMalfunction.json",{deviceId:deviceId,malfunctionId:malfunctionId,flag:flag},function(d){
            var data=JSON.parse(d);
            var solutionMalfunctionList=data.solutionMalfunctionList;
            if(solutionMalfunctionList) {
                var smid = $("#sm_id").val();
                for (var i = 0; i < solutionMalfunctionList.length; i++) {
                    if(smid==solutionMalfunctionList[i].id){
                        $('.hotbaojia ul').append(" <li  smid='"+solutionMalfunctionList[i].id+"' class='cur'><p class='p1'>"+solutionMalfunctionList[i].malfunctionName+"<font>￥"+solutionMalfunctionList[i].price+"</font></p><p class='p2'>"+solutionMalfunctionList[i].method+"</p></li>");
                    }else{
                        $('.hotbaojia ul').append(" <li smid='"+solutionMalfunctionList[i].id+"'><p class='p1'>"+solutionMalfunctionList[i].malfunctionName+"<font>￥"+solutionMalfunctionList[i].price+"</font></p><p class='p2'>"+solutionMalfunctionList[i].method+"</p></li>");
                    }
                }
                if(solutionMalfunctionList.length>0){
                    $(".hotbaojia").show();
                }
            }
        });
    }
    function getSolutionMalFunction2(smid,brandId,deviceId,malfunctionId,flag){
        $(".hotbaojia").hide();
        $('.hotbaojia ul').empty();
        $("#weixiu-dropdown-content").hide();


        $('.wxfa ul').empty();
        $.post(url+"/order/quick/getSolutionMalfunction.json",{deviceId:deviceId,malfunctionId:malfunctionId,flag:flag},function(d){
            var data=JSON.parse(d);
            var solutionMalfunctionList=data.solutionMalfunctionList;
            if(solutionMalfunctionList) {
                var scolorId= $("#sjxh").attr("colorId");
                var sdeviceId = $("#sjxh").attr("deviceId");
                for (var i = 0; i < solutionMalfunctionList.length; i++) {
                    $.post(url + "/order/quick/getMalFunctionByModelId", {deviceId: deviceId}, function (d) {
                                var data = JSON.parse(d);
                                var condata = data.malfunctionList;
                                var context = "";
                                if (condata != undefined) {
                                    for (var i = 0; i < condata.length; i++) {
                                        if($("#jjfa").attr("fmid") == null){
                                            $("#jjfa").attr("fmid",condata[0].id);
                                        }
                                        // context = context + "<li malfunctionId='" + condata[i].id + "'>" + condata[i].name + "</li>";
                                        var mr = ($("#jjfa").attr("fmid") == condata[i].id) ? "mr" : "";
                                        context = context + "<li malfunctionId='" + condata[i].id + "' class='"+mr+"'>" + condata[i].name + "</li>";
                                    }
                                    $("#jjfa").attr("malfunctionid",malfunctionId)
                                }
                                $(".sjwt ul").html(context);

                            }
                    )

                }
                if(solutionMalfunctionList.length>0){
                    $(".hotbaojia").show();
                }
            }
        });
        getSolution(smid, deviceId,malfunctionId,flag);
    }
    //选择手机设备
    function getColorlist(deviceId) {
        $.post(url+"/order/getDeviceAttributeList.json",{deviceId:deviceId},function(d){
            var data=JSON.parse(d);
            var colorList=data.deviceAttributeList;
            var colorid =$("#sjxh").attr("colorid");
            var valueid =$("#sjxh").attr("valueid");
            var context="";
            if(colorList!=undefined){
                for(var i =0;i<colorList.length;i++){
                        if(colorid == colorList[i].id && valueid == colorList[i].attributeId){
                            $("#color-dropdown ul li").removeClass("mr");
                            $("#sjxh").attr("colorId", colorList[i].id);
                            $("#sjxh").attr("valueId", colorList[i].attributeId);
                            var textShow = $("#myself_data").attr("value");
                            if (textShow != "选择需要维修的设备" && textShow != undefined) {
                                // $("#sjxh").text($(this).text()).css("color","#161938");
                                if (textShow.indexOf("(") > 0) {
                                    var sjxhth = textShow.substring(textShow.indexOf("("));
                                    $("#sjxh").text(textShow.replace(sjxhth, "(" + colorList[i].attributeValue + ")")).css("color","#161938");
                                } else {
                                    $("#sjxh").text(textShow + "(" + colorList[i].attributeValue + ")").css("color","#161938");
                                }
                            }
                        }
                    var mr = (colorid == colorList[i].id && valueid == colorList[i].attributeId) ? "mr" : "";
                    var context=context+"<li colorid='"+colorList[i].id+"' valueid='"+colorList[i].attributeId+"' class='"+mr+"'>"+colorList[i].attributeValue+"</li>";


            }
            }
            $(".color-dropdown-content ul").html(context);
        });
        if($("#jjfa").text().indexOf("确认故障")<0){
            setTimeout(function () {
                $("#sjgz-dropdown-content").hide();
                // $("#weixiu-cotent").hide();
                $("#userName").focus();
            }, 50)
        }else{
            $("#sjgz-dropdown-content").show();
            var deviceId = $("#sjxh").attr("deviceId");
            $(".dropdown-content").hide();
            $("#sjgz-dropdown-content,.sjwt,#wxfa1").show();
            $(".sjwt ul li").removeClass("mr");
            $.post(url + "/order/quick/getMalFunctionByModelId", {deviceId: deviceId}, function (d) {//初始化故障大类
                            var data = JSON.parse(d);
                            var condata = data.malfunctionList;
                            var context = "";
                            if (condata != undefined) {
                                for (var i = 0; i < condata.length; i++) {
                                    if($("#jjfa").attr("fmid") == null || $("#jjfa").attr("fmid") == undefined){
                                        $("#jjfa").attr("fmid",condata[0].id);
                                    }
                                    var mr = ($("#jjfa").attr("fmid") == condata[i].id) ? "mr" : "";
                                    context = context + "<li malfunctionId='" + condata[i].id + "' class='"+mr+"'>" + condata[i].name + "</li>";
                                }
                            }
                            $(".sjwt ul").html(context);
                        initSolution();
                        }
                )

            // }
        }

    }
    function initColorlist2(brandId,deviceid) {
        $.post(url+"/order/getDeviceAttributeList.json",{deviceId:deviceid},function(d){
            var data=JSON.parse(d);
            var colorList=data.deviceAttributeList;
            var context="";
            if(colorList!=undefined){
                // var context=context+"<li colorid='"+colorList[0].id+"' valueid='"+colorList[0].attributeId+"'>"+colorList[0].attributeValue+"</li>";
                $("#sjxh").attr("colorId", colorList[0].id);
                $("#sjxh").attr("valueId", colorList[0].attributeId);
                $("#sjxh").attr("deviceId", deviceid);
                $("#sjxh").attr("brandId", brandId);
                var color = colorList[0].attributeValue;
                var textShow = $("#sjxh").html();
                // $("#sjxh").text($(this).text()).css("color","#161938");
                if (textShow != "选择需要维修的设备" && textShow != undefined) {
                    if (textShow.indexOf("(") > 0) {
                        var sjxhth = textShow.substring(textShow.indexOf("("));
                        $("#sjxh").text(textShow.replace(sjxhth, "(" + color + ")")).css("color","#161938");
                    } else {
                        $("#sjxh").text(textShow + "(" + color + ")").css("color","#161938");
                    }
                }
            }
        });

        // getSolutionMalFunction2(smid,brandId, deviceid, malfunctionid, 0);
        // initSolution();
    }
    function initColorlist(smid,brandId,deviceid,malfunctionid) {
        $.post(url+"/order/getDeviceAttributeList.json",{deviceId:deviceid},function(d){
            var data=JSON.parse(d);
            var colorList=data.deviceAttributeList;
            var context="";
            if(colorList!=undefined){
                // var context=context+"<li colorid='"+colorList[0].id+"' valueid='"+colorList[0].attributeId+"'>"+colorList[0].attributeValue+"</li>";
                $("#sjxh").attr("colorId", colorList[0].id);
                $("#sjxh").attr("valueId", colorList[0].attributeId);
                $("#sjxh").attr("deviceId", deviceid);
                $("#sjxh").attr("brandId", brandId);
            }
        });

        getSolutionMalFunction2(smid,brandId, deviceid, malfunctionid, 0);
    }
    //获取当前服务器时间
    function getSysTime() {
        $.ajax({
            url: "/order/quick/getTime",
            type: 'post',
            data : {},
            async: false,
            dataType:"JSON",
            success: function (data) {
                $("#currentDate").attr("value",data.currentTime);
            }
        });
    }
    //初始化解决方案
    function initSolution() {
        // var malfuntionId = $('#jjfa').attr('malfunctionid');

        // if (malfuntionId == null){
        var  malfuntionId = $(".sjwt ul li:first").attr("malfunctionId");
            // var malfuntionId = malfId;
        // }
        var deviceId = $("#sjxh").attr("deviceId");
        var flag = 1;
        if (malfuntionId == "" || malfuntionId == 0 || malfuntionId == "null") {
            flag = 0;
        }
        initSolutionMalFunction(deviceId,malfuntionId,flag);
    }
    //轮播
    function focusFun(obj,jdpic,jdmenu){
         var banner ;
             banner = '<li class=""><img src="//rs.jikexiu.com/resources/Nimages/banner/pc/banner_pg.jpg"/></li>'+
                 '<li class="animated"><img src="//rs.jikexiu.com/resources/Nimages/banner/pc/banner_gz.jpg"/></li>'+
                 '<li class="animated"><img src="//rs.jikexiu.com/resources/Nimages/banner/pc/banner_jgtm.jpg"/></li>'+
                 '<li class="animated"><img src="//rs.jikexiu.com/resources/Nimages/banner/pc/banner_pa.jpg"/></li>'+
                 '<li class="animated"><img src="//rs.jikexiu.com/resources/Nimages/banner/pc/banner_gome.jpg"/></li>';


        $(jdpic).find("ul").append(banner);

        var len = $(jdpic).find("li").length;
        var index = 1; //$(obj).find(".jdpic li").index(this);
        var time;

        for (var i = 1; i <= len; i++) {
            $(jdmenu).find("ul").append("<li></li>");
            $(jdmenu).find("ul").find("li").eq(0).addClass("active")
        }
        show(0);

        $(jdmenu).find("li").hover(function(){
            index=$(this).index();
            show(index);
        });

        $(obj).find(jdpic).hover(function(){
            clearInterval(time);
        },function(){
            time=setInterval(function(){
                show(index);
                index++;
                if(index==len){index=0;}
            },5000);
        }).trigger("mouseleave");


        function show(index){
            $(jdmenu).find("li").eq(index).addClass("active").siblings().removeClass("active");
            $(jdpic).find("li").eq(index).stop().animate({opacity:'1'},1000).siblings().stop().animate({opacity:'0'},1000);
            $(jdpic).find("li").eq(index).css("z-index","10").siblings().css("z-index","-1");
        }

        var orderSource=getQueryString("orderSource");
        if(null == orderSource) orderSource='0';
        $("#gionee").attr("href","http://www.jikexiu.com/gionee/index?brandId=20&orderSource="+orderSource);
        function getQueryString(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return unescape(r[2]); return null;
        }
    }
    //品牌选中样式滚动到可视范围
    /*function scrollToLocation() {
        if($('#xh1 ul li').hasClass("mr")){
            var scrollToContainer = $(this);
            $('#xh1 ul').animate({
                // scrollTop: scrollToContainer.offset().top +  300
            }, 1000);//2秒滑动到指定位置
        }

    }*/
    //显示加载
    function loadingShow(){
        $("#loading").find(".loaded").remove();
        var loadhtml = '<div class="loaded"><div class="load8"><img src="images/17.jpg"/><p>正在加载数据</p></div></div>';
        $("#loading").show().append(loadhtml);
    }
    //隐藏加载
    function loadingHide(){
        $("#loading").hide();
    }
    //IE9及以下 Placeholder解决方案
    function initPlaceholder(){
        $(".emlay").find("input,textarea").each(function(){
            var $this = $(this);
            var text = $this.attr("placeholder"||"");
            var value = $.trim($this.val());
            if(value != '') {
                $this.after("<em style='display:'>"+text+"</em>");
            } else {
                $this.after("<em>"+text+"</em>");
            }
            var $em = $(this).next("em");

            $this.focus(function(){
                $em.hide();
            });

            $em.click(function(){
                $this.focus();
            });

            $this.blur(function(){
                var curentValue = $.trim($this.val());
                if(curentValue == '') {
                    $em.show();
                }
            });
        });
    }
    //下单流程查看
    $(".processBox").find(".selectP span").unbind().bind("click",function(even){
        $(this).siblings("ul").toggle(0,function(){
            $(this).find("li").each(function(i){
                $(this).unbind().bind("click",function(){
                    var _txt = $(this).text();
                    $(".processBox").find(".selectP span").text(_txt);
                    $(this).closest("ul").hide();
                    $(".process_pic").find("li").eq(i).show().siblings("li").hide();
                    $('.tabTitle a').eq(i).addClass('active').siblings().removeClass('active');/*x170715dyh*/
                });
            });
        });
        even.stopPropagation();
    });

    $(".tabTitle a").each(function(i){/*x170715dyh*/
        $(this).unbind().bind("click",function(even){
            $(this).addClass('active').siblings().removeClass('active');
            $(".selectP span").text($(".selectP li").eq(i).text());
            $(".process_pic").find("li").eq(i).show().siblings("li").hide();
            even.stopPropagation();
        });
    });


    $(document).click(function(){
        $(".processBox").find(".selectP ul").hide();
        $(".table_div > div").find("ul").hide();
    });

    $("input[type='text']").keyup(function(){
        $(this).removeClass("error");
    });
    //IE
    var DEFAULT_VERSION = "9.0";
    var ua = navigator.userAgent.toLowerCase();
    var isIE = ua.indexOf("msie")>-1;
    var safariVersion;
    if(isIE){
        safariVersion =  ua.match(/msie ([\d.]+)/)[1];
        if(safariVersion <= DEFAULT_VERSION ){
            initPlaceholder();
            $(".tuijian").find("li:odd").css("background","#f5e9ce");
        }
    }
</script>

<script type="text/javascript">
$("body").on("click", "#appO", function () {
var domId = $($(this).attr('href')), scrollHeight = domId.offset().top;
$("html,body").animate({"scrollTop": scrollHeight - 100});
return false;
});
</script>
</body>
</html>
<div style="display: none"><!--BD static-->
