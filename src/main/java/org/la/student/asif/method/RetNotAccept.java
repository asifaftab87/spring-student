package org.la.student.asif.method;

public class RetNotAccept {
	
	public static void main(String[] args) {
		
		System.out.println("Main start");
		
		char ss = method1();
		
		System.out.println("main end ss  "+ss);
	}
	
	static char method1() {
		System.out.println("Hello world");
		
		return 'a';
	}
	
	
}
