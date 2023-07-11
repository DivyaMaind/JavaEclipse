package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Deposit extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		int amt = Integer.parseInt(request.getParameter("amt"));
		
		PrintWriter out = response.getWriter();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
			
			PreparedStatement p = con.prepareStatement("update account set inb = inb+? where id = ?");
			
			p.setInt(1, amt);
			p.setInt(2, id);
			
			p.execute();
			p.close();
			
			out.print("<h1>");
			out.print("Deposited Amount: " + amt + "<br>");

			out.print("<a href='Index.html'>Home page</a>");
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
