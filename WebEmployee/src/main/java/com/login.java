package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if (name.equalsIgnoreCase("Divya")&& pass.equalsIgnoreCase("Divya@123")){
			//out.print("Logged in");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request,response);
		}
		else{
			out.print("<p style='color:red'>Please try once again</p>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request,response);
		}
	}

}
