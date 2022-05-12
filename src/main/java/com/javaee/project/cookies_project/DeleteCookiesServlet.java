package com.javaee.project.cookies_project;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteCookiesServlet", urlPatterns = {"/delete-cookies-servlet"})
public class DeleteCookiesServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(DeleteCookiesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        String cookieName = request.getParameter("cookie");
        if (cookieName != null) {
            Cookie cookie = new Cookie(cookieName,"");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }
}
