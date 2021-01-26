package org.la.student.sajid.method;

public class PrimeMethod {
	public static void main(String[] args) {
		System.out.println("is number prime: "+prime(9 ));
	}
	
	static boolean prime(int num) {
		int i=2;
		while(i<num) {
			if(num%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
