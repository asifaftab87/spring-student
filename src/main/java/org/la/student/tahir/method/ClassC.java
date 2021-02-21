package org.la.student.tahir.method;

import org.la.student.tahir.inheritance.ClassA;

public class ClassC extends ClassA{

	public void ClassCMDfP() {
		
		System.out.println("ClassCMDfP is a method from different package");
		protecte();
	//	deflt(); not accessible from different package cos it's default
	//	priv(); not accessible outside its class cos it's private
		pub();
		
	}
}
