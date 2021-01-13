<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Survey</title>
</head>
<body>
<h2>Submitted Info</h2>
Name : <c:out value="${name}"/><br>
Dojo Location : <c:out value="${location}"/><br>
Favorite Language : <c:out value="${language}"/><br>
Comment : <c:out value="${comment}"/>


</body>
</html>