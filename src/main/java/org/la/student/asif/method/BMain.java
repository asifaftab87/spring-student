package org.la.student.asif.method;

public class BMain {

	public static void main(String[] args) {
		
		B b = new B();
		b.bMethodDP();	//B class
		
		//A cass
		b.publ();
		//b.deflt(); default method can't access different package
		
		//b.protect();
	}
}
