<%@page import="java.sql.ResultSet" %>
<%@page import="dao.ContactDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
	background-color: lime;
}
	form {
	color: red;
	border: blue;
}
input {
	background-color: skyblue;
	border-radius: 10px 10px;
	box-shadow: 3px 3px ; 
</style>
</head>
<body>
	<%
		String email=request.getParameter("email");
		ResultSet rs=ContactDao.getAllContacts(email);
		rs.next();
	%>
	<form action="update" method="post">
	<pre>
		ID   :<input type="text" name="id" value="<%=rs.getInt(1)%>" readonly="readonly">
		NAME :<input type="text" name="name" value="<%=rs.getString(2)%>" >
		PHONE:<input type="text" name="phone" value="<%=rs.getLong(3)%>" >
		      <input type="submit" value="update" >
	</pre>
	</form>
</body>
</html>