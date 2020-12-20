package org.la.student.noura.loop;

public class CalculateFactorial {

	public static void main(String[] args) {
 
		//Wap to calculate factorial of a number
		//while
		
		int num =5;
		int f=1;
		while(num>=1)
		{
			f=f*num;
			num--;
		}
		System.out.println("factorial =  "+f);
	}
}
