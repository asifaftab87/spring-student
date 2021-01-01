package org.la.student.noura.array;

public class CalculateFactorialofElementofArray {

	public static void main(String[] args) {


		//wap to calculate the factorial of each element of an array
		
		int []arr= {1,2,3,4,5};
		
		int factorial=1;

		for (int i=0;i<arr.length;i++) {
			factorial=factorial*arr[i];

		}
		System.out.println(factorial);

	}

}
