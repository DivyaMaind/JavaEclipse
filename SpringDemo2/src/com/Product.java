package com;

public class Product {

	private int pid;
	private String pname;
	private int price;
	private String pdesp;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPdesp() {
		return pdesp;
	}

	public void setPdesp(String pdesp) {
		this.pdesp = pdesp;
	}

	public void display() {
		System.out.println(pid + " " + pname + " " + price + " " + pdesp);
	}

}
