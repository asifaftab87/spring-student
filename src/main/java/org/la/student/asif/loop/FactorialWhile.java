package org.la.student.asif.loop;

public class FactorialWhile {

	public static void main(String[] args) {
		
		int f = 1;
		int n = 4;
		
		while(n>=1) {
			f = f * n;
			n--;
		}
		
		System.out.println("Factorial: "+f);
	}
}
