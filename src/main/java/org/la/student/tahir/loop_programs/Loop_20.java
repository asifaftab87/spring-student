package org.la.student.tahir.loop_programs;

public class Loop_20 {

	public static void main(String[] args) {
		// 	wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
		

		int a = 10;
		while(a<=50) {
			
			if(a%2 ==0 && a%5==0)
				System.out.println(a);
			a++;
		}
		

	}

}
