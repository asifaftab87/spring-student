package org.la.student.jamal.array;

public class array25 {
	
	//25) Write a Java program to calculate the average value of array elements?

	public static void main(String[] args) {
		
		
		
		int []a = new int [] {10,20,30,40,50,60,80,100};
		int sum =0;
		
		for(int i=0;i<a.length;i++) 
			sum= sum+a[i];
			
			int avg=sum/a.length;
			System.out.println(avg);
		
		

	}

}
