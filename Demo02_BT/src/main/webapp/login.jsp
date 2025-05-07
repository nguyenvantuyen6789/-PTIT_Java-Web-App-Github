
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Login</h4>
    <form action="result.jsp" method="post">
        <div>
            <label for="username">Username</label>
            <input type="text" name="username" id="username" />
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" id="password" />
        </div>
        <div>
            <label for="age">Age</label>
            <input type="number" name="age" id="age" />
        </div>

        <input type="submit" value="LOGIN" />
    </form>

    <%
        String err = request.getParameter("err");
        if (err != null && err.equals("info_incorrect")) {
            out.print("<p style='color:red'>Username or password not correct</p>");
        }
    %>
</body>
</html>
