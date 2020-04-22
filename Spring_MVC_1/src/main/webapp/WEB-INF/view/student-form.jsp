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
Country :<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select><br>
Favourite language : <br>

		Java <form:radiobutton path="favouritelanguage" value="Java" />
		C# <form:radiobutton path="favouritelanguage" value="C#" />
		PHP <form:radiobutton path="favouritelanguage" value="PHP" />
		Ruby <form:radiobutton path="favouritelanguage" value="Ruby" /><br>
Operation System :<br/>
		Windows<form:checkbox path="operatingSystems" value="windows"/>
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		macOs<form:checkbox path="operatingSystems" value="MacOs"/>
		MsDos<form:checkbox path="operatingSystems" value="MsDos"/>
<input type="submit"/>


</form:form>

</body>
</html>