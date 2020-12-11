package org.la.student.ameen;

public class Divisible4 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 300 those are divisible by 11 and 12.(using for loop)
		int num = 10;
		for(int i = num ; i<=300; i++)
		{
			if(i%11==0||i%12==0)
			{
				System.out.println("i : "+i);
			}
		}

	}

}
