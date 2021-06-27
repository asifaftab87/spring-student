package org.la.student.bakil.methodds;
/*
 * boolean prime(int)
		check whether given number is prime or not and return true or false
 */
public class Prime_Method {


	public static void main(String[] args) {
	
		int a=5;
		prime(a);
	
		
	}

	
	static boolean prime(int a) {
		int b = 2;
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
		return false;
	}
}
	
	

