package org.la.student.sajid.method;

public class OverLoadingMethod {
	public static void main(String[] args) {
		fun();
		fun(55);
		fun(true);
		fun("Sajid");
		fun(45.02);
		
	}
	static void fun() {
		System.out.println("Check Fun Method");
		
	}
	static void fun(int a) {
		System.out.println("Check fun int "+a);
		
	}
	static void fun(boolean c) {
		System.out.println("Check fun boolean "+c);
	
	}
	static void fun(String a) {
		System.out.println("Check Fun String "+a);
	
	}
	static void fun(double d) {
		System.out.println("Check Fun Double "+d);
	
	}
}
