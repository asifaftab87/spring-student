package org.la.student.bakil.for_loop;
/*
 *Wap to print all Strong numbers between 1 to n.
 */
public class Question72 {

	public static void main(String[] args) 
	
	{

		int Number = 900, Temp, Reminder, Sum = 0, i, Factorial;	
		
		for(Temp = Number; Temp > 0; Temp = Temp /10)
		{
			Factorial = 1; 
			
		    Reminder = Temp % 10;
		    for(i = 1; i <= Reminder; i++)
		    {
		     	Factorial = Factorial * i;
		    }
		    System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		}
		
		System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println("\n " + Number + " is a Strong Number");
		}
		else
		{
		   System.out.println("\n " + Number + " is Not a Strong Number");
		}}}
		
