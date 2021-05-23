package org.la.student.asif.method;

public class MethodThree {

	public static void main(String[] args) {
		System.out.println("main start");
		int val = display();
		System.out.println("main end: "+val);
	}
	
	static int display() {
		int i = 9;
		System.out.println("value: "+i);
		return i*10;
	}
	
}
