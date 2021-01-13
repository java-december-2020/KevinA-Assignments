<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">


</head>
<body>

<div class="container">
    <h5>Top Ten Songs: </h5>


        <c:forEach items="${topTen}" var="music" varStatus="loop">


                <p><c:out value="${music.rating}"></c:out> - <a href="/view/songs/${music.id}"><c:out value="${music.title}"/></a>  -
                    <c:out value="${music.artist}"></c:out></p>



                    <%--<form action="/view/delete/${book.id}" method="post">--%>
                    <%--    <input type="hidden" name="_method" value="delete">--%>
                    <%--    <input type="submit" value="Delete">--%>
                    <%--</form>--%>




        </c:forEach>



</div>

</body>
</html>