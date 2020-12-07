package org.la.student.sadique;

public class LowerCaseConsonent34 {

	public static void main(String[] args) {
		// 34.	wap to print all lower case alphabets except vowels.
		char a='a';
		while(a<='z') {
			if(!(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')) {
				System.out.println(a);
			}
		a++;
		
		}

	}

}
