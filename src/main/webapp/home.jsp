<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
	background-color: yellowgreen;
}
	div 
	{
		color: gray;
		border: white;
	}
</style>
</head>
<body>
	<%
		String email=(String)session.getAttribute("email");
		if(email!=null){
	%>
		<div class="topnav">
		 <h1><a href="add.jsp">ADD CONTACT</a></h1>
		 <h1><a href="view.jsp">VIEW CONTACT</a></h1>
		 <h1><a href="logout">LOGOUT</a></h1>
		</div>
	<%
		}
	%>
</body>
</html>