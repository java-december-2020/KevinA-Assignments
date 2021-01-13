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
<form action="/survey" method="post">
    <label> Your Name:</label> <input type="text" name="name"><br><br>
    <label> Dojo Location:</label>
    <select name="location" id="location">
        <option value="San Jose" selected>San Jose</option>
        <option value="Seattle">Seattle</option>
        <option value="Chicago">Chicago</option>

    </select><br><br>
    <label> Favorite Language:</label>
    <select name="language" id="language">
        <option value="Java" selected>Java</option>
        <option value="Javascript">Javascript</option>
        <option value="Python">Python</option>

    </select><br><br>
    <label> Comment (Optional):</label><br>
    <textarea name="comment" id="comment" rows="4" cols="50"></textarea>

    <button>Submit</button>
</form>

<script type="text/javascript" src="js/app.js"></script>
</body>
</html>