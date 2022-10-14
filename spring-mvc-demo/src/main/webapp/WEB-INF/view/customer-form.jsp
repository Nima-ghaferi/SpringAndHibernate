<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nima
  Date: 10/14/2022 AD
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {color: red;}
    </style>
</head>
<body>
<%--@elvariable id="customer" type="com.nemo.mvcdemo.Customer"--%>
<form:form action="process-form" modelAttribute="customer">
    First name: <form:input path="firstName" />
    <br/>
    <br/>
    Last name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error" />
    <br/><br/>
    Free Passes: <form:input path="freePasses" />
    <form:errors path="freePasses" cssClass="error" />
    <br/><br/>
    Postal Code: <form:input path="postalCode" />
    <form:errors path="postalCode" cssClass="error" />
    <br/><br/>
    Course Code: <form:input path="courseCode" />
    <form:errors path="courseCode" cssClass="error" />
    <br/><br/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
