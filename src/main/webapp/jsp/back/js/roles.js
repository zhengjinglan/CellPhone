document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
	$(function(){
		// 权限设置窗口
		$("#dl").dialog({
			title:"权限设置",
			toolbar: [{
				text:"保存",
				iconCls: 'icon-save',
				handler: function(){
					var lids = getChecklids();
					var rid = $("#tables").datagrid("getChecked")[0].rid;
					// 添加
					$.post("roles/savePermission",{"rid":rid,"lids":lids.toString()},function(data){
						if(data==0){
							$.messager.show({
						title:'提示',
						msg:"操作成功！"
					});
					$("#dl").window("close");
					$("#tables").datagrid("reload");
				}else{
					$.messager.show({
						title:'提示',
						msg:"操作失败！"
					});
				}
					});
				}
			}]
		});
		
		// 默认关闭
		$("#dl").dialog('close');
		$("#dataWindow").dialog('close');
		
		// 初始化权限树状菜单
		$("#tt").tree({
			checkbox:true,
			onLoadSuccess:function(){
				var checked = $("#tables").datagrid("getChecked");
				if(checked.length==1){
					var lids = checked[0].lids.split(",");
					// 查询当前角色的权限id;
					for(var i=0;i<lids.length;i++){
						var node = $("#tt").tree("find",lids[i]);
						if( null!=node && null==node.children){
							$("#tt").tree("check",node.target);
						}
					}
				}
			}
		});
		
		// 初始化数据表格
		$("#tables").datagrid({
			url:"roles/queryAll",
			columns:[[
			  {field:'rid',title:'编号',width:40,hidden:true},  
			  {field:'rname',title:'角色名',width:60},
			  {field:'upuname',title:'修改人',width:100},
			  {field:'uid',title:'修改人编号',width:100,hidden:true},
			  {field:'uptime',title:'时间',width:100},
			  {field:'lids',title:'权限id',width:100,hidden:true},
			]],
			idField:'rid',
			fitColumns:true,
			striped:true,
			singleSelect:true,// 只能选中一行
			toolbar: [{
				text:"添加",
				iconCls: 'icon-edit',
				handler: function(){
						$("#dataWindow").dialog('open').window('setTitle',"添加角色");;
				}
			},'-',{
				text:"权限设置",
				iconCls: 'icon-edit',
				handler: function(){
					var checked = $("#tables").datagrid("getChecked");
					if(checked.length==0){
						$.messager.show({
							title:"提示",
							msg:"请选择要设置权限的角色"
						});
					}else{
						$("#dl").dialog('open');
						// 加载权限
						$("#tt").tree({
							url:"lib/getTree"
						});		
					}
				}
			}]
		});
	});
	
	// 获取树状菜单所有选中的节点id
	function getChecklids(){
		var options = $("#tt").tree("getChecked");

		var lids = [];
		for(var i=0;i<options.length;i++){
			// 保存选中项的节点
			lids.push(options[i].id);
			
			// 获取选中项的父节点
			var node = options[i];
			do{
				node = getParentNode(node);
				// 判断是否有父节点,判断父节点的id是否已经保存,返回的字符在数组中第一次出现的位置的下标
				if(null != node && $.inArray(node.id,lids) == -1){
					lids.push(node.id);
				}
			}while(null != node);
		}
		return lids;
	}
	
	// 获取指定节点的父节点
	function getParentNode(node){
		var parent = $("#tt").tree("getParent",node.target);
		return parent;
	}
	function submits(){
		$("#fm").form("submit",{
			url:"roles/insert",
			success:function(data){
				if(data==0){
					$.messager.show({
						title:'提示',
						msg:"操作成功！"
					});
					$("#dataWindow").window("close");
					$("#tables").datagrid("reload");
				}else{
					$.messager.show({
						title:'提示',
						msg:"操作失败！"
					});
				}
			}
		});
	}
	// 取消
	function concel(){
		$("#datawindow").window("close");
	}
	
	// 重置
	function resets(){
		$("#fm").form('reset');
	}