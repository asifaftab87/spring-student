package org.la.student.kayes.loop;

public class ExceptVowels {

	public static void main(String[] args) {
		int i;
		for(i=97;i<=122;i++)
		{
			char c=(char)i;
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				continue;
			else
			System.out.println(c);
		}


	}

}
