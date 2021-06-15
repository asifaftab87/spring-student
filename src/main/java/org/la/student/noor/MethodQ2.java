package org.la.student.noor;
/*void printPositive(int[])
		method will print all positive number from supplied array*/

public class MethodQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,1,2,3};
	    printPositive(arr);

	}

	static void printPositive(int[] a) {
		System.out.println("Positive numbers are");
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				System.out.print(a[i]+ "  ");
		}
	}

}
