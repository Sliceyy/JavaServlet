package com.agent;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello");
        System.out.println("执行doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
