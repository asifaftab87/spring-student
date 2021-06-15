package org.la.student.barry.array;

public class CheckPrimeArr {

	public static void main(String[] args) {
		int arr[]= {3,4,5};
		for (int i=0; i<arr.length; i++) {
			int f=1;
			int n=arr[i];
			
			int x;
			
			for( x=2; x<n;x++) {
			if(n%x==0) {
				break;
				}
			}
			if(n==x) {
				System.out.println(n + " is a prime number");
			}
			else {System.out.println(n + " is not a prime number");
			
		}
	} 
		}

}
