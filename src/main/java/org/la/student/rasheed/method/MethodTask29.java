package org.la.student.rasheed.method;

/*
 * void diamond(int n) print diamond
 */

public class MethodTask29 {

	public static void main(String[] args) {
		
		int n=5;
		printStar(n);

	}
	static void printStar(int n) {
		int j=0;
		for(int i=-n;i<=n;i++) {
			
				if(i<0)
					j=-i;
				else 
					j=i;
				//printing space
				
				for(int k=1 ; k<=j ; k++) {
				
					System.out.print(" ");
				}
				
				for(int k=0 ; k<=n-j ; k++) {
					System.out.print("* ");
			
	}
		System.out.println();

}
	}
	}

