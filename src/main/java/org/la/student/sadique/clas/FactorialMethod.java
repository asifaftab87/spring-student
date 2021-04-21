package org.la.student.sadique.clas;

public class FactorialMethod {
	static void fact(int n) {
		int f = 1;
		while (n > 0) {
			f = f * n;
			n = n - 1;
		}
		System.out.println("factorial of 4 is " + f+" in fact method");
	}

	public static void main(String[] args) {
		int f = 4;
		fact(f);
		int g=5;
		int result = act(5);

		System.out.println("Factorial of " + g + " is " + result+" in act method ");
		

	}

	static int act(int m) {
		if (m == 1) {
			return 1;
		}
		return m * act(m - 1);
	}
}
