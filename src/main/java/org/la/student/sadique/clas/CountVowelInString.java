package org.la.student.sadique.clas;

import java.util.*;

public class CountVowelInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("You have entered: " + str);
		char[] chars = str.toCharArray();
		int count = 0;
		for (char c : chars) {
			switch (c) {
			case 'a': System.out.println("entered: " + c);
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("Number of vowels in String = " + count);
	}
}
