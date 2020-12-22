package org.la.student.tahir.loop_programs;

public class For_Loop_58 {

	public static void main(String[] args) {
		//Wap to check whether a number is Prime number or not.
		
		int a = 11;
		int r = 2;
		
		for(;r <a;) {
			if(a%r ==0) {
				break;
			}
			r++;
		}
		
		if(r==a) {
			System.out.println("Prime");
			
		}
		
		else
			System.out.println("Not prime");
	}
}

