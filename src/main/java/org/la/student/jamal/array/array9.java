package org.la.student.jamal.array;

public class array9 {
	
	//09) wap to print number not divisible by given number from an array

	public static void main(String[] args) {
		
		
		int a[]= {2,3,4,5,6,7,8,9,12,23,34};
		for (int i=0;i<a.length;i++) {
			if (a[i]%a[0]!=0) {
				System.out.println(a[i]);
				
			}
		}
		
		
		

	}

}
