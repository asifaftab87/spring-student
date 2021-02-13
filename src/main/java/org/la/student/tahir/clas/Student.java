package org.la.student.tahir.clas;

public class Student {

	private int id;
	private String name;
	private String email;
	private String mobile;
	
	//parameterless constructor
	
	public Student() {
		
		id= 01;
		name="";
		email="";
		mobile= "....";
		
	}
	
	
	//parametrized costructor
	
	public Student(int a, String b, String c, String d) {
		
		id=a;
		name=b;
		email=c;
		mobile=d;
		
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
		this.name= name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email= email;
	}
	
	public String getMobile() {
		return mobile;
		
	}
	
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
	
	
	public void display() {
		System.out.println("id: "+id+"  name: "+name+"  email: "+email+"  mobile: "+mobile);
	}
}
