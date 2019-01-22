<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립트릿: 자바코드 들어가는 부분.. -->
<!-- 복사: 컨트롤+알트+화살표아래  -->
<!-- 이동: 알트+화살표아래 -->
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
String gender = request.getParameter("gender");
String addr = request.getParameter("addr");
String[] hobby = request.getParameterValues("hobby");
String collect = "";
for(String h : hobby){
	collect = collect + h + " ";
}
String word = request.getParameter("word");
%>
<!-- 표현식: 출력용 -->
당신이 입력한 id는 <%=  id %><br> 
당신이 입력한 pw는 <%=  pw %><br> 
당신이 입력한 name는 <%=  name %><br> 
당신이 입력한 tel는 <%=  tel %><br> 
당신이 입력한 gender는 <%=  gender %><br> 
당신이 입력한 addr는 <%=  addr %><br> 
당신이 입력한 hobby는 <%=  collect %><br> 
당신이 입력한 word는 <%=  word %><br> 





</body>
</html>