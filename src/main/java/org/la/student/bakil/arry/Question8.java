package org.la.student.bakil.arry;
/*
 * wap to print only negative number from an array
 */
public class Question8 {

	public static void main(String[] args) {
	
		int a[]= {-2,3,12,5,-9};
			
		for (int i=0;i<a.length;i++) {
				if (a[i]<0) {
			System.err.println("Negative : "+a[i]);
		
				}
			}
		}

}
