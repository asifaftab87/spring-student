package org.la.student.rasheed.clas;

public class AdminMain {

	public static void main(String[] args) {
		
		
		Admin admin = new Admin();
		admin.setId(13);
		admin.setName("abdul");
		admin.setPwd("password");
		
		//admin.display();
		int id = admin.getId();
		String password = admin.getPwd();
		String name = admin.getName();
		System.out.println("id: "+id);
		System.out.println("pwd: "+password);
		System.out.println("name: "+name);
		

	}
}
