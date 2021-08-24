package org.la.student.sajid.cls;

public class Country {
	public static String name;
	public String code;
	

	public static void statcMethod() {
		System.out.println("this is static mehtod and called by class name,can call by object but not preferable");
		
	}
	public void instMethod() {
		System.out.println("this is intance method can only be called by object");
	}

}
