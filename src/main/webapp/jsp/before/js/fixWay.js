//鑾峰彇閭瘎鍦板潃
var areaList2 = [];
var cityList2 = [];
$.ajax({
    type:'get',
    dataType:'json',
    url: url + '/api/Address/allAddress',
    success:function(data,status){
        if(status == "success" && data.code == 200){
            $.each(data.data,function(id,value) {
                areaList2.push(value);
            });
            renderProvince2();
        }
    }
});

function renderProvince2(){
    $('#province').empty();
    for(var i = 0;i<areaList2.length;i++){
        var value = areaList2[i];
        $('#province').append($('<option>', {
            value: value.id,
            text:value.name
        }));
    }
    renderCity2(areaList2[0]);
}

function renderCity2(area){
    cityList2 = area.city;
    $('#city').empty();
    for(var i = 0;i<cityList2.length;i++){
        var city = cityList2[i];
        $("#city").append($('<option>', {
            value: city.id,
            text:city.name
        }));
    }

    var cityArea = [];
    $.each(cityList2[0].area,function(id,value) {
        cityArea.push(value);
    });

    renderArea2(cityArea);
}

function renderArea2(area){
    $('#areap').empty();
    for(var i = 0;i<area.length;i++){
        var value = area[i];
        $('#areap').append($('<option>', {
            value: value.id,
            text:value.name
        }));
    }
}

$('#province').change(function(){
    var currentValue = $(this).val();
//  localStorage.province = currentValue;
    for(var i = 0;i<areaList2.length;i++){
        var value = areaList2[i];
        if(currentValue == value.id){
            renderCity2(value);
            break;
        }
    }
});

$("#city").change(function(){
    var currentCity = $(this).val();
//  localStorage.city = currentCity;
    for(var i = 0;i<cityList2.length;i++){
        var city = cityList2[i];
        if(currentCity == city.id){
            var cityArea = [];
            $.each(city.area,function(id,value) {
                cityArea.push(value);
            });
            renderArea2(cityArea);
            break;
        }
    }
});

//鍙戠エ鎶ご鐨勯殣钘忓拰鏄剧ず
//鍒ゆ柇褰撳墠澶嶉€夋鐘舵€侊紝骞惰label鑳屾櫙鍥句笌澶嶉€夋鍚屾鍕鹃€夋垨鍙栨秷
localStorage.invoice = 0;
localStorage.is_personal = 1;
$(".checkbox").click(function (){	
	$(".checkbox2").attr("checked",false);
	$(".type2").removeClass("iCheck-ed2"); //鍒犻櫎鍕鹃€夐€夎儗鏅浘
	$(".type2").addClass("iCheck2");       //娣诲姞鏈嬀閫夐€夎儗鏅浘
	//鍒ゆ柇澶嶉€夋鍕鹃€夌姸鎬�
	if ($('.checkbox').is(':checked')) {
		$(".type1").removeClass("iCheck");    //鍒犻櫎鏈嬀閫夐€夎儗鏅浘
		$(".type1").addClass("iCheck-ed");    //娣诲姞鍕鹃€夋€佽儗鏅浘
		$("#invoiceTitle").show();
		localStorage.invoice = 1;
		localStorage.is_personal = 1;
	}else{
		$(".type1").removeClass("iCheck-ed"); //鍒犻櫎鍕鹃€夐€夎儗鏅浘
		$(".type1").addClass("iCheck");       //娣诲姞鏈嬀閫夐€夎儗鏅浘
		$("#invoiceTitle").hide();
		localStorage.invoice = 0;
		localStorage.removeItem("is_personal");
	}
});
$(".checkbox2").click(function (){
	$("checkbox").attr("checked",false);
	$(".type1").removeClass("iCheck-ed"); //鍒犻櫎鍕鹃€夐€夎儗鏅浘
	$(".type1").addClass("iCheck");       //娣诲姞鏈嬀閫夐€夎儗鏅浘;
	//鍒ゆ柇澶嶉€夋鍕鹃€夌姸鎬�
	if ($('.checkbox2').is(':checked')) {
		$(".type2").removeClass("iCheck2");    //鍒犻櫎鏈嬀閫夐€夎儗鏅浘
		$(".type2").addClass("iCheck-ed2");    //娣诲姞鍕鹃€夋€佽儗鏅浘
		$("#invoiceTitle").show();
		localStorage.invoice = 1;
		localStorage.is_personal = 2;
		$(".invoice-box").show();
		$(".prompy-btn").click(function(){
        	$(".invoice-box").hide();
        })
	}else if($(".checkbox2").attr("checked",false)){
		$(".type2").removeClass("iCheck-ed2"); //鍒犻櫎鍕鹃€夐€夎儗鏅浘
		$(".type2").addClass("iCheck2");       //娣诲姞鏈嬀閫夐€夎儗鏅浘
		$("#invoiceTitle").hide();
		localStorage.invoice = 0;
		localStorage.removeItem("is_personal");
	}
});
//椤堕儴瀵艰埅鍒囨崲
$("#addressAll").hide();
$("#imeiBox").hide();
$("#imeiTips").hide();
$("#serviceCenterBox").hide();
$("#serviceCenterInfoBox").hide();

