package org.la.student.sajid.method;

public class MathsMethod {
	public static void main(String[] args) {
		int a=5,b=6;
		System.out.println("sum  of two number "+sum(a,b));
		sub(a,b);
		System.out.println("prod value: "+prod());
		disp();
		System.out.println("end of method");
		
	}
	
	static int sum(int x,int y) {
		return x+y;
	}
	static void sub(int x,int y) {
		System.out.println("sub: "+(x-y));
	}
	static int prod() {
		int i=5,j=6;
		int prod=i*j;
		return prod;
	}
	
	static void disp() {
		System.out.println("simple disp method");
	}
}
