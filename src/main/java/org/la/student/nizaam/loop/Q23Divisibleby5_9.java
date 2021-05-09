package org.la.student.nizaam.loop;

public class Q23Divisibleby5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	23.	wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		for(int i=10; i<=50;i++) {
			if(i%5==0 && i%9==0) {
				System.out.println(i);
			}
		}
		
	}

}
