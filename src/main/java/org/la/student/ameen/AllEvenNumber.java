package org.la.student.ameen;

public class AllEvenNumber {

	public static void main(String[] args) {
		// Print all even number from 1 to 100 using while loop
		int num = 1;
		while(num<=100)
		{
			if(num%2==0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
