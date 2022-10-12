<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nima
  Date: 10/12/2022 AD
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<%--@elvariable id="student" type="com.nemo.mvcdemo.Student"--%>
<form:form action="process-form" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br/><br/>
    Last name: <form:input path="lastName"/>
    <br/><br/>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br/><br/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
