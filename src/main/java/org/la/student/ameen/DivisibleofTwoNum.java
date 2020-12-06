package org.la.student.ameen;

public class DivisibleofTwoNum {

	public static void main(String[] args) {
		// wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.(using for loop)
		int num = 1;
		for(int i = num ; i<=10; i++)
		{
			if(i %2==0 || i %3==0)
			{
				System.out.println(" i : " +i);
			}
		}

	}

}
