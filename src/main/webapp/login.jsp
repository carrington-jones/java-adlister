<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Login</title>
    <%@include file="../partials/head.jsp" %>
</head>
<body>

<%@include file="../partials/navbar.jsp" %>

<form action="/login.jsp" method="POST">
    <label for="username">Username:</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password:</label><br>
    <input type="text" id="password" name="password">
    <br>
    <button type="submit" class="btn btn-outline-success mt-3">Login</button>
</form>
</body>
</html>


<!--VERY HELPFUL WITH action and method attributes-->
<!--https://developer.mozilla.org/en-US/docs/Learn/Forms/Sending_and_retrieving_form_data-->
