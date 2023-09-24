<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body {
	background-color: gray;
}
input {
	background-color: violet;
	border-radius: 10px 20px;
	box-shadow: 3px 3px bisque; 
}
h1
{
	color: greenyellow;
}
</style>
</head>
<body>
	<form action="validatelogin" method="post">
	<pre>
		EMAIL   :<input type="text" name="email">
		PASSWORD:<input type="text" name="pwd">
		          <input type="submit" value="login">
	</pre>
	</form>
	<h1><a href="signin.jsp">If NEW USER CREAT ACCOUNT</a></h1>
	

</body>
</html>