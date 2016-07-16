<%--
  Created by IntelliJ IDEA.
  User: vboryskin
  Date: 09.07.2016
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<a href="/">Home</a>
<h1>Header</h1>
<sec:authorize access="isAnonymous()"><a href="/login">Login</a></sec:authorize>
<sec:authorize access="isAuthenticated()"><a href="/logout">Logout</a></sec:authorize>
<p>Hello! <sec:authentication property="name"/></p>
