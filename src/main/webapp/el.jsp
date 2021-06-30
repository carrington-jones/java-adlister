<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    request.setAttribute("userRole", "user_1");

    String message;

    switch (request.getAttribute("userRole").toString()){
        case "admin":
            message = "administrator";
            break;
        case "s_admin":
            message = "Super Admin";
            break;
        case "user_1":
            message = "active user";
            break;
        default:
            message = "unknown status";
    }

    request.setAttribute("userRoleMessage", message);

%>
<html>
<head>
    <title>Expressions Language</title>
</head>
<body>
<h1>${userRole}</h1>
<h3>User Status: ${userRoleMessage}</h3>
</body>
</html>
