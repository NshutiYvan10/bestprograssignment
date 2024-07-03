package org.example.demo3;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        String i = request.getParameter("stuname");
        String j = request.getParameter("stid");

        PrintWriter out = response.getWriter();

        out.println("Student Information");
        out.println("====================");
        out.println("Student name: "+i);
        out.println("Student ID: "+j);

    }

    public void destroy() {
    }
}