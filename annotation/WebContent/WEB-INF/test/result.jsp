<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���������κ��� �����  JSP(�丮��������)</h1>
	<hr/>
	<h3>JSP�� ���:<%= request.getAttribute("msg") %></h3>
	<h3>EL�� ���:${msg}</h3>
</body>
</html>