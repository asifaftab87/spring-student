package org.la.student.barry.clas;

public class AdminMain {

	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setId(1);
		admin.setName("aicha");
		admin.setPwd("password");
		
		admin.display();
		
		int id = admin.getId();
		String name= admin.getName();
		String password = admin.getPwd();
		System.out.println("id: "+id);
		System.out.println("pwd: " + password);
		System.out.println("name: "+name);

	}

}
