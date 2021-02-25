package org.la.student.sadique.clas;

public class AddTwoArrayAndCopyInThirdArray {

	public static void main(String[] args) {
		//wap to add two array elements and copy into third array.
		int a[]=new int[] {2,4,7};
		
		int b[]=new int[] {6,8,2};
		
		int c[]=new int[a.length];
		
		for(int s=0;s<b.length;s++) {
		
			c[s]=a[s]+b[s];
			
			System.out.println(c[s]);
		}
	}
}
