package org.la.student.ameen;

public class PrintEvenNumberFromArray {

	public static void main(String[] args) {
		// wap to print only even number from an array
		int array [] = {1,2,3,4,5,6,7};
		for(int i =0 ; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				System.out.println( array[i] );
			}
		}

	}

}
