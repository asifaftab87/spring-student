package org.la.student.asif.method;

public class SimpleMethod {

	static void method1(char a) {
		
		System.out.println("method1 value of argument a: "+a);
	}

	public static void main(String[] j) {
		
		System.out.println("this is main method start");
		
		fun();
		
		method2(22, 65.3);
		
		char d = '$';
		method1(d);

		float u = div();
		
		System.out.println("main return value: "+u);
		
		boolean b = diff(2);
		System.out.println("from diff method: "+b);
	}
	
	static boolean diff(int i) {
		
		return i==2;
	}
	
	static float div() {
		
		float y = 4.33f;
		System.out.println("this is div method");
		return y;
	}
	
	static void fun() {
		System.out.println("This is fun method");
	}
	
	static void method2(int a, double s) {
		
		System.out.println("method2 value of argument a: "+a + "    double: "+s);
	}
	
}
