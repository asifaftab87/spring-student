package org.la.student.jamal.array;

public class array4 {
	
	//04) wap to print only odd number from an array

	public static void main(String[] args) {
		
		int a[]= {2,4,1,3,7,8,9};
		
		for(int i=0;i<a.length;i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
		

	}

}
