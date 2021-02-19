package org.la.student.sadique;

public class CheekPalindroneNumberOrNot {

	public static void main(String[] args) {
		// Wap to check whether a number is palindrome or not.
		int a=212,o=a,r=0;
		for(;a>0;) {
			int rm=a%10;
			a=a/10;
			r=(r*10)+rm;
			
			
		}
		if(o==r) {
			System.out.println("palindrom number "+ r);
			
		}else {
			System.out.println("not palindrom number "+ r);
		}

	}

}
