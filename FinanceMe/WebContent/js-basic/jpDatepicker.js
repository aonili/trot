$(function(){
	 $(".jp-date").datepicker();

	 $("#settlement_date_from").datepicker({
	 onSelect:function(dateText,inst){
	 $("#settlement_date_to").datepicker("option","minDate",dateText);
	 }
	 });
	 $("#settlement_date_to").datepicker({
	 onSelect:function(dateText,inst){
	 $("#settlement_date_from").datepicker("option","maxDate",dateText);
	 }
	 });
	  
	  $.datepicker.regional['ja'] = {
			    closeText: '閉じる',
			    prevText: '<',
			    nextText: '>',
			    currentText: '今日',
			    monthNames: ['1月','2月','3月','4月','5月','6月',
			    '7月','8月','9月','10月','11月','12月'],
			    monthNamesShort: ['1月','2月','3月','4月','5月','6月',
			    '7月','8月','9月','10月','11月','12月'],
			    dayNames: ['日曜日','月曜日','火曜日','水曜日','木曜日','金曜日','土曜日'],
			    dayNamesShort: ['日','月','火','水','木','金','土'],
			    dayNamesMin: ['日','月','火','水','木','金','土'],
			    weekHeader: '週',
			    dateFormat: 'yy年mm月dd日',
			    firstDay: 0,
			    isRTL: false,
			    showMonthAfterYear: true,
			    yearSuffix: '年',
			    showOtherMonths:true,
				 selectOtherMonths:true
			 };
			  $.datepicker.setDefaults($.datepicker.regional['ja']);

});
