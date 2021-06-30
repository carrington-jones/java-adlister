<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--This comment will NOT be seen in the dev tools --%>

<%--Include directive syntax below!--%>
<%--<%@ include file=""%>--%>

<%--Directive Tags are symbolized with a <%@ directive attributes %>  --%>

<%! int instanceCount = 0; %>

<%
    int localCount = 1;
    localCount += 1;
    instanceCount +=1;
%>

<html>
<head>
    <title>JSP Tags</title>
</head>
<body>
<h1>HELLO THERE!</h1>
<!--Comment will not be seen-->

<h2>The local count is: <%= localCount%></h2>
<h2>The instance count is: <%= instanceCount%></h2>

<%@include file="partials/national-parks.jsp"%>
<%@include file="partials/navbar.jsp"%>
</body>
</html>
