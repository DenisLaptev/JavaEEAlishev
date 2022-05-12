package com.javaee.project.cookies_project;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetCookiesServlet", urlPatterns = {"/get-cookies-servlet"})
public class GetCookiesServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(GetCookiesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        Cookie[] cookies = request.getCookies();

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        for (Cookie cookie : cookies) {
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        }
        pw.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }
}
