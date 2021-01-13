<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>


<h2>Add New Product</h2>


<%--@elvariable id="product" type="java"--%>
<form:form action="/newProduct" method="post" modelAttribute="product">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>

    </p>

    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>

    </p>

    <p>
        <form:label path="price">Price</form:label>
        <form:errors path="price"/>
        <form:input path="price"/>

    </p>

    <input type="submit" value="Create">


</form:form>


</html>
