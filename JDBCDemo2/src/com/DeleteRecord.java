package com;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

            PreparedStatement p = con.prepareStatement("delete from employee where id=?");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter id: ");
            int id = sc.nextInt();

         
            p.setInt(1, id);
            p.execute();
            p.close();
            System.out.println("data inserted sucessfully..! ");

        } catch(Exception e) {

            System.out.println(e);
        }

    }
}


