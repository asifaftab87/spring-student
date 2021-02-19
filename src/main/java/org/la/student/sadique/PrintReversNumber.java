package org.la.student.sadique;

public class PrintReversNumber {

	public static void main(String[] args) {
		// Wap to enter a number and print its reverse.
		int i=987654321,s=0;
		for(;i>0;) {
		int r=i%10;
			i=i/10;
			s=s*10+r;
			
		}System.out.println(s);
		

	}

}
