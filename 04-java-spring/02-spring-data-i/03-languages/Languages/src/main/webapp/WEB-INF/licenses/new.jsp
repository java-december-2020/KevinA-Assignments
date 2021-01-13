<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <meta charset="ISO-8859-1">
    <title>DMV App</title>
</head>

<body>
<form:form action="/licenses" method="POST" modelAttribute="license">
    <p>
        <form:label path="person" id="person">Person</form:label>
        <form:errors path="person"></form:errors>
        <form:select path="person" id="person">

            <c:forEach items="${person}" var="p">

                <form:option value="${p.id}">  ${p.firstName} ${p.lastName}</form:option>


            </c:forEach>



        </form:select>
    </p>
    <p>
        <form:label path="state" id="state">State</form:label>
        <form:errors path="state" id="state"></form:errors>
        <form:input path="state" id="state"></form:input>
    </p>
    <p>
        <form:label path="expirationDate" id="expirationDate">Expiration Date</form:label>
        <form:errors path="expirationDate" id="expirationDate"></form:errors>
        <form:input type="date" path="expirationDate" id="expirationDate"></form:input>
    </p>
    <button>Add Licenses</button>

</form:form>
</body>
</html>