package org.la.student.ameen;

public class ProductofDigitNumber {

	public static void main(String[] args) {
		// Wap to calculate product of digits of a number.
		int num =1234,n;
		int product=1;
		while(num>0)
		{
			n=num%10;
			product=product*n;
		num=num/10;
		}
		
		System.out.println(" product of digit number : " +product);

		
	}

}
