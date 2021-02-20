package org.la.student.aqsa;

public class B extends A {
	@Override
public void methP1() {
		
		System.out.println("1st method of parent class");
	}

	@Override
	public void methP2() {
		methP1();
		System.out.println("2nd method of parent class");
	}

	@Override
	public void methP3() {
		 methP2();
	System.out.println("3rd method of parent class");
}

//	@Override---> writing @Override here gives error because methC1() is not an overriden method 
	public  void methC1() {
	 System.out.println("1st method of child class B");
	 
 }
	public  void methC2() {
		methC1();
		 System.out.println("2nd method of child class B");
		 
	 }
}