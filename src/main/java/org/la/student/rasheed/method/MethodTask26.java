package org.la.student.rasheed.method;

/*
 * void printStarReverse(int n) print star pattern in decrease order
 */

public class MethodTask26 {

	public static void main(String[] args) {
		
		int n=5;
		printStar(n);

	}
	static void printStar(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				
					System.out.print("*");
				
			}
			System.out.println();
	}

}
}
