package com;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Emp {
    void insert() {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee e = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

 
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Designation: ");
        String desig = sc.next();

        e.setUid(id);
        e.setName(name);
        e.setUsalary(salary);
        e.setDesig(desig);

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

    void update() {

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
    }

    void delete() {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee e = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        e.setUid(id);

        session.delete(e);
        tx.commit();

        System.out.println("Deleted");
    }

    static void display() {


        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        List emp = session.createQuery("from Employee").list();
        Iterator i = emp.iterator();

        while(i.hasNext()) {

            Employee e = (Employee)i.next();
            System.out.println(e.getUid());
            System.out.println(e.getName());
            System.out.println(e.getSalary());
            System.out.println(e.getDesig());
        }

    }
}

public class Project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 0;

        do {

            System.out.println("1. insert");
            System.out.println("2. update");
            System.out.println("3. delete");
            System.out.println("4. display");
            System.out.println("5. exit");

            System.out.println("enter your choice: ");
            c = sc.nextInt();

            Emp e = new Emp();

            switch(c) {

            case 1:
                 e.insert();
                 break;
            case 2:
                e.update();
                break;
            case 3:
                e.delete();
                break;

            case 4:
                Emp.display();
                break;    
            }
        } while (c < 5);
    }

}