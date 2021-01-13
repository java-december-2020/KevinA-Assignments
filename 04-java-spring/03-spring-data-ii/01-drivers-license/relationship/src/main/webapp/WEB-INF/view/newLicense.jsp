<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>


<h2>Add New Person</h2>
<%--@elvariable id="language" type="javax"--%>
<form:form action="/newLicense" method="post" modelAttribute="license">
    <p>
        <form:label path="person">Person</form:label>
        <form:errors path="person"/>
        <form:select path="person">
            <c:forEach items="${person}" var="list">
                <form:option value="${list.id}">${list.firstName} ${list.lastName}</form:option>
            </c:forEach>
        </form:select>


    </p>

    <p>
        <form:label path="state" id="state">State</form:label>
        <form:errors path="state" id="state"></form:errors>
        <form:input path="state" id="state"></form:input>

    </p>
    <p>
        <form:label path="expiration_date" id="expiration_date">State</form:label>
        <form:errors path="expiration_date" id="expiration_date"></form:errors>
        <form:input path="expiration_date" type="date"/>


    </p>


    <input type="submit" value="Create">


</form:form>


</html>
