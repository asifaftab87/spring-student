package org.la.student.nizaam.loop;

public class Q26Divisibleby13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	26.	wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
		
		
		for(int i=200; i>=1;i--) {
			if(i%13==0 && i%2==0) {
				System.out.println(i);
			}
		}
	}

}
