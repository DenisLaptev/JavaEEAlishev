package com.javaee.project.cookies_project;

import com.javaee.project.authorization_project.AuthServlet;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "SetCookiesServlet", urlPatterns = {"/set-cookies-servlet"})
public class SetCookiesServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(SetCookiesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        Cookie cookie1 = new Cookie("name1", "value1");
        cookie1.setMaxAge(24 * 60 * 60);

        Cookie cookie2 = new Cookie("name2", "value2");
        cookie2.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }
}
