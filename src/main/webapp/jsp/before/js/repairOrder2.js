localStorage.removeItem("cartData");
localStorage.removeItem("within");
if(localStorage.meizu == 0){
	$(".bx-main").hide();
	$(".description").hide();
	$(".serviceRepair").show();
	$(".meizu-title").hide();
}else if(localStorage.meizu == 1){
	$(".bx-main").show();				
	$(".description").show();
	$(".serviceRepair").hide();
	$(".meizu-title").show();
}
if(localStorage.hide == 1){
	$("#page-one").hide();
    $("#page-two").show();
    $(".describe").hide();	
}else if(localStorage.hide == 0){
	$("#page-one").show();
    $("#page-two").hide();
    $(".describe").show();	
}
$(".questionEdit").val("我还可以更详细的描述我手机的故障情况");
$(".questionEdit").focus(function(){
	if($(".questionEdit").val() == "我还可以更详细的描述我手机的故障情况"){
		$(".questionEdit").val("");
	}
})
$(".questionEdit").blur(function(){
	if($(".questionEdit").val().length == 0){
		$(".questionEdit").val("我还可以更详细的描述我手机的故障情况");
	}
})

//服务和问题模块
$("#serviceBtn").click(function(){
    $("#service_grids").show();
    $("#question_grids").hide();
});
$("#questionBtn").click(function(){
    $("#service_grids").hide();
    $("#question_grids").show();
});

var obj = {};
$.ajax({
    type: 'get',
    dataType: 'json',
    url: url + '/api/PhoneType/brandPhone',
    success: function (data, status) {
        if (status == "success" && data.code == 200) {			
            for(var i = 0;i<data.data.length;i++){          	
            	obj[data.data[i].alias] = data.data[i].id;
            }       
            var countriesArray = $.map(obj, function (value, key) { return { value: key, data:value  }; });
            var countriesArray2 = $.map(obj, function (value, key) { return { value: key, data:value  }; });
			for(var j = 0 ;j< countriesArray2.length; j++){
				countriesArray2[j].value = countriesArray2[j].value.toLowerCase().replace(/\s/g,'');
			}
			$(".search-pic").click(function(){
				var text = $(".search-text").val().replace(/\s/g,'');
				for (var i =0 ;i < countriesArray2.length;i++){
					if(text !== countriesArray2.value){
						$("#page-one").hide();
					    $("#page-two").show();
					    $(".describe").hide();						
					}else if(text === countriesArray2.value){
						if(text[0] == "魅"){
							localStorage.meizu = 1; 
						}else{
							localStorage.meizu = 0; 
						}
						localStorage.phone_id = countriesArray2.data;
						var nextData = {};
						nextData.data = countriesArray2[i].data;
						onSelect(nextData);
					}
				}
			})
			$(".search-text").bind('keydown',function(e){
				var key = e.which;
				 if (key == 13) {
				 	var text = $(".search-text").val().replace(/\s/g,'');
 					for (var i =0 ;i < countriesArray2.length;i++){
						if(text !== countriesArray2[i].value){
							$("#page-one").hide();
						    $("#page-two").show();
						    $(".describe").hide();
						}else if(text === countriesArray2[i].value){
							if(text[0] == "魅"){
								localStorage.meizu = 1; 
							}else{
								localStorage.meizu = 0; 
							}
							localStorage.phone_id = countriesArray2[i].data;
							var nextData = {};
							nextData.data = countriesArray2[i].data;
							onSelect(nextData);
						}
					}
				 }
			})
			$('#autocomplete-ajax').autocomplete({
			    lookup: countriesArray,
			    onSelect: onSelect
			});			
        }
    }
});

//下单数据
var cartData={
	addprice:0
};
var firstData ={
	
};
if(localStorage.phone_id){
	firstData.data = localStorage.phone_id;
	firstData.value = localStorage.phone_name;
	cartData.phoneId = localStorage.phone_id;
}else if(localStorage.phone_id == undefined){
	firstData.data = 67;
	cartData.phoneId = 67;
 	firstData.value='iPhone 6s';
}

//点击选择故障
$("#fault").click(function(){
	$("#page-one").show();
    $("#page-two").hide();
    $(".describe").show();
    var idx =  $(".phoneAct").data("id");
    cartData.phoneId = idx;
    firstData.data = idx;  
    onSelect(firstData);
})
onSelect(firstData);

