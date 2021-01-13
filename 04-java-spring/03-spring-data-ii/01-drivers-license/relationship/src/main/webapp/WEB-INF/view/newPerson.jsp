<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>


<h2>Add New Person</h2>
<%--@elvariable id="language" type="javax"--%>
<form:form action="/newPerson" method="post" modelAttribute="person">
    <p>
        <form:label path="firstName">FirstName</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>

    </p>

    <p>
        <form:label path="lastName" id="lastName">LastName</form:label>
        <form:errors path="lastName" id="lastName"></form:errors>
        <form:input path="lastName" id="lastName" ></form:input>

    </p>



    <input type="submit" value="Create">


</form:form>


</html>
