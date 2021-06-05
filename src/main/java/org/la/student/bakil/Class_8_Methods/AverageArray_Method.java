package org.la.student.bakil.Class_8_Methods;
/*
 * int average(int[])
		find the average of array elements and return average
 */
public class AverageArray_Method {


	public static void main(String[] args) {
	
		int arr[] = {3,7,12,23,5};
		average(arr);
		
	}

	
	 static void average(int arr[]) {
	
		 int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		sum =sum+arr[i];
		avg=sum/arr.length;
		System.out.println(avg);
	}
	
	}

