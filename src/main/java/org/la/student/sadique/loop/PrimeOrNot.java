package org.la.student.sadique.loop;

//wap to find given number is prime or not
public class PrimeOrNot {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		while (b < a) {
			if (a % b == 0) {
				break;
			}
			b++;
		}
		if (a == b) {
			System.out.println("Is Prime Number");
		} else {
			System.out.println("Is Not Prime Number");
		}

	}

}
