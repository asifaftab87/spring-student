package org.la.student.asif.clas;

public class State {
	
	public static String statName;
	public String instCode;

	public static void statMethod() {
		System.out.println("this is static method");
		
	}
	
	public void instMethod() {
		System.out.println("This instance method");
		statMethod();
	}

}
