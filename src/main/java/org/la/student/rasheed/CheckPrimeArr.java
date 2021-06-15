package org.la.student.rasheed;

public class CheckPrimeArr {
	/*
	 * wap to find a prime number in array
	 */

	public static void main(String[] args) {
		
		int arr [] = { 5, 4, 3, 6, 7, 111, 321, 131, 132};
		for (int i=0; i<arr.length ; i++) {
			
			int n =arr[i];
			int x;
			for ( x=2 ; x<n; x++) {
				if(n%x==0) {
					break;
				}
				}
				if (n==x) {
					System.out.println(n+" is a prime number");
				}
				else {
					System.out.println(n+" is not a prime number");
				}
			}
				
		}
	}
	


