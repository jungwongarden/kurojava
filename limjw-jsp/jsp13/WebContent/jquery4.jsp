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
		$("#id").keyup(function() {
			var id = $("#id").val();
			if (id.length < 5) {
				//$("#id").after("<font color='red'>id는 5글자 이상 입력해야합니다.</font>");
				$("#d1").html("<font color='red'>id는 5글자 이상 입력해야합니다.</font>");
				return false;
			} else {
				//$("#id").after("<font color='blue'>id 정상 OK...</font>");
				$("#d1").text("아이디 OK!!");
				return false;
			}
		});
		$("#button2").click(function() {
			var pw = $("#pw").val();
			var pw2 = $("#pw2").val();

			if (pw == pw2) {
				/* 				alert("패스워드가 확인되었습니다."); */
			} else {
				/* alert("패스워드가 불일치 합니다.재입력 요망!!"); */
				$("#pw2").after("<font color='red'>패스워드 불일치</font>");
				return false;
			}
		});
	});
</script>

</head>
<body>
	<form action="jquery5.jsp">
		아이디: <input id="id" type="text" name="id"><div id="d1"></div>
		<br> 패스워드: <input
			id="pw" type="text" name="pw"><br> 패스워드 확인: <input
			id="pw2" type="text" name="pw2"><br>
		<button id="button2">회원가입 완료</button>
	</form>
</body>
</html>












