package com.data.demo06_register_account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // chuyen sang trang jsp: senRedirect, k truyen du lieu
//        response.sendRedirect("employee_list.jsp");
        // chuyen trang jsp, dung forward, co truyen du lieu
        request.setAttribute("employeeName", "Tran Nam");
        request.setAttribute("age", 18);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee_list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
