package org.la.student.ameen;

public class PrintOdd1 {

	public static void main(String[] args) {
		// wap to print all odd numbers between 120 to 100.(using for loop)
		int num = 120;
		for(int i = num; i>=100 ; i--)
		{
			if(i%2!=0)
			{
				System.out.println("i : " +i);
			}
		}
	}

}
