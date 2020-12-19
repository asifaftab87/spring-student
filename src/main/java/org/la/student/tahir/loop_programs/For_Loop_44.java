package org.la.student.tahir.loop_programs;

public class For_Loop_44 {

	public static void main(String[] args) {
		//// sum of all even numbers between  1 to n
		
		int i=2344;
		
		int s = 0;
		for(; i>0;) {
			
			int r = i%10;
		i = i/10;
		
		if(r%2==0)
		s= s+r;
		
		}
		
		System.out.println(s);
	}
	}


