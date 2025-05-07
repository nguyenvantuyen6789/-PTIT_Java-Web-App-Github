package com.data.demo06_register_account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AccountServlet", value = "/account")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullName = request.getParameter("fullName");
        String age = request.getParameter("age");
        String address = request.getParameter("address");

        // printwriter in ra giao dien
        PrintWriter out = response.getWriter();

        if ("".equals(username)) {
            System.out.println("Username is required");
            out.print("Username is required");
        } else if ("".equals(password)) {
            System.out.println("Password is required");
            out.print("Password is required");
        } else if ("".equals(fullName)) {
            System.out.println("Full Name is required");
            out.print("Full Name is required");
        } else {
            System.out.println("Register account successfully, username: " + username);

            out.print("Register account successfully, username: " + username);
        }


    }
}
