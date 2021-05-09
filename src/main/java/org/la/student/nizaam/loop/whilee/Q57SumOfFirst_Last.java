package org.la.student.nizaam.loop.whilee;

public class Q57SumOfFirst_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	57.	Wap to find sum of first and last digit of a number.
		int num = 1678957,first,last;
		last=num%10;
		while(num>10) {
			num=num/10;
		}
		first=num;
		System.out.println("Sum of First and last digit is : "+(first+last));
	}

}
