package org.la.student.ameen;

public class Div {

	public static void main(String[] args) {
		// wap to print numbers which is completely divisible by 10 between 1 to 100.
		int n = 1;
		while(n <= 100)
		{
			if(n % 10 == 0)
			{
				System.out.println("n : " +n);
			}
			n++;
		}

	}

}
