package org.la.student.asif.loop;

public class ReverseNum {

	public static void main(String[] args) {
		
		
		int n = 321;
		int res = 0;
		
		for(; n>0 ;) {
			int r = n % 10;
			n = n / 10;
			res = res * 10 + r;
		}
		
		System.out.println("reverse num: "+res);
	}
}