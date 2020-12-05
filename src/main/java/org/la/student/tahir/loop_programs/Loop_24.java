package org.la.student.tahir.loop_programs;

public class Loop_24 {

	public static void main(String[] args) {
		// wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
		
		int a = 100;
		while(a>=1) {
			
			if(a%11 !=0 && a%3 !=0)
				System.out.println(a);
			a--;
		}
		
		
		
	}

}
