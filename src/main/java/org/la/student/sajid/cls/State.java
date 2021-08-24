package org.la.student.sajid.cls;

public class State {
	public static String statMethod;
	public String instMethod;
	
	public static void statMethod() {
		System.out.println("this is static method");
//		instMethod(); // Directly can not called
		State st=new State();
		st.instMethod();
	}
	public void instMethod() {
		System.out.println("this is instance method");
//		statMethod();
	}

}
