package org.la.student.ameen;

public class Divisibleby7 {

	public static void main(String[] args) {
		// wap to print all numbers between 30 to 50 those are not divisible by 7.
		int num = 30;
		while(num <= 50)
		{
			if(num % 7 != 0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
