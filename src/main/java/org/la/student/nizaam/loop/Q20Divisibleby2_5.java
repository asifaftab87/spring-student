package org.la.student.nizaam.loop;

public class Q20Divisibleby2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	20.	wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
		
		for(int i =10; i<=50; i++) {
			if(i%2==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
