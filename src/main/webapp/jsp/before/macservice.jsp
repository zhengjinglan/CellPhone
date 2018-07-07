<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	  <link  type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/common.css" />
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/animate.min.css" />
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/landing2017.css"/>
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/web_index.css" />
	  <link type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/tuiguang_order.css">
	  <script type="text/javascript" src="//rs.jikexiu.com/resources/js/web_index.js"></script>
 	 <!-- 评价 -->
 	  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <script type="text/javascript" src="//rs.jikexiu.com/resources/js/web_index.js"></script>
	  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	  <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <!-- 故障 -->
    <link type="image/x-icon" href="/favicon.ico" rel="shortcut icon">
    <link href="http://static.shanxiuxia.com/weadoc/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/bootstrap-datetimepicker.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/public.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/fixWay.css" rel="stylesheet">
    <link href="http://static.shanxiuxia.com/weadoc/css/laydate.css" rel="stylesheet">
    <link href="css/publicOrder2.css" rel="stylesheet">
    <script src="js/config.js"></script>
    
    
 	
 		<style type="text/css">
 			.disabled{
 				pointer-events:none;
 			}
 		</style>

</head>

<body>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">
				</button>
				<h4 class="modal-title" id="myModalLabel">
				<div class="contact">
			
			<div class="container">
				<h1>您的评价</h1>
			<div class="contact-form">
				
				<div class="col-md-8 contact-grid">
					<form action="assessment/inserts" method="post">	
						<input type="text" name="fettlerId" value="维修工id" style="width:100px; height=20px;" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='维修工编号';}">
					
						<input type="text" name="userId" value="用户id" style="width:200px; height=20px;"onfocus="this.value='';" onblur="if (this.value == '') {this.value ='用户编号';}">
							<select name="level"  >   
								  <option value="0">请选择评分</option>   
								  <option value="1" >1</option>  
								  <option value="2" >2</option>
								  <option value="3" >3</option>  
                                  <option value="4" >4</option>
                                  <option value="5" >5</option>   
								  <option value="6" >6</option>  
								  <option value="7" >7</option>
								  <option value="8" >8</option>  
                                  <option value="9" >9</option>
                                  <option value="9" >10</option>
                                  
                            </select>
						<textarea cols="77" rows="6" value=" " name="content" onfocus="this.value='';" style="width:440px; height=400px;" onblur="if (this.value == '') {this.value = '评价内容';}">评价内容</textarea>
						<div class="send">
							<input type="submit" value="提交" class="btn btn-primary btn-lg " onclick="addUser()">
							<input type="button" value="关闭"class="btn btn-default" data-dismiss="modal">
				         ${inserUser }<br>  
						</div>
					
					</form>
				</div>
			</div>
			
		</div>
	
	</div>
				</h4>
			</div>
			<div class="modal-body">
				按下 ESC 按钮退出。
			</div>
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<header id="header">
    <div class="wrap">

            <h1 class="logo"><img src="images/8.jpg"/>手机维修平台</h1>
            <ul class="parentmenu"><li class="showmenu">
            <li><a href="#col2" target="_self">报价信息</a></li>
            <li><a id="appO" href='#maodian' target="_self">预约下单</a></li>
            <li><a href="#col5" target="_self">常见问题</a></li>
            <li><a href="company.jsp" target="_self">公司动态</a></li>
            <li><a href="contact.jsp" target="_self">意见反馈</a></li>
            
             <li><a href="login.jsp" target="_self">查询订单</a></li>
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

    <article class="col processBox">
        <h2>服务方式</h2>
        <div class="tabTitle">
            <a class="active" href="javascript:">上门维修</a>
            <a href="javascript:" class="disabled" >---------</a>
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
    <div class="container-fluid listContent" id="maodian">
        <div class="container listBox">
        	<form id="orderfm" method="post" >
            <div class="listBox-left">
            	<div id="nameBox" class="input-group nameBox">
	                <span class="input-group-addon namePic">
	                    <img class="nameIcon" src="http://static.shanxiuxia.com/weadoc/fix_name2.png">	
                    	<p class="listTitle">姓名：</p>
	                </span>
	                
	                <input id="userName" name="userName" type="text" class="form-control nameText"
	                 placeholder="输入我的姓名">
	                
	            </div>
				<span id="nameFixTips" class="fixTips">请输入2-4个中文英文或者数字</span>
	            <div id="phoneBox" class="input-group phoneBox">
	                <span class="input-group-addon phonePic">
	                   <img class="phoneIcon" src="http://static.shanxiuxia.com/weadoc/fix_telnum2.png">
	                   	<p class="listTitle">手机号码：</p>
	                </span>
	                <input id="telPhone" name="userPhone" type="number" maxlength="11"
	                 class="form-control phoneText" placeholder="输入我的手机号码">
	                
	            </div>
				<span id="telFixTips" class="fixTips">请输入正确的手机号码</span>
				
				<div id="mailBox" class="input-group phoneBox">
	                <span class="input-group-addon phonePic">
	                   <img class="phoneIcon" src="http://static.shanxiuxia.com/weadoc/fix_tabmenu2-2.png">
	                   	<p class="listTitle">快递单号：</p>
	                </span>
	                <input id="mailNum" name="mailNum" type="number" 
	                 class="form-control mailText" placeholder="输入快递单号">
	                
	            </div>
				
	            <div id="serviceCenterBox" class="input-group serviceCenterBox">
	                <span class="input-group-addon serviceCenterPic">
                     	<img class="serviceCenterIcon" src="http://static.shanxiuxia.com/weadoc/fix_name2.png">
                     	<p class="listTitle">邮寄地址：</p>
	                </span>
	               <div id="serviceCenterInfoBox" class="input-group serviceCenterInfoBox">
	                <span class="input-group-addon serviceCenterInfoPic" disabled>
	                	河南省郑州市二七区政通路25号
	                	*邮费自费
	                </span>
	                <div id="centerDetails" class="centerDetails">
	                </div>
	            </div>
	            </div>		  	
	            <div id="addressBox" class="input-group addressBox">
	                <span class="input-group-addon addressPic">
                     	<img class="addressIcon" src="http://static.shanxiuxia.com/weadoc/fix_address2.png">
                     	<p class="listTitle">地址：</p>
	                </span>
	                	<select class="form-control province" id="s_province" name="s_province"
	                	  onChange="javascript:doit(this.form);"></select>
	    				<select class="form-control province" id="s_city"  name="s_city" 
	    				 onChange="javascript:doit(this.form);"></select>
	    				<select class="form-control province" id="s_county" name="s_county" 
	    				 onChange="javascript:doit(this.form);"></select>
	            </div>
	            <div id="streetBox" class="input-group streetBox">
	                <span class="input-group-addon streetPic">
	                    <img class="streetIcon" src="http://static.shanxiuxia.com/weadoc/fix_street.png">
	                </span>
	                <textarea id="street" name="address" class="form-control streetText" placeholder="输入具体街道地址"></textarea>
	                <span id="streetFixTips" class="fixTips">请输入6-32个文字</span>
	            </div>
	            	<div id="imeiBox" class="input-group imeiBox">
	                <span class="input-group-addon imeiPic">
	                   <img class="imeiIcon" src="http://static.shanxiuxia.com/weadoc/fix_imei2.png">
	                   	<p class="listTitle">IMEI：</p>
	                </span>
	                <input id="imei" name="imei" type="text" class="form-control imeiText" placeholder="输入IMEI码">
	                <span class="fixTips">请输入IMEI码</span>
	            </div>
	            <div id="imeiTips"  class="imeiTipsBox">
	                <p class="tips">在拨号面板入输 *#06#；或查看设置－通用－关于本机即可获得IMEI码</p>
	            </div>	
	             <div class="fixBtn">
	                <button  class="btn btn-default  next" type="submit" id="orderBtn"
	                >提交订单</button> 
	               、</div>
	           
            </div>
            <div class="listBox-right">
            	<li class="fault-title">故障维修信息</li>
            	 <div class="input-group">   
            	 				<span>请选择品牌</span> <br>                           
                               <select id="brandId" class="form-control">  
								<option value="请选择">请选择</option>                            
								</select>
								<span>请选择系列</span><br>
								<select id="seriesId" class="form-control">                              
								</select> 
								<span>请选择手机型号</span><br>
								 <select id="modelId" class="form-control">                               
								</select>
								<span>请选择故障信息</span><br>
								 <select id="faultId" name="faultId" class="form-control">                               
								</select> 
								  <span>请选择手机颜色</span><br>      
                                 <select id="colorId" class="form-control">                           
                                </select>   
                                	预计价格:￥<input  id="price" name="orderPrice" readonly/>
                               
            </div>
        </div>
        
        </form>
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

    <div class="kj-survice site-inner clearFix">
        <!--dyh1031-->
        <p class="title">用户对我们的信任</p>
        <a href="#" data-toggle="modal" data-target="#myModal"><button type="button" class="btn btn-default btn-lg" >添加您的评价</button></a>
            
        <div class="float-left user-evaluate">
            <div id="scroll">
                <ul class="user-evaluate-list" style="top: 0px;">
            <c:forEach items="${userList }" var="l">
                            <li class="clearFix">
                                <div class="user-img float-left">
                                    <img src="//rs.jikexiu.com/resources/Nimages/landing/user.png" alt="">
                                    <p>${l.id}</p>
                                </div>
                                <div class="user-name float-left">
                                     <p class="mar-b-10 stars">
                                        ${l.level }分
                                    </p> 
                                    <p class="col-hui" title="下完订单后，夏师傅很快联系我，预约上门时间，全过程录像，很专业，有问必答，耐心。非常满意！会推荐给同事～">${l.content }</p>
                                    <p class="timeShow">${l.gmtCreate }</p>
                                </div>
                            </li>
                            </c:forEach>
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
 <script type="text/javascript" src="js/fixWay.js"></script> 
    <script class="resources library" src="../before/area.js" type="text/javascript"></script>
    <script type="text/javascript">_init_area();</script>
