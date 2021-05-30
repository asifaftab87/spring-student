package org.la.student.nizaam.methods;

public class Q4PrintOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[]= {-1,-2,0,1,2,-3};
		printodd(arr);
		
	}
	
	static void printodd(int[] a) {
		System.out.println("Printing Even numbers from array");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				System.out.print(a[i]+ "  ");
		}
	}

}
