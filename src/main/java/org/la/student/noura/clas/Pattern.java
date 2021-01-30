package org.la.student.noura.clas;

public class Pattern {

	public int n;
	
	public static void increament(int a )
	{
		for(int i = 1; i<=a;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}
    }
	
	
	public static void decrease(int b)
	{
		for(int i =1;i<=b;i++)
		{
			for(int k= 1;k<=b+1-i;k++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}
	}
	
	
	
	
	public static void rightprint(int c)
	{
		for(int i = 1; i<=c ; i++)
		{
			for(int s = 1 ; s<=c-i ; s++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k<=i ; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
	
   }        
		}
	
	
	
	
}