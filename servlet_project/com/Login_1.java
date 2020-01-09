package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_1
 */
@WebServlet("/Login_1")
public class Login_1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
		String uName = request.getParameter("userName");
		String pAssword = request.getParameter("passWord");
		
		if(uName.equals("admin") && pAssword.equals("1234"))
			response.sendRedirect("Input_Details_1.jsp");
		else
			response.sendRedirect("login_1.jsp");
		}
		catch(Exception e) {
			System.err.print(e);
		}
	}

}
