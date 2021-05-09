package org.la.student.nizaam.loop;

public class Q19Divisibleby6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	19.	wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
		
		for(int i =30; i<=80; i++) {
			if(i%5==0 && i%6==0) {
				System.out.println(i);
			}
		}
	}

}
