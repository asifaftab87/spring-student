package org.la.student.noura.method;

public class Maths {

	public static void main(String[] args) {

		
		int a =5, b=2;
		
		System.out.println("sum of two numbers; "+sum(a,b));
        sub(a,b);
        
        int m=prod();
        System.out.println(m);
        
	
	}

	static int sum(int x,int y) {
		
		return x+y;
	}
	
	static void sub(int x, int y) {
		System.out.println("subtract: "+(x-y));
	}
	static int prod() {
	int i=5, k=6;
	
	return i*k;
	}
	
	static void disp() {
		System.out.println("simple display method");
	}
}
