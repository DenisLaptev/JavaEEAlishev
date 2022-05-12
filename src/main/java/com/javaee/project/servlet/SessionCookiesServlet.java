package com.javaee.project.servlet;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionCookiesServlet", urlPatterns = {"/session-cookies-servlet"})
public class SessionCookiesServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(SessionCookiesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        //HttpSession session = request.getSession();

//        if (count == null) {
//            count = 1;
//            session.setAttribute("count", count);
//        } else {
//            session.setAttribute("count", count + 1);
//        }
//
//        PrintWriter pw = response.getWriter();
//        pw.println("<html>");
//        pw.println("<h1>Your count is: " + count + "</h1>");
//        pw.println("</html>");

        //count how many times user visits the page
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/forSessionCookies.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }

}

