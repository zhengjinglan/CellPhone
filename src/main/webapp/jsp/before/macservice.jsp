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
	  <link  type="text/css" rel="stylesheet" href="//rs.jikexiu.com/resources/css/common.css" >
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
	  
 	
 	
 	
 		<style type="text/css">
 			.disabled{
 				pointer-events:none;
 			}
 		</style>
 	
<!--     <script type="text/javascript" >
        window.ctx = "";
        window.resourcePath = "//rs.jikexiu.com";
        var _Width = $(window).width();
     
    </script> -->
</head>

<body>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
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
            <form  action="../../order/add" id="biddingForm" method="post">
                <div class="ksxdUpdate">
                 <div class="butbox">
                    <button  type="button" id="Besuch" >上门维修</button>
                    <button  type="button"  id="Mail" >邮寄维修</button>
                        <!-- <button  type="submit" id="OrderSubmit" >确认下单</button> -->
                    </div>
                    <div  id="maodian">
                        <div class="table_div">
                            <div class="weixiu">                               
                               <select id="brandId">  
								<option value="">请选择</option>                            
								</select>
								
								<select id="seriesId">                              
								</select> 
								
								 <select id="modelId">                               
								</select>
								
								 <select id="faultId" name="faultId">                               
								</select> 
								        
                                 <select id="colorId">                           
                                </select>                                                       
                        </div>
                    </div>
                    <div class="table_div">
                    <div class="tel">
                            <input type="text" placeholder="填写能联系到您的电话" 
                            class="txt" id="userPhone" name="userPhone">
                        </div>
                        <div class="name">
                            <input type="text" placeholder="怎么称呼你" name="userName" id="userName" class="txt">
                        </div>
                        
                          <div class="sex">
                    </div>
                    </div>
                    <div class="table_div" style="margin-bottom:0">
                        <div class="place" >
                        <select id="s_province" name="s_province" diaabled onChange="javascript:doit(this.form);"></select>&nbsp;&nbsp;
	    				<select id="s_city"  name="s_city" diaabled onChange="javascript:doit(this.form);"></select>&nbsp;&nbsp;
	    				<select id="s_county" name="s_county" diaabled onChange="javascript:doit(this.form);"></select>
                        </div>
                        <div class="position">
                            <input type="text" placeholder="你所在的位置，如：街道名/小区/大厦名.." 
                            id="placePositon" class="txt" name="address">
                            <div class="area_position" style="display: none" >
                                <ul >
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="note" id="door_range_cite" ></div>                  
                    <textarea  id="other" cols="30" rows="10" class="txt" placeholder="您可以详细描述手机故障或其他要求（选填）" style="width:764px;height:104px"></textarea>
                    <div class="agreement">
                        <input type="checkbox" id="agreement" checked>
                        <label for="agreement">我已阅读并同意
                            <a href="http://www.jikexiu.com/article/articleDetails/62.html" target="_blank">《极客修服务协议》</a>
                        </label>
                    </div>
                    <div class="butbox">                  
                       <button  type="submit" id="OrderSubmit" onclick="submits()">确认下单</button> 
                    </div>
                </div>
            </form>
        <div class="tjts">
            <p>*工作时间(8:00-22:00)将有来自工程师或区号023的座机与您联系，请保持电话畅通</p>
        </div>
    <div class="kj-survice site-inner clearFix">
        <!--dyh1031-->
        <p class="title">用户对我们的信任</p>
        <a href="#" data-toggle="modal" data-target="#myModal"><button type="button" class="btn btn-default btn-lg" >添加您的评价</button></a>
            
  </form>
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

    <script class="resources library" src="../before/area.js" type="text/javascript"></script>
    <script type="text/javascript">_init_area();</script>
<script type="text/javascript"> 

  $(document).ready(function(){
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
  			for(var i in data){
  			html +='<option value='+data[i].faultId+'>' +data[i]. faultName+' </option>';
  			} 
  			 $("#faultId").append(html);

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
	 

  });
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
		
/* // 提交
		function submits(){
		alert(123);
			$("#biddingForm").form("submit",{
				url:"order/add",
				
				success:function(data){
				alert(url);
				alert(data);
					if(data==1){
						$.messager.show({
							title:'提示',
							msg:"订单提交成功！"
						});
						window.location="macservice.jsp";
					}else{
						$.messager.show({
							title:'提示',
							msg:"订单提交失败！"
						});
					}
				}
			});
		}     */      
        function addUser(){  
        var form = document.forms[0];  
        form.action = "<%=basePath%>assessment/inserts";  
        form.method="post";  
        form.submit();  
    }  
  </script>
</body>
</html>
<div style="display: none"><!--BD static-->
