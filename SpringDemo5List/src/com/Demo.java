package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.hsqldb.lib.HashSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("per");
		
		String[] hb =p.getHobbies();
		
		System.out.println("1st sem subject are");
		for (String s : hb) {
			System.out.println("    "+s);
		}
		
		ArrayList<String> em = p.getEmails();
		System.out.println("Emails are");
		for (String s : em) {
			System.out.println("    "+s);
		}
		
		java.util.HashSet<String> ph = p.getPhones();
		System.out.println("Phones are");
		for (String s : ph) {
			System.out.println("    "+s);
		}
		
		HashMap<String, String> ed = p.getEducation();
		System.out.println("Education details are");
		Iterator it = ed.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println("    "+it.next());
		}
		
		
	}

}
