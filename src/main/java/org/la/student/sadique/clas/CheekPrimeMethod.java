package org.la.student.sadique.clas;

public class CheekPrimeMethod {
	static boolean isPrime(int num) {
		int a = 2;
		while (a < num) {
			if (num % a == 0) {
				return false;
			}
			a++;
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 500; i++) {
			int temp = 0;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println(i);
			}
		}
		boolean asPrime = isPrime(11);
		System.out.println(11 +" Is PRIME NUMBER " + asPrime);

	}

}
