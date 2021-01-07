package org.la.student.noura.method;

public class SimpleMethod {
	
	
	public static void main(String[] r) {
		
		fun();
		System.out.println("this is main method start");
		
		method1(1);
		
		System.out.println("this is main method end");
	

	}
	
	static void fun() {
		
		System.out.println("this is fun method");
	}
	static void method1(int a) {
		System.out.println("value of argument a: "+a);
	}

}
