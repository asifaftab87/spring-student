package org.la.student.kayes.loop;

public class PrimeToN {

	public static void main(String[] args) {
		int n=10,j,i,c=0;
		for(i=2;i<=n;i++)
		{
		for(j=2;j<=i;j++)
		{
			
			if(i%j==0)
				c++;
		}
		if(c==1)
			System.out.println(i);
		}

}
	}
