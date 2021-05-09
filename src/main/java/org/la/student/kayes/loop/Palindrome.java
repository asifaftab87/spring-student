package org.la.student.kayes.loop;

public class Palindrome {

	public static void main(String[] args) {
		int n=7887,r,s=0,k;
		k=n;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(s==k)
		System.out.println("IT IS PALINDROME NUMBER");
		else
			System.out.println("IT IS NOT A PALINDROME NUMBER");
			

	}

}
