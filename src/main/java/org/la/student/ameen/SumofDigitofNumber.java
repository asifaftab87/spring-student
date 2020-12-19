package org.la.student.ameen;

public class SumofDigitofNumber {

	public static void main(String[] args) {
		// Wap to calculate sum of digits of a number.
		int num =1234,n;
		int sum=0;
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
		num=num/10;
		}
		
		System.out.println(" sum of digit number " +sum);

	}

}
