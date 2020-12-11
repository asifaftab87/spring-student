package org.la.student.tahir.loop_programs;

public class For_Loop_26 {

	public static void main(String[] args) {
		// wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
		
				for(int a=1; a<=1500; a++) {
					
					if(a%11 ==0 && a%13 ==0)
						System.out.println(a);
				
				}
	}

}
