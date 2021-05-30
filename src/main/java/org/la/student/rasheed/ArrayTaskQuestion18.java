package org.la.student.rasheed;
/*
 * wap to add two array elements n copy into third array
 */
public class ArrayTaskQuestion18 {

	public static void main(String[] args, int x) {
		int [] a= {20, 5, 7, 9};
		int [] b= {10, 6, 7, 3};
		int [] sum = new int [4]; 

		for (int i=0; i<b.length; i++) {
			sum[i] =0;
		
		if (i > b.length) {
			sum[i] = b[i] +0;
		}
			else {
				sum[i] = a[i]+b[i];
			}
		}
		
		
		
		System.out.println(sum);
		
	

	}
	
	

}
	

