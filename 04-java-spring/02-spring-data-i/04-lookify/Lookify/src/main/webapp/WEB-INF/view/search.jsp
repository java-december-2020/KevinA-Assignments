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


</head>
<body>

<div class="container">
    <a href="/view/index">Dashboard</a>
    <h3>Searched for : ${artist}</h3>
    <form method="get" action="/view/search/">
        <input type="text" name="artist">
        <input type="submit" name="searchArtists" value="Search Artist">
    </form>

    <table class="table table-hover table-dark">
        <thead>
        <tr>

            <th scope="col">Name</th>
            <th scope="col">Rating</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${searchMusic}" var="music" varStatus="loop">
            <tr>

                <td><a href="/view/songs/${music.id}"><c:out value="${music.title}"/></a></td>
                <td><c:out value="${music.rating}"/></td>

                <td> <a href="/view/delete/${music.id}">Delete</a><br><br>
                    <form action="/view/delete/${music.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input class="btn btn-danger" type="submit" value="Delete">
                    </form>
                </td>


            </tr>

        </c:forEach>


        </tbody>
    </table>
</div>

</body>
</html>