package org.la.student.ameen;

public class Num3 {

	public static void main(String[] args) {
		// wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
		int num = 1;
		while(num<=1500)
		{
			if(num % 11 == 0 || num % 13 == 0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
