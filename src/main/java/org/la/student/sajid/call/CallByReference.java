package org.la.student.sajid.call;

public class CallByReference {
	public static void main(String[] args) {
		
	int a[]= {300};
	System.out.println("a: "+a[0]);
	reference(a);
	System.out.println("a: "+a[0]);
	}
	
	static void reference(int y[]) {
		System.out.println("y: "+y[0]);
		y[0]=50;
		System.out.println("y: "+y[0]);
	}
}