function onSelect(suggestion,callback){
	var phoneName = suggestion.value;
	if(phoneName[0] == "魅"){
		localStorage.meizu = 1; 
	}else{
		localStorage.meizu = 0; 
	}
	$("#shopping").empty();
	cartData.addprice =0;
	cartData.malName = "undefined";
	cartData.malName = "undefined";
	$(".brand-left").removeClass("brandActive");
	$(".modalIntroduce").hide();
	localStorage.removeItem("cartData"); 	
	cartData.phoneId=suggestion.data;
    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: url + '/api/PhoneType/malclass',
        data:{
            id:suggestion.data
        },
        success: function (data, status) {	
        	$(".phoneName").text(data.data.alias);
        	cartData.phoneName = data.data.alias;
        	$("#shopPicBox").empty();
        	$("#shopPicBox").append('<img class="cartPic" src="'+data.data.img+'">');
            $(".brand-left").empty();
            $(".brand-left").prepend('<img class="model-pic" src="'+data.data.img+'">');
            $(".phone-name").text(data.data.alias);
            $("#modelColor").empty();
			var mallength = data.data.malfunction;
			localStorage.brand_id = data.data.brand_id;
            for (var k = 0; k < data.data.color.length && k < data.data.color.length; k++) {            	          	
                var colorData = data.data.color[k];
                var colorName = "'"+ colorData.name +"'"; 
                var colorBtn;
                if(colorData.name == "白色"){
                	colorBtn = "white";
                }else{
                	colorBtn = "";
                }
                if(k==0){
            		datashopcolor(colorData.name);
            		datacolor(colorData.id);
            	} 
				$("#modelColor").append('<div data-color="'+ colorData.id +'" class="color-btn " data-id="' + k + '" onclick="datashopcolor('+ colorName +');datacolor(' + colorData.id + ');"><span class="btnColor '+ colorBtn +'" style="background-color:' + colorData.color + ' "></span><span class="colorName">'+colorData.name+'</span></div>');
            }
            $(".color-btn").bind("mouseover",function(){
	      		var Index = $(".color-btn").index($(this));
	      		if($(".color-btn").eq(Index).hasClass("colorChoice")){
	//	      			$(".break-box").eq(Index).addClass("break-hover");
	      		}else{
	      			$(".color-btn").eq(Index).addClass("color-btnHover");
	      		}      				      		
	      	})
	      	$(".color-btn").bind("mouseout",function(){
	      		var Index = $(".color-btn").index($(this));     		
	  			$(".color-btn").eq(Index).removeClass("color-btnHover");	
	      	})
            $($("#modelColor").children("div").get(0)).addClass("colorChoice");
			$(".color-btn").on("click",function(){
				var Index = $(".color-btn").index($(this));
				$(".color-btn").removeClass("colorChoice");
				$(".color-btn").eq(Index).addClass("colorChoice");			
			})  
			$(".within").on("mouseover",function(){
				$(".within").addClass("within-hover");			
			})
			$(".abroad").on("mouseover",function(){
				$(".abroad").addClass("abroad-hover");			
			})
			$(".within").on("mouseout",function(){
				$(".within").removeClass("within-hover");			
			})
			$(".abroad").on("mouseout",function(){
				$(".abroad").removeClass("abroad-hover");			
			})
			$(".within").on("click",function(){	
				localStorage.within = 1;
				$("#orderTotle").text(0)
				$(".within").addClass("within-choose");	
				$(".abroad").removeClass("within-choose");
			})
			$(".abroad").on("click",function(){
				localStorage.within = 0;
				$(".within").removeClass("within-choose");
				$(".abroad").addClass("within-choose");			
			})			
            $("#break-list").empty(); 
            $("#break-list2").empty();
            $("#break-list3").empty();
            /*for(var j in mallength){  
		        $("#break-list").append('<div class="break-box" data-id = "' + mallength[j].id +'"><div class="break-title clearfix"><li class="break-classify">'+ mallength[j].name +'</li></div><ul id="box'+ j +'" class="break-main clearfix"  data-id="'+ mallength[j].id +'"></ul></div>');		        		              
		        for(var k in mallength[j].malfunction){		        	
		        	var malname = mallength[j].malfunction[k];
		          	$("#box" + j).append('<li class="b-list" data-name="'+ mallength[j].malfunction[k].malfunction +'" data-remark="' + mallength[j].malfunction[k].remark + '"  data-price="'+ mallength[j].malfunction[k].price_reference  +'" data-id = "'+ mallength[j].malfunction[k].id +'" data-name="'+ malname.malfunction +'"><span class="break-name">'+ mallength[j].malfunction[k].malfunction +'</span><span class="break-price">￥'+ mallength[j].malfunction[k].price_reference +'</span></li>')
		        }		       	        
	      	}*/
	      	if(mallength.length>8){
	      		for(var j=0;j<4;j++){
			        $("#break-list").append('<div class="break-box breakBox'+j+' " data-id = "' + mallength[j].id +'"><img class="malImg" src="'+ mallength[j].img +'" /><li class="break-classify">'+ mallength[j].name +'</li><div class = "noneText">'+ mallength[j].name +'</div></div>');		        		              
		      	}
		      	for(var k = 4;k < 8;k++ ){
			        $("#break-list2").append('<div class="break-box2" data-id = "' + mallength[k].id +'"><img class="malImg" src="'+ mallength[k].img +'" /><li class="break-classify">'+ mallength[k].name +'</li><div class = "noneText">'+ mallength[k].name +'</div></div>');		        		              	      		
		      	}
		      	for(var l = 8;l < mallength.length;l++ ){
			        $("#break-list3").append('<div class="break-box3" data-id = "' + mallength[l].id +'"><img class="malImg" src="'+ mallength[l].img +'" /><li class="break-classify">'+ mallength[l].name +'</li><div class = "noneText">'+ mallength[l].name +'</div></div>');		        		              	      		
		      	}
	      	}
	      	if(mallength.length> 4 && mallength.length< 9){	      		
	      		for(var j=0;j<4;j++){
			        $("#break-list").append('<div class="break-box" data-id = "' + mallength[j].id +'"><img class="malImg" src="'+ mallength[j].img +'" /><li class="break-classify">'+ mallength[j].name +'</li><div class = "noneText">'+ mallength[j].name +'</div></div>');		        		              
		      	}
		      	for(var k = 4;k < mallength.length;k++ ){
			        $("#break-list2").append('<div class="break-box2" data-id = "' + mallength[k].id +'"><img class="malImg" src="'+ mallength[k].img +'" /><li class="break-classify">'+ mallength[k].name +'</li><div class = "noneText">'+ mallength[k].name +'</div></div>');		        		              	      		
		      	}		      	
	      	} 
	      	if(mallength.length> 0 && mallength.length< 5){
	      		for(var j=0;j<mallength.length;j++){
			        $("#break-list").append('<div class="break-box" data-id = "' + mallength[j].id +'"><img class="malImg" src="'+ mallength[j].img +'" /><li class="break-classify">'+ mallength[j].name +'</li><div class = "noneText">'+ mallength[j].name +'</div></div>');		        		              
		      	}	      	
	      	}
	      	$(".break-box").bind("mouseenter",function(){
	      		var Index = $(".break-box").index($(this));
	      		if($(".break-box").eq(Index).hasClass("mal-active")){
	      		}else{
	      			$(".break-box").eq(Index).addClass("break-hover");
	      		}
	      		int = setTimeout(function(){
	      			$(".break-box").eq(Index).children("div :last-child").show();	      			
	      		},1500)
			})
	      	$(".break-box").bind("mouseleave",function(){
	      		var Index = $(".break-box").index($(this));   
	      		clearTimeout(int)
	      		$(".break-box").children("div :last-child").hide();
      			$(".break-box").eq(Index).removeClass("break-hover");
				$(".break-box").eq(Index).children("div :last-child").hide();
	      	})
	        $(".break-box").bind("click",function(){
				var index = $(".break-box").index($(this));

				// console.log($(this).children('li').text());
				/**
				 * 2018-3-19 14:03:11
				 * @author lizhikui
				 * iphone6p 屏幕缺货提示
				 */
				var nowText = $(this).children('li').text();
				var $iphone6pShow = $('.iphone6p-show');
				if(nowText === '屏幕问题'){
					$(".mal-title").show();
					if ($('.phone-name').html() === 'iPhone 6 Plus') {
						// $iphone6pShow.removeClass('hide');
					}
				}else{
					$(".mal-title").hide();
					$iphone6pShow.addClass('hide');
				}
				
				var dataId = $(this).attr("data-id");
				$.ajax({
					type: 'POST',
			        dataType: 'json',
			        url: url + '/api/PhoneType/maldetails',
			        data:{
			            id:suggestion.data,
			            type_id:dataId
			        },
			        success: function (data, status) {
			        	if (status == "success" && data.code == 200) {
			        		$("#detailed1").empty();
			        		var malData = data.data;
			        		for(var i = 0; i< malData.length; i++){
			        			var display;
					        	if(phoneName == 'iPhone 6s'&&malData[i].malfunction == '64G内存升级'){
					        		display = 'block';
					        	}else{
					        		display = 'block';
					        	}
			        			$("#detailed1").append('<li class="b-list '+ display +'" title="'+ malData[i].malfunction +'" data-name="'+ malData[i].malfunction +'" data-remark="' + malData[i].remark + '"  data-price="'+ malData[i].price_reference  +'" data-id = "'+ malData[i].id +'" data-name="'+ malname.malfunction +'"><span class="break-name">'+ malData[i].malfunction +'</span><div class="price_box"><div class="break-price">￥'+ malData[i].price_reference +'</div><div class="price_market">￥'+ Math.floor(malData[i].price_market) +'</div></div></li>')
			        		}
			        		$(".b-list").bind("mouseover",function(){
					      		var Index = $(".b-list").index($(this));
					      		if($(".b-list").eq(Index).hasClass("break-active")){
				//	      			$(".break-box").eq(Index).addClass("break-hover");
					      		}else{
					      			$(".b-list").eq(Index).addClass("b-listHover");	
					      		}      				      		
					      	})
					      	$(".b-list").bind("mouseout",function(){
					      		var Index = $(".b-list").index($(this));     		
				      			$(".b-list").eq(Index).removeClass("b-listHover");
				
					      	})
			        		$(".b-list").click(function(){
					        	var dataid = $(this).attr("data-id");
					        	var dataprice = $(this).attr("data-price");
					        	var dataname = $(this).attr("data-name");
					        	var remake = $(this).attr("data-remark");
					        	var name = $(this).attr("data-name");
					        	if($(this).hasClass("break-active")){	        		
					        		$(this).removeClass("break-active");
					        		maldata.splice(maldata.indexOf(dataid),1);
					        		malprice.splice(malprice.indexOf(dataprice),1);
					        		malname.splice(malname.indexOf(dataname),1);
					        	}else{
					        		$(".modalIntroduce").show();
					        		$(".brand-left").addClass("brandActive");
					        		$(".describeTitle").text(name);
					        		$(".describeMain").text(remake);
					        		if(remake == "undefined"){
					        			$(".describeMain").text("暂无故障描述");
					        		}
					        		$(this).addClass("break-active");
					        		maldata.push(dataid);
					         		malprice.push(dataprice);
					         		malname.push(dataname); 		
					        	}
					        	if(localStorage.within == 1){
					        		var addprice = 0;
					        		$("#orderTotle").text(0)
					        	}else{
					        		var addprice = 0;
						        	for(var i = 0;i<malprice.length;i++){       		
						        		addprice =addprice+parseInt(malprice[i]);
						        	}	    
						        	if(addprice == 0){
						        		$(".brand-left").removeClass("brandActive");
						        		$(".modalIntroduce").hide();
						        	}
									$("#orderTotle").text(addprice)
					        	}
					        	$("#shopping").empty();
					        	for(var i = 0; i< maldata.length;i++){
					        		$("#shopping").append('<li class="list-group-item pull-left cartSubMenu"><span>'+malname[i]+'<span><span class="shop-price">￥'+malprice[i]+'<span><button onClick="clearBtn('+ i +')" type="button" data-id="'+ i +'" class="fixDelIcon"></button></li>')
					        	}	        	
					        	if($("#shopping").children().length>3){
					        		$(".cartSubMenu").css("margin-right","20px");
					        	}
					        	cartData.malName = malname;
					        	cartData.malData = maldata;
					        	cartData.addprice = addprice;
					        	cartData.shopPrice = malprice;
					        	shopData=maldata;
					        	shopName = malname;
					        	shopPrice = malprice;        	
					        })
			        	}
			        }
				});
				$(".break-box").removeClass("mal-active");
				$(".break-box2").removeClass("mal-active");
				$(".break-box3").removeClass("mal-active");
				$(".break-box").eq(index).addClass("mal-active");
				$("#detailed1").show();
				$("#detailed2").hide();
				$("#detailed3").hide();
				
			});	
			$(".break-box2").bind("mouseenter",function(){
	      		var Index = $(".break-box2").index($(this));
	      		if($(".break-box2").eq(Index).hasClass("mal-active")){
	      		}else{
	      			$(".break-box2").eq(Index).addClass("break-hover");
	      		}
	      		int2 = setTimeout(function(){
	      			$(".break-box2").eq(Index).children("div :last-child").show();	      			
	      		},1500)
			})
	      	$(".break-box2").bind("mouseleave",function(){
	      		var Index = $(".break-box2").index($(this));   
	      		clearTimeout(int2)
	      		$(".break-box2").children("div :last-child").hide();
      			$(".break-box2").eq(Index).removeClass("break-hover");
				$(".break-box2").eq(Index).children("div :last-child").hide();
	      	})
	        $(".break-box2").bind("click",function(){
				/**
				 * 2018-3-19 14:03:11
				 * @author lizhikui
				 * iphone6p 屏幕缺货提示
				 */
				var nowText = $(this).children('li').text();
				var $iphone6pShow = $('.iphone6p-show');
				if(nowText === '屏幕问题'){
					if ($('.phone-name').html() === 'iPhone 6 Plus') {
						// $iphone6pShow.removeClass('hide');
					}
				}else{
					$iphone6pShow.addClass('hide');
				}


				var index = $(".break-box2").index($(this));
				var dataId = $(this).attr("data-id");
				$.ajax({
					type: 'POST',
			        dataType: 'json',
			        url: url + '/api/PhoneType/maldetails',
			        data:{
			            id:suggestion.data,
			            type_id:dataId
			        },
			        success: function (data, status) {
			        	if (status == "success" && data.code == 200) {
			        		$("#detailed2").empty();
			        		var malData = data.data;
			        		for(var i = 0; i< malData.length; i++){
			        			var display;
					        	if(phoneName == 'iPhone 6s'&&malData[i].malfunction == '64G内存升级'){
					        		display = 'block';
					        	}else{
					        		display = 'block';
					        	}
			        			$("#detailed2").append('<li class="b-list '+ display +'" title="'+ malData[i].malfunction +'" data-name="'+ malData[i].malfunction +'" data-remark="' + malData[i].remark + '"  data-price="'+ malData[i].price_reference  +'" data-id = "'+ malData[i].id +'" data-name="'+ malname.malfunction +'"><span class="break-name">'+ malData[i].malfunction +'</span><div class="price_box"><div class="break-price">￥'+ malData[i].price_reference +'</div><div class="price_market">￥'+ Math.floor(malData[i].price_market) +'</div></div></li>')
			        		}
			        		$(".b-list").bind("mouseover",function(){
					      		var Index = $(".b-list").index($(this));
					      		if($(".b-list").eq(Index).hasClass("break-active")){
				//	      			$(".break-box").eq(Index).addClass("break-hover");
					      		}else{
					      			$(".b-list").eq(Index).addClass("b-listHover");
					      		}      				      		
					      	})
					      	$(".b-list").bind("mouseout",function(){
					      		var Index = $(".b-list").index($(this));     		
				      			$(".b-list").eq(Index).removeClass("b-listHover");
				
					      	})
			        		$(".b-list").click(function(){
					        	var dataid = $(this).attr("data-id");
					        	var dataprice = $(this).attr("data-price");
					        	var dataname = $(this).attr("data-name");
					        	var remake = $(this).attr("data-remark");
					        	var name = $(this).attr("data-name");
					        	if($(this).hasClass("break-active")){	        		
					        		$(this).removeClass("break-active");
					        		maldata.splice(maldata.indexOf(dataid),1);
					        		malprice.splice(malprice.indexOf(dataprice),1);
					        		malname.splice(malname.indexOf(dataname),1);
					        	}else{
					        		$(".modalIntroduce").show();
					        		$(".brand-left").addClass("brandActive");
					        		$(".describeTitle").text(name);
					        		$(".describeMain").text(remake);
					        		if(remake == "undefined"){
					        			$(".describeMain").text("暂无故障描述");
					        		}
					        		$(this).addClass("break-active");
					        		maldata.push(dataid);
					         		malprice.push(dataprice);
					         		malname.push(dataname); 		
					        	}
					        	var addprice = 0;
					        	for(var i = 0;i<malprice.length;i++){       		
					        		addprice =addprice+parseInt(malprice[i]);
					        	}	    
					        	if(addprice == 0){
					        		$(".brand-left").removeClass("brandActive");
					        		$(".modalIntroduce").hide();
					        	}
								$("#orderTotle").text(addprice)
					        	$("#shopping").empty();
					        	for(var i = 0; i< maldata.length;i++){
					        		$("#shopping").append('<li class="list-group-item pull-left cartSubMenu"><span>'+malname[i]+'<span><span class="shop-price">￥'+malprice[i]+'<span><button onClick="clearBtn('+ i +')" type="button" data-id="'+ i +'" class="fixDelIcon"></button></li>')
					        	}	        	
					        	if($("#shopping").children().length>3){
					        		$(".cartSubMenu").css("margin-right","20px");
					        	}
					        	cartData.malName = malname;
					        	cartData.malData = maldata;
					        	cartData.addprice = addprice;
					        	cartData.shopPrice = malprice;
					        	shopData=maldata;
					        	shopName = malname;
					        	shopPrice = malprice;        	
					        })
			        	}
			        }
				});
				$(".break-box").removeClass("mal-active");
				$(".break-box2").removeClass("mal-active");
				$(".break-box3").removeClass("mal-active");
				$(".break-box2").eq(index).addClass("mal-active");
				$("#detailed1").hide();
				$("#detailed2").show();				
				$("#detailed3").hide();
			});
			$(".break-box3").bind("mouseenter",function(){
	      		var Index = $(".break-box3").index($(this));
	      		if($(".break-box3").eq(Index).hasClass("mal-active")){
	      		}else{
	      			$(".break-box3").eq(Index).addClass("break-hover");
	      		}
	      		int3 = setTimeout(function(){
	      			$(".break-box3").eq(Index).children("div :last-child").show();	      			
	      		},1500)
			})
	      	$(".break-box3").bind("mouseleave",function(){
	      		var Index = $(".break-box3").index($(this));   
	      		clearTimeout(int3)
	      		$(".break-box3").children("div :last-child").hide();
      			$(".break-box3").eq(Index).removeClass("break-hover");
				$(".break-box3").eq(Index).children("div :last-child").hide();
	      	})
	        $(".break-box3").bind("click",function(){
				/**
				 * 2018-3-19 14:03:11
				 * @author lizhikui
				 * iphone6p 屏幕缺货提示
				 */
				var nowText = $(this).children('li').text();
				var $iphone6pShow = $('.iphone6p-show');
				if(nowText === '屏幕问题'){
					if ($('.phone-name').html() === 'iPhone 6 Plus') {
						// $iphone6pShow.removeClass('hide');
					}
				}else{
					$iphone6pShow.addClass('hide');
				}

				
				var index = $(".break-box3").index($(this));
				var dataId = $(this).attr("data-id");
				$.ajax({
					type: 'POST',
			        dataType: 'json',
			        url: url + '/api/PhoneType/maldetails',
			        data:{
			            id:suggestion.data,
			            type_id:dataId
			        },
			        success: function (data, status) {
			        	if (status == "success" && data.code == 200) {
			        		$("#detailed3").empty();
			        		var malData = data.data;
			        		for(var i = 0; i< malData.length; i++){
			        			var display;
					        	if(phoneName == 'iPhone 6s'&&malData[i].malfunction == '64G内存升级'){
					        		display = 'block';
					        	}else{
					        		display = 'block';
					        	}
			        			$("#detailed3").append('<li class="b-list '+ display +'" title="'+ malData[i].malfunction +'" data-name="'+ malData[i].malfunction +'" data-remark="' + malData[i].remark + '"  data-price="'+ malData[i].price_reference  +'" data-id = "'+ malData[i].id +'" data-name="'+ malname.malfunction +'"><span class="break-name">'+ malData[i].malfunction +'</span><div class="price_box"><div class="break-price">￥'+ malData[i].price_reference +'</div><div class="price_market">￥'+ Math.floor(malData[i].price_market) +'</div></div></li>')
			        		}
			        		$(".b-list").bind("mouseover",function(){
					      		var Index = $(".b-list").index($(this));
					      		if($(".b-list").eq(Index).hasClass("break-active")){
				//	      			$(".break-box").eq(Index).addClass("break-hover");
					      		}else{
					      			$(".b-list").eq(Index).addClass("b-listHover");
					      		}      				      		
					      	})
					      	$(".b-list").bind("mouseout",function(){
					      		var Index = $(".b-list").index($(this));     		
				      			$(".b-list").eq(Index).removeClass("b-listHover");
				
					      	})
			        		$(".b-list").click(function(){
					        	var dataid = $(this).attr("data-id");
					        	var dataprice = $(this).attr("data-price");
					        	var dataname = $(this).attr("data-name");
					        	var remake = $(this).attr("data-remark");
					        	var name = $(this).attr("data-name");
					        	if($(this).hasClass("break-active")){	        		
					        		$(this).removeClass("break-active");
					        		maldata.splice(maldata.indexOf(dataid),1);
					        		malprice.splice(malprice.indexOf(dataprice),1);
					        		malname.splice(malname.indexOf(dataname),1);
					        	}else{
					        		$(".modalIntroduce").show();
					        		$(".brand-left").addClass("brandActive");
					        		$(".describeTitle").text(name);
					        		$(".describeMain").text(remake);
					        		if(remake == "undefined"){
					        			$(".describeMain").text("暂无故障描述");
					        		}
					        		$(this).addClass("break-active");
					        		maldata.push(dataid);
					         		malprice.push(dataprice);
					         		malname.push(dataname); 		
					        	}
					        	var addprice = 0;
					        	for(var i = 0;i<malprice.length;i++){       		
					        		addprice =addprice+parseInt(malprice[i]);
					        	}	    
					        	if(addprice == 0){
					        		$(".brand-left").removeClass("brandActive");
					        		$(".modalIntroduce").hide();
					        	}
								$("#orderTotle").text(addprice)
					        	$("#shopping").empty();
					        	for(var i = 0; i< maldata.length;i++){
					        		$("#shopping").append('<li class="list-group-item pull-left cartSubMenu"><span>'+malname[i]+'<span><span class="shop-price">￥'+malprice[i]+'<span><button onClick="clearBtn('+ i +')" type="button" data-id="'+ i +'" class="fixDelIcon"></button></li>')
					        	}	        	
					        	if($("#shopping").children().length>3){
					        		$(".cartSubMenu").css("margin-right","20px");
					        	}
					        	cartData.malName = malname;
					        	cartData.malData = maldata;
					        	cartData.addprice = addprice;
					        	cartData.shopPrice = malprice;
					        	shopData=maldata;
					        	shopName = malname;
					        	shopPrice = malprice;        	
					        })
			        	}
			        }
				});
				$(".break-box").removeClass("mal-active");
				$(".break-box2").removeClass("mal-active");
				$(".break-box3").removeClass("mal-active");
				$(".break-box3").eq(index).addClass("mal-active");				
				$("#detailed1").hide();
				$("#detailed2").hide();				
				$("#detailed3").show();
				
			});
	        var maldata=[];
	        var malprice=[];
	        var malname = [];
	        if(localStorage.meizu == 0){
				$(".bx-main").hide();
				$(".description").hide();
				$(".serviceRepair").show();
				$(".meizu-title").hide();
			}else if(localStorage.meizu == 1){
				$(".bx-main").show();				
				$(".description").show();
				$(".serviceRepair").hide();
				$(".meizu-title").show();
			}
	        
        }
    });
}
$(".other-box").hide();
var otherBtn = true;
$(".other-title").click(function(){
	if(otherBtn){
		$(".other-img").attr("src","images/other2.png");
		$(".other-text").text("取消备注");
		$(".other-box").show();
		otherBtn = ! otherBtn;
	}else{
		$(".other-img").attr("src","images/other1.png");
		$(".other-text").text("添加备注");
		$(".other-box").hide();
		otherBtn = ! otherBtn;
	}
})
function clearBtn(i){
	shopData.splice(i,1);
	shopPrice.splice(i,1);
	shopName.splice(i,1);
	$("#shopping").empty();
	var addprice = 0;
	for(var i = 0;i<shopPrice.length;i++){       		
		addprice =addprice+parseInt(shopPrice[i]);
	}
	$("#orderTotle").text(addprice);
	for(var i = 0; i< shopData.length;i++){
		$("#shopping").append('<li class="list-group-item pull-left cartSubMenu"><span>'+shopName[i]+'<span><span class="shop-price">￥'+shopPrice[i]+'<span><button onClick="clearBtn('+ i +')" type="button" data-id="'+ i +'" class="fixDelIcon"></button></li>')
	}		
	cartData.malName = shopName;
	cartData.malData = shopData;
	cartData.addprice = addprice;
	$($(".break-active")[i]).removeClass("break-active");
	if(addprice == 0){
		$(".brand-left").removeClass("brandActive");
	    $(".modalIntroduce").hide();
	}
}
function datashopcolor(name){
	cartData.colorName = name; 
}
function datacolor(id){
	cartData.colorId = id;
}

