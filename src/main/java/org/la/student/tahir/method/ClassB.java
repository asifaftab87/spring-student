package org.la.student.tahir.method;

import org.la.student.tahir.inheritance.ClassA;

public class ClassB extends ClassA{

	public void ClassBMDfP() {
		
		System.out.println("ClassBMDfP is a method from different package");
		protecte();
	//	deflt(); not accessible from different package cos it's default
	//	priv(); not accessible outside its class cos it's private
		pub();
		
	}
}
