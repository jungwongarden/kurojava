<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<!--컨트롤+쉬프트+m(jsp에서 자동import) -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//1. connector 셋팅
	Class.forName("com.mysql.jdbc.Driver");
	out.print("1. connector셋팅 성공<br>");
	
	//2. db 연결
	String url = "jdbc:mysql://localhost:3306/phone";
	String user = "root";
	String password = "1234";
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. db 연결 성공<br>");
	
	//3. SQL객체화
	String sql = "insert into product values ('400', '400', 'java', 'java study')";
	PreparedStatement ps = con.prepareStatement(sql);
	out.print("3. SQL문 객체화 성공<br>");

	//4. sql 실행 요청
	ps.executeUpdate();
	out.print("4. SQL문 실행 요청 성공<br>");
	
	ps.close();
	con.close();
	
	
	
%>






</body>
</html>