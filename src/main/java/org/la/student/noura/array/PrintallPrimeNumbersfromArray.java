package org.la.student.noura.array;

public class PrintallPrimeNumbersfromArray {

	public static void main(String[] args) {
		//wap to print all prime numbers from an array
		
		int a[]= {34,5,78,23};
		
		System.out.print(" the array elements are: ");

		for (int i=0;i<a.length;i++) {
			
		System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.print(" prime numbers in array are: ");
		
		
		////printing prime numbers
		
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=2;j<a.length-1;j++) {
				
				if (a[i]%j==0) {
					count++;
				}
			}  
			if (count==0) {
				System.out.print(" "+a[i]);
				}
	    	}
	    }
   }  
