package org.la.student.jamal.loob;

public class ForLoob56 {
	
	//56.	Wap to find first and last digit of a number.
	
	public static void main(String[] args) {
		


		int n=7379236;
		int f=0;
		int l=0;
		
		l=n%10;
		System.out.println("Last digit : " + l);
		
		while (n!=0) {
			f=n%10;
			n/=10;
		}
		System.out.println("first digit :" + f);
		
	}

}
