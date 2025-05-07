
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Scope Variable</h4>
    <%
        request.setAttribute("name", "Nguyen Ngo 2");
        request.setAttribute("address", "5 Pham Hung");
        // chuyển biến name trong request sang result.jsp
        // dùng forward
        request.getRequestDispatcher("result.jsp").forward(request, response);
    %>
</body>
</html>
