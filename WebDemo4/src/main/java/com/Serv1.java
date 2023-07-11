package com;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

            ServletConfig config=getServletConfig();
             String driver=config.getInitParameter("driver");
             String url=config.getInitParameter("url");
             String username=config.getInitParameter("username");
             String password=config.getInitParameter("password");

            Class.forName(driver);
            Connection con= DriverManager.getConnection(url,username,password);
            java.sql.Statement stmt=con.createStatement();
            stmt.execute("insert into employee values(100,'Divya',20,60000,'Developer')");
            stmt.close();
            System.out.println("data inserted sucessfully...!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
		}
	}

	

