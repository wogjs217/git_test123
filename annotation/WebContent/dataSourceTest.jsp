<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="java.sql.*,javax.sql.*,javax.naming.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JNDI�� �̿��ؼ� Ŀ�ؼ� Ǯ �����ϱ�</h1>
	<hr>
	<h3> WAS���� �����ϴ� Ŀ�ݼ� Ǯ�� �̿��Ͽ� Ŀ�ؼ� �����ϱ� - WAS���� ��ϵ� Ŀ�ݼ� Ǯ�� �����ϴ� ����� ��� �ٸ� ���̹Ƿ�
	Ŀ�ؼ��� ��� �� �� �ִ� ǥ��API�� �־�� �ϸ�, javax.sql��Ű���� DataSource�� ǥ�� API�̴�. conttext.xml�� 
	/resource /�� ��ϵǾ� �ִ� name���� lookup�ؼ� ã�ƿ� �� �̿��Ѵ�. </h3>
	<%
		//1. WAS�� ��ϵ� �ڿ��� ã�ƿ��� ���� ��ü�� ����
		InitialContext context = new InitialContext();
		//2. InitialContext ��ü�� lookup �޼ҵ忡 ã�� resource �� �̸��� �����Ͽ� �ڿ��� ã�ƿ´�.
		// -> WAS�� ��ϵ� Ŀ�ؼ� Ǯ�� ������ �� �ִ� ��ü�� �޾ƿ´�.
		DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/myspring");
	%>
</body>
</html>