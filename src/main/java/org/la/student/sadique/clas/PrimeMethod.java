package org.la.student.sadique.clas;

public class PrimeMethod {
	static boolean prime(int num) {
		int a=2;
		while(a<num) {
			if(num%a==0) {
				return false;
			}
			a++;
		}
		return true;
	}
	public static void main(String[] args) {
		boolean isprime=prime(10);
		System.out.println("10 is prime number : "+ isprime);
	}

}
