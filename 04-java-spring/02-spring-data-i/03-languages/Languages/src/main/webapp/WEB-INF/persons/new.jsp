<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form:form action="/new" method="post" modelAttribute="person">
    <p>
        <form:label path="firstName" id="firstName">firstName</form:label>
        <form:errors path="firstName" id="firstName"></form:errors>
        <form:input path="firstName" id="firstName"></form:input>
    </p>
    <p>
        <form:label path="lastName" id="lastName">lastName</form:label>
        <form:errors path="lastName" id="lastName"></form:errors>
        <form:input path="lastName" id="lastName"></form:input>
    </p>
    <input type="submit" value="Create">

</form:form>