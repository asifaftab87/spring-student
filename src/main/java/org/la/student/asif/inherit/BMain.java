package org.la.student.asif.inherit;

public class BMain {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.bMeth();		//only method inside B class
		
		//coming from A class
		b.publ();
		b.deflt();
		b.protect();
	}
}
