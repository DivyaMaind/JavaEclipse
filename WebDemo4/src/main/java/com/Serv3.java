package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv3
 */
public class Serv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv3() {
        super();
        // TODO Auto-generated constructor stub
    }


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {

				 ServletContext context=getServletContext();
	             String driver=context.getInitParameter("driver");
	             String url=context.getInitParameter("url");
	             String username=context.getInitParameter("username");
	             String password=context.getInitParameter("password");

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

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
