package com.data.demo05_life_cycle;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    // giai doan khoi tao chay 1 lan duy nhat
    public void init() {
        System.out.println("Run in init method");
        message = "Hello World!";
    }

    // doget, do post: thuc thi khi co request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Run giai doan thuc thi; goi method do get");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    // giai doan huy, goi khi stop server
    public void destroy() {
        System.out.println("Run giai doan huy; goi method destroy");
    }
}