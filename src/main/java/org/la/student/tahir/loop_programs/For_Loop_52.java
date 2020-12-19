package org.la.student.tahir.loop_programs;

public class For_Loop_52 {

	public static void main(String[] args) {
		
		//Wap to calculate product of digits of a number.
				int i=272;
				
				int s = 1;
				for(; i>0;) {
					
					int r = i%10;
				i = i/10;
				s= s*r;
				
				}
				
				System.out.println(s);
		
	}
}

