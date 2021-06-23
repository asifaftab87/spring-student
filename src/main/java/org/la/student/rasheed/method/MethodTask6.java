package org.la.student.rasheed.method;
/*
 * Void copy(int[], int[]) copy first array to second array
 */

public class MethodTask6 {

	public static void main(String[] args) {
		
		char a [] = {'1',  '2', '3', '4'};
		
		
		print(a);
		
	
	}
	static void print (char a []) {
		char b [] = new char[a.length];
	
		for (int i =0; i<a.length ; i++) {
			b[i] = a[i];
		}
			
			for (char c : b) {
				System.out.println(c);
			}

}
	}

		