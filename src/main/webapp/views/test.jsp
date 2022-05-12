<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>

    <h2>This is a test</h2>
    <p>
        <%="Hello World!"%>
    </p>
    <p>
      <%= new java.util.Date()%>
    </p>
    <p>
      <%
        java.util.Date now = new java.util.Date();
        String someString = "Current date: " + now;
        %>
    </p>
    <p>
      <%= someString%>
    </p>
    <p>
      <%
        for(int i=0;i<10;i++){;
            out.println("<p>" + "Hello : " + i + "</p>");
        }
        %>
    </p>

    <p>
      <%
        String name = request.getParameter("name");
        %>
      <%= "Hello, " + name%>
    </p>
</body>
</html>