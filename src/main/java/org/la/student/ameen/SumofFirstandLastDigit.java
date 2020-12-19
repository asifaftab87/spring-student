package org.la.student.ameen;

public class SumofFirstandLastDigit {

	public static void main(String[] args) {
		// Sum of first and last digit
		int num=12345;
		int firstdigit = 0 ;
		int lastdigit ;
		lastdigit = num % 10;
		while(num!=0)
		{
			firstdigit = num%10;
			num=num/10;
		}
				int sum = firstdigit + lastdigit ;
				System.out.println("sum of first and last digit : " +sum);
	}

}
