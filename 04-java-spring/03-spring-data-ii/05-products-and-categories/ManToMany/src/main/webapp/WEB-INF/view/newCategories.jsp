<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>


<h2>Add New Product</h2>



<%--@elvariable id="category" type="java"--%>
<form:form action="/newCategory" method="post" modelAttribute="category">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>

    </p>



    <input type="submit" value="Create">


</form:form>


</html>
