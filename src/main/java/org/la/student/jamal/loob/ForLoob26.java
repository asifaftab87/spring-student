package org.la.student.jamal.loob;

public class ForLoob26 {
	
	//26.	wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
	public static void main(String[] args) {
		


		for(int i=200; i>1; i--) {
			if ((i%13==0)&&(i%2==0)) {
				System.out.println(i);
				
			}
		}
		int j=200;
		while (j>1) {
			if((j%13==0) && (j%2==0)) {
				System.out.println("this is with while  : " +j);
			}
		
			j--;
		}
		
		

	}

}
