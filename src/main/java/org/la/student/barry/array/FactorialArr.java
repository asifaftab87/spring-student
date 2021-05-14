package org.la.student.barry.array;

public class FactorialArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for (int i=0; i<arr.length; i++) {
			int f=1;
			int n=arr[i];
			for(;n>0;) {
				f=f*n; 
				n--;
			}
			System.out.println("Factorial of "+ arr[i]+" is :"+ f);
		}

	}

}
