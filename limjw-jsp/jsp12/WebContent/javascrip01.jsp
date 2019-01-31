<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	name = "kim";
	alert("반갑습니다." + name + "님");
	result = confirm("당신은 자바 프로그래머입니까?");
	alert(result);
	input = prompt("당신의 이름은?");
	alert(input)
	
	console.log("내가 디버거 화면입니다.");
	function call() {
		alert("나를 누르셨군요..!!")
	}
	
	$(function() {
		id = $("#id").val();
		console.log("당신이 입력한 아이디는 " + id);
	});
		
</script>

</head>
<body>
<input type="text" name="id" id="id" value="park">
<input type="button" onclick="call()" value="나를 누르세요.">
</body>
</html>