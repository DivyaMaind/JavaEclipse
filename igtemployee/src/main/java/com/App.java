package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter ID");
		//int uid = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter designation");
		String desig = sc.next();
		
		System.out.println("Enter salary");
		int usalary = sc.nextInt();
		
		System.out.println("Enter location");
		String location = sc.next();
		
		
		//e.setUid(uid);
		e.setName(name);
		e.setDesig(desig);
		e.setUsalary(usalary);
		
		
		session.save(e);
		tx.commit();
		
		System.out.println("Data inserted successfully...!");
	}

}