$(".modify").click(function(){
    $("#page-one").hide();
    $("#page-two").show();
    $(".describe").hide();
});
//更多机型按钮
$("#show-btn").click(function(){
	$(".description").hide();
	$(".serviceRepair").show()
    $("#page-one").hide();
    $("#page-two").show();
    $(".describe").hide();
});

$(".returnBtn").click(function(){
	$(".describe").show();
	$("#page-two").hide();
	$("#page-one").show();
})
getPhoneType()
//获取品牌
var firstList = [];
function getPhoneType(){
    $.ajax({
        type: 'get',
        dataType: 'json',
        url: url + '/api/PhoneType/brand',
        success: function (data, status) {
            if (status == "success" && data.code == 200) {
                firstList = data.data;
                	for (var i = 0; i < data.data.length; i++) {
	                    var brandData = data.data[i];
	                    var name;
	                    if(data.data[i].name == "魅族"){
		                	name = "meizu";
		                }else if(data.data[i].name == "Rokid"){
		                	name = "ruoqi";
		                }else{
		                	name = "";
		                }
	                    if(i === 0){
	                        //默认第一个品牌的数据显示
	                        brandClickButton(brandData.id);
	                    }
	                    $("#two-brand").append('<li class="brandList '+ name +'" onclick="brandClickButton('+brandData.id+');"><span class="brand-name">'+brandData.name+'维修</span></li>');
	                }/*else if(data.data.length>7){
                	for (var i = 0; i < 5; i++) {
	                    var brandData = data.data[i];
	                    var name;
	                    if(data.data[i].name == "魅族"){
		                	name = "meizu";
		                }else if(data.data[i].name == "Rokid"){
		                	name = "ruoqi";
		                }
	                    else{
		                	name = "";
		                }
	                    if(i === 0){
	                        //默认第一个品牌的数据显示
	                        brandClickButton(brandData.id);
	                    }
	                    $("#two-brand").append('<li class="brandList '+ name +'" onclick="brandClickButton('+brandData.id+');"><span class="brand-name">'+brandData.name+'维修</span></li>');
	                    
	                }
                	$("#two-brand").append('<li class="brandMore '+ name +'" onclick="brandMore();"><span class="brand-name">更多维修</span></li>')
                	for (var i = 5; i < data.data.length; i++) {
	                    var brandData = data.data[i];
	                    var name;
	                    if(data.data[i].name == "魅族"){
		                	name = "meizu";
		                }else if(data.data[i].name == "Rokid"){
		                	name = "ruoqi";
		                }else{
		                	name = "";
		                }
	                    $("#two-brand2").append('<li class="brandList '+ name +'" onclick="brandClickButton('+brandData.id+');"><span class="brand-name">'+brandData.name+'维修</span></li>');	                    
	                }
                }*/
                $(".brandList").bind("mouseover",function(){
		      		var Index = $(".brandList").index($(this));
		      		if($(".brandList").eq(Index).hasClass("brandChoice")){
		//	      			$(".break-box").eq(Index).addClass("break-hover");
		      		}else{
		      			$(".brandList").eq(Index).addClass("model-btnHover");
		      		}      				      		
		      	})
		      	$(".brandList").bind("mouseout",function(){
		      		var Index = $(".brandList").index($(this));     		
		  			$(".brandList").eq(Index).removeClass("model-btnHover");	
		      	})
		      	$(".meizu").bind("mouseover",function(){
		      		var Index = $(".meizu").index($(this));
		      		if($(".meizu").eq(Index).hasClass("brand2Choice")){
		//	      			$(".break-box").eq(Index).addClass("break-hover");
		      		}else{
		      			$(".meizu").eq(Index).addClass("model2-btnHover");
		      		}      				      		
		      	})
		      	$(".meizu").bind("mouseout",function(){
		      		var Index = $(".meizu").index($(this));     		
		  			$(".meizu").eq(Index).removeClass("model2-btnHover");	
		      	})
		      	$(".ruoqi").bind("mouseover",function(){
		      		var Index = $(".ruoqi").index($(this));
		      		if($(".ruoqi").eq(Index).hasClass("brand2Choice")){
		//	      			$(".break-box").eq(Index).addClass("break-hover");
		      		}else{
		      			$(".ruoqi").eq(Index).addClass("model2-btnHover");
		      		}      				      		
		      	})
		      	$(".ruoqi").bind("mouseout",function(){
		      		var Index = $(".ruoqi").index($(this));     		
		  			$(".ruoqi").eq(Index).removeClass("model2-btnHover");	
		      	})
	            $($("#two-brand").children("li").get(0)).addClass("brandChoice");
	            $(".meizu").on("click",function(){
					$(".meizu").addClass("brand2Choice");
					localStorage.meizu = 1;
				})
	            $(".ruoqi").on("click",function(){
					$(".ruoqi").addClass("brand2Choice");			
				})
	            
				$(".brandList").on("click",function(){
					var Index = $(".brandList").index($(this));
					if(Index == 4){
						localStorage.meizu = 1;
						$(".meizu").addClass("brand2Choice");
						$(".ruoqi").removeClass("brand2Choice");
					}else if(Index == 7){
						localStorage.meizu = 0;
						$(".ruoqi").addClass("brand2Choice");
						$(".meizu").removeClass("brand2Choice");
					}else{
						localStorage.meizu = 0;
						$(".meizu").removeClass("brand2Choice");
						$(".ruoqi").removeClass("brand2Choice");
					}
					$(".brandList").removeClass("brandChoice");
					$(".brandList").eq(Index).addClass("brandChoice");			
				})
				var oIndex;
				$(".brandMore").on("click",function(){
					if(oIndex){
						$("#two-brand2").slideUp("slow");						
						oIndex  =! oIndex;
					}else{
						$("#two-brand2").slideDown();						
						oIndex  =! oIndex;
					}
					
				})
                /*$($("#two-brand").children("li").get(0)).addClass("nameact");
                $(".brandList").on("click",function(){
                	var Index = $(".brandList").index($(this));               	
                	$(".brandList").removeClass("nameact");
                	$(".brandList").eq(Index).addClass("nameact");             	               	
                })
                brandChangeButton(0);*/
            }
        }
    });
}

