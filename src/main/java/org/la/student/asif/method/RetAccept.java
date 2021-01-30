package org.la.student.asif.method;

public class RetAccept {
	
	public static void main(String[] args) {
		
		System.out.println("Main start");
		
		char ss = method1(false);
		
		System.out.println("main end ss  "+ss);
	}
	
	static char method1(boolean b) {
		System.out.println("Hello world: "+b);
		
		return 'a';
	}
	
	
}
