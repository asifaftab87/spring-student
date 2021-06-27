package org.la.student.bakil.arry;
/*
 * wap to print all prime numbers from an array ?
 */
public class PrimeNumbersFromAnArray {

	public static void main(String[] args) {
	
		int[] a = {12,3,5,14,25,15};

	    //loop through the numbers one by one
	    for(int i=0; i<a.length; i++){

	        System.out.print("All prime numbers are:");

	        for (i = 0; i <a.length; i++) {
	            int p = 1;
	            int n =a[i];
	            
	            for (int j=2; j<n;j++) {
	                if (n% j == 0) {
	                    p = 0;
	                    break;
	                }
	            }
	            if (p == 1) {
	                System.out.print(" " + n);
	            }
	        }
    }
	}
	}
