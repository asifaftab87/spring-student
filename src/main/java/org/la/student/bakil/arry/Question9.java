package org.la.student.bakil.arry;
/*
 * wap to print number not divisible by given number from an array
 */
public class Question9 {

	public static void main(String[] args) {
	
		int a[]= {-2,3,12,5};
			
		for (int i=0;i<a.length;i++) {
				if (a[i]%2!=0) {
			System.err.println("The number is not divisible by 2 : "+a[i]);
		
				}
			}
		}

}
