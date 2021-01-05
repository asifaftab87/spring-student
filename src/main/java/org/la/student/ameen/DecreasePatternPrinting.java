package org.la.student.ameen;

public class DecreasePatternPrinting {

	public static void main(String[] args) {
		// Decrease Pattern Printing
		int num = 3;
		for(int i =1;i<=num;i++)
		{
			for(int k= 1;k<=num+1-i;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
