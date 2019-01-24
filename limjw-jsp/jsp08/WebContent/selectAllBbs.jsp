<%@page import="shop.BbsDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.BbsDAO"%>
<%@page import="shop.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="1" borderColor="red">
			<tr align="center">
				<td width="50">번호</td>
				<td width="100">제 목</td>
				<td width="80">글쓴이</td>
			</tr>

			<%
				BbsDAO dao = new BbsDAO();
				ArrayList<BbsDTO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					BbsDTO dto = list.get(i);
			%>
			<tr>
				<td align="center"><%=dto.getId()%></td>
				<td bgcolor="yellow">
					<a href=select2.jsp?id=<%=dto.getId()%> >
						<%=dto.getTitle()%>
					</a>
				</td>
				<td><%=dto.getUser()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</center>
</body>
</html>