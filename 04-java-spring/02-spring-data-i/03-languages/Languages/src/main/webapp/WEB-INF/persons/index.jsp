<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Dogs</title>
</head>
<body>
    <h2>Welcome to Spring Data II</h2>
<table>

    <thead>
    <tr>
        <th>ID</th>
        <th>FirstName</th>
        <th>LastName</th>

    </tr>
    </thead>
    <tbody>
         <c:forEach items="${person}" var="person">
    <tr>
        <td><c:out value="${person.id}"></c:out></td>
        <td><a href="/${person.id}"><c:out value="${person.firstName}"></c:out></a></td>
        <td><c:out value="${person.lastName}"></c:out></td>
    </tr>




    </c:forEach>
</table>


<a href="/persons/new">Create Person</a>



</body>
</html>


