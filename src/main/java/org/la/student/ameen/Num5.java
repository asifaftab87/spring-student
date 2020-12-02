package org.la.student.ameen;

public class Num5 {

	public static void main(String[] args) {
		// wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
		int num = 100;
		while(num>=1)
		{
			if(num %11==0 || num%3==0)
			{
				System.out.println("num : " +num);
			}
			num--;
		}

	}

}
