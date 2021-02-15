package org.la.student.noura.array;

public class Add2ArrayElementsandCopyintoThirdArray {

	public static void main(String[] args) {
		//wap to add two array elements n copy into third array
	 
		int a[]= {1,2,3,4,5};
		int b[]= {5,4,6,7,9};
		int c[]= new int [a.length];
		
		
		for (int i=0;i<b.length;i++) {
			
			c[i]=a[i]+b[i];
			
			System.out.print(" "+c[i]);

			
		}
		
	}

}
