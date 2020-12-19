package org.la.student.ameen;

public class AllOddNum {

	public static void main(String[] args) {
		// Print all odd number from 1 to 100
		int num =1;
		while(num<=100)
		{
			if(num%2!=0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
