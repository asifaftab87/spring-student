package org.la.student.ameen;

public class DoubleDigit {

	//wap to check whether a given number is double digit or not
	
	public static void main(String[] args) {
		int num = -19;
		if( num >= 10 && num < 100)
		{
			System.out.println(" num is double");
			}
		else if(num <= -10 && num > -100)
		{
			System.out.println("num is double");
		}
		else
		{
			System.out.println(" num is not double");
		}

	}

}
