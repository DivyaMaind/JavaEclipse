package com;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class readrecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//Employee e=session.load(Employee.class, 100);
        //System.out.println("=============");
       // System.out.println("uID :"+e.getUid());
        //System.out.println("uName :"+e.getName());
        //System.out.println("udesig :"+e.getDesig());
        //System.out.println("usalary :"+e.getSalary());
		
		List emp= session.createQuery("from Employee").list();
		Iterator i= (emp).iterator();
		while(i.hasNext()) {
			Employee e=(Employee)i.next();
			System.out.println(e.getUid());
			System.out.println(e.getName());
			System.out.println(e.getDesig());
			System.out.println(e.getSalary());
			System.out.println("=======================");
			
			
		}

	}
	}


