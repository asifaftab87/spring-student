package org.la.student.ameen;

public class PositiveNumberFromArray {

	public static void main(String[] args) {
		// wap to print only positive number from an array
		int array [] = {-4,-3,-2,-1,0,1,2,3,4};
		System.out.println("Positive number from an array ");
		for(int i = 0 ; i<array.length ; i++)
		{
			if(array[i]>=0)
			{
				System.out.println(+array[i]);
			}
		}

	}

}
