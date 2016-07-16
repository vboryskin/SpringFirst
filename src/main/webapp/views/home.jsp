<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 01.07.2016
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${orders}" var= "o">
    <div>
        <p>id: ${o.id}</p>
        <p>orderNumber: ${o.orderNumber}</p>
        <p>quantity: ${o.quantity}</p>
        <p>sum: ${o.sum}</p>
        <p>user: ${o.user}</p>
    </div>
</c:forEach>

<a href="/allUsers">All Users</a>
<a href="/allOrders">All Orders</a>
<a href="/addNewOrder">Add New Order</a>


