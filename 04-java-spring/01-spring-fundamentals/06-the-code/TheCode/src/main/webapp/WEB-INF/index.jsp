<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>The Code</title>
</head>
<body>

<form action="/code" method="post">
    <h2>What is the code?</h2>
    <input type="text" name="code"><br><br>

<button href="/submit">Try Code</button>
</form>
</body>
</html>