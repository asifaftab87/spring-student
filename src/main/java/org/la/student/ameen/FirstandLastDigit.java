package org.la.student.ameen;

public class FirstandLastDigit {

	public static void main(String[] args) {
		// Wap to find first and last digit of a number.
		int num = 1234,firstdigit = 0,lastdigit;
		lastdigit = num % 10;
		System.out.println("last digit : " +lastdigit );
		while(num!=0)
		{
			firstdigit=num%10;
			num=num/10;
			
		}
		System.out.println("first digit : " +firstdigit);

		 
	}
}
