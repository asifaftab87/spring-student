package org.la.student.sajid.method;

public class OddAndEven {
	public static void main(String[] args) {
		int a=oddEven(55);
		System.out.println(a);
	}
	
	static int oddEven(int a) {
		if(a%2==0) {
			System.out.println("tji number is even: "+a);
		}else
			System.out.println("this number is odd: "+a);
			return a;
		
	}

}
