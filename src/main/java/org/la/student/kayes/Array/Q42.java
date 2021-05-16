package org.la.student.kayes.Array;

public class Q42 {

	public static void main(String[] args) {
		char c[]= {'a','b','c','d'};
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a')
				c[i]='A';
			if(c[i]=='b')
				c[i]='B';
			if(c[i]=='c')
				c[i]='C';
			if(c[i]=='d')
				c[i]='D';
			
		}
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		

	}

}
