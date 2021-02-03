package org.la.student.sajid.method;

public class PrimeMethod {
	public static void main(String[] args) {
		System.out.println("is number prime: "+prime(8));
	}
	
	static boolean prime(int num) {
		int i=0,temp=0;
		for(i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			return false;
		}else 
			return true;
	}
	
}

