<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>


<h2>Add New Ninja</h2>

<%--@elvariable id="ninja" type="javax"--%>
<form:form action="/newNinja" method="post" modelAttribute="ninja">
    <p>
        <form:label path="dojo">Dojo</form:label>
        <form:errors path="dojo"/>
        <form:select path="dojo">
            <c:forEach items="${dojo}" var="list">
                <form:option value="${list.id}">${list.name}</form:option>
            </c:forEach>
        </form:select>


    </p>

    <p>
        <form:label path="firstName" id="firstName">First Name</form:label>
        <form:errors path="firstName" id="firstName"></form:errors>
        <form:input path="firstName" id="firstName"></form:input>

    </p>
    <p>
        <form:label path="lastName" id="lastName">State</form:label>
        <form:errors path="lastName" id="lastName"></form:errors>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age" id="age">Age</form:label>
        <form:errors path="age" id="age"></form:errors>
        <form:input path="age"/>
    </p>


    <input type="submit" value="Create">


</form:form>


</html>
