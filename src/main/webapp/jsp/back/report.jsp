
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单季度报表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<script type="text/javascript" src="jsp/back/js/echarts.js"></script>

<script type="text/javascript" src="jsp/back/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
		var  idds=new Array();
		var gmt_create=new Array();
		
			$(function(){
				$.post("order/OrderReport",{},function(data){
					for(var i=0;i<data.length;i++){
						idds[i]=data[i].idds;
						gmt_create[i]=data[i].gmt_create;
					}
					showTime();
				});
			});

       function showTime(){
                   // 基于准备好的dom，初始化echarts图表
                   var myChart = echarts.init(document.getElementById('main')); 
                   //定义图表option 
                   option = {
                		    title : {
                		         //主标题文本
                		        text: '订单季度报表',
                		        subtext: '数量'
                		    },
                		    //提示框，鼠标悬浮交互时的信息提示  
                		    tooltip : {
                		    //触发类型，默认（'item'）数据触发，可选为：'item' | 'axis'  
                		        trigger: 'axis'
                		    },
                		    //图例，每个图表最多仅有一个图例  
                		    legend: {
                		        data:['订单数量'],
                		       // icon:'rect',
                		        textStyle: {
						            fontSize: 30,
                                 }
                		    },
                		    //工具箱，
                		    toolbox: {
                		        show : true,
                		        feature : {
                		        //辅助线标志  
                		            mark : {show: true},
                		            //dataZoom，框选区域缩放，自动与存在的dataZoom控件同步，分别是启用，缩放后退  
		                            dataZoom: {  
		                                show: true,  
		                                 title: {  
		                                    dataZoom: '区域缩放',  
		                                    dataZoomReset: '区域缩放后退'  
		                                }  
		                            }, 
		                             //数据视图，打开数据视图，可设置更多属性
                		            dataView : {show: true, readOnly: false},
                		            magicType : {show: true, type: ['line', 'bar']},
                		            restore : {show: true},
                		            //saveAsImage，保存图片（IE8-不支持）,图片类型默认为'png'  
                		            saveAsImage : {show: true}
                		        }
                		    },
                		    //是否启用拖拽重计算特性，默认关闭(即值为false) 
                		    calculable : true,
                		    //直角坐标系中横轴数组，数组中每一项代表一条横轴坐标轴，仅有一条时可省略数值  
                            //横轴通常为类目型，但条形图时则横轴为数值型，散点图时则横纵均为数值型  
                		    xAxis : [
                		        {
                		            type : 'category',
                		            data : gmt_create
                		        }
                		    ],
                		    yAxis : [
                		        {
                		            type : 'value'
                		        }
                		    ],
                		    //sereis的数据: 用于设置图表数据之用。series是一个对象嵌套的结构；对象内包含对象  
                		    series : [
                		        {
                		            name:'订单数量',
                		            color:'khaki',
                		            type:'bar',
                		            //系列中的数据内容数组，折线图以及柱状图时数组长度等于所使用类目轴文本标签数组axis.data的长度
                		            data:idds,
                		            //系列中的数据标注内容  
                		            markPoint : {
                		                data : [
                		                    {type : 'max', name: '最大值'},
                		                    {type : 'min', name: '最小值'}
                		                ]
                		            },
                		            markLine : {
                		                data : [
                		                    {type : 'average', name: '平均值'}
                		                ]
                		            }
                		        },
                		        
                		    ]
                		};
                   // 为echarts对象加载数据 
                   myChart.setOption(option); 
       }
    </script>
  </head>
  
	 <body>
	    <div id="main" style="width:1000px; height: 600px;"></div>
	    
	</body>
</html>
