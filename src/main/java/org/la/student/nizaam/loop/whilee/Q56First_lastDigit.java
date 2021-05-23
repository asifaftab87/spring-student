package org.la.student.nizaam.loop.whilee;

public class Q56First_lastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	56.	Wap to find first and last digit of a number.
		
		int num = 1678957,first,last;
		last=num%10;
		while(num>10) {
			num=num/10;
		}
		first=num;
		System.out.println("First digit : "+first + "\n"+"Last digit : "+last);
	}

}
