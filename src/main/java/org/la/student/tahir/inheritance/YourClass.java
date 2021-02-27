package org.la.student.tahir.inheritance;

public class YourClass extends Myclass {
	int i=1000;
	
	void f(){
		
		System.out.println("Inside f() of YourClass, i:" +i);
		System.out.println("Inside f() of YourClass, super.i: " + super.i);
		
		
	}
}
