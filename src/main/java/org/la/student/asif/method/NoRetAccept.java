package org.la.student.asif.method;

public class NoRetAccept {
	
	public static void main(String[] args) {
		
		System.out.println("Main start");
		
		method1(true, 33);
		
		System.out.println("main end");
	}
	
	static void method1(boolean i, int j) {
		System.out.println("Hello world: "+i+"  "+j);
	}
	
}
