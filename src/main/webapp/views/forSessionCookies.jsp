<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>For Session Cookies JSP</title>
</head>
<body>
    <h1> For Session Cookies jsp </h1>
    <p>
        <%= "session : " + session %>
    </p>
    <p>
        <%
            Integer count = (Integer) session.getAttribute("count");
            if (count == null) {
                count = 1;
                session.setAttribute("count", count);
            } else {
                session.setAttribute("count", count + 1);
            }
        %>
        <%= "count : " + session.getAttribute("count") %>
    </p>
</body>
</html>