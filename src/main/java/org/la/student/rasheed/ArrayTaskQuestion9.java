package org.la.student.rasheed;

public class ArrayTaskQuestion9 {

	public static void main(String[] args) {
		
		int arr [] = {4, 6, 10, 12};
		for (int i=0 ; i<arr.length; i++) {
			int n =arr[i];
			int y;
			for (y=2; y<n; y++) {
				if (n%y==0) {
					break;
					
				}
			}
			if (n==y) {
				System.out.println(n+" is a prime number");
			}
			else {
				System.out.println(n+" is not prime number");
		}
	}

	}

}
