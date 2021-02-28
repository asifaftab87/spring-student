package org.la.student.noura.clas;

public class Student {

	
	private int id;
	private String name;
	private String email;
	private String mobile;
	
	//default constructor, parameter less constructor
	public Student() {
		System.out.println("object created");
		id = -1;
		name = "";
		email = "";
		mobile = "";
		
	}
	
	//parameterized constructor
	public Student(int i, String n, String e, String string) {
		System.out.println("object created");
		id = i;
		name = n;
		email = e;
		mobile = string;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void display() {
		System.out.println("id: "+id+"  name: "+name+"  email: "+email+"  mobile: "+mobile);
	}
	
}
