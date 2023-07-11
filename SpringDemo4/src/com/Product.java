package com;

public class Product {
	private int pid;
	private String pname;
	private int price;
	private String pdesp;
	public Product(int pid, String pname, int price, String pdesp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pdesp = pdesp;
	}
	
	void display() {
		System.out.println("ID :"+pid);
		System.out.println("Name :"+pname);
		System.out.println("Price :"+price);
		System.out.println("Description :"+pdesp);
		
	}

}
