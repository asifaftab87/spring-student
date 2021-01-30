package org.la.student.asif.call;

//call by value
public class CallByValue {

	//calling method
	public static void main(String[] args) {
		int x = 3;
		System.out.println("before x: "+x);
		value(x);
		System.out.println("after x: "+x);
	}

	//called method
	static void value(int a) {
		System.out.println("value before a: "+a);
		a = 7;
		System.out.println("value after a: "+a);
	}
	
}
