package com.javaee.project.project_jdbc;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BookServlet", urlPatterns = {"/book-servlet"})
public class BookServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(BookServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");

        PrintWriter pw = response.getWriter();

        BookService bookService = new BookService();

        List<String> titles = new ArrayList<>();
        try {
            titles = bookService.findAllTitles();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (String title : titles) {
            pw.println("title=" + title);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost process");
        doGet(request, response);
    }
}

