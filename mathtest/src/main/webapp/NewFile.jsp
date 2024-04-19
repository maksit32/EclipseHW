<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="java.util.concurrent.ThreadLocalRandom" %>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
   Random rnd = new Random();
   int a =  rnd.nextInt(10);
   int b = rnd.nextInt(10);
%>
<form action='check' method='post'>
How many is <%=a%> * <%=b%> = <input type='number' name='answer'>?
<input type='submit' value='check'>
</form>
</body>
</html>
