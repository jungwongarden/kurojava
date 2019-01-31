<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("button").click(function() {
			var tour = $("input").val();
			if (tour == "japan") {
				alert("서비스가 지원되지 않는 지역입니다. 다시 입력해주세요.");
				return false; //페이지 넘기지 않음.
			} else {
				alert("서비스가 시작됩니다.");
			}
		});
	});
</script>

</head>
<body>
	<form action="jquery3.jsp">
		가고 싶은 여행지 <br> <input type="text" name="tour" value="japan">
		<br>
		<button>여행지 서비스 가능 여부 체크</button>
	</form>







</body>
</html>