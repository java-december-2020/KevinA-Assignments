<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Book</title>
</head>
<body>
<p>Title:<c:out value="${book.title}"/></p>
<p>Description:<c:out value="${book.description}"/></p>
<p>Language:<c:out value="${book.language}"/></p>
<p>Number of Pages:<c:out value="${book.numberOfPages}"/></p>
<a href="/view/editBook/${book.id}">Edit Book</a>

<form action="/view/delete/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>