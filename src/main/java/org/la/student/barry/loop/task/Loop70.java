package org.la.student.barry.loop.task;
public class Loop70 {
	
	//Wap to find sum of all prime numbers between 1 to n.
	public static void main(String[] args) {
		
		int i, number, count, sum = 0;
				
				for(number = 1; number <= 100; number++)
				{
					count = 0;
				    for (i = 2; i <= number/2; i++)
				    {
				    	if(number % i == 0)
				    	{
				    		count++;
				    		break;
				    	}
				    }
				     if(count == 0 && number != 1 )
				    {
				    	sum = sum + number;
				    }  
				}
		          System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);    
   }
}
	
  

	
	
