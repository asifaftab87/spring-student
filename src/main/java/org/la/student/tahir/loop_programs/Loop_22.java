package org.la.student.tahir.loop_programs;

public class Loop_22 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		

		int a = 10;
		while(a<=50) {
			
			if(a%5 ==0 && a%9==0)
				System.out.println(a);
			a++;
		}
		


	}

}
