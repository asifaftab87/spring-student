package org.la.student.tahir.loop_programs;

public class Loop_19 {

	public static void main(String[] args) {
		// wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
		

		int a = 30;
		while(a<=80) {
			
			if(a%6 ==0 && a%5==0)
				System.out.println(a);
			a++;
		}
		
	}

}
