 package org.la.student.sajid;

public class FindSumOfFIrstAndLastDigitOfNumber {
	public static void main(String[] args) {
//		Wap to find sum of first and last digit of a number.
		int num=123456,same=num;
		while(num>=10) {
			num=num/10;
		}System.out.println("first digit number "+num);
		
		same=same%10;
		System.out.println("last digit number "+same);
		System.out.println("sum of first and last digit number = "+(same+num));
	}

}
