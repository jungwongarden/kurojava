<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="project.css" 
	  type="text/css"
	  rel="stylesheet" >
</head>
<body>
    <div id="total">
        <div id="top2">
		<jsp:include page="total.jsp"></jsp:include>
		</div>
         <div id="top">
          <jsp:include page="top.jsp"></jsp:include>
        </div>
        <div id="content">
        <form action="login.jsp">
        <table border="1" bordercolor="blue">
        <tr>
        	<td>아이디:<input type="text" name="id"></td>
        	<td>비밀번호:<input type="text" name="pw"></td>
        	<td><button type="submit">로그인하기</button> </td>
        </tr>
        </table>
        </form>
        
        
        
        <form action="member2.jsp">
	<table>
		<tr>
			<td height="50" width="100" bgcolor="yellow" align="center">아이디</td>
			<td bgcolor="blue" width="200">
				<input type="text" name="id" size="30">
			</td>
		</tr>
		<tr>
			<td height="50" width="100" bgcolor="yellow" align="center">패스워드</td>
			<td bgcolor="blue" width="200">
				<input type="text" name="pw" size="30">
			</td>
		</tr>
		<tr>
			<td height="50" width="100" bgcolor="yellow" align="center">이름</td>
			<td bgcolor="blue" width="200">
				<input type="text" name="name" size="30">
			</td>
		</tr>
		<tr>
			<td  height="50" width="100" bgcolor="yellow" align="center">전화번호</td>
			<td bgcolor="blue" width="200">
				<input type="text" name="tel" size="30">
			</td>
		</tr>
		<tr>
			<td  height="50" width="300" bgcolor="yellow" align="center" colspan="2">
				<input type="submit" value="회원가입 완료" >
			</td>
		</tr>
	</table>
	</form>
        </div>
        <div id="bottom">나는 아래</div>
        <div id="company">싱싱쇼핑몰</div>
    </div>
</body>
</html>