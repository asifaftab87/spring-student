package org.la.student.kayes.loop;

public class Prime {

	public static void main(String[] args) {
		int n=10,i,c=0;
		for(i=2;i<=n;i++)
		{
			
			if(n%i==0)
				c++;
			
		}
		if(c==1)
			System.out.println("THE NUMBER IS A PRIME NUMBER");
		else
			System.out.println("THE NUMBER IS NOT A PRIME NUMBER");


	}

}
