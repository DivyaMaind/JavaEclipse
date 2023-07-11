package com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	
	private List<String>answer;
	private Set ph;
	
	public Question(int id, String name, List<String> answer, Set ph){ 

		this.id = id;
		this.name = name;
		this.answer= answer;
		this.ph = ph;
	}
	public void display()
	{
	System.out.println(id+" : "+name);
	System.out.println("Answer....");
	
	Iterator i = answer.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("Number....");
	
	Iterator phone = ph.iterator();
	while(i.hasNext()) {
		System.out.println(phone.next());
	}
	
	}
}
