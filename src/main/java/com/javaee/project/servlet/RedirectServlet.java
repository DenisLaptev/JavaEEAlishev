package com.javaee.project.servlet;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RedirectServlet", urlPatterns = {"/redirect-servlet"})
public class RedirectServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(RedirectServlet.class);

    private static final String URL_GOOGLE = "https://www.google.com";
    private static final String URL_FOR_REDIRECT_JSP = "/JavaEETest/views/forRedirect.jsp";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");
        //response.sendRedirect(URL_GOOGLE);
        response.sendRedirect(URL_FOR_REDIRECT_JSP);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }

}
