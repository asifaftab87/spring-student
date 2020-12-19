package org.la.student.ameen;

public class PrimeNumber {

	public static void main(String[] args) {
		// Wap to check whether a number is Prime number or not.
		int num =10;
		int flag =0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Not Prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime");
		}

	}

}
