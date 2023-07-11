package com;

public class Product {
	private int id;
	private String pname;
	private int price;
	private String desc;
	public Product(int id, String pname, int price, String desc) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + ", desc=" + desc + "]";
	}
	public void display() {
		System.out.println(id + " " + pname + " " + price + " " + desc);
	}

}
