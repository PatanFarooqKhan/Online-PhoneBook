<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body {
	background-color: cyan;
}
input {
	background-color: lightgreen;
	border-radius: 10px 20px;
	box-shadow: 3px 3px olive; 
}
</style>
</head>
<body>
	<form action="savesignin" method="post">
	<pre>
		NAME        :<input type="text" name="name">
		PHONE       :<input type="text" name="phone">
		EMAIL       :<input type="text" name="email">
		PASSWOED    :<input type="text" name="pwd1">
		CNF PASSWORD:<input type="text" name="pwd2">
		              <input type="submit" value="signin">
	</pre>
	</form>

</body>
</html>