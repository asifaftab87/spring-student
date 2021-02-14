package org.la.student.tahir.clas;

public class State {

	public static String StatName;
	public String InstName;
	
	
	public static void statMethod() {
	
		System.out.println("This is static method");
	}
	
	public void instMethod() {
		
		System.out.println("This is instance method");
		statMethod();
	}
}
