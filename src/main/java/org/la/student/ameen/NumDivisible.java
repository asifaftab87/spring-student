package org.la.student.ameen;

public class NumDivisible {

	public static void main(String[] args) {
		// wap to print numbers which is completely divisible by 3 between 1 to 10.(using for loop)
		int num = 1;
		for(int i = num ; i<=10 ; i++)
		{
			if(i%3==0)
			{
				System.out.println("i : " +i);
			}
		}

	}

}
