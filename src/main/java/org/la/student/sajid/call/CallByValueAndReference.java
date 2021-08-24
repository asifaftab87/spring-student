package org.la.student.sajid.call;

public class CallByValueAndReference {
	public static void main(String[] args) {
		int a[]= {300};
		System.out.println("a: "+a[0]);
		reference(a);
		System.out.println("a: "+a[0]);
		value(a[0]);
		System.out.println("aj: "+a[0]);
		}
	
		static void value(int z) {
		System.out.println("z: "+z);
		z=99;
		System.out.println("z: "+z);
	}

		static void reference(int y[]) {
		System.out.println("y: "+y[0]);
		y[0]=50;
		System.out.println("y: "+y[0]);
		}

}
