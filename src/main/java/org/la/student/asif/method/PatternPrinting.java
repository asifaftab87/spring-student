package org.la.student.asif.method;

public class PatternPrinting {

	public static void main(String[] args) {

		incr(5);
		decr(3);
	}

	static void incr(int n) {

		System.out.println("increase start");
		
		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

	static void decr(int n) {

		System.out.println("decrease start");
		
		for (int i = 0; i < n; i++) {

			for (int k = 1; k <= n - i; k++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

}
