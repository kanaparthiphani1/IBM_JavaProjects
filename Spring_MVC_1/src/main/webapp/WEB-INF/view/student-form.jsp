<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="student">
First Name : <form:input path="firstName"/><br>
Last Name : <form:input path="lastName"/><br>
Email : <form:input path="email"/><br>
<input type="submit"/>


</form:form>

</body>
</html>