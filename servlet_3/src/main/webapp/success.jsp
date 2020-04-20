<%@page import="com.example.model.Todo"%>
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
Todo obj = (Todo)request.getAttribute("todo");
out.println("Todo Name:"+obj.getName()+","+obj.getId()+","+obj.getCompletedBy());

%>
</body>
</html>