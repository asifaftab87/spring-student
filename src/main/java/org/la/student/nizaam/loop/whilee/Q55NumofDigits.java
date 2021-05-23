package org.la.student.nizaam.loop.whilee;

public class Q55NumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	55.	Wap to count number of digits in a number.
		int  num =1234578, count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
