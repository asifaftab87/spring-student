package org.la.student.noor;

/*boolean prime(int)
check whether given number is prime or not and return true or false*/

public class MethodQ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=444;
		System.out.println(prime(n));


	}

	static boolean prime(int n) {

		boolean isPrime=true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				isPrime=false;

		}
		return isPrime;
	}

}
