package org.la.student.asif.clas;

public class AdminMain {

	public static void main(String[] args) {
		
		Admin admin = new Admin();
		admin.setId(13);
		admin.setName("jain");
		admin.setPwd("password");
		
		//admin.display();
		int id = admin.getId();
		String name = admin.getName();
		String password = admin.getPwd();
		System.out.println("id: "+id);
		System.out.println("pwd: "+password);
		System.out.println("name: "+name);
	}
}
