<%--
  Created by IntelliJ IDEA.
  User: Shark
  Date: 09/03/2024
  Time: 12:13 pm
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>This is Home Page</h1>
    <h1>Short Intro</h1>
<%
String name = (String) request.getAttribute("name");

Integer id = (Integer) request.getAttribute("id");

String City = (String) request.getAttribute("City");

 %>
 <h1>My Name is <%=name%></h1>
  <h1>My Id is <%=id%></h1>
  <h1>I am from <%=City%></h1>

  </body>

</html>
