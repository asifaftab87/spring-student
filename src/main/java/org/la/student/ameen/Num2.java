package org.la.student.ameen;

public class Num2 {

	public static void main(String[] args) {
		// wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
		int num = 200;
		while(num>=1)
		{
			if(num %2==0 || num%13==0)
			{
				System.out.println("num : " +num);
			}
			num--;
		}

	}

}
