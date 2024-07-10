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
String n = (String) pageContext.getAttribute("name", PageContext.SESSION_SCOPE);
if (n != null) {
    out.print(n);
} else {
    out.print("Name attribute not set.");
}
%>
</body>
</html>