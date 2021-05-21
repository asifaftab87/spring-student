package org.la.student.sadique.loop;

//wap to print patterns
public class PrintingPattern {
	public static void main(String[] args) {
		int n = 4;
		System.out.println("Daimond pattern ");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Left to right Decresing star");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
		System.out.println("Left to right Decresing star Down ward");
		for (int i = 1; i <= n; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
		System.out.println("right to left Decresing star ");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println("right to left Decresing star ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println(" Mountain pattern");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}for( int j=1;j<i;j++) {
				System.out.print("* ");
			}for( int j=1;j<=i;j++) { 
				System.out.print("* ");
			}System.out.println();
		}System.out.println("Reverse Mountain pattern");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}for( int j=i;j<n;j++) {
				System.out.print("* ");
			}for( int j=i;j<=n;j++) { 
				System.out.print("* ");
			}System.out.println();
		}
	}
}
