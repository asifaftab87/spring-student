package org.la.student.ameen;

public class AverageValueOfArrayElement {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements?
		int sum=0; 
		double avg = 0;
		int array [] = {1,2,3,4,5};
		for(int i = 0 ; i<array.length;i++)
		{
			sum = sum+array[i];
			 avg = sum/array.length;
			
		}
		System.out.println("The Average value of array element : " +avg);

	}

}
