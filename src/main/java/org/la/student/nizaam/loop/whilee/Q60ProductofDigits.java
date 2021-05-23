package org.la.student.nizaam.loop.whilee;

public class Q60ProductofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	60.	Wap to calculate product of digits of a number.
		int num=1234,sum=1;
		while(num>10) {
			sum=sum*(num%10);
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
