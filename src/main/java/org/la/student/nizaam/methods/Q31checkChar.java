package org.la.student.nizaam.methods;

public class Q31checkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c='A';
		System.out.println(checkChar(c));
	}

	static int checkChar(char c) {
		if(c>='A' && c<='Z')
			return 1;
		else if( c>='a' && c<='z')
			return -1;
		else
			return 0;
	}
}
