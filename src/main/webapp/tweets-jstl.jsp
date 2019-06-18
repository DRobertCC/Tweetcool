<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tweets</title>
</head>

<body>

<h1>Tweets</h1>

<c:forEach var="tweet" items="${tweets}">
    <c:out value="${tweet.poster}"/>: <c:out value="${tweet.content}"/><br>
    <c:out value="${tweet.timestamp}"/>
    <br>

</c:forEach>

<a href="index.html">Go back to the <em>index</em> page.</a>
<br>

</body>

</html>
