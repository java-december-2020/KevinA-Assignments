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
    <a href="/view/addNew">Add New</a>
    <table class="table table-hover table-dark">
        <thead>
        <tr>

            <th scope="col">Name</th>
            <th scope="col">Rating</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${music}" var="music" varStatus="loop">
            <tr>

                <td><a href="/view/songs/${music.id}"><c:out value="${music.title}"/></a></td>
                <td><c:out value="${music.rating}"/></td>
                <td><a href="view/delete/${music.id}">Delete</a></td>

                    <%--<form action="/view/delete/${book.id}" method="post">--%>
                    <%--    <input type="hidden" name="_method" value="delete">--%>
                    <%--    <input type="submit" value="Delete">--%>
                    <%--</form>--%>


            </tr>

        </c:forEach>


        </tbody>
    </table>
</div>

</body>
</html>