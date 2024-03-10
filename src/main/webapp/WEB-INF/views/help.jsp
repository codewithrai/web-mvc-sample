<%--
  Created by IntelliJ IDEA.
  User: Shark
  Date: 09/03/2024
  Time: 12:17 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Help Page</title>
</head>
<body>
    <h1>This is Help page</h1>

<h1> My Name is
    ${name}
</h1>

<h1>
    My Id is
    ${id}
</h1>

<h1>
    My time is
    ${time}
</h1>

<hr>
    <c:forEach var="item" items="${marks}">
<h1>
    ${item}
</h1>
</c:forEach>

</body>
</html>
