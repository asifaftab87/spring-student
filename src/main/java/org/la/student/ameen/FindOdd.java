package org.la.student.ameen;

public class FindOdd {

	public static void main(String[] args) {
		// wap to print all odd numbers between 120 to 100.
		int num = 120;
		while(num >=100)
		{
			if(num % 3 == 0)
			{
				System.out.println("num : " +num);
			}
			num--;
		}

	}

}
