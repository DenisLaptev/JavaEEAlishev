package com.javaee.project.project_jdbc;

import java.sql.SQLException;
import java.util.List;

public class BookService {

    BookDAO bookDAO;

    public BookService() {
        bookDAO = new BookDAO();
    }

    public List<String> findAllTitles() throws SQLException, ClassNotFoundException {
        return bookDAO.findAllTitles();
    }
}
