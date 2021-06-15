package org.la.student.kayes.method;

public class LowerExceptVowel {
	public static void main(String[] args) {
		int i;
		for(i=97;i<=122;i++)
		{
			if((char)i=='a' || (char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u' )
				continue;
			
			else
				{
				char c=(char)i;
				
			System.out.println(c);
				}


	}

}

}
