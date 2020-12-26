package org.la.student.tahir.array;

public class Printonlyevennumberfromanarray {

	public static void main(String[] args) {
		// wap to print only odd number from an array
		
				int[] a = new int[10];
				
				for(int i=0; i<a.length; i++) {
					
					a[i]= i;
					if(i%2 == 0) {
						System.out.println(a[i]);
					}

	}

}}
