package com.javaee.project.project_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private static final String QUERY_SELECT = "SELECT title FROM books";

    public List<String> findAllTitles() throws SQLException, ClassNotFoundException {

        List<String> titles = new ArrayList<>();
        Connection connection = DBHelper.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(QUERY_SELECT);
        while(resultSet.next()){
            titles.add(resultSet.getString("title"));
        }
        return titles;
    }
}
