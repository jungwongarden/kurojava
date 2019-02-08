<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="jsp17.DTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/> <!-- 액션태그 -->

<hr color="red">
당신이 입력한 가수는 : ${dto.singer}<br> <!-- dto.getSinger()  -->
당신이 입력한 곡명은 : ${dto.title}<br>














</body>
</html>