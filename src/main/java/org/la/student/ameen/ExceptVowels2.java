package org.la.student.ameen;

public class ExceptVowels2 {

	public static void main(String[] args) {
		// wap to print all lower case alphabets except vowels.
		char ch ='a';
		while(ch<='z')
		{
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
			{
				System.out.println("ch : " +ch);
			}
			ch++;
		}

	}

}
