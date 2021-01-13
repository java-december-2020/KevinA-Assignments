
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome To Lookify</title>
    <a href="/view/index">Dashboard</a>

</head>
<body>

<div class="container">
<p>Title: <c:out value="${lookify.title}"></c:out></p>
<p>Artist: <c:out value="${lookify.artist}"></c:out></p>
<p>Rating: <c:out value="${lookify.rating}"></c:out></p>

<p><a href="/view/delete/${lookify.id}">Delete</a></p>
</div>
</body>
</html>