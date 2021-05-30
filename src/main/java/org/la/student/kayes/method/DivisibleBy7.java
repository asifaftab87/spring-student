package org.la.student.kayes.method;

public class DivisibleBy7 {
	public static void main(String[] args) {
		int s=49;
		divisible(s);
	}
		static void divisible(int n)
		{
		if(n%7==0)
			System.out.println("The number  "+n+ " is divisible by 7");
		else
			System.out.println("The number  "+n+ " is not divisible by 7 ");

	}


}
