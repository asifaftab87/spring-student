package org.la.student.noura.loop;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		//Wap to print all Prime numbers between 1 to N
		
		int n=30;

		int temp=0;
		for(int i=1;i<=n;i++)
		{
			for (int j=2;j<i-1;j++) 
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
				
		    } 
			if (temp==0) //prime numbers
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
			
	

		}
	
	}
}
