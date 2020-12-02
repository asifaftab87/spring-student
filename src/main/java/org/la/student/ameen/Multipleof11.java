package org.la.student.ameen;

public class Multipleof11 {

	public static void main(String[] args) {
		// wap to print all numbers between 1 to 150 multiple of 11
		int num = 1;
		while(num<=150)
		{
			if(num % 11==0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
