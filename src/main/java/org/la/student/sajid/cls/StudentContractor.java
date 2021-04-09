package org.la.student.sajid.cls;

public class StudentContractor {
	private int id;
	private String name;
	private String email;
	private String mobile;
	
//	Contractor
	public StudentContractor() {
		System.out.println("contractor objecet");
		id=9;
		name="Sajid";
		email="sjdali819@gmail.com";
		mobile="9534523397";
	}
//	Parameterized contractor
	public StudentContractor(int i,String n,String e,String m) {
		id=i;
		name=n;
		email=e;
		mobile=m;
	}
	public void setId(int x) {
		id=x;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName(){
		return name; 
	}
	public void setEmail(String e) {
		email=e;
	}
	public String getEmail() {
		return email;
	}
	public void setMobile(String m) {
		mobile=m;
	}
	public String getMobile() {
		return mobile;
	}
	public void dispaly() {
		System.out.println("id: "+id+" Name: "+name+" Email: "+email+" Mobile: "+mobile);
	}
	
}
