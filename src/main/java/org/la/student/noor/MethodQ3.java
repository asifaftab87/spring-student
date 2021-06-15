package org.la.student.noor;
/*void printEven(int[])
		method will print all even number from supplied array*/

public class MethodQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,1,2,3};
		printEven(arr);

	}

	static void printEven(int[] a) {
		System.out.println("Even numbers are");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+ "  ");
		}
	}

}
