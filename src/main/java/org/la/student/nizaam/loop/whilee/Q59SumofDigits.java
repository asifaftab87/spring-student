package org.la.student.nizaam.loop.whilee;

public class Q59SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345,sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
