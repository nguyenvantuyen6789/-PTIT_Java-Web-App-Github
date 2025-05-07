
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Result</h4>
    <%
        String name = (String) request.getAttribute("name");
        String address = (String) request.getAttribute("address");
    %>
    <%= "Name: " + name %>
    <%= "address: " + address %>
</body>
</html>
