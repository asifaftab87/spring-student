package org.la.student.sadique.clas;

public class CheekAlphabetOrNot {

	public static void main(String[] args) {
		//  wap to print alphabet if the given character is 'alphabet' else print 'non alphabet'
		char s='a';
		int a=s;
		if(a>=65&&a<=90 || a>=97&&a<=122) {
			System.out.println("Alphabet");
		}else {
			System.out.println("Non Alphabet");
		}

	}

}
