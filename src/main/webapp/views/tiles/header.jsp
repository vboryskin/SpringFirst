<%--
  Created by IntelliJ IDEA.
  User: vboryskin
  Date: 09.07.2016
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<h1>Header</h1>
<p>Hello! <sec:authentication property="name"/></p>
