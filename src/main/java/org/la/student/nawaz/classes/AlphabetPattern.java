package org.la.student.nawaz.classes;

public class AlphabetPattern {
	
	int n=5;
	
	void AlphabetPrint() {
		
		for (int i=1; i<=n;i++)
		{
	      for( int j=1;j<=i;j++)
	    {
	    	System.out.print((char)('A' + (j-1)) + " ");
	    }
	        System.out.println();
	    }
	}
	
	void AlphabetGreatertoLower() {
		
		for (int i=1; i<=n;i++)
		{
	      for( int j=1;j<=n-i+1;j++)
	    {
	    	System.out.print((char)('A' + (j-1)) + " ");
	    }
	        System.out.println();
	    }
		
	}
}