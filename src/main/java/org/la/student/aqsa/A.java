package org.la.student.aqsa;



public class A {

	public void methP1() {
		
		System.out.println("1st method of parent class");
	}

	public void methP2() {
		methP1();
		System.out.println("2nd method of parent class");
	}

	public void methP3() {
		 methP2();
	System.out.println("3rd method of parent class");
}

}

