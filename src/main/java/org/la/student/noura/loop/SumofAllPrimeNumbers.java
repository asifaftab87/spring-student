package org.la.student.noura.loop;

public class SumofAllPrimeNumbers {

	public static void main(String[] args) {
		//Wap to find sum of all prime numbers between 1 to n
		
		
		
		int n=30;
        int sum=0;
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
				sum=sum+i;
				System.out.print(" "+i);
			}
			

			else

			{
				temp=0;
			}
		
		}
		System.out.println();
		System.out.println("sum of all prim numbers= "+sum);

	}

}


