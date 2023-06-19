<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Даниил
  Date: 05.06.2023
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Print All</title>
</head>
<body>
<h1>All Elements:</h1>
<ul>
    <% int[] array = (int[]) request.getAttribute("array100"); %>
    <% for (int i = 0; i < array.length; i++) { %>
    <li><%= array[i] %></li>
    <% } %>
</ul>
</body>
</html>
