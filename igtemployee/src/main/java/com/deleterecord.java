package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class deleterecord {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int uid = sc.nextInt();

		e.setUid(uid);
		
		session.delete(e);
		tx.commit();
		
		System.out.println("Data deleted successfully...!");
	}

}

