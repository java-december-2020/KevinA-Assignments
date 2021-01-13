<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<title>Languages</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<h1 id="lang">All Dojo </h1>
<p><a href="/">Home</a> | <a href="/ninjas/new">Add New Ninja</a> </p>
<%--<a href="/licenses/new">Add New License</a>--%>
<%--<form method="get" action="/search/artist">--%>
<%--    <input type="text" name="artist" id="search">--%>
<%--    <button type="submit">Search Artist</button>--%>

<%--</form>--%>
<%--</p>--%>
<div class="container">
    <table class="table table-hover table-dark">
        <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Dojo</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ninja}" var="ninja">
            <tr>
                <td><c:out value="${ninja.id}"></c:out></td>
                <td><c:out value="${ninja.firstName}"></c:out></td>
                <td><c:out value="${ninja.lastName}"></c:out></td>
                <td><c:out value="${ninja.age}"></c:out></td>
                <td><c:out value="${ninja.dojo.name}"></c:out></td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

</div>


</html>