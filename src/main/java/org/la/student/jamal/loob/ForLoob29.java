package org.la.student.jamal.loob;

public class ForLoob29 {
	//29.	wap to print all numbers between 100 to 1 those are divisible by 11 and 3.

	public static void main(String[] args) {
		
		for (int i=100; i>1; i--) {
			if ((i%11==0)&&(i%3==0)) {
				System.out.println(i);
			}
		}



		

	}

}