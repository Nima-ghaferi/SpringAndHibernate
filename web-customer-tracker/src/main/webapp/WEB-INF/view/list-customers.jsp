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
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Customer Relationship Manager</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <input type="button" value="Add Customer" onclick="window.location='add'; return false;"
            class="add-button">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Lat Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>

                <c:forEach var="customer" items="${customers}">
                    <c:url var="updateLink" value="update">
                        <c:param name="id" value="${customer.id}"/>
                    </c:url>
                    <c:url var="deleteLink" value="delete">
                        <c:param name="id" value="${customer.id}"/>
                    </c:url>
                    <tr>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.email}</td>
                        <td><a href="${updateLink}">Update</a> | <a href="${deleteLink}"
                                                                    onclick="if(!confirm('Are you sure?')) return false;">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
