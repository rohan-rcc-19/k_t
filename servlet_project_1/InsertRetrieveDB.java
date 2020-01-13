package com;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement; 
  
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
  
// Import Database Connection Class file 
import com.DBConnection;

public class InsertRetrieveDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     String title = "Database Result";
		
	     String docType =
	             "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	          
	     out.println(docType +
	             "<html>\n" +
	             "<head><title>" + title + "</title></head>\n" +
	             "<body bgcolor = \"#f0f0f0\">\n" +
	             "<h1 align = \"center\">" + title + "</h1>\n");
	          
		try {
			Connection conn = DBConnection.initializeDatabase();
			
			PreparedStatement ps = conn.prepareStatement("select id, string from demo");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String string = rs.getString("string");
				
				out.println("ID : " + id + "<br>");
				out.println("String : " + string + "<br>");
			}
			out.println("</body></html>");
			rs.close();
			conn.close();
		} catch(SQLException se) {	se.printStackTrace();	}
		catch(Exception e) {	e.printStackTrace();	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection conn = DBConnection.initializeDatabase();
			
			PreparedStatement st = conn.prepareStatement("insert into demo values(?, ?)");
			
			st.setInt(1, Integer.valueOf(request.getParameter("id")));
			st.setString(2, request.getParameter("string"));
			
			st.executeUpdate();
			
			st.close();
			conn.close();
			
			PrintWriter out = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted" + "</b></body></html>"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}
}
