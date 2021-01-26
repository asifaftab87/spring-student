package org.la.student.ameen;

public class PatternPrintingRightSide {

	public static void main(String[] args) {
		// Pattern Printing right side of number
		int n = 4;
		for(int i = 1; i<=n ; i++)
		{
			for(int s = 1 ; s<=n-i ; s++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k<=i ; k++)
			{
				System.out.print(+i);
			}
			System.out.println("");
		}

	}

}