var collectShare =localStorage.tommagic;
var landShare =localStorage.landData;
var reShare =localStorage.referrer;
var category = 1;

var phoneId;
var phonePrice;
var colorId;
var malId;

var source = localStorage.door;
//鏁呴殰缁翠慨鏁版嵁
if(localStorage.door==1){
	var cartData = JSON.parse(localStorage.cartData);
	var user_remark = cartData.user_remark;
	if(user_remark == ""){
		user_remark = '';
	}else if(user_remark == "鎴戣繕鏈夊叧浜庢墜鏈虹殑鍏跺畠闂"){
		user_remark = '';
	}
	$(".phoneName").text(cartData.phoneName);
	$(".phoneColor").text(cartData.colorName);
	$(".phonePrice").text(cartData.addprice);
	$(".malBox").empty();
	for (var i = 0; i<cartData.malName.length;i++ ) {
		$(".malBox").append('<li><span class="phoneMal">'+ cartData.malName[i] +'</span><span class="mPrice">锟�'+ cartData.shopPrice[i] +'</span></li>')
	}
	phoneId = cartData.phoneId;
	phonePrice = cartData.addprice;
	colorId = cartData.colorId;
	malId = cartData.malData;
}
//褰╁３涓嬪崟鏁版嵁
if(localStorage.door==3){
	var colorData = JSON.parse(localStorage.colorData);
	if(colorData.user_remark == ""){
		user_remark = '';
	}
	$(".malBox").empty();
	$(".fault-title").text("澶栧３鏇存崲淇℃伅");
	$(".phone_color").empty();
	$(".phoneName").text(colorData.name);
	$(".malBox").append('<span class="phoneMal">'+ colorData.colorname +'</span>')
	$(".phonePrice").text(colorData.totalPrice);
	phoneId = colorData.phoneid;
	malId = [colorData.colorid];
	phonePrice = colorData.totalPrice;
	colorId = '';
}
$(".pre").click(function(){
	localStorage.phone_id = cartData.phoneId;
	window.location.href= document.referrer;
})

