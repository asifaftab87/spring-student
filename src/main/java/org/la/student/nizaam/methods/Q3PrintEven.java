package org.la.student.nizaam.methods;

public class Q3PrintEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-2,0,1,2,-3};
		printEven(arr);
		
	}
	
	static void printEven(int[] a) {
		System.out.println("Printing Even numbers from array");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+ "  ");
		}
	}

}
