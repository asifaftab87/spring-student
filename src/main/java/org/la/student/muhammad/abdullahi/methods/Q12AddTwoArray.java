package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q12AddTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,8,10};
		int b[]= {2,3,4,5};
		
		int c[]=  addArray(a,b);
		
		System.out.println(Arrays.toString(c));
		
		
	
}
	
	
	static int[] addArray(int []a,int[]b) {
		int c[]= new int[a.length];

		for(int i=0;i<a.length;i++) {
	
		c[i]=a[i]+b[i];
		}
			
			
		
			
		return c;
	}	

}