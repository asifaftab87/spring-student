package org.la.student.aameen.method;

public class FindLargestElement {

	public static void main(String[] args) {
		// Write a program in java   to get the largest element of an array using the  method 
		
		
		 System.out.println(" largest element : " +largest());
		 
	}
	static int largest()
	{
		 int array[] = new int [5];
		 array[0]=1;
		 array[1]=2;
		 array[2]=3;
		 array[3]=4;
		 array[4]=5;
		int i;
		int max =array[0];
		for( i =1;i<array.length;i++ )
		{
			if(array[i]>max)
			{
				max = array[i];
				
			}
		}
		return max;
	}

}
