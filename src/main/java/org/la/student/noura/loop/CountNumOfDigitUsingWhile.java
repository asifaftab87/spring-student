package org.la.student.noura.loop;

public class CountNumOfDigitUsingWhile {

	public static void main(String[] args) {
//		Wap to count number of digits in a number.
			//using while loop
		
		
		
		int num=9826874;
		int count=0;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
