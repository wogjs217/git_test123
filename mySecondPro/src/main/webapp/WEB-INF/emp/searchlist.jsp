<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>JSTL을 이용한 jsp</h3>
	<jsp:include page="search.jsp" />

	<hr />
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>아이디</th>
			<th>패스워드</th>
			<th>성명</th>
			<th>주소</th>
			<th>포인트</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="user" items="${userlist}">
			<tr>
				<td>${user.id}</td>
				<td>${user.pass}</td>
				<td>${user.name}</td>
				<td>${user.addr}</td>
				<td>${user.deptno}</td>
				<td><a href="mybatisDel.do?id=${user.id}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>