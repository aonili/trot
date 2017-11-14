<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="transitPages/basic.css">
<link rel="stylesheet" href="jQuery/jquery-ui.css">

<script type="text/javascript" src="jQuery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="jQuery/jquery-ui.js"></script>
<script type="text/javascript" src="js-basic/jpDatepicker.js"></script>

<script>
	
</script>
<title>交通費精算書</title>
</head>
<body>
	<h1 class="head1">交通費精算書</h1>
	<form action="TransitExpenseServlet" method="post">
		<div style="margin-left: 80%;">
			<select name="month_select" id="month_select"
				style="width: 55px; height: 30px">
				<option value="1">1月</option>
				<option value="2">2月</option>
				<option value="3">3月</option>
				<option value="4">4月</option>
				<option value="5">5月</option>
				<option value="6">6月</option>
				<option value="7">7月</option>
				<option value="8">8月</option>
				<option value="9">9月</option>
				<option value="10">10月</option>
				<option value="11">11月</option>
				<option value="12">12月</option>
			</select>
		</div>
		<script type="text/javascript">
			var d = new Date();
			var m = d.getMonth() + 1;
			document.getElementById("month_select").value = m;
		</script>

		<div
			style="width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; width: 800px;">
			<p>
				<label class="label-up">提出日 </label><input type="text"
					id="submit_date" class="jp-date">
			</p>
			<p>
				<label class="label-up">氏名 </label><input type="text" id="name">
			</p>
			<p>
				<label class="label-up">精算開始日</label><input type="text"
					id="settlement_date_from"> <label
					style="display: inline-block; width: 15px; margin: 5px;">～</label>
				<label class="label-up">精算終了日</label><input type="text"
					id="settlement_date_to">
			</p>
			<br>
		</div>
		<input type="button" name="create-row"
			onclick="addRow(document.getElementById('transitExpenseDetail'),2)"
			value="新規"> <input type="button" name="delete-row" value="削除">
		<input type="button" name="reset-row" value="元に戻す"> <br>
		<div class="wrap">

			<table id="transitExpenseDetail" border="1" width="100%"
				cellpadding="1" cellspacing="1">
				<thead>
					<tr>
						<th rowspan="2"></th>
						<th rowspan="2">No.</th>
						<th rowspan="2">支払開始日</th>
						<th rowspan="2">支払終了日</th>
						<th rowspan="2">日数</th>
						<th rowspan="2">交通機関</th>
						<th colspan="2">区間</th>
						<th rowspan="2">片道金額</th>
						<th rowspan="2">通勤タイプ</th>
						<th rowspan="2">備考</th>
						<th rowspan="2">合計金額</th>
					</tr>
					<tr>
						<th>出発</th>
						<th>到着</th>
					</tr>
				</thead>
				<tbody id="t-body">
					<tr id="tr_1">
						<td><input name="check-select_1" id="check-select_1"
							type="checkbox" style="width: 10px;"></td>
						<td class="No">1</td>
						<td><input name="date-from_1" id="date-from_1" type="text"
							class="jp-date"></td>
						<td><input name="date-to_1" id="date-to_1" type="text"
							class="jp-date"></td>
						<td><input name="days_1" id="days_1" type="text"
							style="width: 25px;"></td>
						<td><select name="transpotation_1" id="transpotation_1">
								<option value="0"></option>
								<option value="1">JR</option>
								<option value="2">新京成電鉄</option>
								<option value="3">東京メトロ</option>
								<option value="4">東武鉄道</option>
								<option value="5">西武鉄道</option>
								<option value="6">東京急行電鉄</option>
								<option value="7">京王電鉄</option>
								<option value="8">京成電鉄</option>
								<option value="9">京浜急行電鉄</option>
								<option value="10">小田急電鉄</option>
								<option value="11">東京都交通局</option>
								<option value="12">バス</option>
								<option value="13">タクシー</option>
								<option value="14">その他</option>
						</select></td>

						<td><input name="section-from_1" id="section-from_1"
							type="text"></td>
						<td><input name="section-to_1" id="section-to_1" type="text"></td>
						<td><input name="price_1" id="price_1" type="text"
							style="width: 50px;"></td>
						<td><input name="transit-mode_1" id="transit-mode-oneway_1"
							type="radio" value="0" checked style="width: 10px;"> <label
							for="片道">片道</label> <input name="transit-mode_1"
							id="transit-mode-round_1" type="radio" value="1"
							style="width: 10px;"> <label for="往復">往復</label></td>
						<td><input name="comment_1" id="comment_1" type="text"></td>
						<td><input name="ammount_1" id="ammount_1" type="text"
							style="width: 50px;" readonly="readonly"></td>
					</tr>
				</tbody>
			</table>
		</div>
		<script>
			function addRow(table, index) {
				try {
					var r = table.rows.length - 1;
					alert(r);
					var lastRow = table.rows[2];
//					$("tbody tr:first").clone(true).appendTo("tbody tr:last");
					

					var newRow = lastRow.cloneNode(true);

					var nId = newRow.getAttribute("id").split("_")[0] + "_" + r;
					newRow.setAttribute("id", nId);

					table.tBodies[0].appendChild(newRow);

//$("tbody tr:last").find("input").css('background-color', 'red');
//$("table tr:last td input[type='text']").val("");
					$("tbody tr:last")
							.find("*")
							.each(
									function() {

										if (typeof ($(this).attr("id")) != "undefined") {
											var rpId = $(this).attr("id")
													.split("_")[0]
													+ "_" + r;
											$(this).attr("id", rpId);
										}

										if (typeof ($(this).attr("name")) != "undefined") {
											var rpN = $(this).attr("name")
													.split("_")[0]
													+ "_" + r;
											$(this).attr("name", rpN);
					}

										if (typeof ($(this).attr("type")) ==
											"text") {
											$(this).val("");

										}


										if ($(this).hasClass("hasDatepicker")) {
											$(this).css('background-color',
													'red');
											$(this)
													.removeClass(
															"hasDatepicker");

											$(this).datepicker();
										}

										if ($(this).hasClass("No")) {
											$(this).text(r);
										}

										//if($(this).attr("type")=="radio"
										//	&& $(this).val()=="0"){
										//$(this).attr("checked","0");
										//}

									});

					return newRow;

					//		var lastRow=table.rows[table.rows.length-1];
					//		var cloneRow=lastRow.clone(false);

				} catch (err) {
					alert(err);
				}
			}
		</script>
	</form>

</body>
</html>