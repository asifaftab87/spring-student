package org.la.student.ameen;

public class Multiple {

	public static void main(String[] args) {
		// wap to print numbers which is multiple of 3 between 1 to 22.
		int num = 1;
		while(num <= 22)
		{
			if(num % 3 == 0)
			{
				System.out.println("multiple of 3 is " + num);
			}
			num++;
		}

	}

}
