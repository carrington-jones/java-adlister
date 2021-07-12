<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>

</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<form method="POST" action="${pageContext.request.contextPath}/register">
<div class="container">
    <h1> User Registration</h1>
    <div class="form-group">
        <label for="username">Username</label>
        <input id="username" type="text" name="username" placeholder="Enter username">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input id="email" name="email" type="text" placeholder="Enter email">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" type="password" placeholder="Enter password">
    </div>
    <input class="btn btn-primary" type="submit" value="Submit">

</div>
</form>


</body>
</html>
