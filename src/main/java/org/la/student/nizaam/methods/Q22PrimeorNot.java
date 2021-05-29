package org.la.student.nizaam.methods;

public class Q22PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=367;
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
