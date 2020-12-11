package org.la.student.ameen;

public class Divisible2 {

	public static void main(String[] args) {
		// wap to print all numbers between 200 to 1 those are divisible by 13 and 2.(using for loop)
		int num = 200;
		for(int i = num ; i>=1 ; i--)
		{
			if(i%2==0||i%13==0)
			{
				System.out.println("i : " +i);
			}
		}

	}

}
