<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nima
  Date: 10/27/2022 AD
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customers</title>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Customer Relationship Manager</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Lat Name</th>
                    <th>Email</th>
                </tr>

                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
