package org.la.student.tania.loop_class5;

public class Loop_Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.

		for(int i=10; i<=90;i++) {
			if(i%2!=0 && i%5!=0) {
				System.out.println(i);
			}
		}
	}

}