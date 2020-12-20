package org.la.student.noura.ifelse;

public class PrintallStrongNumbersBetween1ton {

	public static void main(String[] args) {
		//Wap to print all Strong numbers between 1 to n
		
	
		
		int Sum = 0;
		int maximum = 50000;	
		
		for(int n=1; n <= maximum; n++)
		{
			int Temp = n; 
			Sum = StrongNumber(Temp);
		
			if (n == Sum )
			{
				System.out.println(" " + n + " is a Strong Number");
			}
		}
	}
	public static int Factorial(int num)
	{
		if (num == 0 || num == 1)
			return 1;
		else
		    return num * Factorial (num -1);
	}
	public static int StrongNumber(int num)
	{
		int Temp, Reminder, Sum = 0, Factorial, i=1;
		
		for(Temp = num; Temp > 0; Temp = Temp /10)
		{
			
			Factorial = 1; 			
			Reminder = Temp % 10;
			Factorial = Factorial(Reminder);
			Sum = Sum + Factorial;
		}
		return Sum;
	}
}