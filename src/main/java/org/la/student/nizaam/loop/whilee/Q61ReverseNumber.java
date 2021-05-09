package org.la.student.nizaam.loop.whilee;

public class Q61ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	61.	Wap to enter a number and print its reverse.

		int num = 67893,r,rev=0;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			rev= rev*10+r;
		}
		System.out.println(rev);
	}

}
