package org.la.student.jamal.loob;

public class ForLoob3 {

	//3.	wap to print first five odd numbers.
	public static void main(String[] args) {
		

		for (int i=1; i<10; i++) {
			if (i%2!=0) {
			System.out.println(i);
		}
		}
		
		int j=1;
		while(j<=10) {
			if (j%2!=0) {
			System.out.println("this is wheile loop  :" + j);
			}
			j+=2;
		}
		
	}

}
