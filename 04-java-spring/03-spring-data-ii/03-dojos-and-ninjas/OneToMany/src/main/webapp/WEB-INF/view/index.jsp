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
<p><a href="/new">Add New Dojo</a> | <a href="/ninjas/new">Add New Ninja</a> |  <a href="/ninjas">Ninjas</a> </p>
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
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dojoList}" var="dojo">
            <tr>
                <td><c:out value="${dojo.id}"></c:out></td>
                <td><a href="/view/dojo/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

</div>


</html>