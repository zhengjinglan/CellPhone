document.write("<script language=javascript src='jsp/back/js/util.js'></script>");
		var url;
	
		$(function(){
			//数据窗口隐藏
			$("#datawindow").window("close");
			
		});
		function formatState(value, row,index){//使用formatter格式化刷子
			if(row.brandIcon){
			  return "<img style='width:50px;height:50px;' src='upload/"+row.brandIcon+"'/>";
			}  
			}
		
		// 删除
		function dels(){
			// 获取所有选中行
			var rows = $("#tables").datagrid("getChecked");
			
			if(rows!=""){
				var ids=[];
				for(var i=0;i<rows.length;i++){
					ids[i] = rows[i].brandId;
				}
				
				$.messager.confirm('提示','确定删除选中品牌么?',function(r){
					if(r){
						$.post("brand/del",{"ids":ids.toString()},function(data){
							if(data==0){
								$.messager.show({
									title:'提示',
									msg:"删除成功！"
								});
								$("#tables").datagrid("reload");	
							}
						});
					}
				});
				
			}else{
				$.messager.alert('提示','请选择要删除的数据');
			}
		}
		
		// 打开新增窗口
		function add(){
			$("#fm").form('reset');
			$("#datawindow").window("open").window('setTitle',"新增");
			url = "brand/add";
		}
		// 打开修改窗口
		function edit(){
			// 判断是否有选中项
			var rows = $("#tables").datagrid("getSelections");
			if(rows.length == 1){
				// 重置表单
				$("#fm").form('reset');
				// 加载修改的数据信息
				$("#fm").form('load',rows[0]);
				
				// 设置表单提交路径
				url = "brand/update";
				// 打开窗口
				$("#datawindow").window("open").window('setTitle',"修改");
				
			}else if(rows.length > 1){
				$.messager.show({
					title:'提示',
					msg:"一次只能修改一条数据,请重新选择！"
				});
			}else{
				$.messager.show({
					title:'提示',
					msg:"请选择修改的数据！"
				});
			}
		}	
		
		// 提交
		function submits() {
			if($("#brandId").textbox("getValue")=="自动生成"){
				$("#brandId").textbox("setValue",-1);
			}
		   $("#fm").form('submit',{
		    	url:url,
		    	onSubmit:function(){
		    		return $(this).form('validate');
		    	},
		        success:function (data) {
		        	if(data==1){
						$.messager.show({
							title:'提示',
							msg:"操作成功！"
						});
						$("#datawindow").window("close");
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