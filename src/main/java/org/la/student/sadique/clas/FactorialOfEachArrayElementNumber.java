package org.la.student.sadique.clas;

public class FactorialOfEachArrayElementNumber {

	public static void main(String[] args) {
		// wap to calculate the factorial of each element of an array?
		int arr[] = new int[] { 5, 6, 4 }, i,  j = 1;
		for (i = 0; i < arr.length; i++) {
			int fact = 1;
			for (j = arr[i]; j > 0; j--) {
				fact = fact * j;
			}  System.out.println(fact+ " is factorial of "+arr[i]);

		}

	}

}
