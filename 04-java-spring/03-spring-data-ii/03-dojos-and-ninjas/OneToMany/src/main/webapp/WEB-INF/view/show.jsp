<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <meta charset="ISO-8859-1">
    <title>Dojos and Ninjas</title>
</head>
<body>
<div class="container">
    <%--    <h1>${ person.firstName } ${ person.lastName }</h1>--%>
    <%--    <p><strong>License Number</strong> ${ person.license.getNumberAsString() }</p>--%>
    <%--    <p><strong>Expiration Date</strong> ${ person.license.getExpirationDateFormatted() }</p>--%>
    <h1>${dojo.name} Location Ninjas</h1>

    <table class="table table-hover table-dark">
        <thead>
        <tr>
            <%--            <th>ID</th>--%>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <c:forEach items="${ dojo.ninjas }" var="ninja">

        <tr>
            <td><c:out value="${ninja.firstName}"></c:out></td>
                <%--					<td>${ ninja.firstName }</td>--%>
            <td> ${ ninja.lastName }</td>
            <td>${ ninja.age }</td>
        </tr>
        </c:forEach>
        </tr>


        </tbody>
    </table>
</div>
</body>
</html>