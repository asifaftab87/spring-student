package org.la.student.kayes.method;

public class CheckChar {
	static int checkChar(char c)
	{
		if(c>='a' && c<='z')
			return -1;
		if(c>='A' && c<='Z')
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		char n='R';
		int i=checkChar(n);
		System.out.println(i);

	}

}
