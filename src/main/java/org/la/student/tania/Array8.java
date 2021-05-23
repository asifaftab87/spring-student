package org.la.student.tania;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1, 2, 5, 4, 3};
		
		for(int i=0 ; i<arr.length ; i++) {
			
			int f = 1;
			int n = arr[i];
			for(;n>0;) {
				f = f * n;
				n--;
			}
			
			System.out.println("Factorial of "+arr[i]+" is: "+f);
		}
	}

}
