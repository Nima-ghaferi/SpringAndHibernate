<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nima
  Date: 10/12/2022 AD
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<h2>
    Student is confirmed: ${student.firstName} ${student.lastName}
    <br/>
    Country: ${student.country}
    <br/>
    Favorite Language: ${student.favoriteLanguage}
    <br/>
    Operating Systems:
    <br/>
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</h2>
</body>
</html>
