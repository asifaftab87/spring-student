package org.la.student.ameen;

public class PatternPrinting {

	public static void main(String[] args) {
		// Pattern Printing(Star)
		int num = 5;
		for(int i = 1;i<=num;i++)
		{
			for(int k= 1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}

		
	}

}