$("#fixMenuBtnOne").click(function () {
    category = 1;
    $("#smText").css("color","#f37b46");
    $("#yjText").css("color","#777371");
    $("#imeiBox").hide();
    $("#addressAll").hide();
    $("#addressBox").show();
    $("#imeiTips").hide();
    $("#time").show();
    $("#timeTipsBox").show();
    $("#serviceCenterBox").hide();
    $("#serviceCenterInfoBox").hide();
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
$("#fixMenuBtnTwo").click(function () {
    category = 2;
    $("#smText").css("color","#777371");
    $("#yjText").css("color","#f37b46");
    $("#imeiBox").show();
    $("#addressBox").hide();
    $("#addressAll").show();
    $("#imeiTips").show();
    $("#time").hide();
    $("#timeTipsBox").hide();
    $("#serviceCenterBox").show();
    $("#serviceCenterInfoBox").show();
    if(localStorage.invoice == 1){
    	$(".listBox-right").css("min-height","896px");
    }else if(localStorage.invoice == 0){
    	$(".listBox-right").css("min-height","816px");   	
    }
	
    $("#fixMenuBtnOne #menuL").attr("src","http://sxxcdn.oss-cn-hangzhou.aliyuncs.com/weadoc/fix_tabmenu1.png");
    $("#fixMenuBtnTwo #menuR").attr("src","http://sxxcdn.oss-cn-hangzhou.aliyuncs.com/weadoc/fix_tabmenu2_select2.png");
});

//搴曢儴缁翠慨鏂瑰紡
$('#stepA').hover(function () {
    $("#stepThree").html('03 閭瘎璁惧');
    $("#stepFive").html('05 杞处浠樻');
    $("#stepSix").html('06 瀵勫洖璁惧');
});
$('#stepB').hover(function () {
    $("#stepThree").html('03 涓婇棬缁翠慨');
    $("#stepFive").html('05 鐢ㄦ埛楠屾敹');
    $("#stepSix").html('06 杞处浠樻');
});
$('#stepC').hover(function () {
    $("#stepThree").html('03 鍒板簵缁翠慨');
    $("#stepFive").html('05 鐢ㄦ埛楠屾敹');
    $("#stepSix").html('06 杞处浠樻');
});

//琛ㄥ崟楠岃瘉
$("#userName").change(function(){
    var username = $(this).val();
    var length = username.length;
    if(length >=2 && length <= 16){
        if(/(^(([\u4e00-\u9fa5]|[a-zA-Z0-9])+)$)/.test(username)){
            $("#nameFixTips").hide();
        }else{
            $("#nameFixTips").show();
        }
    }else{
        $("#nameFixTips").show();
    }
});

$("#telPhone").change(function(){
    var filter1 = /^0?1[3|4|5|7|8][0-9]\d{8}$/;
    if(!filter1.test($("#telPhone").val())){
        $("#telFixTips").show();
    }else{
        $("#telFixTips").hide();
    }
});

$("#street").change(function(){
    var streetname = $(this).val();
    var length = streetname.length;
    if(length >=6 && length <= 32){
        if(/(^(([\u4e00-\u9fa5]|[a-zA-Z0-9])+)$)/.test(streetname)){
            $("#streetFixTips").hide();
        }else{
            $("#streetFixTips").show();
        }
    }else{
        $("#streetFixTips").show();
    }
});

$("#inTitle").change(function(){
    var length = $(this).val().length;
    if(length >0){
        $("#titleFixTips").hide();
    }else{
        $("#titleFixTips").show();
    }
});

//琛ㄥ崟楠岃瘉
$("#fixSubmit").click(function(){
    var length = $("#userName").val().length;
    if(length <2 || length > 16){
        $("#nameFixTips").show();
        return;
    }

    var filter1 = /^0?1[3|4|5|7|8][0-9]\d{8}$/;
    if(!filter1.test($("#telPhone").val())){
        $("#telFixTips").show();
        return;
    }

    var length = $("#street").val().length;
    if(length <6 || length > 32){
        $("#streetFixTips").show();
        return;
    }
	fixSubmit()
});

//鏁版嵁璇锋眰

function fixSubmit() {
    //鐪佸競鍖哄湴鍧€绫诲瀷鍒ゆ柇
    var province = null;
    var provinceText = null;
    var city = null;
    var cityText = null;
    var area = null;
    var areaText = null;
    var repairWay = "";
    var mail = "";
    var mailCiyt ="";
    var is_period;
	if(localStorage.within == 1){
		is_period = true;
	}else{
		is_period = '';
	}
    if(category ==1){
        province = $("#provinceOne").val();
        provinceText =$("#provinceOne option:selected").text();
        city = $("#cityOne").val();
        cityText = $("#cityOne option:selected").text();
        area = $("#areaOne").val();
        areaText = $("#areaOne option:selected").text();
        repairWay = "涓婇棬缁翠慨";
        mail = "";
    }else if(category == 2){
        province = $("#province option:selected").attr("value");
        provinceText = $("#province option:selected").text();
        city =  $("#city option:selected").attr("value");
        cityText = $("#city option:selected").text();
        area =$("#areap option:selected").attr("value");
        areaText = $("#areap option:selected").text();
        repairWay = "閭瘎缁翠慨";
        mail = $("#centerDetails").text();
        mailCiyt=$("#provinceService option:selected").attr("city");
    }else if(category == 3){
        province = $("#province option:selected").attr("value");
        provinceText = $("#province option:selected").text();
        city =  $("#city option:selected").attr("value");
        cityText = $("#city option:selected").text();
        mailCiyt=$("#provinceService option:selected").attr("city");
        area =$("#areap option:selected").attr("value");
        areaText = $("#areap option:selected").text();
        repairWay = "鍒板簵缁翠慨";
        mail = $("#centerDetails").text();
    }

    //鏃堕棿鎴宠浆鍖�
    var strtime = $("#datetimepickertime").val()+" "+$("#datetimepicker").val();
    var datetime = (new Date(strtime)).getTime()/1000;
    if(	isNaN(datetime)){
    	datetime = '';
    }

    //浼犲叆鍙傛暟
    var formdata = {
    	"type":1,
        "category":category,
        "name": $("#userName").val(),
        "mobile": $("#telPhone").val(),
        "province":province,
        "city":city,
        "area":area,
        "user_remark": user_remark,
        "phone_id" : phoneId,
        "color_id" : colorId,
        "areaText":areaText,
        "provinceText":provinceText,
        "cityText":cityText,
        "is_invoice":localStorage.invoice,
        "is_personal":localStorage.is_personal,
        "detailed_address":$("#street").val(),
        "coupons": $("#vote").val(),
        "phone_imei": $("#imei").val(),
        "date":datetime,
        "malfunctions":malId,
        "invoice": $("#inTitle").val(),      
        "tax_number":$("#taxNumber").val(),
        "mailAddress":mail,
        "mailCiyt":mailCiyt,
        "tommagic":collectShare,
        "reference_price":cartData.addprice,
        "landUrl":landShare,
        "referrer":reShare,
        'is_period':is_period,
        'brand_id':localStorage.brand_id,
        'suuid': Cookies.get('suuid') // 鐢ㄦ埛杩借釜鏍囪瘑
    };
    $('#fixSubmit').attr('disabled','true');
	$.ajax({
		type:"POST",
		dataType:'json',
		url:url + '/api/order/add',
		data:formdata,
		success:function(data, status){
			if(data.code==200){
				localStorage.clear();
				window.location.href = "successTips.html";
				localStorage.orderNumber = data.data.orderNumber;
			}else if(data.code==555){
				$(".xiaomi").show();
			}else{
				localStorage.source = source;
				window.location.href = "fail.html";
			}
		}		
	});
}
/*function codeButton() {
    var filter1 = /^0?1[3|5|7|8][0-9]\d{8}$/;
    if(!filter1.test($("#telPhone").val())){
        alert('璇锋纭～鍐欐墜鏈哄彿鐮�');
        return;
    }
    $.ajax({
        type: 'POST',
        url: url + '/api/order/sendSms',
        data: {
            mobile : $("#telPhone").val()
        },
        dataType: 'json',
        success: function (data, status) {
            if (status == "success" && data.code == 200) {
                time(document.getElementById('enterCode'));
                //alert('鑾峰彇鎴愬姛')
            }
        }
    })
}

//鑾峰彇楠岃瘉鐮�
var wait=60;
// var wait;
function time(o) {
    // debugger;
    if (wait == 0) {
        o.innerHTML="鑾峰彇";
        $('#enterCode').css({background:"#fff"});
        wait = 60;
    } else {
        //alert(wait);
        o.innerHTML="(" + wait + ")";
        $('#enterCode').css({background:"#c8c8c8"});
        wait--;
        setTimeout(function() {
            time(o)
        },1000)
    }
}*/

//涓婇棬缁翠慨鐪佸競鍖哄湴鍧€璇锋眰
var areaList = [];
var cityList = [];
$.ajax({
    type:'POST',
    dataType:'json',
    url: url + '/api/Address/doorAddress',
    success:function(data,status){
        if(status == "success" && data.code == 200){
            $.each(data.data,function(id,value) {
                areaList.push(value);
            });
            renderProvince();
        }
    }
});

function renderProvince(){
    $('#provinceOne').empty();
    for(var i = 0;i<areaList.length;i++){
        var value = areaList[i];
        $('#provinceOne').append($('<option>', {
            value: value.id,
            text:value.name
        }));
    }
    renderCity(areaList[0]);
}

function renderCity(area){
    cityList = area.city;
    $('#cityOne').empty();
    for(var i = 0;i<cityList.length;i++){
        var city = cityList[i];
        $("#cityOne").append($('<option>', {
            value: city.id,
            text:city.name
        }));
    }
    var cityArea = [];
    $.each(cityList[0].area,function(id,value) {
        cityArea.push(value);
    });
    renderArea(cityArea);
}

function renderArea(area){
    $('#areaOne').empty();
    for(var i = 0;i<area.length;i++){
        var value = area[i];
        $('#areaOne').append($('<option>', {
            value: value.id,
            text:value.name
        }));
    }
}

$('#provinceOne').change(function(){
    var currentValue = $(this).val();
    for(var i = 0;i<areaList.length;i++){
        var value = areaList[i];
        if(currentValue == value.id){
            renderCity(value);
            break;
        }
    }
});

$("#cityOne").change(function(){
    var currentCity = $(this).val();
    for(var i = 0;i<cityList.length;i++){
        var city = cityList[i];
        if(currentCity == city.id){
            var cityArea = [];
            $.each(city.area,function(id,value) {
                cityArea.push(value);
            });
            renderArea(cityArea);
            break;
        }
    }
});

//閭瘎鍦板潃閮ㄥ垎闂ㄥ簵鍦板潃鑾峰彇
var servicecenter =[];
$.ajax({
    type:'POST',
    dataType:'json',
    url: url + '/api/Address/mailAddress',
    success:function(data,status){
        if(status == "success" && data.code == 200){
            servicecenter = data.data;
            for (var c = 0; c < data.data.length; c++) {
                var centerData = data.data[c];
                if(c == 0){
                    $("#centerDetails").append(' <p>' +
                        '<span>閭瘎鍦板潃:'+centerData.address+'</span>' +
                        //'<span>'+centerData.receiver+'</span><br>' +
                        '<span>鑱旂郴鐢佃瘽锛�'+centerData.phone+'</span></p>')
                    $("#centerDetails").append('<div class="zhuyi">鐗瑰埆娉ㄦ剰锛岄偖瀵勭淮淇繍璐归渶鐢ㄦ埛鑷鎵挎媴</div>');
                }
                $("#provinceService").append($('<option>', {
                    value: centerData.id,
                    text: centerData.name,
                    city:centerData.city
                }));
            }
        }
    }
});

$('#provinceService').change(function(){
    var serviceValue = $(this).val();
    $('#centerDetails').empty();
    for(var i = 0; i < servicecenter.length;i++){
        var value = servicecenter[i];
        if(serviceValue == value.id){
            $("#centerDetails").append(' <p>' +
                '<span>閭瘎鍦板潃:'+value.address+'</span>' +
                //'<span>'+value.receiver+'</span><br>' +
                '<span>鑱旂郴鐢佃瘽锛�'+value.phone+'</span></p>')
             $("#centerDetails").append('<div class="zhuyi">鐗瑰埆娉ㄦ剰锛岄偖瀵勭淮淇繍璐归渶鐢ㄦ埛鑷鎵挎媴</div>');
            break;
        }
    }
});
