
<%@page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
	background-color: mediumspringgreen
}
table
 {
	background-color:lightsteelblue
}
th {
color: green	
}
td {
	color: barkslategray
	
}
</style>
<link href="../Css.css/Style.css"  rel="stylesheet">
</head>
<body>
	<%
	String email=(String)session.getAttribute("email");
	if(email!=null)
	{
		ResultSet rs= dao.ContactDao.getAllContacts(email);
	
	%>
		<table border="2px">
			<tr>
				<th>ID</th>
				<th>NAME</th> 
				<th>PHONE</th>
				<th>EDIT</th>
				<th>DELETE</th>
			</tr>
			
	<%
		while(rs.next()){
	%>
	<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getLong(3) %></td>
		<td><a href="edit.jsp?email=<%=rs.getString(4) %>">Edit</a></td>
		<td><a href="delete?id=<%=rs.getInt(1)%>">Delete</a></td>
	</tr>
	<%
		}
	}else{
		response.sendRedirect("login.jsp");
	}
	%>
		</table>

</body>
</html>