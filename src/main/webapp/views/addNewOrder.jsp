<%--
  Created by IntelliJ IDEA.
  User: vboryskin
  Date: 7/10/2016
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="post" action="/addNewOrder">
    <input type="text" name="orderNumber">
    <input type="text" name="quantity">
    <input type="text" name="sum">
    <c:forEach items="${users}" var="a">
    <input name="user" type="radio" value="${a.id}">${a.name}
    </c:forEach>
    <button value="post">Send!</button>

</form>
