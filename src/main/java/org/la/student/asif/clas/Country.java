package org.la.student.asif.clas;

public class Country {
	
	public static String name;
	public String code;

	public static void statMethod() {
		System.out.println("this is static method and called by class name, can call by object but not preferable");
	}
	
	public void instMethod() {
		System.out.println("This is instance method can only be called by object");
	}

}
