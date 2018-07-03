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
            var seriesId = $(".model-hd .cur").attr("data-seriesId");
            $(".q_brand ul").siblings("code").text(brandName).css("color", "#666");
            // $(".q_fault ul").siblings("code").text(malfunction).css("color","#666");
            $(".q_model ul").siblings("code").text(deviceName).css("color", "#666");
            $("#brand").val(brandId);
            $("#model").val(seriesId);
            $("#malfunction").val(malfunction);
            $("#malfunction_id").val(malfunctionId);
            $("#sm_id").val(smid);
            $("#f_malfunction_id").val(fmid);
            //设备信息写入span
            writeDevice(brandId,seriesId);
            if (malfunctionId != null && malfunctionId != '') {
                getSolutionMalFunction2(brandId, seriesId, malfunctionId, 0);
                getMalFunction1(seriesId);
            } else {
                getMalFunction2(seriesId);
            }
            getDevice1(brandId);


        });
        //热门维修 锚点
        $(".tuijian").find("ul").unbind().on("click", "li", function () {
            var domId = $($(this).parent("a").attr('href')),scrollHeight = domId.offset().top;
            if (scrollHeight != 0) {
                var brandId = $(this).attr("brandId");
                var seriesId = $(this).attr("seriesId");
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

            $("#sjxh").attr("seriesId", seriesId);
            $("#sjxh").attr("brandId", brandId);
            writeBrandClass();
            getDevice(brandId);
            initColorlist(smid,brandId,seriesId,malfunctionid);
            getColorlist(seriesId);
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
                var seriesId=$(this).attr("seriesId");

                $("#sjxh").attr("seriesId",seriesId);
                // myself_data
                var jQuery = $(this).html();
                $("#myself_data").attr("value",jQuery);
                getColorlist(seriesId);

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
                    var seriesId = $("#sjxh").attr("seriesId");

                    if (seriesId == undefined || seriesId == "") {
                        $("#sjgz-dropdown-content").hide();
                    } else {
                        $(".dropdown-content").hide();
                        $("#sjgz-dropdown-content").show();
                        $.post(url + "fault/queryAll", {seriesId: seriesId}, function (d) {
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
                                        getSolution(smid,seriesId,malfunctionid,0)
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

            var seriesId = $("#sjxh").attr("seriesId");
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
                $.post(url + "fault/queryAll", {seriesId: seriesId}, function (d) {//初始化故障大类
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
                                getSolution(smid,seriesId,malfunctionid,0)
                            }
                        }
                )

            }
        });
        //点击选择故障弹出故障信息
        $(".sjwt").on('click','li',function (event) {
            var malfunctionid=$(this).attr("malfunctionid");
            var seriesId=$("#sjxh").attr("seriesId");
            // $("#jjfa").attr("malfuntionId",malfuntionId);
            $("#jjfa").attr("fmid",$(this).attr("malfunctionid"));
            $('.sjwt ul li').removeClass("mr");
            $(this).addClass("mr");
            $("#jjfa").text("确认故障与维修方案").css("color","#999");
            var flag=1;
            if(malfunctionid==""||malfunctionid==0||malfunctionid=="null"){
                flag=0;
            }
            initSolutionMalFunction(seriesId,malfunctionid,flag);
            event.stopPropagation();

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
                var seriesId = $(".model-hd .cur").attr("data-seriesId");
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

            $("#sjxh").attr("seriesId", seriesId);
            $("#sjxh").attr("brandId", brandId);
            writeBrandClass();
            getDevice(brandId);
            initColorlist(smid,brandId, seriesId, malfunctionid);
            getColorlist(seriesId);
            // scrollToLocation();
            $("html,body").animate({"scrollTop": scrollHeight - 100});

            return false;

        });
//更多故障报价>>锚点
        $("body").on("click", ".morePrice", function () {
            var domId = $($(this).children('a').attr('href')), scrollHeight = domId.offset().top;
            var brandId = $(".hd .cur").attr("brandId");
            var seriesId = $(".model-hd .cur").attr("data-seriesId");
            $("#jjfa").text("确认故障与维修方案").css("color","#999");
            $("#jjfa").attr("fmid",null);
            $("#sjxh").attr("seriesId", seriesId);
            $("#sjxh").attr("brandId", brandId);
            writeBrandClass();
            getDevice(brandId);
            initColorlist2(brandId, seriesId);
            getColorlist(seriesId);
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
            var model=$("#sjxh").attr("seriesId");

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
        var seriesId = $("#sjxh").attr("seriesId");
        var colorId = $("#sjxh").attr("modelId");
        $(".dropdown-content").hide();
        if (colorId == null) {
            $("#sjgz-dropdown-content").hide();
            $("#weixiu-cotent").show();
            $("#weixiu-dropdown-content,#xh1,#color-dropdown").show();
            $("#color-dropdown ul").html("");
        } else {

            $("#sjgz-dropdown-content,.sjwt,#wxfa1").show();
            $.post(url + "/order/quick/getMalFunctionByModelId", {seriesId: seriesId}, function (d) {//初始化故障大类
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
                            getSolution(smid,seriesId,malfunctionid,0)
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
    function deviceMalfunction(seriesId,brandId){
        $.post(url+"/order/quick/deviceMalfunction",{seriesId:seriesId,brandId:brandId},function(d){
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
                    $(".tab-cont-brand .item .model-hd").append("<dd  class=\"cur\" data-seriesId='"+devices[i].id+"'>"+ devices[i].model+"</dd>");
                }else{
                    $(".tab-cont-brand .item .model-hd").append("<dd data-seriesId='"+devices[i].id+"'>"+ devices[i].model+"</dd>");
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
                    $(".tab-cont-fault .con").find("ul").eq(index).append("<li seriesId ='"+seriesId+"' solutionid ='"+data[i].solutionId+"' fmid='"+data[i].malfunctionFid+"' smid ='"+data[i].id+"' malfunctionid ='"+data[i].malfunctionId+"' method='"+data[i].method+"'><p class=\"faultN\">"+data[i].malfunctionName+"</p><p class=\"price\">￥"+data[i].price+"<small>起</small><font>市场价:￥<del>"+gfprice+"</del></font></p><span class='baoxiu'><a href=\"#maodian\" >我要报修</a></span></li>");
                }else{
                    if(i<15){
                        $(".tab-cont-fault .con").find("ul").eq(index).append("<li seriesId ='"+seriesId+"' solutionid ='"+data[i].solutionId+"' fmid='"+data[i].malfunctionFid+"' smid ='"+data[i].id+"' malfunctionid ='"+data[i].malfunctionId+"' method='"+data[i].method+"'><p class=\"faultN\">"+data[i].malfunctionName+"</p><p class=\"price\">￥"+data[i].price+"<font>市场价:￥<del>"+gfprice+"</del></font></p><span class='baoxiu'><a href=\"#maodian\">我要报修</a></span></li>");
                    }
                }
            }
            var seriesId=$(".item .model-hd .cur").attr("data-seriesId");
            $("#morefault").append("<li class='more col4' seriesId ='"+seriesId +"' brandId='"+brandId+"'><span class='morePrice'><a href='#maodian'>更多故障报价>></a></span></li>");
            devicechanage();
        });
    }
    function devicechanage(){
        $(".model-hd dd").unbind().bind("click",function(){
            var index= $(".model-hd dd").index(this);
            var seriesId=$(this).attr("data-seriesId");
            deviceMalfunction(seriesId,-1);
            $(this).addClass("cur").siblings().removeClass("cur");
        });
    }
   
    //初始化设备
    function initDevice() {
        var brandId = $("#sjxh").attr("brandid");
        $.post(url + "brand/queryBrand", {brandId: brandId}, function (d) {
            var data = JSON.parse(d);
            var devices = data.deviceList;
            var colorid = $("#sjxh").attr("colorid");
            var valueid = $("#sjxh").attr("valueid");
            var device = $("#sjxh").attr("seriesId");

            var context = "";
            if (devices != undefined) {
                for (var i = 0; i < devices.length; i++) {
                    $('#xh1_ul li').removeClass("mr");
                    var mr = (devices[i].id == device)?"mr" :"";
                    context = context + "<li seriesId='" + devices[i].id + "' class='"+mr+"'>" + devices[i].model + "</li>";
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
            var seriesId = $("#sjxh").attr("seriesId");
            var context="";
            if(devices!=undefined){
                for(var i=0;i<devices.length;i++){
                    var mr = (seriesId == devices[i].id) ?"mr":"";
                    seriesId == devices[i].id ? $("#myself_data").attr("value",devices[i].model):"";
                    context=context+"<li seriesId='"+devices[i].id+"' class='"+mr+"'>"+devices[i].model+"</li>";
                    if(seriesId == devices[i].id){
                        $("#xh1_ul").removeClass("mr");
                    }
                }
            }
            $('#xh1 ul').html(context);
            if($("#xh1 ul li").hasClass("mr")){
                getColorlist(seriesId);
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
    function getMalFunction1(seriesId){
        $.post(url+"/order/quick/getMalFunctionByModelId",{seriesId:seriesId},function(d){
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
    function getMalFunction2(seriesId){
        $.post(url+"/order/quick/getMalFunctionByModelId",{seriesId:seriesId},function(d){
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
                    $('.q_model ul').append("<li seriesId='"+devices[i].id+"'>"+devices[i].model+"</li>");

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
    function getSolution(smid,seriesId,malfunctionId,flag){//获取维修方案  我要报修按钮的点击事件
        $.post(url+"/order/quick/getSolutionMalfunction.json",{seriesId:seriesId,malfunctionId:malfunctionId,flag:flag},function(d){
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
    function initSolutionMalFunction(seriesId,malfunctionId,flag){

        $.post(url+"/order/quick/getSolutionMalfunction.json",{seriesId:seriesId,malfunctionId:malfunctionId,flag:flag},function(d){
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
    function getMalFunction(seriesId){
        $(".q_fault ul").siblings("code").text("设备故障").css("color","#999");
        $.post(url+"/order/quick/getMalFunctionByModelId",{seriesId:seriesId},function(d){
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
    function getSolutionMalFunction(seriesId,malfunctionId,flag){
        $(".hotbaojia").hide();
        $('.hotbaojia ul').empty();
        $.post(url+"/order/quick/getSolutionMalfunction.json",{seriesId:seriesId,malfunctionId:malfunctionId,flag:flag},function(d){
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
    function getSolutionMalFunction2(smid,brandId,seriesId,malfunctionId,flag){
        $(".hotbaojia").hide();
        $('.hotbaojia ul').empty();
        $("#weixiu-dropdown-content").hide();


        $('.wxfa ul').empty();
        $.post(url+"/order/quick/getSolutionMalfunction.json",{seriesId:seriesId,malfunctionId:malfunctionId,flag:flag},function(d){
            var data=JSON.parse(d);
            var solutionMalfunctionList=data.solutionMalfunctionList;
            if(solutionMalfunctionList) {
                var scolorId= $("#sjxh").attr("colorId");
                var sseriesId = $("#sjxh").attr("seriesId");
                for (var i = 0; i < solutionMalfunctionList.length; i++) {
                    $.post(url + "/order/quick/getMalFunctionByModelId", {seriesId: seriesId}, function (d) {
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
        getSolution(smid, seriesId,malfunctionId,flag);
    }
    //选择手机设备
    function getColorlist(seriesId) {
        $.post(url+"/order/getDeviceAttributeList.json",{seriesId:seriesId},function(d){
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
            var seriesId = $("#sjxh").attr("seriesId");
            $(".dropdown-content").hide();
            $("#sjgz-dropdown-content,.sjwt,#wxfa1").show();
            $(".sjwt ul li").removeClass("mr");
            $.post(url + "/order/quick/getMalFunctionByModelId", {seriesId: seriesId}, function (d) {//初始化故障大类
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
    function initColorlist2(brandId,seriesId) {
        $.post(url+"/order/getDeviceAttributeList.json",{seriesId:seriesId},function(d){
            var data=JSON.parse(d);
            var colorList=data.deviceAttributeList;
            var context="";
            if(colorList!=undefined){
                // var context=context+"<li colorid='"+colorList[0].id+"' valueid='"+colorList[0].attributeId+"'>"+colorList[0].attributeValue+"</li>";
                $("#sjxh").attr("colorId", colorList[0].id);
                $("#sjxh").attr("valueId", colorList[0].attributeId);
                $("#sjxh").attr("seriesId", seriesId);
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

        // getSolutionMalFunction2(smid,brandId, seriesId, malfunctionid, 0);
        // initSolution();
    }
    function initColorlist(smid,brandId,seriesId,malfunctionid) {
        $.post(url+"/order/getDeviceAttributeList.json",{seriesId:seriesId},function(d){
            var data=JSON.parse(d);
            var colorList=data.deviceAttributeList;
            var context="";
            if(colorList!=undefined){
                // var context=context+"<li colorid='"+colorList[0].id+"' valueid='"+colorList[0].attributeId+"'>"+colorList[0].attributeValue+"</li>";
                $("#sjxh").attr("colorId", colorList[0].id);
                $("#sjxh").attr("valueId", colorList[0].attributeId);
                $("#sjxh").attr("seriesId", seriesId);
                $("#sjxh").attr("brandId", brandId);
            }
        });

        getSolutionMalFunction2(smid,brandId, seriesId, malfunctionid, 0);
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
        var index = 1; 
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
