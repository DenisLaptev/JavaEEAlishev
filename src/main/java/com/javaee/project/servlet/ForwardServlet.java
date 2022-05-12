package com.javaee.project.servlet;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ForwardServlet", urlPatterns = {"/forward-servlet"})
public class ForwardServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(ForwardServlet.class);

    private static final String URL_FOR_FORWARD_JSP = "/views/forForward.jsp";


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(URL_FOR_FORWARD_JSP);
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }

}
