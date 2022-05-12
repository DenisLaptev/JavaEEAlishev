<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.javaee.project.internet_shop.Cart"%>
<html>
<head>
    <title>Shop JSP</title>
</head>
<body>
    <h1>Shop jsp </h1>
    <p>
        <%= "session : " + session %>
    </p>
    <p>
        <%
            Cart cart = (Cart) session.getAttribute("cart");
        %>
        <%= "cart : " + cart %>
    </p>
</body>
</html>