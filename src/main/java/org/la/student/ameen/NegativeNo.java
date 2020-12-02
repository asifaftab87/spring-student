package org.la.student.ameen;

public class NegativeNo {

	public static void main(String[] args) {
		// wap to print negative number among two given numbers( with if ).
		int num1 = -54 , num2 = 14;
		if(num1<0 && num2 < 0)
		{
			System.out.println("both are negative number");
		}
		else if(num2 < 0)
		{
			System.out.println(" num2 is the negative number");
		}
		else if(num1 < 0 )
		{
			System.out.println("num1 is the negative number");
		}
		else 
		{
			System.out.println(" both are positive");
		}
	}

}
