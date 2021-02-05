package org.la.student.tahir.cal;

public class Callbyreference {

	public static void main(String[] args) {
		int x[] = {200};
		System.out.println("initial value: "+ x[0]);
		reference(x);
		System.out.println("Final value: "+ x[0]);
		

	}
	
	static void reference(int y[]) {
		
		System.out.println("Before change in reference class: "+ y[0]);
		
		y[0]=300;
		System.out.println("After change in reference class: " + y[0]);
		
		
	}

}
