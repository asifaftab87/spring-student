package org.la.student.sadique;

public class UpperCaseConsonent034 {

	public static void main(String[] args) {
		// 34.	wap to print all upper case alphabets except vowels.
		char a='A';
		while(a<='Z') {
			if(!(a=='A'||a=='E'|| a=='I'|| a=='O'|| a=='U')) {
				System.out.println(a);
			}
		a++;
		
		}

	}

}
