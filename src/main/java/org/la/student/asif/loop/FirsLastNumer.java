package org.la.student.asif.loop;

public class FirsLastNumer {

	//wap to find first and last digit
	public static void main(String[] args) {
		
		int i=2917;
		
		int s = 0;
		
		int lastDigit = i % 10;
		
		while(i>0) {
			int r = i % 10;
			i = i / 10;
			s = s*10 + r;
		}
		
		int firstDigit = s % 10;
		
		System.out.println("firstDigit: "+firstDigit);
		System.out.println("lastDigit: "+lastDigit);
	}
}
