package org.la.student.ameen;

public class CheckNum {

	public static void main(String[] args) {
		//  wap to check whether a given number is positive and double digit or single digit number 
		int num =  25 ;
		if(num >= 0)
		{
			System.out.println("number is Positive");
		}
		 if(num>10 && num < 100)
		{
			System.out.println("number is double digit ");
		}
		else if(num > 1 && num < 10 )
		{
		System.out.println("number is single digit");	
		}
		else 
		{
			System.out.println(" given number is not single digit nor positive nor double digit");
		}

	}

}
