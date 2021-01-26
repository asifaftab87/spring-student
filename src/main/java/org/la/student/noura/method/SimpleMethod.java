package org.la.student.noura.method;

public class SimpleMethod {
	
	//method that accept value(arguments) but not returning value
	public static void main(String[] r) {
		
		fun();
		System.out.println("this is main method start");
		
		method1(1);
		
		System.out.println("this is main method end");
	
		method2(11,2.0);
		
	}
	
	static void fun() {
		
		System.out.println("this is fun method");
	}
	static void method1(int a) {
		System.out.println("value of argument a: "+a);
	}
	//here can accept more than one argument with different type
	static void method2(int a, double s) {
		System.out.println("method2 value of argument a: "+a+"  double: "+s);
	}

}
