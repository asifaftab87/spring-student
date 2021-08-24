package org.la.student.sajid.inherit;

public class BMain {
	public static void main(String[] args) {
		B b =new B();
		b.bMeth();      // only method inside B class
		// coming from A class
		b.publ();
		b.deflt();
		b.protect();
	
	}
	
}
