package org.la.student.ameen;

public class DiviOrNot {

	public static void main(String[] args) {
		// wap to print all numbers between 130 to 90 those are not divisible by 10.
		int num = 130;
		while(num >= 90)
		{
			if(num % 10 != 0)
			{
				System.out.println("num : " +num);
			}
			num--;
		}

	}

}
