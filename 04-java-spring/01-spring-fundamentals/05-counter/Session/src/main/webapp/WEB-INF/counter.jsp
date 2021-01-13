<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Counter</title>
</head>
<body>
<p>
    You have visited <a href="/">http:/your_server/</a>
    <c:out value="${counter}"></c:out>
    times
</p>

<p>
    <a href="/">Test another visit?</a>

</p>
<button href="/reset">Reset</button>
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>