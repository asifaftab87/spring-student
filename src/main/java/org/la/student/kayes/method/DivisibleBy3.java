package org.la.student.kayes.method;

public class DivisibleBy3 {
	public static void main(String[] args) {
		int s=8;
		divisible(s);
	}
		static void divisible(int n)
		{
		if(n%3==0)
			System.out.println("The number  "+n+ " is divisible by 3");
		else
			System.out.println("The number  "+n+ " is not divisible by 3 ");

	}

}
