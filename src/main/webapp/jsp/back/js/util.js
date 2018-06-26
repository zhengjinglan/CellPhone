function loadSelect(id,url,textField,valueField,auto) {
	$('#'+id+'').combobox({
		url: url,
		required : true,
		editable : false,
		valueField : valueField,
		textField : textField,
		onLoadSuccess : function(){
			if(auto){
				var val = $(this).combobox("getData");
				for (var item in val[0]) {
					if (item == valueField) {
						$(this).combobox("select",val[0][item]);
					}
				}
			}
		}
	});
}