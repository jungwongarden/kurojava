<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.DBConnectionMgr"%>
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
//1. 드라이버 설정
//2. DB연결
DBConnectionMgr dbcp = DBConnectionMgr.getInstance();
Connection con = dbcp.getConnection();

//3. SQL문 객체화
String sql = "insert into bbs values ('winter','winter','winter','winter')";
PreparedStatement ps = con.prepareStatement(sql);

//4. SQL문 실행 요청
ps.executeUpdate();
%>
bbs게시물 삽입 요청 성공!!!

</body>
</html>