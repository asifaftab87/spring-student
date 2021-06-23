package org.la.student.rasheed.method;

/*
 * void printIncrStar(int n) print star patter
 */

public class MethodTask24 {

	public static void main(String[] args) {
		
		int n =6;
		
		printStar(n);
		
		

	}
	static void printStar (int n) {
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
