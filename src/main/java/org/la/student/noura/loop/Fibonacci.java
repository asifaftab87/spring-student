package org.la.student.noura.loop;

public class Fibonacci {

	public static void main(String[] args) {
		
		//Wap to print Fibonacci series up to n terms
		
		int a=2;
		int b=3;
		int s =a+b;

		System.out.print(a);
		System.out.print("  "+b);

		for(int i=1;i<=8;i++) {
			
		System.out.print("  "+s); // int s=a+b;

			a=b;
			b=s;
		    s =a+b;

		}
	}

}
