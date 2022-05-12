package com.javaee.project.internet_shop;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ShopServlet", urlPatterns = {"/shop-servlet"})
public class ShopServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(ShopServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();
        }

        cart.setName(name);
        cart.setQuantity(quantity);

        session.setAttribute("cart", cart);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/shop.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }

}
