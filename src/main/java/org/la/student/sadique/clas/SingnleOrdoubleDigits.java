package org.la.student.sadique.clas;

public class SingnleOrdoubleDigits {

	public static void main(String[] args) {
		// wap to check whether a given number is positive and double digit or single digit number 
		int a=29;
		if(a>0) {
			System.out.println("Positive number ");
		}else {
			System.out.println("Negative number");
		}
		if(a>=-9&&a<=9) {
			System.out.println("Single Digit");
		}if(( a>9&&a<100)||(a>-100&&a<-9)) {
			System.out.println("Double Digits");
			
		}
	}

}
