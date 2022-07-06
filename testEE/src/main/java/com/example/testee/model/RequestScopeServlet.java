package com.example.testee.model;

import com.example.testee.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request")
public class RequestScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("playlist","servlet & JSP");
        req.setAttribute("user",new User("saad","Haimeur"));
       // req.getRequestDispatcher("/result").forward(req,resp);
        resp.sendRedirect("result");
    }
}
