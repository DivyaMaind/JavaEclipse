package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Check extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");
			
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery("select * from account");
			
			out.print("<h4>");
			out.print(" id : name : acoount number : ifsc code : pan card : phone number : address : balance ");
			
			while(r.next()) {
				
				out.print(r.getInt(1) + r.getString(2) + r.getString(3) + r.getString(4) + r.getString(5) + r.getString(6) + r.getString(7) + r.getInt(8));
				out.print("<br>");
			}
			
			out.print("</h4>");

			out.print("<a href='Index.html'>Home page</a>");
		} catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
