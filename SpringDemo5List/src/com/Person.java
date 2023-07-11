package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Person {
	private int pid;
	
	private String name;
	
	private String[] hobbies;
	
	private ArrayList<String> emails;
	
	private HashSet<String> phones;
	
	private HashMap<String, String> education;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public ArrayList<String> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}

	public HashSet<String> getPhones() {
		return phones;
	}

	public void setPhones(HashSet<String> phones) {
		this.phones = phones;
	}

	public HashMap<String, String> getEducation() {
		return education;
	}

	public void setEducation(HashMap<String, String> education) {
		this.education = education;
	}
	

	

}
