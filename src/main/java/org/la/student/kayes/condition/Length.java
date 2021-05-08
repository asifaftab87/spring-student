package org.la.student.kayes.condition;

public class Length {

	public static void main(String[] args) {
		int n=98,r,k,l=0;
		while(n!=0)
		{
			
			n=n/10;
			l++;
			}
		if(l==2)
			System.out.println("DOUBLE DIGIT");
		if(l==1)
			System.out.println("SINGLE DIGIT");
		if(l==3)
			System.out.println("TERNARY");

	}

}
