package com.example.testee.model;

import com.example.testee.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username = req.getParameter("username");
       String password = req.getParameter("password");

       if ("shaimeur".equalsIgnoreCase(username) && "1234".equalsIgnoreCase(password)){
           HttpSession session = req.getSession();
           session.setAttribute("isLoggedIn",true);
           session.setAttribute("user",new User(username,password));
           resp.sendRedirect("result");

       }else {
           resp.sendRedirect("login");
       }
    }
}
