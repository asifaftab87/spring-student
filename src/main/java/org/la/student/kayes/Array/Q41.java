package org.la.student.kayes.Array;

public class Q41 {

	public static void main(String[] args) {
		char c[]= {'A','B','C','D'};
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='A')
				c[i]='a';
			if(c[i]=='B')
				c[i]='b';
			if(c[i]=='C')
				c[i]='c';
			if(c[i]=='D')
				c[i]='d';
			
		}
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		

	}

}
