package org.la.student.sajid.method;

public class Method2 {
	public static void main(String[] args) {
		System.out.println("Start mein method");
		fun();
		num(44);
		float a=sum();
		System.out.println("Return valuse: "+a);
//		System.out.println("Return valuse: "+sum()); we can written 
		System.out.println("end main method");
	}
	
	static float sum() {
		float y=4.55f;
		System.out.println("this is sum method");
		return y;
	}
	
	static void fun() {
		System.out.println("This is fun method");
	}
	static void num(int a) {
		System.out.println("num of int: "+a);
	}

}
