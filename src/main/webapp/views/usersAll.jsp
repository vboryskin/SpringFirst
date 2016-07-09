<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02.07.2016
  Time: 1:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>allUsers</title>
</head>
<body>

<h2>All Users here!</h2>
<table>
    <thead>
        <tr>
            <td>name</td>
            <td>surname</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="&{users}" var="user">
            <tr>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            </tr>
        </c:forEach>
    </tbody>



</table>

</body>
</html>
