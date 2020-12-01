package org.la.student.ameen;

public class BothDivisible {

	public static void main(String[] args) {
		// wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
		int num = 1;
		while(num<=10)
		{
			if(num % 2 == 0 || num % 3 == 0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
