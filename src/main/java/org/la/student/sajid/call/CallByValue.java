package org.la.student.sajid.call;

public class CallByValue {
	public static void main(String[] args) {
		int a=3;
		System.out.println("a: "+a);
		value(a);
		System.out.println("a: "+a);
	}
	
	static void value(int b) {
		System.out.println("b: "+b);
		b=10;
		System.out.println("b: "+b);
	}

}