//获取系列
function brandClickButton(id){		
	localStorage.brand_id = id;
	$.ajax({
        type: 'POST',
        dataType: 'json',
        url: url + '/api/PhoneType/getSeries',
        data: {
            id: id
        },
        success: function (data, status) {
        	if(data.code == 200){      
        		$("#modelseries").empty();
	        	if(id == 1){
	        		getPhone(data.data[0].id);
	        		for (var i = 0 ;i< 2;i++) {			        			
						$("#modelseries").append('<div class="seriesBtn" onclick="getPhone('+data.data[i].id+')">'+ data.data[i].name +'</div>')				
	        		}
	        	}else{
	        		getPhone(data.data[0].id);
	        		for (var i = 0 ;i< data.data.length;i++) {			        			
						$("#modelseries").append('<div class="seriesBtn" onclick="getPhone('+data.data[i].id+')">'+ data.data[i].name +'</div>')				
		        	}
	        	}
	        	$($("#modelseries").children("div").get(0)).addClass("seriesAct");
	        	$(".seriesBtn").on("click",function(){
	        		var Index = $(".seriesBtn").index($(this));	 
	        		$(".seriesBtn").removeClass("seriesAct");
	        		$(".seriesBtn").eq(Index).addClass("seriesAct");
	        	})
	        	$(".seriesBtn").bind("mouseover",function(){
		      		var Index = $(".seriesBtn").index($(this));
		      		if($(".seriesBtn").eq(Index).hasClass("seriesAct")){
		//	      			$(".break-box").eq(Index).addClass("break-hover");
		      		}else{
		      			$(".seriesBtn").eq(Index).addClass("series-btnHover");
		      		}      				      		
		      	})
		      	$(".seriesBtn").bind("mouseout",function(){
		      		var Index = $(".seriesBtn").index($(this));     		
		  			$(".seriesBtn").eq(Index).removeClass("series-btnHover");	
		      	})
        	}        	        	      
        }
  })
}
function brandMore(){
	
}
//获取机型
function getPhone(id){
	$.ajax({
		type:"POST",
		dataType:"json",
		url:url + '/api/PhoneType/getHomeData',
		async:true,
		data:{
			id:id
		},
		success:function(data,status){
			if(data.code == 200){
				$("#modelPhone").empty();
				for (var i = 0; i<data.data.length;i++) {
					$("#modelPhone").append('<div data-id="'+data.data[i].id+'"  class="phoneBtn">'+ data.data[i].alias +'</div>')
				}				
			}
			$(".phoneBtn").bind("mouseover",function(){
	      		var Index = $(".phoneBtn").index($(this));
	      		if($(".phoneBtn").eq(Index).hasClass("seriesAct")){
	      			
	      		}else{
	      			$(".phoneBtn").eq(Index).addClass("phone-btnHover");
	      		}      				      		
	      	})
	      	$(".phoneBtn").bind("mouseout",function(){
	      		var Index = $(".phoneBtn").index($(this));     		
	  			$(".phoneBtn").eq(Index).removeClass("phone-btnHover");	
	      	})
			$(".phoneBtn").on("click",function(){
					cartData={
						
					};
					cartData.addprice = 0;
	        		var Index = $(".phoneBtn").index($(this));	 
	        		var idx =  $(".phoneBtn").eq(Index).data("id");
				    cartData.phoneId = idx;
				    $(".phoneBtn").removeClass("phoneChoice");
	        		$(".phoneBtn").eq(Index).addClass("phoneChoice");
				    firstData.data = idx;
				    firstData.value = $(".phoneBtn").eq(Index).text();
				    onSelect(firstData);
				    setTimeout(function(){
				    	$("#page-one").show();
					    $("#page-two").hide();
					    $(".describe").show();
					    $("#detailed1").hide();
					    $("#detailed2").hide();
					    $("#detailed3").hide();
					    if(localStorage.meizu == 0){
							$(".bx-main").hide();
							$(".description").hide();
							$(".serviceRepair").show();
							$(".meizu-title").hide();
						}else if(localStorage.meizu == 1){
							$(".bx-main").show();				
							$(".description").show();
							$(".serviceRepair").hide();
							$(".meizu-title").show();
						}
						/**
						 * 2018-3-19 14:03:11
						 * @author lizhikui
						 * iphone6p 屏幕缺货提示
						 */
						var nowText = $(this).children('li').text();
						var $iphone6pShow = $('.iphone6p-show');
						if(nowText === '屏幕问题'){
							$(".mal-title").show();
							if ($('.phone-name').html() === 'iPhone 6 Plus') {
								// $iphone6pShow.removeClass('hide');
							}
						}else{
							$(".mal-title").hide();
							$iphone6pShow.addClass('hide');
						}
				    },250)
        	})
			
		}
	});
}
//品牌点击修改样式


function repairSave(){
	if(localStorage.meizu == 1){
		if(localStorage.within == undefined){
			alert("请选择保修状态");
			return false;
		}else{
			if(cartData.malData == undefined){
				alert("请选择故障");
				return false;
			}else{
				cartData.user_remark = $("#questionEdit").val();
				localStorage.door =1;
				localStorage.cartData = JSON.stringify(cartData);
				window.location.href="fixWay.jsp";
			}
		}
	}else{
		if(cartData.malData == undefined){
			alert("请选择故障");
			return false;
		}else{
			cartData.user_remark = $("#questionEdit").val();
			localStorage.door =1;
			localStorage.cartData = JSON.stringify(cartData);
			window.location.href="fixWay.jsp";
		}
	}
	
}

//首页客服
function kefu(){
    window.open('http://vipwebchat.tq.cn/pageinfo.jsp?version=vip&admiuin=9701310&ltype=0&iscallback=1&page_templete_id=93312&is_message_sms=0&is_send_mail=0&action=acd&acd=1&type_code=1');

}
