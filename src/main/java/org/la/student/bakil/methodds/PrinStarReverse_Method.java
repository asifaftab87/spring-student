package org.la.student.bakil.methodds;
/*
 * void printStarReverse(int n)
		print star pattern in decrease order 
 */
public class PrinStarReverse_Method {


	public static void main(String[] args) {
	
		int n = 9;
		increaseStar(n);
		System.out.print("\n");	// \n meaning new line
		decreaseStar(n);
	}
	
	static void increaseStar(int n) {
		for(int j=1 ; j<=n ; j++) {
			for(int y=1; y<=j ; y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	static void decreaseStar(int n) {
		for(int j=1; j<=n; j++) {
			for(int y=1; y<=n-j+1; y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	static void increaseStarReverse(int n) {
	
	}
	static void decreaseStarReverse(int n) {
	
	}}

