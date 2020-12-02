package org.la.student.ameen;

public class NotDivisible {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
		int num = 10;
		while(num <= 70)
		{
			if(num %3==0 || num %5==0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
