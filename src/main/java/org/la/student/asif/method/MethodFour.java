package org.la.student.asif.method;

public class MethodFour {

	public static void main(String[] args) {
		System.out.println("main start");
		int val = bothMethod(true);
		System.out.println("main end: "+val);
	}
	
	static int bothMethod(boolean b) {
		int i = 9;
		System.out.println("display value: "+b);
		return i*10;
	}
	
}
