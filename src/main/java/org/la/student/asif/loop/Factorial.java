package org.la.student.asif.loop;

public class Factorial {

	//find factorial of a number
	
	public static void main(String[] args) {
		
		int n=20; 
		
		int f = 1;
		
		while(n>1) {

			f = f * n;
			n--;
		}
		
		System.out.println("Factorial: "+f);
	}
}
