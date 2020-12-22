package org.la.student.sajid;

public class CheckSingleDigit {
	public static void main(String[] args) {
//		wap to print single if number is single digit
		
		int n=9;
		if(-9<=n && n<=9) {
			System.out.println("this Number is Double:");
		}else {
			System.out.println("this Number is not double");
			  }
		while(-9<=n && n<=9) {
			System.out.println("this number is Double");
			break;
		}
		for(;-9<=n && n<=9;) {
			System.out.println("This Number is Double");
			break;
		}
	}

}
