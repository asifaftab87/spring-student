package org.la.student.tahir.loop_programs;

public class For_Loop_43 {

	public static void main(String[] args) {
		// sum of all natural number from 1 to n
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

