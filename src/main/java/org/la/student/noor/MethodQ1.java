package org.la.student.noor;
/*void printNegative(int[])
method will print all negative number from supplied array*/

public class MethodQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,1,2,3};
		printNegative(arr);

	}

	static void printNegative(int[] a) {
		System.out.println("Negative numbers are");
		for(int i=0;i<a.length;i++) {
			if(a[i]<0)
				System.out.print(a[i]+ "  ");
		}
	}

}
