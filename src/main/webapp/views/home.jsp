<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 01.07.2016
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


<a href="/allUsers">All Users</a>
<a href="/allOrders">All Orders</a>
<a href="/addNewOrder">Add New Order</a>

<sec:authorize access="isAnonymous()"><a href="/login">Login</a></sec:authorize>
<sec:authorize access="isAuthenticated()"><a href="/logout">Logout</a></sec:authorize>
