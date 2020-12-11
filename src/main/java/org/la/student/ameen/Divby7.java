package org.la.student.ameen;

public class Divby7 {

	public static void main(String[] args) {
		// wap to print all numbers between 30 to 50 those are not divisible by 7.(using for loop)
		int num = 30;
		for(int i = num ; i<=50 ; i++)
		{
			if(i%7==0)
			{
				System.out.println("i : "+i);
			}
		}

	}

}
