
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Result</h4>

    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String strAge = (String) request.getParameter("age");
        Integer age = Integer.parseInt(strAge);

        if (username.equals("admin") && password.equals("123")) {
            // set username cho application scope
            // có 3 cách: dùng session, request, application
            application.setAttribute("username", username);
            if (age >= 18) {
                response.sendRedirect("adult.jsp");
            } else {
                response.sendRedirect("teen.jsp");
            }
        } else {
            response.sendRedirect("login.jsp?err=info_incorrect");

        }
    %>

</body>
</html>
