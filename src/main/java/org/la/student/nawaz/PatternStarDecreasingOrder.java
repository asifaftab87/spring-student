package org.la.student.nawaz;

public class PatternStarDecreasingOrder {
	
	public static void main(String[] args) {
		
		int n=8;
		
		for (int i=0; i<n; i++) {
			
			for(int k=1; k<=n-i; k++) {
				
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
