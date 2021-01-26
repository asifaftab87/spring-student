package org.la.student.tahir.method;

public class Palindrome {
	//  Palindrome
	public static void main(String[] args) {
	
		int x=1234543221;
	int b = value(x);
	 if(x==b)
			System.out.println("The number is palindrome");
			
			else
				System.out.println("The number is not palindrome");
	
	}
	
	static int value(int a ) {
		int b=0;
		while(a>0) {
			int r = a%10;
			a=a/10;
			b=b*10;
			b=b+r;
		}
		
		return b;
		
	}

}
