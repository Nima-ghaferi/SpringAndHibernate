package com.nemo.testdb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "TestDbServlet", value = "/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "springstudent";
        String password = "springstudent";
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSl=false";
        String driveClassName = "com.mysql.jdbc.Driver";

        try {
            PrintWriter out = response.getWriter();
            out.println("Connecting to data base" + jdbcUrl);
            Class.forName(driveClassName);
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            out.println("Successful");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }

}
