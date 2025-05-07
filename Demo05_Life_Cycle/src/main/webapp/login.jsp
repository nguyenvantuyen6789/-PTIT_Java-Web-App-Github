
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Form Login</h4>
    <%-- action: duong path --%>
    <form action="login" method="get">
        <div>
            <%-- id: username map voi for="username" de forcus input --%>
            <%-- khi click vao the label --%>
            <label for="username">Username</label>
            <input type="text" name="username" id="username">
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" id="password">
        </div>

        <input type="submit" value="LOGIN" />
    </form>
</body>
</html>
