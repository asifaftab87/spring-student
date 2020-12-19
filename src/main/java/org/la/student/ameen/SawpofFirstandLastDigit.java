package org.la.student.ameen;

public class SawpofFirstandLastDigit {

	public static void main(String[] args) {
		// Wap to swap first and last digits of a number.
		int num = 12345;
		int firstdigit = 0;
		int lastdigit;
		lastdigit = num%10;
		System.out.println("last digit : " +lastdigit);
		while(num!=0)
		{
			firstdigit = num%10;
			num=num/10;
		}
		System.out.println("First digit : " +firstdigit);
		int c = firstdigit;
		 firstdigit = lastdigit;
		 lastdigit = c;
		System.out.println("swap first digit with last digit : " +firstdigit);
		System.out.println("swap last digit with first digit : " +lastdigit);
	} 

}
