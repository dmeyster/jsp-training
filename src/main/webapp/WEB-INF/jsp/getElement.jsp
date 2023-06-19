<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Get Element</title>
</head>
<body>
<h1>Get Element:</h1>
<% int index = (int) request.getAttribute("index"); // retrieve index and element from request
    int element = (int) request.getAttribute("element"); %>
<p>Element at index <%= index %> is <%= element %>.</p>
</body>
</html>
