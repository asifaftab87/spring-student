package org.la.student.noura.loop;

public class CalculateSum {

	public static void main(String[] args) {
		// to calculate sum of digits of a number.
	
		int num =54;
		int s=0;
		for(;num>0;) {
			int r=num %10;//3
			num=num/10;
			s=s+r;

		}
		System.out.println(s);

	}

}
