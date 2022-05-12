package com.javaee.project.authorization_project;

import com.javaee.project.internet_shop.Cart;
import com.javaee.project.internet_shop.ShopServlet;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AuthServlet", urlPatterns = {"/auth-servlet"})
public class AuthServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(AuthServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            //response for UNAUTHORIZED user
        } else {
            //response for AUTHORIZED user
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }

}
