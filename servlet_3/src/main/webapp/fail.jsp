<%@page import="java.util.*"%>
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
List<String> obj = (List)request.getAttribute("error");
Iterator itr = obj.iterator();

while(itr.hasNext())
{
	String obj1 = (String)itr.next();
	out.println(obj1);
	
}


%>
</body>
</html>