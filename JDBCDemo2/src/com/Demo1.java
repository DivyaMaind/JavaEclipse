package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		//java to database
		//5 steps
		//1- Load the driver
		//2- create the connection
		//3- create statement
		//4- execute the statement 
		//5- close the connection
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root","Divya29");
Statement s = con.createStatement();
s.execute("insert into employee values(200, 'Divya',22,6000,'devloper')");
s.close();

System.out.println("data inserted sucessfully..! ");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}