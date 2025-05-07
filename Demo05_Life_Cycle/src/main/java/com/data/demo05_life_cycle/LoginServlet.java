package com.data.demo05_life_cycle;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login Servlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // in ra console
        System.out.println("Run in /login, doGet");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // in ra nen trang web
        PrintWriter out = response.getWriter();
        out.print("Username: <h1>" + username + "</h1>");
        out.print("<br>");
        out.print("Password: " + password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Run in /login, doPost");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
