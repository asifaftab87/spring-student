package org.la.student.noura.ifelse;

public class Snippet {
	
	
	public static void main(String[] args) {
		//Wap to check whether a number is Strong number or not
		
		int n=-145;
		int sum = 0;
		int temp_n = n;
		
		while(n != 0)
		{
		   int i = 1;
		   int factorial = 1;
		   int r = n % 10;
		   n = n / 10;
		   sum = sum + factorial;
		 
		   
		      while(i <= r)
		       {
		              factorial = factorial * i;
		              i++;
		       }
		      
		}
		
		
		if(sum == temp_n)
		System.out.println(temp_n + " is a strong number");
		else
		System.out.println(temp_n + " is not a strong number");
		
	}

}

