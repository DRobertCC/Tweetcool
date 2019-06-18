<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codecool.web.model.Tweet" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta poster="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tweets</title>
</head>

<body>

<h1>Tweets</h1>

<% List<Tweet> tweets = (List<Tweet>) request.getAttribute("tweets"); %>

<% for (Tweet tweet : tweets) { %>
    <p><%= tweet.getPoster() %>: <%= tweet.getContent() %><br>
        <%= tweet.getTimeStamp() %>
    </p>
<% } %>

<a href="index.html">Go back to the <em>index</em> page.</a>
<br>

</body>

</html>
