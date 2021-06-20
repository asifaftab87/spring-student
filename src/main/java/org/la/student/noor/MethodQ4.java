package org.la.student.noor;
/*void printOdd(int[])
		method will print all odd number from supplied array*/

public class MethodQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,1,2,3};
		printOdd(arr);

	}

	static void printOdd(int[] a) {
		System.out.println("Odd numbers are");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				System.out.print(a[i]+ "  ");
		}
	}

}
