package org.la.student.tahir.cal;

public class Callbyvalue {

	public static void main(String[] args) {
		int x=3; 
		System.out.println("Initial value: "+ x);
		value(x);
		System.out.println("Final value: "+ x);

	}
	
	static void value(int x) {
		
		System.out.println("before " +x);
		
		x=2;
		
		System.out.println("after "+ x);
	}

}
