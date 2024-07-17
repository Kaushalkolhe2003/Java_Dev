<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
response.setHeader("Pragma", "no-cache"); // HTTP 1.0
response.setDateHeader("Expires", 0); // Proxies
   if(session.getAttribute("name")==null){
	   response.sendRedirect("Login.jsp");
   }
%>
<main>
    <section >
        <h2>Dsa Vedios</h2>
        <table>
            <tr>
                <td>
                    <iframe  src="https://www.youtube.com/embed/fi2vh0nQLi0?autoplay=1" ></iframe>
                  </td>
                  
                <td><iframe src="https://www.youtube.com/embed/wjqSZy4pMT4"></iframe></td>
                <td><iframe src="https://www.youtube.com/embed/8lWxaRviJBA"></iframe></td>
            </tr>
            <tr>
                <td><iframe src="https://www.youtube.com/embed/EaK6aslcC5g" ></iframe></td>
                <td><iframe src="https://www.youtube.com/embed/EaK6aslcC5g" ></iframe></td>
                <td><iframe src="https://www.youtube.com/embed/b5kij1Akf9I" ></iframe></td>
            </tr>
        </table>
       </section>
       <br>
       <section>
       <h2>Cartoon</h2>
       <table>
       <tr>
       <td> <iframe src ="https://www.youtube.com/embed/aryCScSrDa0"></iframe></td>
       <td> <iframe src ="https://www.youtube.com/embed/XwqEeHIupRE"></iframe></td>
       <td> <iframe src ="https://www.youtube.com/embed/cKmZeKwlsXw"></iframe></td>
       
       </table>
       </section>
    </main>
</body> 
</html>