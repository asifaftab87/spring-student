package org.la.student.asif.loop;

public class Finbonacci {

	public static void main(String[] args) {
		
		int a = 1, b = 1, s = a + b;
		
		System.out.print(a);
		System.out.print(" "+b);
		
		for(int i=1 ; i<=10 ; i++) {
			
			System.out.print(" "+s);
			a = b;
			b = s;
			s = a + b;
		}
	}
}
