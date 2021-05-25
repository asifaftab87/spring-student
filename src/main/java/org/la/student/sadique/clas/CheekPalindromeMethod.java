package org.la.student.sadique.clas;

public class CheekPalindromeMethod {
	static boolean isPalindrome() {
		int no = 12521;
		int temp = no;
		int rem, rev = 0;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean palindrome = isPalindrome();
		System.out.println("Is Palindrome number : " + palindrome);
	}
}
