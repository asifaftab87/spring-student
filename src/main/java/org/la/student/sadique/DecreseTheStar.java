package org.la.student.sadique;

public class DecreseTheStar {

	public static void main(String[] args) {
		// wap to print star in decreasing order.
		int n=3;
		for( int i=0; i<=6; i++) {
			for( int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		int m=3;
		for( int i=0; i<=6; i++) {
			for( int j=1; j<=m-i; j++) {
				System.out.print("1");
				System.out.print("2");
			}
			System.out.println("");
		}

}
	}
