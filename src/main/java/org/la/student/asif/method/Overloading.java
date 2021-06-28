package org.la.student.asif.method;

public class Overloading {

	public void sum(int x, int y) {
		System.out.println("sum: "+(x+y));
	}
	
	public void sum(int a, int b, int c) {
		System.out.println("sum: "+(a+b+c));
	}
	
	public void sum(boolean x, boolean y) {
		System.out.println("This is boolean method");
	}
	
	public void sum(boolean x, int y) {
		System.out.println("This is boolean method");
	}
	
	public void sum(int x, boolean y) {
		System.out.println("This is boolean method");
	}
	
	public void sum() {
		System.out.println("no argument method");
	}
}


