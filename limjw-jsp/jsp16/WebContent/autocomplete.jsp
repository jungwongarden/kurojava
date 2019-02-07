<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery UI Autocomplete - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		 $( document ).tooltip();
		 
		 $( "#dialog-confirm" ).dialog({
		      resizable: false,
		      height: "auto",
		      width: 400,
		      modal: true,
		      buttons: {
		        "OK하시겠습니까?": function() {
		          $( this ).dialog( "close" );
		        },
		        Cancel: function() {
		          $( this ).dialog( "close" );
		        }
		      }
		    });
		 
		$("#button").click(function() {
			$("#dialog").dialog();
			alert("반갑습니다.");
		});
		  
		var availableTags = [ "라면", "우동", "짬뽕", "짜장면", "짜울면", "짜냉면", "국수",
				"햄버거", "피자", "커피", "냉모밀" ];
		$("#tags").autocomplete({
			source : availableTags
		});

		var dateFormat = "mm/dd/yy", from = $("#from").datepicker({
			defaultDate : "+1w",
			changeMonth : true,
			numberOfMonths : 3
		}).on("change", function() {
			to.datepicker("option", "minDate", getDate(this));
		}), to = $("#to").datepicker({
			defaultDate : "+1w",
			changeMonth : true,
			numberOfMonths : 3
		}).on("change", function() {
			from.datepicker("option", "maxDate", getDate(this));
		});

		function getDate(element) {
			var date;
			try {
				date = $.datepicker.parseDate(dateFormat, element.value);
			} catch (error) {
				date = null;
			}

			return date;
		}

	});
</script>
</head>
<body>
<a href="#" title="내일은 금요일....!!!!">오늘은 목요일...</a> 

<div id="dialog-confirm" title="계약조건에 만족하세요?">
  <p><span class="ui-icon ui-icon-alert" style="float:left; margin:12px 12px 20px 0;"></span>정말로 만족하시나요???</p>
</div>

<button id="button">나를 누르세요..</button>

<div id="dialog" title="환영합니다.">
  <p>제 홈페이지에 오신 것을 환영합니다. 즐거운 시간되세요...</p>
</div>

	<form action="auto.jsp">
		<div class="ui-widget">
			<label for="tags">먹고 싶은 음식을 선택하세요...>> </label> 
			<input id="tags" name="food">
		</div>
		<label for="from">From</label> 
		<input type="text" id="from" name="from"> 
		<label for="to">to</label> 
		<input type="text"	id="to" name="to">
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>