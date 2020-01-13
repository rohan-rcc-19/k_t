package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
	
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/demoproj";
		
		String dbName = "demoproj";
		String dbUsername = "root";
		String dbPassword = "12345";
		
		Class.forName(dbDriver);
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		return conn;
	}
}
