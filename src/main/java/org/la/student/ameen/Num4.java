package org.la.student.ameen;

public class Num4 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
		int num = 10;
		while(num<=300)
		{
			if(num%11==0 || num % 12 == 0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
