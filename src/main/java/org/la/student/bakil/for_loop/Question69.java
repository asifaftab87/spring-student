package org.la.student.bakil.for_loop;
/*
 * Wap to check whether a number is Perfect number or not
 */
public class Question69 {

	public static void main(String[] args) {

	long n=28, sum=0;
	
	for (int i=1;i<=n/2;i++)
	{
		if (n%i==0) {
			
				sum+=i;
			
		}
		}
		if (sum==n) {
			
			System.out.println(n+" : The number is perfect ");
		}
		else 
			System.out.print("The number is not perfect");
		
	}
}
		  
