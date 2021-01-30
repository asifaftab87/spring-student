package org.la.student.noura.method;

public class PrimeMethod {

	public static void main(String[] args) {


		boolean isPrime=prime(102);
		System.out.println("is 102 prime: "+isPrime);
		
	}

	
	static boolean prime(int num) {
		
		int i=2;
		
		while (i<num) {
			
			if(num%i==0) {
				return false;
			}
		i++;
		
		}
		return true;
	}	
}
