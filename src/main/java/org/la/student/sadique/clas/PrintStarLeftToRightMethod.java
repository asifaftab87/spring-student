package org.la.student.sadique.clas;

public class PrintStarLeftToRightMethod {
	static boolean star(int n) {
		System.out.println("Left to right  increse star ");

		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("> ");
			}
			System.out.println(" ");
		}
		return true;
	}

	public static void main(String[] args) {
		boolean star = star1(5);
		System.out.println(star);

		boolean gangstar = star(6);
		System.out.println(gangstar);

		boolean daimond = star2(5);
		System.out.println(daimond);
	}

	static boolean star1(int n) {
		System.out.println("Up to down decrese star ");

		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("< ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println("  ");
		}
		return true;
	}

	static boolean star2(int n) {
		System.out.println("Daimond star ");

		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("^ ");
			}
			System.out.println(" ");
		}
		return true;
	}
}
