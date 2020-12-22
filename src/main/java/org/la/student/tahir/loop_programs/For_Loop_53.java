package org.la.student.tahir.loop_programs;

public class For_Loop_53 {

	public static void main(String[] args) {
		//Wap to enter a number and print its reverse.
		
		int a = 2398;
		int r= 0;
		
		for(; a!=0; ) {
			
			r = r*10;
			r= r + a%10;
			a = a/10;
			
			
		}
		System.out.println("Revearse of given number is  :" + r);
	}
}

