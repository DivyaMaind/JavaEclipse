package com;
import java.util.*;
import java.sql.*;
abstract class A {

    int id;
    String name;
    int age;
    int salary;
    String des;

    Scanner sc=new Scanner(System.in);

    A() {
        try {

            System.out.println("Enter id:");
            id = sc.nextInt();

            System.out.println("Enter the Name:");
            name = sc.next();

            System.out.println("Enter Age:");
            age = sc.nextInt();        
        }    
        catch(Exception e) {
            System.out.println(e);
        }

    }

     public void display() {     

         System.out.println("ID:"+id);    
         System.out.println("NAME:"+name);    
         System.out.println("AGE:" +age);
        System.out.println("SALARY:" +salary);    
        System.out.println("DESIGNATION:"+des);         
    }
}

final class Clerk extends A {

    public Clerk() {

        salary=10000;
        des="Clerk";
    }

    
}

final class Programmer extends A {

    public Programmer() {

        salary=15000;
        des="Programmer";
    }
 
}

final class Manager extends A {

    public Manager() {

        salary=20000;
        des="Manager";
    }

 
}
final class Tester extends A {

    public Tester() {

        salary=30000;
        des="Tester";
    }  
}
public class P1 {

    public static void main(String[] args) {

        int c, c1;
        Scanner sc = new Scanner(System.in);

        try {

            do {

                System.out.println("1. create");
                System.out.println("2. read");
                System.out.println("3. update");
                System.out.println("4. delete");
                System.out.println("5. exit");
                System.out.println("Enter your choice: ");
                c = sc.nextInt();

                if(c == 1) {

                    do {

                        System.out.println("1. clerk");
                        System.out.println("2. developer");
                        System.out.println("3. manager");
                        System.out.println("4. tester");
                        System.out.println("5. exit");
                        System.out.println("Enter your choice: ");

                        c1 = sc.nextInt();


                        if(c1 == 1) {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                            PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?);");

                            Clerk cl = new Clerk();

                            p.setInt(1, cl.id);
                            p.setString(2, cl.name);
                            p.setInt(3, cl.age);
                            p.setInt(4, cl.salary);
                            p.setString(5, cl.des);

                            p.execute();
                            p.close();
                        } else if(c1 == 2) {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                            PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?);");

                            Programmer pr = new Programmer();

                            p.setInt(1, pr.id);
                            p.setString(2, pr.name);
                            p.setInt(3, pr.age);
                            p.setInt(4, pr.salary);
                            p.setString(5, pr.des);

                            p.execute();
                            p.close();
                        } else if(c1 == 3) {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                            PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?);");

                            Manager ma = new Manager();

                            p.setInt(1, ma.id);
                            p.setString(2, ma.name);
                            p.setInt(3, ma.age);
                            p.setInt(4, ma.salary);
                            p.setString(5, ma.des);

                            p.execute();
                            p.close();
                        }else if(c1 == 4) {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                            PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?);");

                            Tester te = new Tester();

                            p.setInt(1, te.id);
                            p.setString(2, te.name);
                            p.setInt(3, te.age);
                            p.setInt(4, te.salary);
                            p.setString(5, te.des);

                            p.execute();
                            p.close();
                        }

                    }while(c1 != 5);

 

                } else if(c == 2) {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                    Statement s = con.createStatement();
                    ResultSet r = s.executeQuery("select * from employee");

                    while(r.next()) {
                        System.out.println(r.getInt(1) + ":" + r.getString(2) + ":" + r.getInt(3) + ":" + r.getInt(4) + ":" + r.getString(5) + ":");
                    }
                } else if(c == 3) {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                    PreparedStatement p = con.prepareStatement("update employee set name = ?, age = ?, salary = ?, desig = ? where id = ?");

                    System.out.println("Enter id: ");
                    int id = sc.nextInt();

                    System.out.println("Enter name: ");
                    String name = sc.next();

                    System.out.println("Enter age: ");
                    int age = sc.nextInt();

                    System.out.println("Enter salary: ");
                    int sal = sc.nextInt();

                    System.out.println("Enter designation: ");
                    String des = sc.next();

                    p.setInt(5, id);

                    p.setString(1, name);
                    p.setInt(2, age);
                    p.setInt(3, sal);
                    p.setString(4, des);

                    p.execute();
                    p.close();
                } else if(c == 4) {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

                    PreparedStatement p = con.prepareStatement("delete from employee where id = ?");

                    System.out.println("Enter id: ");
                    int id = sc.nextInt();

                    p.setInt(1, id);

                    p.execute();
                    p.close();
                }

            } while (c != 5);
        }
        catch(Exception e) {

            System.out.println(e);
        }
    }
}
