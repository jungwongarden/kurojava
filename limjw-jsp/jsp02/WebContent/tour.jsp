<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
String tour = request.getParameter("tour");
String count = request.getParameter("count");
int countInt = Integer.parseInt(count);
for(int i = 0; i < countInt; i++){
	out.print(tour + "으로 가요.<br>");
}
if(countInt >= 3){
	out.print("여행을 많이 다니실 계획이군요.");
}else{
	out.print("여행을 더 가셔도 될 것 같습니다.");
}

String color = request.getParameter("color");

%>
<body bgcolor="<%=color%>">
</body>
</html>