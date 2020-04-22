<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Student ID : ${student.id}<br>
Student Firstname : ${student.firstName}<br>
Student Lastname : ${student.lastName}<br>
Student Email : ${student.email}<br>
Student Country : ${student.country}<br>
Student Langugae : ${student.favouritelanguage}
Student Operating Systems:

<ul>
<c:forEach var="os" items="${student.operatingSystems}">
<li>${os}</li>
</c:forEach>
</ul>


</body>
</html>