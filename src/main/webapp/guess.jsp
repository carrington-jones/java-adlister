<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess JSP </title>
</head>
<body>
<h1>Please Guess a Number 1, 2 or 3!</h1>
<form action="/guess" method="POST">
    <label for="guess">Number</label>
    <input id="guess" name="guess" type="number" min="1" max="3" >
    <button>Guess Number</button>
</form>
</body>
</html>
