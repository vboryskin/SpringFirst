<%--
  Created by IntelliJ IDEA.
  User: vboryskin
  Date: 09.07.2016
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<html>
<head>
    <title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>
    <div><tiles:insertAttribute name="header"></tiles:insertAttribute></div>
    <div><tiles:insertAttribute name="menu"></tiles:insertAttribute> </div>
    <div><tiles:insertAttribute name="body"></tiles:insertAttribute> </div>
    <div><tiles:insertAttribute name="footer"></tiles:insertAttribute> </div>

</body>
</html>
