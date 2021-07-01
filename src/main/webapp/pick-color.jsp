<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
    </title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pickcolor" method="POST">
    <label for="color-choice">Please type a color</label>
    <input type="text" id="color-choice" name="color-choice">
    <button type="submit" name="submit">Submit</button>
</form>
</body>
</html>
