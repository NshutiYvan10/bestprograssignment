package org.example.demo3;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    private String message;

    public void init() {
        message = "Hello World!";
        logger.info("Servlet initialized with message: {}", message);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String i = request.getParameter("stuname");
        String j = request.getParameter("stid");

        logger.info("Received POST request with parameters: stuname={}, stid={}", i, j);

        PrintWriter out = response.getWriter();
        out.println("Student Information");
        out.println("====================");
        out.println("Student name: " + i);
        out.println("Student ID: " + j);
    }

    public void destroy() {
        logger.info("Servlet is being destroyed");
    }
}