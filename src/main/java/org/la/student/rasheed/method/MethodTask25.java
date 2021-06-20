package org.la.student.rasheed.method;

/*
 * void printStarFromRight(int n) print star pattern from right
 */

public class MethodTask25 {

	public static void main(String[] args) {
		
		int n=5;
		
		printStar(n);
		
		

	}
	static void printStar (int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				if(j<=i)
				System.out.print("*");
			else
				System.out.print(" ");
			
			
		}
		System.out.println();
	}

}
}
