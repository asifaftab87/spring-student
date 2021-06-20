package org.la.student.asif.method;

public class NumberOperation3 {

	static void factorial(int n) {
		
		int p =1;
		for(int i=1;i<=n;i++)
		{
			p=p*i;
		}
		System.out.println("Factorial="+p);
	}

	public static void main(String[] args) {
		
		//prime number program
		int a = 107;
		boolean b = prime(a);
		if (b) {
			System.out.println("Is Prime Number");
		} else {
			System.out.println("Is Not Prime Number");
		}

		factorial(5);
	}
	
	
	
	static boolean prime(int a) {
		
		int b = 2;
		while (b < a) {
			if (a % b == 0) {
				break;
			}
			b++;
		}
		return a==b;
	}
}