<script type="text/javascript"> 
var url;
  $(document).ready(function(){
	  //默认显示上门服务
	  url="../../order/add";
	    $("#imeiBox").hide();
	    $("#addressBox").show();
	    $("#imeiTips").hide();
	    $("#time").show();
	    $("#timeTipsBox").show();
	    $("#serviceCenterBox").hide();
	    $("#serviceCenterInfoBox").hide();
	    $("#mailBox").hide();
	   
	  
  $.ajax({
  url: '../../brand/queryBrand' ,
  success: function(data){
  if( !data)return;
  var html= "";
  for(var e in data){
  html += '<option value=' +data[e]. brandId+' >'+data[e]. brandName+' </option>';
 }
 $("#brandId").append(html);
 //通过change方法调用
  $("#brandId"). change(function(){
  
  
  $("#seriesId").html("");
  $("#modelId"). html("");
  $("#faultId"). html("");
  getSeries($(this).val());
  });
  }
  });
  
    //根据品牌获取系列
  function getSeries(id){
  $.ajax({
  url:'../../series/querySeries',
  data: {brandId:id},//传入的id
  success: function(data){
  
  if(! data)return;
  var html='';
  for(var i in data){
  html +='<option value='+data[i].seriesId+'>' +data[i]. seriesName+' </option>';
  }
  $("#seriesId").append(html);
  //通辻change方法去調用
  $("#seriesId"). change(function(){
  $("#modelId") . html("");
  $("#faultId"). html(""); 
  getModel($(this) .val());
  });
  $("#seriesId").get(0). selectedIndex=0;
 	getModel($("#seriesId").val());	
  }
  });
  }
  
  //根据系列选择机型
  function getModel(id){
  	$.ajax({
  		url:'../../model/queryAll',
  		data:{seriesId:id},
  		success:function(data){
			if(! data)return;
  			var html='';
  			for(var i in data){
  			html +='<option value='+data[i].modelId+'>' +data[i]. modelName+' </option>';
  			} 
  			 $("#modelId").append(html);
  			  $("#modelId"). change(function(){
              $("#faultId"). html(""); 
              getFault($(this) .val());
  });
  			$("#modelId").get(0). selectedIndex=0;
 			getFault($("#modelId").val());	  	
    			
  		}
  	});  
  }
  
    //根据机型选择故障
  function getFault(id){
  	$.ajax({
  		url:'../../fault/queryAll',
  		data:{modelId:id},
  		success:function(data){
			if(! data)return;
  			var html='';
  			var price='';
  			for(var i in data){
  			html +='<option value='+data[i].faultId+'>' +data[i]. faultName+' </option>'; 			
  			} 
  			price += data[i]. faultPrice;  			
  			$("#price").html("");
  			 $("#faultId").append(html);
  			 $("#price").val(price);
  			 $("#price").append(price);  			 			
  		}
  	});  
  }
//显示颜色
	$.ajax({
	  url: '../../color/queryAll' ,
	  success: function(data){
	  if( !data)return;
	  var html= "";
	  for(var e in data){
	  html += '<option value=' +data[e]. colorId+' >'+data[e]. colorName+' </option>';
	 }
	 $("#colorId").append(html);
	 }
	 });
		
	 //点击上门维修
	$("#fixMenuBtnOne").click(function () {
		url = "../../order/add";
	    category = 1;
	    $("#smText").css("color","#f37b46");
	    $("#yjText").css("color","#777371");
	    $("#imeiBox").hide();
	    $("#addressBox").show();
	    $("#imeiTips").hide();
	    $("#time").show();
	    $("#timeTipsBox").show();
	    $("#serviceCenterBox").hide();
	    $("#serviceCenterInfoBox").hide();
	    $("#mailBox").hide();
	    
	    if(localStorage.invoice == 1){
	    	$(".listBox-right").css("min-height","610px");
	    	$(".listBox-right").css("height","610px");
	    }else if(localStorage.invoice == 0){
	    	$(".listBox-right").css("height","530px");
	    	$(".listBox-right").css("min-height","530px");
	    }
	    $("#fixMenuBtnOne #menuL").attr("src","http://sxxcdn.oss-cn-hangzhou.aliyuncs.com/weadoc/fix_tabmenu1_select2.png");
	    $("#fixMenuBtnTwo #menuR").attr("src","http://sxxcdn.oss-cn-hangzhou.aliyuncs.com/weadoc/fix_tabmenu2-2.png");
	});
	//点击邮寄维修
	$("#fixMenuBtnTwo").click(function () {
		url = "../../mail/addMail";
	    category = 2;
	    $("#smText").css("color","#777371");
	    $("#yjText").css("color","#f37b46");
	    $("#imeiBox").show();
	    $("#addressBox").show();
	   // $("#addressAll").show();
	    $("#imeiTips").show();
	    $("#time").hide();
	    $("#timeTipsBox").hide();
	    $("#serviceCenterBox").show();
	    $("#serviceCenterInfoBox").show();
	    $("#mailBox").show();
	    if(localStorage.invoice == 1){
	    	$(".listBox-right").css("min-height","896px");
	    }else if(localStorage.invoice == 0){
	    	$(".listBox-right").css("min-height","816px");   	
	    }
		
	    $("#fixMenuBtnOne #menuL").attr("src","http://sxxcdn.oss-cn-hangzhou.aliyuncs.com/weadoc/fix_tabmenu1.png");
	    $("#fixMenuBtnTwo #menuR").attr("src","http://sxxcdn.oss-cn-hangzhou.aliyuncs.com/weadoc/fix_tabmenu2_select2.png");
	});        
	//点击底部
	$('#stepA').hover(function () {
	    $("#stepThree").html('03邮寄设备');
	    $("#stepFive").html('05 转账付钱');
	    $("#stepSix").html('06 设备寄回');
	});
	$('#stepB').hover(function () {
	    $("#stepThree").html('03  鐢ㄦ埛楠屾敹');
	    $("#stepFive").html('05 鐢ㄦ埛楠屾敹');
	    $("#stepSix").html('06 杞处浠樻');
	});
	$('#stepC').hover(function () {
	    $("#stepThree").html('03 鍒板簵缁翠慨');
	    $("#stepFive").html('05 鐢ㄦ埛楠屾敹');
	    $("#stepSix").html('06 杞处浠樻');
	});
	 
/* 	//表单提交	
  $("#orderBtn").click(function() { 
            var params = $("#orderfm").serialize();  
            $.ajax( {  
                type : "POST",  
                url : url,  
                data : params,  
                success : function(msg) {                	
                	alert("订单提交成功");
                    window.location="macservice.jsp";
                }
            });  
  	});   */
	
  });
  function repairSave(){
			window.location.href="fixWay.jsp";
		}
		 //地址
		 function doit(ofrm){ 
		ofrm.address.value=ofrm.s_province.value+ofrm.s_city.value+ofrm.s_county.value;  
		}   
        //城市选择
        var Gid  = document.getElementById ;		
		var showArea = function(){
			Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市" + 	
			Gid('s_city').value + " - 县/区" + 
			Gid('s_county').value + "</h3>"
     }  
		Gid('s_county').setAttribute('onchange','showArea()');

    
        function addUser(){  
        var form = document.forms[0];  
        form.action = "<%=basePath%>assessment/inserts";  
        form.method="post";  
        form.submit();  
    }  
        
  </script>
</body>
</html>
    