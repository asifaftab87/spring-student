package org.la.student.noura.loop;

public class FirstDigitAndLastDigit {

	public static void main(String[] args) {
		//Wap to find first and last digit of a number
		
				//using for
		
		
		int num =312;
		int firstDigit=0 , lastDigit=0;
		lastDigit=num%10;
		System.out.println("lastDigit= "+lastDigit);
		
		
		for(;num>0;)
		{
			firstDigit=num%10;
			num=num/10;
			
			
		}
		System.out.println("FirtDigit= "+firstDigit);
	}

}
