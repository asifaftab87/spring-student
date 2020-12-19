package org.la.student.ameen;

public class PrintReverse {

	public static void main(String[] args) {
		// Wap to enter a number and print its reverse.
		int num =1234; int reverse =0;
		while(num!=0)
		{
			int digit = num%10;
			reverse=reverse*10+digit;
			num=num/10;
			
		
			
		}
		System.out.println("reverse : "+reverse);

	}

}
