package org.la.student.ameen;

public class MultiplicationTable {

	public static void main(String[] args) {
		// Print multiplication table of any number
		int num = 2;
		for(int i =1;i<=10;i++)
		{
			int n = num*i;
			System.out.println( num+" * " +i + " = " +n    );
		}

	}

}
