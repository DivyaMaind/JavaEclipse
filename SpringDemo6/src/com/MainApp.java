package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext contex= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("============Setter and getter injection========");
		Employee e = (Employee)contex.getBean("emp");
		System.out.println(e); 
		
		System.out.println("============Constructor injection============");
		Product p = (Product)contex.getBean("pro");
		System.out.println(p); 
		
	}

}
