package org.la.student.asif.method;

public class Maths {

	public static void main(String[] args) {
		
		int a = 5, b = 2;
		
		System.out.println("Sum of two numbers: "+sum(a, b));
		
		sub(a, b);
		
		int p = prod();
		
		System.out.println("product: "+p);
		
		disp();
	}
	
	static int sum(int x, int y) {
		
		return x + y;
	}
	
	static void sub(int x, int y) {
		System.out.println("Subtract: "+(x-y));
	}
	
	static int prod() {
		int i = 5, k = 6;
		int prod = i * k;
		return prod;
	}
	
	static void disp() {
		System.out.println("simple display method");
	}
}
