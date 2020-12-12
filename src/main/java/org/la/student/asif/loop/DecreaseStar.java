package org.la.student.asif.loop;

public class DecreaseStar {

	public static void main(String[] args) {
		
		int n = 2;
		
		for(int i=0 ; i<n ; i++) {
			
			for(int k=1 ; k<=n-i ; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
