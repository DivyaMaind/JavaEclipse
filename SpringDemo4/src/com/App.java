package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext contex= new ClassPathXmlApplicationContext("applicationContext.xml");
		Product p = (Product)contex.getBean("pro");
		p.display();
	}

}

