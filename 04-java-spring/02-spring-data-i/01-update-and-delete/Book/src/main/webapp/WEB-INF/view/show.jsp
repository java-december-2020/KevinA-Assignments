<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>Create New Book</h1>
<%--@elvariable id="book" type="java"--%>
<form:form action="/${book.id}" method="post" modelAttribute="book">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"></form:errors>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"></form:errors>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="language">Language</form:label>
        <form:errors path="language"></form:errors>
        <form:input path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages">Pages</form:label>
        <form:errors path="numberOfPages"></form:errors>
        <form:input type="number" path="numberOfPages"/>
    </p>
    <button>Edit</button>


</form:form>
