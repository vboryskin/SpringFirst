<%--
  Created by IntelliJ IDEA.
  User: vboryskin
  Date: 09.07.2016
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<table>


    <tr>
        <td>name</td>
        <td>surname</td>
        <td>age</td>
        <td>email</td>
        <td>userName</td>
        <td>password</td>
    </tr>

    <c:forEach items="${users}" var="user">
        <tr>
            <td><a href="/user=${user.id}">${user.name}</a></td>
            <td>${user.surname}</td>
            <td>${user.age}</td>
            <td>${user.email}</td>
            <td>${user.userName}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>




</table>
<a href="userNew">New User</a>