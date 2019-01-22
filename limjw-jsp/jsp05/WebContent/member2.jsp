<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
		String id = request.getParameter("id");
		//JAVA--DB--Connectibity(JDBC)

		//1. 커넥터 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		out.print("1. 커넥터 셋팅=======");

		//2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		out.print("2. DB연결======");

		//3. SQL문 객체화
		String sql = "delete from member where id = '" + id + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		out.print("3. SQL문 객체화======");

		//4. SQL문 실행 요청
		ps.executeUpdate();
		out.print("4. SQL문 실행 요청======");
	%>






</body>
</html>