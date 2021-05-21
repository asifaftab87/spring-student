package org.la.student.sadique.loop;

//wap to print all upper case alphabets except vowels.
//	wap to print all lower case alphabets except vowels.
public class LowerAndUpperCaseExcepetVowel {

	public static void main(String[] args) {
		System.out.println("Upper Case Excepet vowel");
		int a;
		for (a = 0; a < 26; a++) {
			char x = (char) ('A' + a);
			if (x != 'A' && x != 'E' && x != 'I' && x != 'O' && x != 'U') {
				System.out.println(x);
			}
		}
		// wap to print all lower case alphabets except vowels.
		System.out.println("Lower Case Excepet vowel");
		for (a = 0; a < 26; a++) {
			char x = (char) ('a' + a);
			if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u') {
				System.out.println(x);
			}
			// wap to print all lower case vowels.

		}
		System.out.println("Upper Case Vowel");
		for (a = 0; a < 26; a++) {
			char x = (char) ('A' + a);
			if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
				System.out.println(x);
			}
		}
		// wap to print all upper case vowels.
		System.out.println("Lower Case Vowel");
		for (a = 0; a < 26; a++) {
			char x = (char) ('a' + a);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				System.out.println(x);
			}
		}

	}

}
