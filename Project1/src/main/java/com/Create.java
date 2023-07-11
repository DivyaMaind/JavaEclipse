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


public class Create extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		//int acc = Integer.parseInt(request.getParameter("acc"));
		String acc = request.getParameter("acc");
		String ifsc = request.getParameter("ifsc");
		String pan = request.getParameter("pan");
		//int phn = Integer.parseInt(request.getParameter("phn"));
		//int adr = Integer.parseInt(request.getParameter("adr"));
		String phn = request.getParameter("phn");
		String adr = request.getParameter("adr");
		int inb = Integer.parseInt(request.getParameter("inb"));
		
		PrintWriter out = response.getWriter();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
			
			PreparedStatement p = con.prepareStatement("insert into account values(?, ?, ?, ?, ?, ?, ?, ?)");
			
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, acc);
			p.setString(4, ifsc);
			p.setString(5, pan);
			p.setString(6, phn);
			p.setString(7, adr);
			p.setInt(8, inb);
			
			p.execute();
			p.close();
			
			out.print("<h1>");
			out.print("Id: " + id + "<br>");
			out.print("Name: " + name + "<br>");
			out.print("Account No: " + acc + "<br>");
			out.print("IFSC: " + ifsc + "<br>");
			out.print("PAN: " + pan + "<br>");
			out.print("Phone No: " + phn + "<br>");
			out.print("Aadhar: " + adr + "<br>");
			out.print("Initial Balance: " + inb + "<br>");
			

			out.print("<a href='Index.html'>Home page</a>");
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
