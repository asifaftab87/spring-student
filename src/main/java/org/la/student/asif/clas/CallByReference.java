package org.la.student.asif.clas;

public class CallByReference {

	public static void main(String[] args) {
		
		int a[] = {3, 4, 8};
		System.out.println("before");
		System.out.println("a[0]: "+a[0]);
		System.out.println("a[1]: "+a[1]);
		System.out.println("a[2]: "+a[2]);
		met(a);
		System.out.println("after");
		System.out.println("a[0]: "+a[0]);
		System.out.println("a[1]: "+a[1]);
		System.out.println("a[2]: "+a[2]);

	}
	
	static void met(int e[]) {
		e[2] = 22;
	}
}
