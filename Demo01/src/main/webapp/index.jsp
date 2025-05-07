<%@ page language="java" import="java.io.*" %>
<%@ page import="com.data.demo01.Student" %>

<%-- hiển thị kí tự utf-8 như tiếng việt có dấu, tiếng trung --%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h4>Trang Chủ</h4>

    <%-- Giai đoạn khởi tạo --%>
    <%!
        public void jspInit() {
            System.out.println("Giai đoạn khởi tạo trong jsp");
        }
    %>
    <%-- Giai đoạn huỷ --%>
    <%!
        public void jspDestroy() {
            System.out.println("Giai đoạn huỷ trong jsp");
        }
    %>

    <%
        System.out.println("Giai đoạn Service trong jsp");
        out.print("Giai đoạn Service trong jsp");

        Student st1 = new Student();
    %>

    <%
        String username = (String) application.getAttribute("username");
    %>
    <%= "Uname: " + username %>
</body>
</html>