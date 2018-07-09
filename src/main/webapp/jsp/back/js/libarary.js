document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
	var editId = -1;
	var url;
	$(function(){
		$('#tb').treegrid({    
		    url:'lib/queryPage',
		   idField:'id',
		    treeField:'lname',
		    fitColumns:true,
		    pagination:true, 
		    pageList:[50],
			pageSize:50,
		    dnd:true,//是否可拖拽 
		    columns:[[
				{field:'id',title:'编号',width:60,hidden:true},
		        {field:'lname',title:'名称',width:60,editor:{type:'text'}},
		        {field:'url',title:'url',width:80,editor:{type:'text'}},
		        {field:'icon',title:'图标',width:80,editor:{type:'text'}},
		        {field:'_parentId',title:'父节点',width:80,editor:{type:'combobox',options:{'url':'lib/queryAll',valueField:'id',textField:'lname'}}},
		        {field:'uid',title:'修改人编号',width:80,hidden:true},
		       // {field:'upname',title:'修改人',width:80},
		        {field:'uptime',title:'修改时间',width:80,editor:{type:'datebox'}}
		    ]],
		    loadFilter:function(data){
		    	if(undefined != data.rows){
		    		var rows = data.rows;
		    		for(var i=0;i<rows.length;i++){
			    		if(rows[i]._parentId==0){
			    			rows[i]._parentId = null;
			    		}
			    	}
		    	}
		    	/*console.log(data);*/
		    	return data;
		    	
		    },
		    toolbar: [{
				text:"添加节点",
		    	iconCls: 'icon-edit',
				handler: function(){
					if(editId == -1){
						insertNode();
					}else{
						$.messager.confirm('提示',"是否要保存正在编辑的节点?",function(r){
							if(r){
					$("#tb").treegrid("endEdit",9999);
					// 保存
					var saveNode = $("#tb").treegrid("find",9999);
					alert(JSON.stringify(saveNode));
					$.ajax({
						type:"post",
						url:"lib/addNode",
						data:JSON.stringify(saveNode),
						contentType:"application/json",
						success:function(data){
							if(data){
								$('#tb').treegrid('reload');
								editId = -1;
							}
						}
					});		
							}else{
								$("#tb").treegrid("cancelEdit",9999);
								$("#tb").treegrid("remove",9999);
								insertNode();
							}
						});
					}
				}
			},/* '-',{
				text:"编辑节点",
				iconCls: 'icon-edit',
				handler: function(){
				if(editId == -1){
						insertNode();
					}else{
						$.messager.confirm('提示',"是否要保存正在编辑的节点?",function(r){
							if(r){
							$("#tb").treegrid("endEdit",9999);
					 // 判断是否有选中项
					 var node = $("#tb").treegrid("getSelected");
					if(node){
						$("#tb").treegrid("beginEdit",node.id);
						
						$("#tb").treegrid("getEditors",node.id);
						var saveNode = $("#tb").treegrid("find",'id');
					//alert(JSON.stringify(saveNode));
					alert($("#tb").treegrid("find",9999));
					$.ajax({
						type:"post",
						url:"lib/updateNode",
						data:JSON.stringify(saveNode),
						contentType:"application/json",
						success:function(data){
							if(data){
								$('#tb').treegrid('reload');
								editId = -1;
							}
						} 
					});
					}
				
					
					}
					}
				},  */ '-',{
				text:"保存",
				iconCls: 'icon-edit',
				handler: function(){
					$("#tb").treegrid("endEdit",9999);
					// 保存
					var saveNode = $("#tb").treegrid("find",9999);
					$.ajax({
						type:"post",
						url:"lib/addNode",
						data:JSON.stringify(saveNode),
						contentType:"application/json",
						success:function(data){
							if(data){
								$('#tb').treegrid('reload');
								editId = -1;
							}
						}

					});
				}
				
			}]
			
		}); 
	});
	
	
	function insertNode(){
		var node = $("#tb").treegrid("getSelected");
		if(null != node){
			$("#tb").treegrid("insert",{
				before:node.id,
				data:{
					id:9999,
					lname:"",
					url:"",
					icon:"icon-1",
					_parentId:node._parentId,
					uid:"1",
					uname:"admin",
					uptime:"1"
				}
			});
		}
		$("#tb").treegrid("select",9999);
		$("#tb").treegrid("beginEdit",9999);
		$("#tb").treegrid("getEditors",9999);
		editId = 9999;
	}