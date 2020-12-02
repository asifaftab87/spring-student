package org.la.student.ameen;

public class Num {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		int num = 10;
		while(num <= 90)
		{
			if(num%2==0 || num%5==0)
			{
				System.out.println("num :" +num);
			}
			num++;
		}

	}

}
