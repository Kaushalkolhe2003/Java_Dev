<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="run.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<%!
int dec=23;

%>
<br>
<%

 int i=Integer.parseInt(request.getParameter("num1"));
 int j=Integer.parseInt(request.getParameter("num2"));
 
 int k=i+j;
 out.println("Output : "+k); 
 pageContext.setAttribute("name","kaushal",PageContext.SESSION_SCOPE);
 
 

%>
</body>
</html>