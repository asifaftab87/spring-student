package org.la.student.asif.call;

//call by reference
public class CallByReference {

	//calling method
	public static void main(String[] args) {
		int x[] = {333};
		System.out.println("before x[0]: "+x[0]);
		reference(x);
		System.out.println("after x[0]: "+x[0]);	//x[0] = 99
		value(x[0]);	
		System.out.println("final x[0]: "+x[0]);
	}
	//called method
	static void reference(int y[]) {
		System.out.println("value before y[0]: "+y[0]);
		y[0] = 99;
		System.out.println("value after y[0]: "+y[0]);
	}
	
	//called method
	static void value(int a) {
		System.out.println("value before a: "+a);
		a = 7;
		System.out.println("value after a: "+a);
	}
	
}
