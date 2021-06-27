package org.la.student.bakil.methodds;
/*
 * create an array and copy supplied array and return that new array
	int sum(int[])
 */
public class SumNumberOfArray_Method {


	public static void main(String[] args) {
	
		int arr[] = {3,7,12,23};
		Sum(arr);
		
	}

	
	 static void Sum(int arr[]) {
	
		 int sum=0;
		for(int i=0;i<arr.length;i++)
		sum=sum+arr[i];
		System.out.println(sum);
	}
	
	}

