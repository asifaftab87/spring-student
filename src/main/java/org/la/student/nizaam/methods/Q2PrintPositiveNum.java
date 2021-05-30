package org.la.student.nizaam.methods;

public class Q2PrintPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-2,0,1,2,-3};
		printPositive(arr);
		
	}
	
	static void printPositive(int[] a) {
		System.out.println("Printing positive numbers from array");
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				System.out.print(a[i]+ "  ");
		}
	}

}
