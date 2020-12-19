package org.la.student.tahir.loop_programs;

public class For_Loop_43 {

	public static void main(String[] args) {
		//Wap to calculate sum of digits of a number.
		int i=28917346;
		
		int s = 0;
		for(; i>0;) {
			
			int r = i%10;
		i = i/10;
		s= s+r;
		
		}
		
		System.out.println(s);
	}
}

