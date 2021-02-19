package org.la.student.sadique;

public class CalculatetheDigit {

	public static void main(String[] args) {
		// Wap to swap first and last digits of a number.
		int i=73532;
		
		int s=0;
		
		for (;i>0;){
			
			int r=i%10;
			
			i=i/10;
			
			s=s+r;
			}
		System.out.println("sum of digts :"+s);
      }
}

