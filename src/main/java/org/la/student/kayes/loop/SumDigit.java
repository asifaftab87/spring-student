package org.la.student.kayes.loop;

public class SumDigit {

	public static void main(String[] args) {
		int n=54321,r,s=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			s=s+r;
		}
		System.out.println(s);


	}

}
