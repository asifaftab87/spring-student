package org.la.student.ameen;

public class ExceptVowels {

	public static void main(String[] args) {
		// wap to print all upper case alphabets except vowels.
		char ch ='A';
		while(ch<='Z')
		{
			if(!(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
			{
				System.out.println("ch : " +ch);
			}
			ch++;
		}

	}

}
