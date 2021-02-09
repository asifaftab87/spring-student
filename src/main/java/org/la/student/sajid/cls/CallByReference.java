package org.la.student.sajid.cls;

public class CallByReference {
	public static void main(String[] args) {
		int x[]= {100};
		System.out.println("after x[0] "+x[0]);
		reference(x);
		System.out.println("After x[0]: "+x[0]);
	}
//	called method
	static void reference(int y[]) {
		System.out.println("Value before y[0] "+y[0]);
		y[0]=7;
		System.out.println("Value after y[0] "+y[0]);
	}
	
//	called method
	static void value(int a) {
		System.out.println("Value before a: "+a);
		a=7;
		System.out.println("Value After a: "+a);
	}

}
