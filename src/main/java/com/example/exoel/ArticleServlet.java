package com.example.exoel;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ArticleServlet", value = "/ArticleServlet")
public class ArticleServlet extends HttpServlet {
    Catalogue catalogue;
    int id = 0;

    public ArticleServlet() {
        super();
        catalogue = new Catalogue();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("vueArticle.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String btnpre = request.getParameter("btnpre");
        String btnsuiv = request.getParameter("btnsuiv");
        String articleAff = catalogue.getArticle(id).getNom();

        if (btnpre != null && id > 0) {
            id--;
        }
        if (btnsuiv != null && id < 3) {
            id++;
        } else {
            id = 0;
        }
        request.setAttribute("articleAff", articleAff);
        request.getRequestDispatcher("vueArticle.jsp").forward(request, response);
    }
}
