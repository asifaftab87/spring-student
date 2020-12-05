package org.la.student.tahir.loop_programs;

public class Loop_23 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		

		int a = 10;
		while(a<=90) {
			
			if(a%2 !=0 && a%5!=0)
				System.out.println(a);
			a++;
		}
		

	}

}
