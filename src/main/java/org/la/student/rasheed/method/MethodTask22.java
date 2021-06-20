package org.la.student.rasheed.method;
/*
 * find factorial of given argument and return result
	boolean prime(int)
 */

public class MethodTask22 {

	public static void main(String[] args) {
		
		int n=33;
		System.out.println(prime(n));
	}
	static boolean prime (int n) {
		
		boolean isprime=true;
		
		for(int i =2; i<n/2; i ++ ) {
			if(n%i==0)
				
				isprime = false;
		}
		return isprime;
		
	}

	


}
