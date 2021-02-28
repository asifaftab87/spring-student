package org.la.student.noura.inherit;

public class NewM {

	public static void main(String[] args) {


		//reference variable from 	A    but pointing to the b
		A a=new B(); //you cannot access the B methods...only parent methods
		
		a.deflt();
		a.protect();
		a.publ();
		
		
		
	}

}
