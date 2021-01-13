<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

<a href="/view/index">Dashboard</a>
<div class="form-control">


    <%--@elvariable id="lookify" type="javax"--%>
    <form:form action="/new" method="post" modelAttribute="lookify">
        <p><form:label path="title">Title</form:label>

            <form:input path="title"></form:input>
            <form:errors path="title" cssClass="error"></form:errors>
        </p>
        <p>
            <form:label path="artist">Artist</form:label>
            <form:input path="artist"></form:input>
            <form:errors path="artist" cssClass="error"></form:errors>
        </p>

        <p>

            <form:label path="rating">Rating (1-10)</form:label>
            <form:input type="number" path="rating"></form:input>
            <form:errors path="rating" cssClass="error">Rating</form:errors>
        </p>

        <input type="submit" name="song" value="Add Song">


    </form:form>
</div>