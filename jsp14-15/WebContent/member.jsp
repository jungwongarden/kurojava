<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String id = request.getParameter("id");
	String gID = "root";
	if(id.equals(gID)){
		out.print("사용할 수 없는 아이디입니다.");
	}else{
		out.print("사용할 수 있는 아이디입니다.");
	}
%>
