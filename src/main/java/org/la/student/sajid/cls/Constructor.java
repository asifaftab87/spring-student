package org.la.student.sajid.cls;

public class Constructor {
	
	private int id;
	private String name;
	private String email;
	private int mobile;
	
	//default Constructor,parameter less Constructor, No pass argument
	public Constructor() {
		System.out.println("object create");
		id=2;
		name="sajid";
		email="sjd@gmail.com"; 
		mobile=95694;
	}
	//Parameterized constructor, pass arguments
	public Constructor(int i, String s, String s2, int j) {
		System.out.println("object create");
		id=i;
		name=s;
		email=s2;
		mobile=j;
		
	}
	
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String e) {
		email=e;
	}
	public String getEmail() {
		return email;
	}
	
	public void setMobile(int m) {
		mobile=m;
	}
	public int getMobile() {
		return mobile;
	}
	
	public void display() {
		System.out.println("Id "+id+", Name "+name+", Email "+email+", mobile "+mobile);
	}

}
