package org.la.student.ameen;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		//wap to print all prime numbers from an array ?
		int array [] = {1,2,3,4,5,6,7,8};
		
		for(int i = 0;i<array.length;i++)
		{
			int flag = 0;
			for(int j =2 ;j<i ; j++)
			{
				if(i%j==0)
				{
					flag =1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(" " +i);
			}
		}

	}

}
