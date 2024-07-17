<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
   if(session.getAttribute("name")==null){
	   response.sendRedirect("Login.jsp");
   }
%>
Welcome to our page ${name}
<br>
For Vedios :
<a href="vedio.jsp">Videos here</a>

<form action="Logout">
<input type="submit" value="Logout">

</form>

</body>
</html>