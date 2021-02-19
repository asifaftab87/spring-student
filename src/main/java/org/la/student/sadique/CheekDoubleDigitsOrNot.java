package org.la.student.sadique;

public class CheekDoubleDigitsOrNot {

	public static void main(String[] args) {
		// wap to print double if number is a double digit.
		// using if and Else.
		int e = 634;
		if(e>9 && e<100) {
			System.out.println(e + " is duble digits ");
		} else {
			System.out.println(e + " is not double digits ");
		}
		//using without if and else.
		int digit=43;
		for(;digit>9 && digit<100;) {
			System.out.println(digit + " is double digit" );
			break;
		}
		for(;digit<9 || digit>100;) {
			System.out.println(digit + " is not double digit" );
			break;
		}
	}

}

