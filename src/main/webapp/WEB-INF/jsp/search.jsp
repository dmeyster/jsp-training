<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Results</title>
</head>
<body>
<h1>Search Results:</h1>
<% int value = (int) request.getAttribute("value");
    int index = (int) request.getAttribute("index"); %>
<% if (index == -1) { %>
<p>Value <%= value %> not found in array.</p>
<% } else { %>
<p>Value <%= value %> found at index <%= index %> in array.</p>
<% } %>
</body>
</html>