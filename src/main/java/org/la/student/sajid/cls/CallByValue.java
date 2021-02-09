package org.la.student.sajid.cls;

public class CallByValue {
	public static void main(String[] args) {
		int x=5;
		int y=9;
		System.out.println("value of x "+x);
		System.out.println("value of y "+y);
		value(x,y);
		System.out.println("value of x "+x);
		System.out.println("value of y "+y);
	}
	static void value(int a,int b) {
		System.out.println("value of x "+a);
		System.out.println("value of y "+b);
		a=15;
		b=99;
		System.out.println("value of x "+a);
		System.out.println("value of y "+b);
	}

}
