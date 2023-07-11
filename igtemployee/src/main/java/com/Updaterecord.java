package com;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updaterecord {

public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        Employee e = session.get(Employee.class, id);
        e.setName(e.getName());
    
        e.setUsalary(salary);
        e.setDesig(e.getDesig());

        session.update(e);
        tx.commit();
        System.out.println("Record updated successfully.");
        session.close();
        factory.close();
    }

}