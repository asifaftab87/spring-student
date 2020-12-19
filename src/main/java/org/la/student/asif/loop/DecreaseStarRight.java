package org.la.student.asif.loop;

public class DecreaseStarRight {

	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i=0 ; i<n ; i++) {
			
			for(int s=1 ; s<=i ; s++) {
				System.out.print(" ");
			} 
			
			for(int k=1 ; k<=n-i ; k++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}
}
