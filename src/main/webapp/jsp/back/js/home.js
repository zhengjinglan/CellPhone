document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
$(function(){
	$("#tree").tree({
		url:"lib/getTreeByRid",
		onClick:function(node){					
			// 没有子节点,打开标签页
			if(null == node.children){
				if(null != node.attributes && undefined != node.attributes.url){
					var url = node.attributes.url;
					var title = node.text;
					addTab(url,title);
				}
			}else{
				if(node.state == "closed"){
					$("#tree").tree("expand",node.target);
				}else{
					$("#tree").tree("collapse",node.target);
				}
			}
		}
	});
});

function refreshtab(tab,url){
	// 刷新选项卡
	$("#tabs").tabs("update",{
		tab:tab,// 刷新指定选项卡
		options:{
			href:url
		}
	});
}

function addTab(url,title){
	// 判断是否已经打开窗口
	var tab = $("#tabs").tabs("getTab",title);
	if(tab == null){
		// 添加选项卡
		$("#tabs").tabs('add',{
			title:title,
			content:"<iframe src="+url+" width='100%' height='100%' frameborder='0'></iframe>",
			closable:true,
			tools:[{
				iconCls:"icon-mini-refresh",
				handler:function(){
					refreshtab($("#tabs").tabs("getTab",title),url);
				}
			}]
		});
	}else{
		$("#tabs").tabs("select",title);
		// 获取ifream路径
		var url = $(tab.panel("options").content).attr("src");
		refreshtab(tab,url);
	}
}