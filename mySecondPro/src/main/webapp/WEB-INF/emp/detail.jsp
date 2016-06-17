<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,emp.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	MyEmpDTO user = (MyEmpDTO)request.getAttribute("user");	
%>
	<div align="center">
		<table width="400" border="1">
			<tr>
				<td>회원아이디</td>
				<td><%=user.getId()%></td>
			</tr>
			<tr>
				<td>회원패스워드</td>
				<td><%=user.getPass() %></td>
			</tr>
			<tr>
				<td>회원성명</td>
				<td><%=user.getName() %></td>
			</tr>
			<tr>
				<td>회원주소</td>
				<td><%=user.getAddr() %></td>
			</tr>
			<tr>
				<td>회원부서코드</td>
				<td><%=user.getDeptno() %></td>
			</tr>
			<tr>
				<td>등급</td>
				<td><%=user.getGrade() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정하기"
					onclick="location.href='update.do?id=<%=user.getId()%>&name=<%=user.getName()%>&action=UPDATE'"/>
					<input type="button" value="삭제하기"
					onclick="location.href='delete.do?id=<%=user.getId()%>'"/>
					<input type="button" value="목록보기"
						onclick="location.href='list.do'"/>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>









