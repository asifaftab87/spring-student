package org.la.student.sadique;

public class CheekSingleDigitsOrNot {
	
	//wap to print single if number is single digit
	
	public static void main(String[] args) {
		//  using if and Else.
		int e = 634;
		if(e>=0 && e<=9) {
			System.out.println(e + " is Single digits ");
		} else {
			System.out.println(e + " is not single digits ");
		}
		//using without if and else.
		int digit=3;
		for(;digit>=0 && digit<=9;) {
			System.out.println(digit + " is single digit" );
			break;
		}
		for(;digit>10;) {
			System.out.println(digit + " is not single digit" );
			break;
		}


	}

}
