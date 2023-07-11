package com;

import java.sql.*;
import java.util.Scanner;

public class ReadRecord {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

            Statement p = con.createStatement();
            ResultSet rs = p.executeQuery("select * from employee");
            while(rs.next()) {
            	System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5)+":");
            }
           
        } catch(Exception e) {

            System.out.println(e);
        }

    }
}


