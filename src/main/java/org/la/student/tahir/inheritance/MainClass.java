package org.la.student.tahir.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		Myclass m = new Myclass();
		System.out.println("Referencing a superclass object using a superclass variable : " + m.i);
		m.f();
		
	 m = new YourClass();
		
	System.out.println("Referencing a subclass object using a superclass variable : " + m.i);
	m.f();
		
	}

}
