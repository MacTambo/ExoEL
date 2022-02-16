package com.example.exoel;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("txtLogin");
        String password = request.getParameter("txtPwd");
        if (login == null) login = "";
        if (password == null) password = "";

        HttpSession session = request.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("password", password);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("txtLogin");
        String password = request.getParameter("txtPwd");
        String messageMdp = request.getParameter("messageMdp");
        String mdpIncorrect = "Identifiant ou mot de passe incorrect.";

        HttpSession session = request.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("password", password);

        if(login.equals("Arthur") && password.equals("arthur"))
        {
            request.getRequestDispatcher("/vueArticle.jsp").forward(request, response);
            session.setAttribute("isConnected", true);
        }
        else {
            session.setAttribute("isConnected", false);
            request.setAttribute("messageMdp", mdpIncorrect);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}