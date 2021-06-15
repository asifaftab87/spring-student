package org.la.student.kayes.method;

public class DigitCount {
	public static void main(String[] args) {
		int s=02;
		divisible(s);
	}
		static void divisible(int n)
		{
			int c=0;
			while(n!=0)
				{
				
				n=n/10;
				c++;
				}
		if(c==1)
			System.out.println("single");
		if(c==2)
			System.out.println("double");
		if(c==3)
			System.out.println("ternary");
		

	}


}
