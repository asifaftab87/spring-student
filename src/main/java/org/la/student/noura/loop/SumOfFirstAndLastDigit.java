package org.la.student.noura.loop;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		//Wap to find sum of first and last digit of a number
		//using while
		int num=8934;
		int lastDigit=0;
		int firstDigit=0;
		
		lastDigit=num%10;
		System.out.println(lastDigit);
		
		
		while (num>0) {
			
			firstDigit=num%10;
			num/=10;
			
		}
		System.out.println(firstDigit);
		System.out.println("sum=" +(firstDigit+lastDigit));
		

	}

}
