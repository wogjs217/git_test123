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
		List<MyEmpDTO> userlist = (List<MyEmpDTO>) request.getAttribute("userlist");
		int size = userlist.size();
	%>
	<h1>ȸ�����(MVC)</h1>

	<hr />
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>���̵�</th>
			<th>�н�����</th>
			<th>����</th>
			<th>�ּ�</th>
			<th>�μ���ȣ</th>
			<th>����</th>
		</tr>
		<%
			for (int i = 0; i < size; i++) {
				MyEmpDTO user = userlist.get(i);
		%>
		<tr>
			<td><a href="mybatisdetail.do?id=<%=user.getId()%>&action=DETAIL"><%=user.getId()%></a></td>
			<td><%=user.getPass()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAddr()%></td>
			<td><%=user.getDeptno()%></td>
			<td><a href="mybatisdelete.do?id=<%=user.getId()%>">����</a></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>




