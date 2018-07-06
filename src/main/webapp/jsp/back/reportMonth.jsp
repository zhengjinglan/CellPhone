
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单月份报表</title>
    
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
			$.post("order/OrderReportMonth",{},function(data){
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
                   
                   option = {
                		    title : {
                		        text: '订单月份报表',
                		        subtext: '数量'
                		    },
                		    tooltip : {
                		        trigger: 'axis'
                		    },
                		    legend: {
                		        data:['订单数量']
                		    },
                		    toolbox: {
                		        show : true,
                		        feature : {
                		            mark : {show: true},
                		            //dataZoom，框选区域缩放，自动与存在的dataZoom控件同步，分别是启用，缩放后退  
		                            dataZoom: {  
		                                show: true,  
		                                 title: {  
		                                    dataZoom: '区域缩放',  
		                                    dataZoomReset: '区域缩放后退'  
		                                }  
		                            },  
                		            dataView : {show: true, readOnly: false},
                		            magicType : {show: true, type: ['line', 'bar']},
                		            restore : {show: true},
                		            saveAsImage : {show: true}
                		        }
                		    },
                		    calculable : true,
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
                		    series : [
                		        {
                		            color:'khaki',
                		            name:'订单数量',
                		            type:'bar',
                		            data:idds,
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
