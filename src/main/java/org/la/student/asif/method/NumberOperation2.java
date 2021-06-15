package org.la.student.asif.method;

public class NumberOperation2 {

	

	public static void main(String[] args) {
		
		//prime number program
		int a = 107;
		
		factorial(5);
	}
	
	static void factorial(int n) {
		
		int p =1;
		for(int i=1;i<=n;i++)
		{
			p=p*i;
		}
		System.out.println("Factorial="+p);
		prime(44);
	}
	
	static void prime(int a) {
		
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
	}
}
