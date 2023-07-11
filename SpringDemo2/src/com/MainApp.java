package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext contex= new ClassPathXmlApplicationContext("applictionContext.xml");
		Product p = (Product)contex.getBean("pro");
		p.display();
	}

}