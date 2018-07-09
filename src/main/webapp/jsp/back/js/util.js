function loadSelect(id,url,textField,valueField,editable) {
	if(editable == null){
		editable = false;
	}
	$('#'+id+'').combobox({
		url : url,
		required : true,
		editable : editable,
		valueField : valueField,
		textField : textField,
		panelHeight: 'auto'
	});
}
function initSelect(id,valueField){
	$('#'+id+'').combobox({
		onLoadSuccess : function(){
			var val = $(this).combobox("getData");
			for (var item in val[0]) {
				if (item == valueField) {
					$(this).combobox("select",val[0][item]);
				}
			}
		}
	});
}
