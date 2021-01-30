package org.la.student.noura.method;

public class PatternMethod {

	public static void main(String[] args) {
	
		int a=5;
		pattern(a);
	
	}

	static void pattern(int a) {
	 
		for(int i = 1;i<=a;i++)
		{
			for(int k= 1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}

		
		
	}
}
