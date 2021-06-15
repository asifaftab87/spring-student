package org.la.student.kayes.method;

public class UpperExceptVowel {
	public static void main(String[] args) {
		int i;
		for(i=65;i<=90;i++)
		{
			if((char)i=='A' || (char)i=='E'||(char)i=='I'||(char)i=='O'||(char)i=='U' )
				continue;
			
			else
				{
				char c=(char)i;
				
			System.out.println(c);
				}


	}

}
}
